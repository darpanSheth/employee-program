import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public abstract class Employee {
    private String name;
    private String socialSecurityNumber;
    private int birthdayMonth;
    private int birthdayWeek;
    private int bonus;


    public void load(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name ==> ");
        this.name = scanner.nextLine();

        System.out.print("Social Security Number ==> ");
        this.socialSecurityNumber = scanner.nextLine();

        System.out.print("Birthday Month ==> ");
        this.birthdayMonth = scanner.nextInt();

        System.out.print("Birthday Week ==> ");
        this.birthdayWeek = scanner.nextInt();
    }

    public String toString(){
        return String.format("employee: %s\nsocial security number: %s\npaycheck: $%.2f\n", this.name, this.socialSecurityNumber, this.getEarnings());
    }

    public int getBonus(){
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH);
        int week = cal.get(Calendar.WEEK_OF_MONTH);

        if(this.birthdayMonth == (month + 1) && this.birthdayWeek == week - 1){
            bonus = 100;
        }
        else{
            bonus = 0;
        }
        return bonus;
    }

    public abstract double getEarnings();
}