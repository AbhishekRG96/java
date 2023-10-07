
class Program9{

	public static void main(String[] args){
	
		char arr[] = new char[] {'a','b','e','g','a','g'};
		int countofa = 0;
		int count = 0;

		for(int i = 0 ; i < arr.length ; i++){
		
				if(arr[i] == 'a'){
					countofa++;
				}
		
				if(arr[i] == 'g'){
					count = count + countofa;
				}
			
			}
		System.out.println(count);
	}
}
