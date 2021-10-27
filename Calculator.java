//calculator Progarm
import java.util.Scanner;

class Calculator{
    public static void main(String[] args) {
        char operator;
        Double number1, number2, result;
        Scanner sc= new Scanner(System.in);

        System.out.print("Choose an operator: +, -, *, or / : ");
        operator = sc.next().charAt(0);
        System.out.print("Enter first number: ");
        number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        number2 = sc.nextDouble();

            switch (operator) {
                case '+':
                    result = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + result);
                    break;
                case '-':
                    result = number1 - number2;
                    System.out.println(number1 + " - " + number2 + " = " + result);
                    break;
                case '*':
                    result = number1 * number2;
                    System.out.println(number1 + " * " + number2 + " = " + result);
                    break;
                case '/':
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                    break;
				default:
                    System.out.println("Invalid operator!");
                    break;
					}
	}
}