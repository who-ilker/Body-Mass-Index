import java.util.Scanner;
// BMI = Kilo (kg) / Boy(m) * Boy(m)
public class Main {
    public static void main(String[] args){

        double kg, m, BMI;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your kilogram (kg): ");
        kg = inp.nextDouble();
        System.out.print("Enter your height (m): ");
        m = inp.nextDouble();
        BMI = kg / (m * m);

        System.out.println("Your body mass index: "+BMI);
    }
}