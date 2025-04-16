import java.util.Scanner;
class Discount {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);

        System.out.println("The amount used is");
        int amount = sin.nextInt();
        int Discount = 0;
        if(amount>=11000 && amount<=20000) {
            Discount = 10  ;
        }else if(amount>=21000 && amount<=30000){
            Discount = 15 ;
        }else if(amount>=31000 && amount <=34000){
            Discount = 20 ;
        }

        int DiscountedAmount  = amount - (amount*Discount/100);

        System.out.println("Your discount is: " + Discount + "%");
        System.out.println("Amount after discount: " + DiscountedAmount);
        
        

    }
    
}
