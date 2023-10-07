/*
 2. 
Given an integer array of size N count the no of elements having atleast 1 element greater than itself
arr: [2,5,1,4,8,0,8,1,3,8]
N :10
o/p:7 

brute force
t.c = o(n^2)
s.c = 0(1)

optimes 
t.c = o(n^2) 
s.c = o(1)
 */

import java.io.*;

class Program2{

	public static void main(String[] args)throws IOException{

        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        	System.out.println("Enter Size of Array : ");
        	int size = Integer.parseInt(br.readLine());
        
        	int[] arr = new int[size];

        	System.out.println("Enter " + size +" Array Elements : ");
        	
		for(int i =0;i<arr.length ; i++){
            		arr[i] = Integer.parseInt(br.readLine());
        	}
		
		int count =0;

		for(int i = 0; i<arr.length ;i++){
			for(int j =0; j<arr.length; j++){
			
				if(arr[i] < arr[j]){
					count++;
					break;
				}
			}
		}
		System.out.println(count);

	}
}
