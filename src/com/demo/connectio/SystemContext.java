package com.demo.connectio;

public class SystemContext {
	private static ThreadLocal<Integer> pageOffset = new ThreadLocal<Integer>();
	public static int getPageOffset() {
		return pageOffset.get();
	}
	public static void setPageOffset(int _pageOffset) {
		pageOffset.set(_pageOffset);
	}
	public static void removePageOffset(){
		pageOffset.remove();
	}
}

