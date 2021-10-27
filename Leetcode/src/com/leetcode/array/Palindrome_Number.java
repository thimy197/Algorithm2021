package com.leetcode.array;

public class Palindrome_Number {

	public static void main(String[] args) {
//		System.out.println(isPalindrome(1234567899));
		System.out.println(isPalindromeByCharAt(123454321));
	}
	
	// 1: cắt và lưu một nửa sau, sau đó so sánh với chuỗi đã cắt rồi
	public static boolean isPalindrome(int x) {
		if(x < 0) return false;
		String xStr = x+"";
		String result1 = "";
		while(result1.length() < xStr.length()/2) {
			result1 += x%10;
			x /= 10;
		}
        if(result1.isEmpty()) return true;
		String result2 = x+"";
		if(result1.length() < (result2).length()) {
			x /= 10;
		}
		return result1.equals(x+"");
	}
	
	// 2: reverse number
	public static boolean isPalindromeByReverse(int x) {
        if(x < 0) return false;
        return reverseNumber(x).equals(x+"");
    }
    
    public static String reverseNumber(int x){
        return new StringBuilder(String.valueOf(x)).reverse().toString();
    }
    
    // 3: so sánh từng vị trí đầu với vị trí cuối tương ứng
    public static boolean isPalindromeByCharAt(int x) {
    	if(x < 0) return false;
		String xStr = x+"";
		int i=0;
		while(i < xStr.length()-1-i) {
			if(xStr.charAt(i) != xStr.charAt(xStr.length()-1-i)) {
				return false;
			}
			i++;
		}
		return true;
	}
}
