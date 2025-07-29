package Address_Booking;

import java.util.*;
public class Main {

	public static void main(String args[]) {
		Contact c1=new Contact("Divyansh","8791314283","divyanshsinghh2304@gmail.com","Lucknow");
		Contact c2=new Contact("Tanisq","7897001321","tanishq456@gmail.com","Agra");
		Contact c3=new Contact("Nipun","9305924283","nipun789@gmail.com","Faridabad");
		
		AddressBook ab=new AddressBook();
		
		ab.addContact(c1);
		ab.addContact(c2);
		ab.addContact(c3);
		
		
		Contact c=ab.searchByName("Divyansh");
		c.printDetails();
		
		Contact b=ab.searchByPhone("9305924283");
		b.printDetails();
		
		ab.listContacts();
		
		
		ab.removeContact("Tanishq");
		//ArrayList<Contact>ll=(ArrayList<Contact>) ab.listContacts();
		ab.listContacts();
		System.out.println(ab.hasSameAddress("Tanishq","Divyansh"));
		ab.sortByName();
	}
}