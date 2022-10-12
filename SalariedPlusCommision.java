import java.util.Scanner;

public class SalariedPlusCommision extends Salaried{
    private double salesDuringLastWeek;
    private double commisionRate;

    public void load(){
       super.load();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sales for this past weel ==> ");
        this.salesDuringLastWeek = scanner.nextDouble();

        System.out.print("Sales commission rate (fraction paid to employee) ==> ");
        this.commisionRate = scanner.nextDouble();
    }


    @Override
    public double getEarnings() {
        double totalEarnings = this.weeklySalary + (this.salesDuringLastWeek * this.commisionRate);
        if (totalEarnings > 1000){
            totalEarnings = 1000;
        }
        return totalEarnings;
    }
}
