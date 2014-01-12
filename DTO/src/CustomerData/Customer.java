package CustomerData;

import java.io.Serializable;

import General.Address;

public class Customer implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String username;
	private String eMail;
	private String firstName;
	private String lastName;
	private String phone;
	private int bankCode;
	private int accountNumber;
	private Address address;
	
	public Customer()
	{
		
	}
	
	public Customer(String a, String b, String c, String d, String e, int f, int g, Address h) {
		this.username = a;
		this.eMail = b;
		this.firstName = c;
		this.lastName = d;
		this.phone = e;
		this.bankCode = f;
		this.accountNumber = g;
		this.address = h;
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getBankCode() {
		return bankCode;
	}

	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
