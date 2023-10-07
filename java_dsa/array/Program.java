
class Program7{

	public static void main(String[] args){
	
		char arr[] = new char[] {'a','b','e','g','a','g'};

		int count = 0;

		for(int i = 0; i < arr.length ;i++){
		
			if(arr[i] == 'a'){
			
				for(int j = i+1; j < arr.length; j++){
				
					if(arr[j] == 'g'){
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
