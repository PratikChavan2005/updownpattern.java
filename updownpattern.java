
import java.util.Scanner;


class updownpattern{
    public static void main(String[] args) {
        System.out.println("Enter the no of rows");
        Scanner input = new Scanner(System.in); 
        int x = input.nextInt();
        for (int i = 0; i < x; i++) {

            for (int j= x; j>i; j--) {
                
            
            System.out.print("*");
            }
            System.out.println();
        }
    }
}