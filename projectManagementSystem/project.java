//This is a class to create a project object

public class project {

    // Attributes
    int projectNumber;
    String projectName;
    String buildingDesign;
    String physicalAddress;
    int ERFNumber;
    float totalFee;
    private float amountPaidToDate;
    private String deadline;

    private String projectFinal;
    
    private String completionDate;
    person architect;
    person contractor;
    person customer;

    // setters
    public void setDeadline(String newDeadLine){
        deadline = newDeadLine;
    }
    public void setAmountPaidToDate(float newAmountPaidToDate){
        amountPaidToDate = newAmountPaidToDate;
    }

    public void setProjectFinal(String newProjectFinal){
        projectFinal = newProjectFinal;
    }
    public void setCompletionDate(String newCompletionDate){
        completionDate = newCompletionDate;
    }

    //getters
    public String getDeadline(){
        return deadline;
    }
    public float getAmountPaidToDate(){
        return amountPaidToDate;
    }
    public float getTotalFee(){
        return totalFee;
    }

    public String getBuildingDesign(){
        return buildingDesign;
    }
    public person getContractor(){
        return contractor;
    }
    public person getCustomer(){
        return customer;
    }

    //constructor
    public project(int projectNumber, String projectName, String buildingDesign, String physicalAddress, int ERFNumber,
                   float totalFee, float amountPaidToDate, String deadline,String projectFinal, String completionDate, person architect,
                   person contractor, person customer) {
        this.projectNumber = projectNumber;
        this.projectName = projectName;
        this.buildingDesign = buildingDesign;
        this.physicalAddress = physicalAddress;
        this.ERFNumber = ERFNumber;
        this.totalFee = totalFee;
        this.amountPaidToDate = amountPaidToDate;
        this.deadline = deadline;
        this.projectFinal = projectFinal;
        this.completionDate = completionDate;
        this.architect = architect;
        this.contractor = contractor;
        this.customer = customer;

    }
    //toString method which will be used to display the project object when created
    public String toString(){
        String output = "Project number: " + projectNumber + "\nProject Name: " + projectName + "\nBuilding design: " +
                buildingDesign + "\nPhysical address: " + physicalAddress + "\nERF number: " + ERFNumber + "\nTotal fee: R" +
                totalFee + "\nAmount paid to date: R" + amountPaidToDate + "\nDeadline: " + deadline +
                "\nProject status: " + projectFinal + "\nCompletion date: " + completionDate +
                "\n" + architect + "\n" + contractor + "\n" + customer;

        return output;
    }
}
