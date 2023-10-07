/*
 
 2. Two Sum (Leetcode:- 1)
Given an array of integer numbers and an integer target, return indices of
the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you
may not use the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
Constraints:
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.

 */

import java.io.*;

class Program2{

	public static void main(String[]args)throws IOException{
	
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the Array Size");
                int size = Integer.parseInt(obj.readLine());

                System.out.println("Enter the Array Elements");
                int arr[] = new int[size];

                for(int i = 0;i<arr.length;i++){

                        arr[i]=Integer.parseInt(obj.readLine());

                }

                System.out.println("Enter the target Element");
                int target = Integer.parseInt(obj.readLine());
		
		for(int i =0; i < arr.length ;i++){
		
			for(int j = i+1; j< arr.length ;j++){
			
				if(arr[i] + arr[j] == target){
					System.out.println("[" + i + "," + j + "]");
				}
			}
		}
	}
}
