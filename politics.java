import java.util.Scanner;
public class politics {
    public static void main(String[] args) {
        java.util.Scanner sin = new Scanner(System.in);
        
        System.out.println("Enter your age");
        int age = sin.nextInt();
        switch (age) {
            case 36: 
                    
        System.out.println("you can run for MCA");
        break;
        case 50:
        System.out.println("you can run for president");
        break;
        case 45:
        System.out.println("you can run for MP");
        break;
        case 55:
        System.out.println("you can run for senator");
        break;
        default:
        System.out.println("sorry you are not valid for any seat");

        }
        

    }
    
}
