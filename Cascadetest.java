
import java.util.Scanner;


public class Cascadetest {
    public static void main(String[] args) {
        Scanner sin =new Scanner(System.in);
        
        System.out.print("Enter month (1-12): ");
        int month = sin.nextInt();
        if(month == 12||month == 1|| month==2) 
        System.out.println("Winter");
        else if(month==3||month==4||month==5)
        System.out.println(("Spring"));
        else if(month==6||month==7||month==8)
        System.out.println("Summer");
        else if(month==9||month==10||month==11)
        System.out.println("Autumn");
        else
        System.out.println("invalid month");
    }
}
