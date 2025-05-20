import java.util.Scanner;

public class Problem1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a = scan.nextDouble();
        System.out.print("Enter value of b: ");
        double b = scan.nextDouble();
        scan.nextLine(); 
        System.out.print("enter operation (add, subtract, multiply, divide): ");
        String operation = scan.nextLine();
        scan.close();
        Calculator calculator = new Calculator(a, b, operation);
        String result = calculator.calculate();
        System.out.println(result);
    }
}     
       class Calculator{
        private double a;
        private double b;
        private String operation;
        
        public Calculator(double a, double b, String operation){
           this.a = a;
           this.b = b;
           this.operation = operation.toLowerCase();
    }

    public String calculate(){
        switch (operation) {
            case "add":
                return "Result: " + (a + b);
            case "subtract":
                return "Result: " + (a - b);
            case "multiply":
                return "Result: " + (a * b);
            case "divide":
                if (b != 0){
                    return "Result: " + (a / b);
                } else{
                    return "Error: Cannot divide by zero";
                }
            default:
                return "Error use add, subtract, multiply, divide";
        }
    }
}





