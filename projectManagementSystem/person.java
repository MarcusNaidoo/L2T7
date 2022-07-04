// This is a class to create a person object
public class person {

    // Attributes
    String firstName;

    String surname;
    String telephoneNumber;
    String emailAddress;
    String physicalAddress;

    // setters
    public void setTelephoneNumber(String newTelephoneNumber){
        telephoneNumber = newTelephoneNumber;
    }
    public void setEmailAddress(String newEmailAddress){
        emailAddress = newEmailAddress;
    }

    // getters
    public String getFirstName(){
        return firstName;
    }
    public String getSurname(){
        return surname;
    }
    public String getTelephoneNumber(){
        return telephoneNumber;
    }
    public String getEmailAddress(){
        return emailAddress;
    }

    // Constructor
    public person(String firstName, String surname, String telephoneNumber, String emailAddress, String physicalAddress){
        this.firstName = firstName;
        this.surname = surname;
        this.telephoneNumber = telephoneNumber;
        this.emailAddress = emailAddress;
        this.physicalAddress = physicalAddress;
    }
    // toString method which will be used to display the person object.
    public String toString(){
        String output = "\nName: " + firstName + " " + surname + "\n" + "Telephone number: " + telephoneNumber + "\n" +
                "Email address: " + emailAddress + "\n" + "Physical address: " + physicalAddress + "\n";

        return output;
    }
}
