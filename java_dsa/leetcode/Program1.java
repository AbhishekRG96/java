/*
 1. Reverse Integer (Leetcode:- 7)
Given a signed 32-bit integer x, return x with its digits reversed. If reversing
x causes the value to go outside the signed 32-bit integer range [-231, 231
- 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed
or unsigned).
Example 1:
Input: x = 123
Output: 321
Example 2:
Input: x = -123
Output: -321
Example 3:
Input: x = 120
Output: 21
Constraints:
-231 <= x <= 231 - 1
*/

import java.io.*;

class Program1{

static int reverse(int num){

	int x = num;
	int rev = 0;
	while(x != 0){
	
		rev = rev * 10 + ( x % 10 );

		x = x / 10;
	}
	if(rev >= -231 && rev <= 230){
		return rev;
	}
	return 0;
}

	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter number to reverse :");
		int num = Integer.parseInt(br.readLine());

		int rev  = reverse(num);
		System.out.println(rev);

	}
}
