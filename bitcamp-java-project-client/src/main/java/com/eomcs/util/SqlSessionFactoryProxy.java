package com.eomcs.util;

import java.sql.Connection;

import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.TransactionIsolationLevel;

public class SqlSessionFactoryProxy implements SqlSessionFactory {
	SqlSessionFactory original;
	boolean inTransaction;
	SqlSessionProxy currentSqlSession;

	public SqlSessionFactoryProxy(SqlSessionFactory original) {
		this.original = original;
	}

	public void startTransaction() {
		inTransaction = true;
	}

	public void endTransaction() {
		inTransaction = false;
		
		if (currentSqlSession != null) {
		currentSqlSession.realClose();
		currentSqlSession = null;
		}
	}

	public SqlSession openSession() {
		if (inTransaction) {
			if (currentSqlSession == null) {
				currentSqlSession = new SqlSessionProxy(original.openSession());
			}
			return currentSqlSession;
		} else {
			return original.openSession(true);
		}
	}

	public void commit() {
		if (currentSqlSession != null) {
			currentSqlSession.commit();
		}
		endTransaction();
	}

	public void rollback() {
		if (currentSqlSession != null) {
			currentSqlSession.rollback();
		}
		endTransaction();
	}

	public SqlSession openSession(boolean autoCommit) {
		return original.openSession(autoCommit);
	}

	public SqlSession openSession(Connection connection) {
		return original.openSession(connection);
	}

	public SqlSession openSession(TransactionIsolationLevel level) {
		return original.openSession(level);
	}

	public SqlSession openSession(ExecutorType execType) {
		return original.openSession(execType);
	}

	public SqlSession openSession(ExecutorType execType, boolean autoCommit) {
		return original.openSession(execType, autoCommit);
	}

	public SqlSession openSession(ExecutorType execType, TransactionIsolationLevel level) {
		return original.openSession(execType, level);
	}

	public SqlSession openSession(ExecutorType execType, Connection connection) {
		return original.openSession(execType, connection);
	}

	public Configuration getConfiguration() {
		return original.getConfiguration();
	}
		
}
