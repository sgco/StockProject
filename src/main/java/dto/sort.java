package dto;

public class sort {

	public static void main(String[]args){
		
		
		int g;
		int []numbers = {1,3,2,4};
		String []stringos = {"1","3","2","4"};
		int []conve= new int[4];
		
		
		for(int i= 0; i<= stringos.length-1;i++){
			conve[i] = Integer.parseInt(stringos[i]);
		}
		
		System.out.println("Stringos");
		
		

		for(int i= 0; i< conve.length;i++){
			
			for(int j=0;j<conve.length;j++)
			
			if(conve[i] <conve[j]){
			g = conve[i];				
			conve[i] = conve[j];
			conve[j] = g;
		}
	}
		for(int i= 0; i<= conve.length-1;i++){
			System.out.println(conve[i]);
		}
		
		System.out.println("end conve");
		
		System.out.println("sorted numbers");
		
		for(int i= 0; i<= numbers.length-1;i++){
			System.out.println(numbers[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		for(int i= 0; i< numbers.length;i++){
			
			for(int j=0;j<numbers.length;j++)
			
			if(numbers[i] < numbers[j]){
			g = numbers[i];				
			numbers[i] = numbers[j];
			numbers[j] = g;
		}
	}
		
		System.out.println("sorted numbers");
		
		for(int i= 0; i<= numbers.length-1;i++){
			System.out.println(numbers[i]);
		}
		
		
		
		
		
		System.out.println("descending");
		
for(int i= 0; i< numbers.length;i++){
			
			for(int j=0;j<numbers.length;j++)
			
			if(numbers[i] > numbers[j]){
			g = numbers[i];				
			numbers[i] = numbers[j];
			numbers[j] = g;
		}
	}
		
		

for(int i= 0; i<= numbers.length-1;i++){
	System.out.println(numbers[i]);
}





	}
	
	
	
	
	
	
	
	
	
	
	
}
