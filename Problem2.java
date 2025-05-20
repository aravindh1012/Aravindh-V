import java.util.Scanner;

public class Problem2{
       public static void main(String[] args) {
            oddNumbers();   
       }   
       public static void oddNumbers(){
              Scanner scan = new Scanner(System.in);
              System.out.print("enter the number for a : ");
              int a = scan.nextInt();
              if(a < 0){
                     System.out.print("please enter a positive number:");
                     a = scan.nextInt();
              }
              int num = 1;
              // loop to print odd numbers with range of a
              for (int i = 1; i <= a; i++) {
                   if (i != 1) {
                     System.out.print(", ");
              }
              System.out.print(num);
              num += 2; 
              }
              scan.close();

       }       
}
