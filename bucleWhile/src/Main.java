import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un valor: ");
        int i = sc.nextInt();
        While(i);
    }
    public static void While(int _i){
        int i = 0;
        while (i<=_i){
            System.out.println("i = " + i);
            i++;
        }
    }
}