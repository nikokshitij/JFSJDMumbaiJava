
public class Employee implements UserInterface
{
    String firstName;
    String lastName;
    int registration;
    int age;
    int daysWorked;
    int vacationDaysTaken;
    double salary;
    int yearsWorked;
    private String UserName;
    private String PassWord;


    

    public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
            double salary, int yearsWorked, String UserName, String PassWord) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.age = age;
        this.daysWorked = daysWorked;
        this.vacationDaysTaken = vacationDaysTaken;
        this.salary = salary;
        this.yearsWorked = yearsWorked;
        this.UserName = UserName;
        this.PassWord = PassWord;
    }
    @Override
    public boolean login(String username, String password)
    {
        return this.UserName.equals(username) && this.PassWord.equals(password);
    }


    public int timeToRetirement(int age,int yearsWorked)
    {
        
        return Math.min(60 - age, 40 - yearsWorked);
     }
  
     public int vacationTimeLeft(){

         return (daysWorked/360)*(30 - vacationDaysTaken);
     }
  
     public int calculateBonus(double salary)
     {
         
         return (int) ((int)2.2*salary);
     }
    
}