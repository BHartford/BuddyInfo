import java.util.ArrayList;
public class AddressBook {
	ArrayList<BuddyInfo> buddyList;
	public AddressBook()
	{
		//lel
		buddyList = new ArrayList<BuddyInfo>();
	}
	public void addBuddy(BuddyInfo buddy)
	{
		buddyList.add(buddy);
	}
	public void removeBuddy(BuddyInfo buddy)
	{
		buddyList.remove(buddy);
	}
	public static void main(String args[])
	{
		System.out.println("Address book");
		AddressBook book = new AddressBook();
		BuddyInfo newBuddy = new BuddyInfo("guy","123 lane","613-867-5309");
		book.addBuddy(newBuddy);
		book.removeBuddy(newBuddy);
	}
	public void test()
	{
		System.out.println("this is a test");
	}
}
