public class Main{

	public static void main(String[] args) {
		ContactList contactsList = new ContactList();
		
		contactsList.addContact("Gita, 9000000065);
		contactsList.addContact("Police", 100);
		contactsList.addContact("Rita", 9111111111);
				
		System.out.println("Police: " + contactsList.doesContactNameExist("Police"));
		System.out.println("98765432: " + contactsList.doesContactNumberExist(98765432));
		
		System.out.println();
		contactsList.listAllContacts();
	}

}