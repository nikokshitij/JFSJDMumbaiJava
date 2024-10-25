package ArraysDemo;

public class Students {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;   
    
    public Students(){

    }
    public Students(String firstname,String lastname){
        firstName=firstname;
        lastName=lastname;
    }
    public Students(String firstname, String lastname, int registration){
        firstName=firstname;
        lastName=lastname;
        grade=registration;
    }
    public void printFullName(){
        System.out.println(firstName+""+lastName);
    }
    public boolean isApproved(){

        if(grade>60)
        return true;
        return false;

    }
    public int changeYearIfApproved() {
        if(grade>=60) {
            year++;
            System.out.println("Congragulations");
        }
        return 0;

    }
}
