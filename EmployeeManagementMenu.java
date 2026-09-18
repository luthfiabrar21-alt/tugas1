package OOPKelas.tugas1;

import java.util.Scanner;

public class EmployeeManagementMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan, totalEmployee = 0;

        String employee;
        String[] employees = new String[10];

        do {
            System.out.println();
            System.out.println("1. Insert Employee Data");
            System.out.println("2. View All Employees");
            System.out.println("3. Exit");
            System.out.print("Masukkan Pilihan ke - ");
            
            try {
                pilihan = input.nextInt();
                input.nextLine();
            } catch (Exception e) {
                System.out.println();
                System.out.println("inputan harus (1,2,3)");
                input.nextLine();
                pilihan = 0;
            }

            switch (pilihan) {
                case 1:
                    System.out.println();
                    System.out.print("Enter employee (name;email): ");
                    employee = input.nextLine();
                    String[] parts = employee.split(";");

                    if (parts.length == 2 && parts[1].contains("@")) {
                        employees[totalEmployee] = employee;
                        totalEmployee++;
                        System.out.println("Data berhasil disimpan");
                    }
                    else{
                        System.out.println();
                        System.out.println("Input tidak valid! Format: nama;email");
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("====================================");

                    for(int i = 0; i < totalEmployee; i++){
                        System.out.printf("%d. %s\n",i+1, employees[i].replace(";", " - "));
                    }
                    System.out.printf("Total Employee: %d\n", totalEmployee);
                    if (totalEmployee > 0) {

                        String[] firstParts = employees[0].split(";");
                        String namaTerpanjang = firstParts[0];

                        for (int i = 1; i < totalEmployee; i++) {
                            String[] currentParts = employees[i].split(";");
                            String namaSekarang = currentParts[0];

                            if (namaSekarang.length() > namaTerpanjang.length()) {
                                namaTerpanjang = namaSekarang;
                            }
                        }

                        System.out.println("Longest name: " + namaTerpanjang);
                    }

                    System.out.println("====================================");
                    break;
                case 3:
                    System.out.println();
                    System.out.println("thanks");
                    System.out.println();
                    break;
                default:
                    System.out.println("Input tidak Valid");
                    break;
            }

        } while (pilihan != 3);
    }
}
