import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        bucleFor();
    }
    public static void bucleFor(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        for (int i=0;i<=numero;i++){
            if (i<=100){
                System.out.print("\n El valor de i es: " + i);
            }
            else{
                System.out.print("\nSolo se pueden imprimir valores del 0 al 100");
            }
        }
    }
}