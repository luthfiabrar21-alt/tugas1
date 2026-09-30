package OOPKelas.tugas1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class GroceriesManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<String>();
        int choice = 0;
        String itemName;

        do {
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Search Item");
            System.out.println("4. View List");
            System.out.println("5. Exit");
            System.out.print("Input Your Choice: ");

            try {
                choice = input.nextInt();
                input.nextLine();
            } catch (Exception e) {
                System.out.println("Input Invalid");
                input.nextLine();
                choice = 0;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    itemName = input.nextLine().trim().toLowerCase();
                    
                    if(itemName.trim().isEmpty()){
                        System.out.println("Dont empty");
                        System.out.println();
                    }
                    else if (items.contains(itemName)) {
                        System.out.println("Item Already Exist");
                        System.out.println();
                    }
                    else{
                        items.add(itemName);
                        System.out.println("Item Added!");
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Enter Item to Remove: ");
                    String namaHapus = input.nextLine().trim().toLowerCase();
                    boolean validasiRemove = items.remove(namaHapus);
                    if (validasiRemove == true) {
                        System.out.println(namaHapus + " Removed!");
                        System.out.println();
                    } 
                    else if (namaHapus.trim().isEmpty()){
                        System.out.println("Dont empty");
                        System.out.println();
                    }
                    else {
                        System.out.println("Item Not Found");
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("Enter search keyword: ");
                    String namaSearch =  input.nextLine().trim().toLowerCase();
                    System.out.println("Search Results: ");

                    if(namaSearch.trim().isEmpty()){
                        System.out.println("Dont empty");
                        System.out.println(); 
                    }

                    else{
                        boolean found = false;
                        for(String itemSearch: items){
                            if (itemSearch.toLowerCase().contains(namaSearch)) {
                                System.out.println("- " + itemSearch.substring(0,1).toUpperCase() + itemSearch.substring(1).toLowerCase());
                                found = true;
                            }
                        }
                        if (!found) {
                            System.out.println("No item match your search.");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    int nomor = 1;
                    System.out.println("Your grocery List: ");
                    for(String itemView: items){
                        System.out.printf("%d. %s\n", nomor,itemView.substring(0,1).toUpperCase() + itemView.substring(1).toLowerCase());
                        nomor++;
                    }
                    System.out.println("Total Items: " +  items.size());
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
        } while (choice != 5);
        

    }
}
