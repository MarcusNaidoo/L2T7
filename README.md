# Project Management System #
## Overview ##
This is a Java program to assist Poise, a structural engineering company, with managing and keeping track of their projects. This program makes use of classes and it 
has 3 classes, which are:
1. projectManagementSystem class - which contains the main method
2. project class - which has the attributes for constructing a project object. This class is linked to the person class (below) as some of the attributes in this 
class are needed from the person class for creating a project object. 
3. person class - which has the attributes for constructing a person object

The program makes use of getters and setters to display and change certain elements in the project object. The projectManagemetSystem class makes use of an empty 
arraylist to store the project object. The main has the menu which is displayed to the user, these are the following options in the menu:
1. Add new project - the user is asked to enter the information needed to create the object
2. Edit project - the user has the option to edit the object and can perform the following on the object:
   1. change due date of the project - makes use of the setDeadline method to change the due date of the project object
   2. change the amount paid to date - makes use of the setAmountPaidToDate to change the amount paid to date of the project object
   3. change the contractors contact details - make use of the setEmailAddress and setTelephoneNumber method to change the contractors contact details
3. Finalise project - an invoice is generated if the total cost of the project subtracted the amount paid to date is not zero else no invoice is generated. The invoice 
has the customer name, contact details and amount still owing printed on it. To finalise the project the object is marked as "finalised" and the completion date is added 
to it. 
4. Exit program - the program is exited using the built in exit function. 

The project class defines the attributes used in the constructor to create the project object. This is where the getters and setters for the project object are defined.
The toString method is also defined here which will be used when displaying the project object to the user. 

The person class defines the attributes used in the constructor to create the person object. This is where the getters and setters for the person object are defined. 
The toString method is also defined here which will be used when displaying the project object to the user. 

## Motivation ##
This program was developed as my first capstone project using Java for my software engineering course. 

## Build Status ##
The program is designed to meet certain specifications for the project so there maybe certain bugs or errors but these will be removed as we move on. 

## Installation ##
For this project I used IntelliJ IDEA, which the user has to have installed in order to run this program. Once installed, open IntelliJ and click on "File", then 
select "Open", and navigate to where you saved this file and then select it and press open. To run the program simply press on the green play button on the right 
side of the code that has been written in the main method. 
