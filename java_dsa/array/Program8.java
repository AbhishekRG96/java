
class Program8{

	public static void main(String[] args){
	
		char arr[] = new char[] {'a','a','e','g','a','g'};

		int countofa = 0;
		int countofg = 0;

		int count = 0;

		for(int i = 0; i < arr.length ;i++){
		
			if(arr[i] == 'a'){
				countofa++;
			}else if(arr[i] == 'g'){
				countofg++;
			}
		}

		int[] aarr = new int[countofa + countofg];

		int ai = 0;
		int gi = countofa;
		
		for(int i = 0; i < arr.length ;i++){

                        if(arr[i] == 'a'){
                                aarr[ai] = i;
				ai++;

                        }else if(arr[i] == 'g'){
                                aarr[gi] = i;
				gi++;
                        }
                }

		for(int x: aarr){
			System.out.println(x);
		}


		for(int i = 0 , j = countofa ; i<aarr.length - countofg ; i++){
		
			if(j >= aarr.length){
				j = countofa;
			}
			if(aarr[i] < aarr[j]){
			
				count++;
			}
			j++;
			if( j < aarr.length){
				i = i - 1;
				
			}
			
		}


		System.out.println(count);
	}
}
