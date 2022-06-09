import java.util.Scanner;

public class At01{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva seu primeiro numero: ");
        double numero1 = entrada.nextDouble();
        System.out.println("Escreva seu segundo numero: ");
        double numero2 = entrada.nextDouble();
        System.out.println("==============================================");

        double total = numero1+numero2;
        System.out.println("Seu resultado foi "+ total);

    }
}