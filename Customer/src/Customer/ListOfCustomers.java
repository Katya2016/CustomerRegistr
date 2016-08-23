package Customer;


import java.io.BufferedReader;



import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.LinkedHashSet;;




public class ListOfCustomers {
	
	
	private TreeSet <Customer>listOfCustomers = new TreeSet<>();
	private File fileList = new File("listOfCustomers.txt");

	public ListOfCustomers() {
		
		this.listOfCustomers = listOfCustomers;
		
	}
	public File getFileList() {
		return fileList;
	}


	public void setFileList(File fileList) {
		this.fileList = fileList;
	}
		
	
	
	public TreeSet<Customer> getListOfCustomers() {
		return listOfCustomers;
	}
	public void setListOfCustomers(TreeSet<Customer> listOfCustomers) {
		this.listOfCustomers = listOfCustomers;
	}
	
	public String scStr() {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		return str;
		
		
	}
	public int scInt() {
		Scanner sc=new Scanner(System.in);
		int x =sc.nextInt();
		return x;
		
		
	}
	public void addCustomers(Customer c) {
		
		
		c = new Customer("firstName", "surname", " city", " street",0);

		
		System.out.println("Please, input firstname of customer:");
		
		c.setFirstName(scStr());
		System.out.println("Please, input  surname of customer:");	
		c.setSurname(scStr());
		System.out.println("Please, input city of customer:");
		c.setCity(scStr());
		System.out.println("Please, input street of customer:");
		c.setStreet(scStr());
		System.out.println("Please, input house  number of customer:");
		c.setHouseNumber(scStr());
		
		System.out.println("Please input  total value of all the goods he ordered");
		c.setTotalValue(scInt());
		c.setUnique((listOfCustomers.size())+1);
		
		for(Customer c2 : listOfCustomers){
			if(c2.getUnique()==c.getUnique()){
				System.out.println("This customers' unique is already exsist");
				System.out.println("Please, input another unique");
				System.out.println("There are uniques, which You can not use:");
				TreeSet <Integer>temp=new TreeSet<>();
				for(Customer c3:listOfCustomers){
					int x =c3.getUnique();
					temp.add(x);
				}
				System.out.println(temp);
				
				c.setUnique(scInt());
				for(Customer c4:listOfCustomers){
					if(c4.getUnique()==c.getUnique()){
						System.out.println("You can't use the existing unique!!");
						return;
					}
					
				}
			}
		}
		
		listOfCustomers.add(c);
		System.out.println("The customer is added");

		
		
	}
	
	public void fileOfCustomers(TreeSet<Customer>trs) {
		
		try {
			PrintWriter writer = new PrintWriter(new FileWriter(fileList));
			for(Customer c : trs){
				writer.println(c);
				
			}
			writer.flush();
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Mistakes in this file!");
		}
		
		BufferedReader read;
		try {
			read = new BufferedReader(new FileReader(fileList));
			 String s;
			 while((s=read.readLine())!=null){
				 System.out.println(s);
			 	}
			 read.close();
			 
			 }catch ( IOException e) {
			// TODO Auto-generated catch block
				 System.out.println("Mistakes in this file!");
		}
		
		 }
	
	public TreeSet<Customer> comparison() {
		
		TreeSet<Customer>temp = new TreeSet<>();

		System.out.println("Please input value for comparison: ");
		int x = scInt();
		for(Customer c : listOfCustomers){
			if(c.getTotalValue()>=x){
			
				temp.add(c);
				
			}
			
		}
		
		fileOfCustomers(temp);
		return temp;
		
		
	}


	
		
		
		
		
		
	}



	


