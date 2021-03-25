import java.util.*;

//members datails (individual)
class Contact
{
    //private global variables
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private long phoneNumber;
    private String email;

    //initializing global variables
    public Contact(String f_name, String l_name, String address, String city, String state, int zip, long phoneNumber, String email)
    {
        firstName = f_name;
        lastName = l_name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //update firstName
    public void updateFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    //update lastName
    public void updateLastName(String lastName)
    {
        this.lastName = lastName;
    }

    //update address
    public void updateAddress(String address)
    {
        this.address = address;
    }

    //update city
    public void updateCity(String city)
    {
        this.city = city;
    }

    //update state
    public void updateState(String state)
    {
        this.state = state;
    }

    //update zip
    public void updateZip(int zip)
    {
        this.zip = zip;
    }

    //update phoneNumber
    public void updatePhoneNumber(long phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    //update email
    public void updateEmail(String email)
    {
        this.email = email;
    }

    //to add first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //to add last name
    public void setSecondName(String lastName) {
        this.lastName = lastName;
    }

    //to add address
    public void setAddress(String address) {
        this.address = address;
    }

    //to add city
    public void setCity(String city) {
        this.city = city;
    }

    //to add state
    public void setState(String state) {
        this.state = state;
    }

    //to add zip
    public void setZip(int zip) {
        this.zip = zip;
    }

    //to add phone number
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //to add email
    public void setEmail(String email) {
        this.email = email;
    }

    //to fetch first name
    public String getFirstName() {
        return firstName;
    }

    //to fetch last name
    public String getLastName() {
        return lastName;
    }

    //to fetch address
    public String getAddress() {
        return address;
    }

    //to fetch city
    public String getCity() {
        return city;
    }

    //to fetch state
    public String getState() {
        return state;
    }

    //to fetch zip
    public int getZip() {
        return zip;
    }

    //to fetch phone number
    public long getPhoneNumber() {
        return phoneNumber;
    }

    //to fetch email
    public String getEmail() {
        return email;
    }

    //to fetch everything
    @Override //for getting all the info
    public String toString() {
        return "member info:"+"\n"+ "firstName: " + firstName +"\n"+"lastName: " + lastName +"\n"+ "address: " + address +"\n"+ "city: " + city +"\n"+ "state: " + state +"\n"+ "zip: " + zip +"\n"+ "phoneNumber: " + phoneNumber +"\n"+ "email: " + email;
    }
}

//List of members
class AddressBookMembers
{
    //creating a list for members
    private List<Contact> members;
    /**
     * members = list of members
     */

    //assigning members to the list
    public AddressBookMembers(List<Contact> members)
    {
        this.members = members;
    }

    //Returns the list of members
    public List<Contact> getContact()
    {
        return members;
    }

    //Adds a new member to the members list
    public void setMember(List<Contact> member)
    {
        this.members = member;
    }
}

public class AddressBookProgram
{
    static int i;
    static List<Contact> membersList;
    static AddressBookMembers abms;
    static Scanner sc;
    static Contact kiran;
    static Contact varun;
    static Contact object;

    public static int optionToUpdate(Object object)
    {
        Contact anObject = (Contact) object;
        sc = new Scanner(System.in);
        System.out.println("Which detail do you want to change?");
        System.out.println("1. first name" +"\n"+"2. last name"+"\n"+
                           "3. address"+"\n"+"4. city"+"\n"+"5. state"+"\n"+
                           "6. zip"+"\n"+"7. phone number"+"\n"+"8. email"+"\n"+
                           "9. exit");
        int option =sc.nextInt();
        sc = new Scanner(System.in);
        switch(option)
        {
            case 1:
                System.out.println("Enter the first name:");
                String fname = sc.nextLine();
                anObject.updateFirstName(fname);
                break;
            case 2:
                System.out.println("Enter the last name: ");
                anObject.updateLastName(sc.nextLine());
                break;
            case 3:
                System.out.println("Enter the Address: ");
                anObject.updateAddress(sc.nextLine());
                break;
            case 4:
                System.out.println("Enter the city");
                anObject.updateCity(sc.nextLine());
                break;
            case 5:
                System.out.println("Enter the state");
                anObject.updateState(sc.nextLine());
                break;
            case 6:
                System.out.println("Enter the zip");
                anObject.updateZip(sc.nextInt());
                break;
            case 7:
                System.out.println("Enter the phone number");
                anObject.updatePhoneNumber(sc.nextLong());
                break;
            case 8:
                System.out.println("Enter the email");
                anObject.updateEmail(sc.nextLine());
                break;
            default:
                System.out.println("Thank you");
        }
        return 0;
    }

    //main method
    public static void main(String[] args)
    {
        //Entering the details manually
        kiran = new Contact("Kiran", "Matham", "H.No: 1-4-5/2, Near post office, Ramapure.", "Hyderabad", "Telangana", 589267, 9865895652L, "email1@yahoo.com");

        //Creating a list for the contacts
        membersList = new ArrayList<>();

        //Adding member to the contact list
        membersList.add(kiran);

        //Taking the details from user
        sc = new Scanner(System.in);

        System.out.println("Enter member's first name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter member's last name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter email: ");
        String email = sc.nextLine();
        System.out.println("Enter member's address: ");
        String address = sc.nextLine();
        System.out.println("Enter city: ");
        String city = sc.nextLine();
        System.out.println("Enter state: ");
        String state = sc.nextLine();
        System.out.println("Enter zip: ");
        int zip = sc.nextInt();
        System.out.println("Enter phone number: ");
        long phoneNumber = sc.nextLong();

        //Passing variables/details to the Contact-class
        varun = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);

        //Creating a list for the contacts
        membersList = new ArrayList<>();

        //Adding member to the contact list
        membersList.add(varun);

        //Passing the contacts list to the address book
        abms = new AddressBookMembers(membersList);

        //printing the contact details from Contacts list
        System.out.println("Contact: "+abms.getContact());

        System.out.println("Do you want to update details? : Y/N");
        sc = new Scanner(System.in);

        //choosing the option
        switch(sc.nextLine().toUpperCase())//converting the option to upper-case
        {
            case "Y":
                System.out.println("Which persons details do you want to update?"+"\n"+" 1. person_1"+"\n"+" 2. person_2");
                System.out.println("Enter the number: ");
                switch(sc.nextInt())
                {
                    case 1:
                        //updating person_1
                        object = kiran; //passing reference to a reference
                        optionToUpdate(object);
                        break;
                    case 2:
                        //Updating person_2
                        object = varun; //passing reference to a reference
                        optionToUpdate(object);
                        break;
                    default:
                        System.out.println("Sorry! this program is for two persons only!");
                }
            default:
                System.out.println("Thank you!");
        }
        System.out.println("Contact: "+abms.getContact());
    }
}
