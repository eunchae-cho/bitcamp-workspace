package com.eomcs.pms.filter;

import com.eomcs.pms.handler.Request;

class Filter1 implements CommandFilter {
	@Override
	public void doFilter(Request request, FilterChain next) {
		System.out.println("Filter1 ==> ");
		System.out.println(" <== Filter1");
	}
}

class Filter2 implements CommandFilter {
	@Override
	public void doFilter(Request request, FilterChain next) {
		System.out.println("Filter2 ==> ");
		System.out.println(" <== Filter2");
	}
}

public class Test1 {
	public static void main(String[] args) throws Exception {
		CommandFilterManager filterManager = new CommandFilterManager();
		filterManager.add(new Filter1());
		filterManager.add(new Filter2());
		
		filterManager.doFilter(null);
		
	}
}
