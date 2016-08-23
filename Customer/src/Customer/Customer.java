package Customer;

public class Customer implements Comparable<Customer>{
	
	private int unique;
	private String FirstName;
	private String surname;
	private String city;
	private String street;
	private String houseNumber;
	private int totalValue;
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}


	public Customer(String firstName, String surname, String city,
			String street, int totalValue) {
		
		this.FirstName = firstName;
		this.surname = surname;
		this.city = city;
		this.street = street;
		this.totalValue =totalValue;
		
	
		
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getHouseNumber() {
		return houseNumber;
	}


	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getStreet() {
		return street;
	}


	public int getUnique() {
		return unique;
	}


	public void setUnique(int unique) {
		this.unique = unique;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public int getTotalValue() {
		return totalValue;
	}


	public void setTotalValue(int totalValue) {
		this.totalValue = totalValue;
	}
	
	


	@Override
	public int compareTo(Customer o) {
		int res=this.FirstName.compareToIgnoreCase(o.FirstName);
		if(res==0){
			int z = this.surname.compareToIgnoreCase(o.surname);
			int x=this.city.compareToIgnoreCase(o.city);
			int y =this.street.compareToIgnoreCase(o.street);
			int l = this.houseNumber.compareToIgnoreCase(o.houseNumber);
			res=z+x+y+l;
			return res;
		}
		return res;
	}


	@Override
	public String toString() {
		System.out.println("");
		return  "The unique is "+ unique + ",  " + FirstName
				+ " " + surname + ", " + city + ", street  "
				+ street + ", total value of orders = " + totalValue ;

	}


	


	
	
	
	
	
	
	

}
