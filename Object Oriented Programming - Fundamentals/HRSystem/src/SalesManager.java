public class SalesManager extends SalesRep {
    double salesbyteam;

    public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked,
            int vacationDaysTaken,
            double salary, int yearsWorked, String UserName, String PassWord, double salesMade, double salesbyteam) {
        super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, UserName,
                PassWord, salesMade);
        this.salesbyteam = salesbyteam;
    }

    public void calculateComission() {

        System.out.println("The Managers commission is :----------->" + 0.03f * salesbyteam);
    }

}