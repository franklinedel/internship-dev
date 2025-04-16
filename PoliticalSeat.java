import java.util.Scanner;

public class PoliticalSeat {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sin.nextInt();

        switch (age) {
            case 36:
                System.out.println("You can run for MCA.");
                break;
            case 45:
                System.out.println("You can run for MP.");
                break;
            case 50:
                System.out.println("You can run for President.");
                break;
            case 55:
                System.out.println("You can run for Senator.");
                break;
            default:
                System.out.println("No political seat assigned for this age.");
        }
    }
}

