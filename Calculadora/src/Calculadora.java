import java.util.Scanner;



public class Calculadora{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num1, num2, resultado;
        char operacion;

        System.out.println("Calculadora en Java");
        System.out.println("Ingresa la operacion ( +, -, *, / ): ");
        operacion = sc.next().charAt(0);
        System.out.println("Ingresa el primer numero: ");
        num1 = sc.nextDouble();
        System.out.println("Ingresa el segundo numero: ");
        num2 = sc.nextDouble();

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0){
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                }else{
                    System.out.println("Error: Division por cero no permitida");
                    break;
                }
            default:
                System.out.println("Operacion no valida");
                break;
        }

        main(args);
    }
}