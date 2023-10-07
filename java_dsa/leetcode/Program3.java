/*
 Given a sorted array of distinct integers and a target value, return the index
if the target is found. If not, return the index where it would be if it were
inserted in order.
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
Constraints:
1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104
 */

import java.io.*;

class Program3{

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
			
                      	if(arr[i] >= target ){
				System.out.println(i);
				break;
			}
                }
        }
}
