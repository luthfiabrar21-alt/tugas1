package OOPKelas.tugas1;
import java.util.Scanner;

public class BMI {
    public static double hitungBMI(double heightM, double weight){
            double BMI = weight/(heightM*heightM);
            return BMI;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight = 0, heightCm = 0;
        
        try {
            System.out.println();
            System.out.print("Masukkan tinggi badan anda (Cm): ");
            heightCm = input.nextDouble();
            System.out.print("Masukkan berat badan anda (Kg): ");
            weight = input.nextDouble();
            System.out.println("Tinggi Badan (Cm) = " + heightCm + " Berat Badan (Kg) = " + weight);

            double heightM = 0;
            heightM = heightCm / 100;
            double BMI = hitungBMI(heightM, weight);
            System.out.print(String.format("%.2f Kategori ", BMI));

            if(BMI < 18.5){
                System.out.print("Underweight\n");
            }
            else if (BMI >= 18.5 && BMI <= 24.9) {
                System.out.print("Normal\n");
            }
            else if (BMI >= 25 && BMI <= 29.9) {
                System.out.print("Overweight\n");
            }
            else {
                System.out.print("Obese\n");
            }

        } catch (Exception e) {
            System.out.print("Inputan tidak valid, Masukkan inputan yang valid\n");
            input.nextLine();
        }
    }
}
