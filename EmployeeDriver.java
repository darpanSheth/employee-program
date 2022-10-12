import java.util.Scanner;

public class EmployeeDriver {
    public static void main(String[] args){

        Employee[] employees = new Employee[100];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of employees: ");
        int numberOfEmployees = scanner.nextInt();

        for(int i = 0; i < numberOfEmployees; i++){
            System.out.println("PROFILE FOR EMPLOYEE #" + (i+1));
            System.out.println("Hourly(1), Salaried(2), Salaried plus Commision(3)");
            System.out.print("Enter your choice (1, 2 or 3): ");
            int choice = scanner.nextInt();

            if(choice == 1){
                employees[i] = new Hourly();
                ((Hourly) employees[i]).load();
            }

            if(choice == 2){
                employees[i] = new Salaried();
                ((Salaried) employees[i]).load();
            }

            if(choice == 3){
                employees[i] = new SalariedPlusCommision();
                ((SalariedPlusCommision) employees[i]).load();
            }
            System.out.println();
        }

        for (int i = 0; i < numberOfEmployees; i++){
            System.out.println(employees[i].toString());
        }
    }
}
