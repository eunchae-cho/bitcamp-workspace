package com.eomcs.pms.filter;

import com.eomcs.pms.handler.Request;

public interface CommandFilter {
	void doFilter(Request request, FilterChain next) throws Exception;
}
