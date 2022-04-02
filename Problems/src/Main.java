
import java.util.Arrays;
import java.util.Scanner;
//Exact sum
class Main {

	public static void main(String[] args) {

		 try (Scanner reader = new Scanner(System.in)) {
			while (reader.hasNext()) {
				
				 
					int numberOfBooks = reader.nextInt();
					
					int[] costOfBooksInt = new int[numberOfBooks];
					for (int i = 0; i < costOfBooksInt.length; i++) {
						costOfBooksInt[i] = reader.nextInt(); 
					}
					
					int money = reader.nextInt();
					
					String space = reader.nextLine();
					
					Arrays.sort(costOfBooksInt);
					
					int price1 = -1;
					int price2 = -1;
					
					for (int i = 0; i < costOfBooksInt.length; i++) {
						int temporalprice1 = costOfBooksInt[i];
						int temporalprice2 = 0;
						
						int inicio = i+1;
				        int fin = numberOfBooks-1;
				        int medio = -1;
				        boolean found = false; 
				        
				        while (inicio <= fin && !found){
				            medio = (inicio + fin)/2;
				            if(costOfBooksInt[medio] == money-temporalprice1){
				                temporalprice2 = costOfBooksInt[medio];
				                found = true;
				            }else if (money-temporalprice1 < costOfBooksInt[medio]){
				                fin = medio - 1;
				            }else if (money-temporalprice1 > costOfBooksInt[medio]){
				                inicio = medio + 1;
				            }
				        }
				        if (temporalprice2 > 0) {
				        	if (temporalprice2 - temporalprice1 < price2 - price1 || (price2 == -1 && price2 == -1)) {
				                price1 = temporalprice1;
				                price2 = temporalprice2;
				            }	
				        }
				        
						
					}
							
					System.out.println("Peter should buy books whose prices are "+price1+" and "+price2+".\n"); 
				 
			 }
		}
		
	}

}

