import java.util.Scanner;


public class arithmeticOperation {
    public static int add(int x, int y){
        return x + y;
    }
    public static int subtract(int x, int y){
        return x - y;
    }
    public static int multiply(int x, int y){
        return x * y;
    }
    public static int divide(int x, int y){
        return x / y;
    }

    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
        System.out.println("sum: " +add(num1,num2));
        System.out.println("difference: " +subtract(num1, num2));
        System.out.println("product: " +multiply(num1, num2));
        System.out.println("quotient: " +divide(num1, num2));

        scanner.close();
    }
}
