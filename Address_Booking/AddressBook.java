package Address_Booking;


import java.util.*;

public class AddressBook<T extends Contact> {
    private final HashMap<String, T> contacts = new HashMap<>();
    //private final HashMap<String, T> phoneMap = new HashMap<>();

    
    public void addContact(T contact) {
        contacts.put(contact.getName(), contact);
        //phoneMap.put(contact.getPhone(), contact);
    }
    
    
    public T removeContact(String name) {
        T removed = contacts.remove(name);
//        if (removed != null) {
//            phoneMap.remove(removed.getPhone());
//        }
        return removed;
    }

    
    public T searchByName(String name) {
        return contacts.get(name);
    }

   
    public T searchByPhone(String phone) {
    	T a=null;
        for(String i:contacts.keySet()) {
        	if(contacts.get(i).getPhone()==phone) {
        		a=contacts.get(i);
        	}
        }
        return a;
    }

    
    public  void listContacts() {
        for(T i:contacts.values()) {
        	i.printDetails();
        }
    }

    
    public boolean hasSameAddress(String name1, String name2) {
        T c1 = contacts.get(name1);
        T c2 = contacts.get(name2);
        if (c1 == null || c2 == null) return false;
        return c1.getAddress().equals(c2.getAddress());
    }

    
    public void sortByName() {
        List<T> list = new ArrayList<>(contacts.values());
        list.sort((c1, c2) -> c1.getName().compareToIgnoreCase(c2.getName()));
        for(T i:list) {
        	i.printDetails();
        }
    }

    
    public void sortByPhone() {
        List<T> list = new ArrayList<>(contacts.values());
        list.sort(Comparator.comparing(Contact::getPhone));
        for(T i:list) {
        	i.printDetails();
        }
    }

   
}



    


    