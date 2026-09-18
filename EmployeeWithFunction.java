package OOPKelas.tugas1;

import java.util.Scanner;

public class EmployeeWithFunction {
    public static int choice = 0, jumlahKaryawan = 0;
    public static String inputDataEmployee;
    public static String[] dataEmployee = new String[10];

    public static void insertEmployee(){
        String[] bagianEmployee = inputDataEmployee.split(";");
        if (bagianEmployee.length == 2 && bagianEmployee[1].contains("@")) {
            dataEmployee[jumlahKaryawan] = inputDataEmployee;
            jumlahKaryawan++;
            System.out.println("Data successfully saved");
        } else {
            System.out.println();
            System.out.println("Invalid input! Format: nama;email");
            System.out.println();
        }
    }

    public static void viewAllEmployee(){
        System.out.println();
        System.out.println("=========================");
        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.printf("%d. %s\n", i+1 , dataEmployee[i].replace(";"," - "));
        }
        System.out.printf("Total Employee: %d\n",jumlahKaryawan);
        System.out.println("=========================");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        do {
            System.out.println();
            System.out.println("1. Insert Employee Data");
            System.out.println("2. View All Employees");
            System.out.println("3. Exit");
            System.out.print("Input Your Choice: ");

            try {
                choice = input.nextInt();
                input.nextLine();
            } catch (Exception e) {
                System.out.println("Your choice not valid, please input 1 2 or 3");
                input.nextLine();
                choice = 0;
            }

            switch (choice) {
                case 1:
                    System.out.print("Input your name and email with format (name;email): ");
                    inputDataEmployee = input.nextLine();
                    insertEmployee();
                    break;
                case 2:
                    viewAllEmployee();
                    break;
                case 3:
                    System.out.println("Thank you");
                    break;
                default:
                    break;
            }

        } while (choice != 3);

    }
}
