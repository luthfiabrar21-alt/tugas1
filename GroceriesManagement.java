package OOPKelas.tugas1;

import java.util.HashSet;
import java.util.Scanner;

public class GroceriesManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<String> barang = new HashSet<String>();
        int pilihan = 0;
        String namaBarang;
        // String[] barang = new String[50];


        do {
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Search Item");
            System.out.println("4. View List");
            System.out.println("5. Exit");
            System.out.print("Input Your Choice: ");

            try {
                pilihan = input.nextInt();
                input.nextLine();
            } catch (Exception e) {
                System.out.println("Input Invalid");
                input.nextLine();
                pilihan = 0;
            }

            switch (pilihan) {
                case 1:
                    System.out.print("Enter item name: ");
                    namaBarang = input.nextLine();
                    boolean validasiAdd = barang.add(namaBarang);
                    if (validasiAdd == true) {
                        System.out.println("Item Added!");
                        System.out.println();
                    } else {
                        System.out.println("Item Already Exist");
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Enter Item to Remove: ");
                    String namaHapus = input.nextLine();
                    boolean validasiRemove = barang.remove(namaHapus);
                    if (validasiRemove == true) {
                        System.out.println(namaHapus + " Removed!");
                        System.out.println();
                    } else {
                        System.out.println("Item Not Found");
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("Enter search keyword: ");
                    String namaSearch =  input.nextLine().trim().toLowerCase();
                    System.out.println("Search Results: ");
                    boolean validasiSearch = false;


                    for(String nama: barang){
                        if (nama.toLowerCase().contains(namaSearch)) {
                            System.out.println("- " + nama);
                            validasiSearch = true;
                        }
                    }
                    System.out.println();
                    if (!validasiSearch) {
                        System.out.println("No item match your search.");
                        System.out.println();
                    }
                    break;
                case 4:
                    int nomor = 1;
                    System.out.println("Your grocery List: ");
                    for(String nama: barang){
                        System.out.printf("%d. %s\n", nomor,nama);
                        nomor++;
                    }
                    System.out.println("Total Items: " +  barang.size());
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Thanks");
                    System.out.println();
                    break;
                default:
                    System.out.println("Input Invalid");
                    System.out.println();
                    break;
            }
        } while (pilihan != 5);
        

    }
}
