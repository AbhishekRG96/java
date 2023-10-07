/*
 5. 
ϐind second largest element
arr: [8,4,1,3,9,2,6,7]
t.c = o(N)
s.c = o(1)
 */

import java.io.*;

class Program5{

	public static void main(String[] args)throws IOException{

        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        	System.out.println("Enter Size of Array : ");
        	int size = Integer.parseInt(br.readLine());
        
        	int[] arr = new int[size];

        	System.out.println("Enter " + size +" Array Elements : ");
        	
		for(int i =0;i<arr.length ; i++){
            		arr[i] = Integer.parseInt(br.readLine());
        	}
		
		int max = Integer.MIN_VALUE;
		int secmax = Integer.MIN_VALUE;

		for(int i = 0; i<arr.length ;i++){
			if(arr[i] > max){
				max = arr[i];
							
			}

			if(arr[i] < max && arr[i] > secmax){
                                secmax = max;		
			}
		}
	
	/*	for(int i = 0; i<arr.length ;i++){
                        if(arr[i] < max && arr[i] > secmax){
                                secmax = arr[i];
                        }
                }
		*/
		System.out.println(secmax);

	}
}
