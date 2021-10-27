package com.leetcode.array;

public class Reverse_Integer {

	public static void main(String[] args) {
		System.out.println(reverse(1234567899));
		System.out.println(reverseStringBuffer(1234567899));
	}

	public static int reverse(int x) {
		String reverseNumber = "";
		if(x < 0) {
			reverseNumber += "-";
			x *= (-1);
		}
		while(x!=0){
			int sodu = x%10;
			reverseNumber += sodu;
			x /= 10;
		}
		try {
			return Integer.parseInt(reverseNumber);
		}catch(Exception ex) {
			return 0;
		}
	}
	
	/**
	 * StringBuilder supports reverse() function 
	 * 
	 * @param x
	 * @return
	 */
	public static int reverseStringBuffer(int x) {
		String reverseNumber = 
				x < 0 
				? new StringBuilder(String.valueOf(-x)).append("-").reverse().toString()
                : new StringBuilder(String.valueOf(x)).reverse().toString();
		try {
			return Integer.parseInt(reverseNumber);
		}catch(Exception ex) {
			return 0;
		}
	}

}
