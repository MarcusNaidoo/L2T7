/* This is a Java program to help "Poised" keep track of their projects.
This is the import library
The following are the sites that I used to do this task:
https://www.geeksforgeeks.org/system-exit-in-java/
https://www.geeksforgeeks.org/java-lang-boolean-class-java/
https://www.tutorialspoint.com/how-to-get-the-current-date-in-java
https://www.tutorialspoint.com/how-to-compare-two-dates-in-java#:~:text=In%20Java%2C%20two%20dates%20can,if%20date1%20is%20before%20date2.
https://www.geeksforgeeks.org/arraylist-isempty-java-example/
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.System;

// This is the class and main method
public class projectManagementSystem {
    public static void main(String[] args){

        ArrayList<project> projectList = new ArrayList<>();  // This creates an empty arraylist

        Scanner input = new Scanner(System.in);

        // This is the while loop that is used to display the different options the user has to execute on a project
        while (true){
            // This is the menu that is displayed to the user
            System.out.println("Please choose from the following:\n" +
                    "1 - Add new project\n" +
                    "2 - Edit project\n" +
                    "3 - Finalize project\n" +
                    "4 - Exit program");
            int choice = input.nextInt();

            // If the user selects 1 from the menu option, they are asked for the following data which will be inputted by the user
            if (choice == 1) {
                System.out.println("What is the architects first name?");
                String architectFirstName = input.next();
                System.out.println("What is the architects surname?");
                String architectSurname = input.next();
                System.out.println("What is the architects telephone number?");
                String archTelephoneNum = input.next();
                System.out.println("What is the architects email address?");
                String archEmailAddress = input.next();
                System.out.println("What is the architects physical address?");
                String archPhysicalAddress = input.next();

                // This creates a person object called architect
                person architect = new person(architectFirstName, architectSurname, archTelephoneNum, archEmailAddress, archPhysicalAddress);

                System.out.println("What is the contractors first name?");
                String contractorFirstName = input.next();
                System.out.println("What is the contractors surname?");
                String conSurname = input.next();
                System.out.println("What is the architects telephone number?");
                String conTelephoneNum = input.next();
                System.out.println("What is the architects email address?");
                String conEmailAddress = input.next();
                System.out.println("What is the architects physical address?");
                String conPhysicalAddress = input.next();

                // This creates a person object called contractor
                person contractor = new person(contractorFirstName, conSurname, conTelephoneNum, conEmailAddress, conPhysicalAddress);

                System.out.println("What is the customers first name?");
                String customerFirstName = input.next();
                System.out.println("What is the customers surname?");
                String custSurname = input.next();
                System.out.println("What is the architects telephone number?");
                String custTelephoneNum = input.next();
                System.out.println("What is the architects email address?");
                String custEmailAddress = input.next();
                System.out.println("What is the architects physical address?");
                String custPhysicalAddress = input.next();

                // This creates a person object called customer
                person customer = new person(customerFirstName, custSurname, custTelephoneNum, custEmailAddress, custPhysicalAddress);

                System.out.println("What is the project number? (eg. 1)");
                int projNum = input.nextInt();

                //This is an option for the user for if they want to have a personalised project name or not
                System.out.println("Do you want a personalised project name? (Yes/No)");
                String projName = " ";
                String personalisedProjName = input.next().toLowerCase();
                if (personalisedProjName.equals("yes")) {
                    System.out.println("What is the project name?");
                    projName = input.next();
                }

                System.out.println("What is the building type?");
                String buildingType = input.next();
                System.out.println("What is the projects physical address?");
                String projPhysicalAddress = input.next();
                System.out.println("What is the ERF number? (eg. 542)");
                int ERFNum = input.nextInt();
                System.out.println("What is the cost of the project? (R)");
                float totalFee = input.nextFloat();
                System.out.println("How much as been paid to date? (R)");
                float paidToDate = input.nextFloat();
                System.out.println("What is the project expected to finished? (dd/mm/yyyy)");
                String deadline = input.next();
                String projectFinal = "In progress";
                String completionDate = "Not complete";

                // This is linked to the personalised project name section above.
                if (personalisedProjName.equals("no"))
                    projName = buildingType + " " + custSurname;

                // This creates a project object called newProject
                project newProject = new project(projNum, projName, buildingType, projPhysicalAddress, ERFNum, totalFee,
                        paidToDate, deadline, projectFinal, completionDate, architect, contractor, customer);

                projectList.add(newProject);   // The project is added to the arraylist
            }
            // If the user selects 2 from the above option, the following is executed
            else if (choice == 2){
                boolean ans = projectList.isEmpty();  // This boolean variable is used to check if the arraylist is empty

                if (ans == true)
                    System.out.println("The Arraylist is empty.\n");

                else {
                    // The user has the following options for editing a task
                    System.out.println("Would you like to edit:\n" +
                            "1 - Due date of the project\n" +
                            "2 - Amount paid to date\n" +
                            "3 - Contractor's contact details");

                    int editChoice = input.nextInt();

                    // If the user selects 1 the following executed
                    if (editChoice == 1) {
                        System.out.println("What is the new due date?");
                        String DD = input.nextLine();
                        projectList.get(0).setDeadline(DD);
                    }
                    // If the user selects 2 the following is executed
                    else if (editChoice == 2) {
                        System.out.println("What is the new total amount paid to date?");
                        float newAmtPaidToDate = input.nextFloat();
                        projectList.get(0).setAmountPaidToDate(newAmtPaidToDate);
                    }
                    // If the user selects 3 the following is executed
                    else if (editChoice == 3) {
                        System.out.println("What is the contractor's telephone number?");
                        String newTelephoneNum = input.nextLine();
                        System.out.println("What is the contractor's email address?");
                        String newEmailAddress = input.nextLine();
                        projectList.get(0).getContractor().setTelephoneNumber(newTelephoneNum);
                        projectList.get(0).getContractor().setEmailAddress(newEmailAddress);
                    } else
                        System.out.println("Sorry, invalid entry.");
                }
            }
            // If the user selects 3 from the main menu option above the following is executed
            else if (choice == 3){
                boolean ans = projectList.isEmpty();  // This boolean variable is used to check if the arraylist is empty

                if (ans == true)
                    System.out.println("The Arraylist is empty.\n");

                else {
                    /* First the program checks if the project is fully paid for or not. Depending on the result the
                    IF or ELSE statement is executed.
                     */
                    float owingAmount = projectList.get(0).getTotalFee() - projectList.get(0).getAmountPaidToDate();
                    // If statement state that no invoice is generated
                    if (owingAmount == 0)
                        System.out.println("Project is fully paid for. No invoice generated.");
                    // else statement generates an invoice and displays it to the user
                    else {
                        System.out.println("Customer name: " + projectList.get(0).getCustomer().getFirstName() + " " +
                                projectList.get(0).getCustomer().getSurname());
                        System.out.println("Customer number: " + projectList.get(0).getCustomer().getTelephoneNumber());
                        System.out.println("Customer email address: " + projectList.get(0).getCustomer().getEmailAddress());
                        System.out.println("Customer is still owing " + owingAmount);
                    }
                    // This section marks the project as finalised and adds the completion date
                    projectList.get(0).setProjectFinal("Finalised");
                    Date date = new Date();
                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                    String str = formatter.format(date);
                    projectList.get(0).setCompletionDate(str);

                    System.out.println(projectList.get(0).toString());
                }
            }
            /* If the user selects 4 from the option above the following is executed. Which is the project being exited
            using the built in function.
             */
            else if (choice == 4){
                System.exit(0);
            }
            else
                System.out.println("Sorry. Invalid entry, try again.");
        }
    }
}
