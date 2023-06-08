package com.iqbal;

public class ReverseString {
	public static void main(String[] args) {
		String name = "IQBAL";
		int len = name.length();
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);
		StringBuffer sb = new StringBuffer(name);
		StringBuffer st = sb.reverse();
		System.out.println(st);
	}

}
