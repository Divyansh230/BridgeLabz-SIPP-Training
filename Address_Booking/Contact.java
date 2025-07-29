package Address_Booking;

public class Contact {
    private String name;
    private String phone;
    private String email;
    private String address;

    public Contact(String name, String phone, String email, String address) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getName() { 
    	return name; 
	}
    public String getPhone() { 
    	return phone;
	}
    public String getEmail() { 
    	return email;
    }
    public String getAddress() { 
    	return address; 
    }

   public void printDetails() {
	   System.out.println("Name : "+getName()+"\n"+"Phone : "+getPhone()+"\n Email: "+getEmail()+"\n address: "+getAddress());
	   System.out.println("==========================================================================================================================");
	   
   }

    
   
}
