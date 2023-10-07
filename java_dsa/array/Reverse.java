
import java.util.*;

class Reverse{

	/*
	 int[] revArray(int[] arr, int b){
	
		for(int i=0;i<b;i++){
		
			int temp = arr[arr.length-1];
			for(int j = arr.length-1 ; j > 0; j--){
			
				arr[j] = arr[j-1];
			}
			arr[0] = temp;
		}
		return arr;
	}
	*/

	int[] revArray(int[] arr , int b){
	
		int[] arrToRotate = new int[b];

		int j = 0;
		for(int i = arr.length - b ; i<arr.length ; i++){
		
			arrToRotate[j] = arr[i];
			j++;
		}

		for(int i = arr.length -1 ; i >= 0 ;i--){
		
			if(i>=b){
				arr[i] = arr[i-b];
			}else{
				arr[i] = arrToRotate[i];
			}
		}
		return arr;
	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of Array : ");
                int size = sc.nextInt();

                int[] arr = new int[size];

                System.out.println("Enter " + size +" Array Elements : ");

                for(int i =0;i<arr.length ; i++){
                        arr[i] = sc.nextInt();
                }

		System.out.println("Enter how many digit should shift : ");
		int b = sc.nextInt();

		Reverse obj = new Reverse();
		int[] revarr = obj.revArray(arr , b);

		for(int x : arr){
			System.out.print(x + " ");
		}
	}
}
