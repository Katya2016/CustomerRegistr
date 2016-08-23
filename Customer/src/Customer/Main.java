package Customer;



public class Main {

	public static void main(String[] args) {
		
		
		ListOfCustomers l = new ListOfCustomers();
		System.out.println("Input parol: ");
		if(l.scStr().equals("0000")){
			System.out.println("Choose Your action:");
			System.out.println("In order to add customer input 1;");
			System.out.println("In order to read customer data from file and display all the customers input 2;");
			System.out.println("In order to read customer data from file and display all the customers who ordered goods for the value even or greater than a specific value input 3;");
			
		
			while(true){
				try{switch (l.scInt()) {
				case 1:
					l.addCustomers(new Customer());
					
					break;
				case 2:
					l.fileOfCustomers(l.getListOfCustomers());
					break;
					
				case 3:
					l.comparison();
					
					break;

				default:
					break;
				}}
				catch(java.util.InputMismatchException e){
					System.out.println("You should input number!! Not word!!"); 
					System.out.println("Please, try again");
				}
			}
		}else{
			System.out.println("Parol is uncorrect");
			System.out.println("You don't access! ");
		}
	
	
	
		
	}

}
