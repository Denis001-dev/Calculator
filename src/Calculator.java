import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char CalculateOperation = 'c';
        double val1 ;
        double val2;
        char operation;
        double result = 0;
        do {
            if (CalculateOperation == 'c') {
                System.out.println("Enter 1 Value");
                val1 = sc.nextInt();
                System.out.println("Enter Operand");
                operation = sc.next().charAt(1);

            }else {
                val1 = result;
                operation = CalculateOperation;
            }
                System.out.println("Enter 2 Value");
                val2 = sc.nextInt();


                result = calculate(val1, operation, val2);
                System.out.println(result);
                CalculateOperation = sc.next().charAt(0);
            }
            while (CalculateOperation != 'S') ;

    }


    public static  double calculate(double val1, char operation, double val2) {

        return switch (operation) {
            case '+' -> val1 + val2;
            case '-' -> val1 - val2;
            case '*' -> val1 * val2;
            case '/' -> val1 / val2;

            default -> {
                System.out.println("Incorrect operand input ");
                yield 0;
            }
        };
    }
}
