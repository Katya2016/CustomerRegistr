package Customer;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestListOfCustomers {
	
	static ListOfCustomers myListOfCustomers;
	static Customer c1;
	static Customer c2;
	static Customer c3;
	static Customer c4;
	

	@BeforeClass
	public static void beforeClass()  {
		
		myListOfCustomers = new ListOfCustomers();
		c1=new Customer("Boguw", "Kate", "Lviv", "Franko", 1000);
		c2=new Customer("Boguw", "Pawa", "Lviv", "Franko", 500);
		c3=new Customer("Palisa", "Roma", "Lviv", "Rinok", 230);
		c4=new Customer("Rudo", "Lesya", "Lviv", "Gorodocka", 50);
		
	}

	@Before
	public void before() {
		
		myListOfCustomers.addCustomers(c1);
		myListOfCustomers.addCustomers(c2);
		myListOfCustomers.addCustomers(c3);
		
		
	}
	@After
	public void after() {
		myListOfCustomers.getListOfCustomers().clear();
	}
	
	@Test
	public void testAddCustomers() throws Exception {
		
		int x=myListOfCustomers.getListOfCustomers().size();
		myListOfCustomers.addCustomers(c4);
		assertEquals(x + 1,myListOfCustomers.getListOfCustomers().size());
		
	}
	
	@Test
	public void testComparison() throws Exception {
		
		TreeSet<Customer> temp = myListOfCustomers.comparison();
		for(Customer c: temp){
			
			assertEquals(true, c.getTotalValue()>250);
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	

}
