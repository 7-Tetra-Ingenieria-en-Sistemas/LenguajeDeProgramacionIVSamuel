import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[+] Ingrese la cantidad de numeros a imprimir");

        long numero = sc.nextLong();

        for (long i=0; i<=numero; i++){
            System.out.printf("\t- i: %d\n",i);
        }

    }
}