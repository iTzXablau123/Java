import java.util.Scanner;

public class At02{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva seu valor em metros: ");
        double numero1 = entrada.nextDouble();
        double total = numero1*100;
        System.out.println("Seu valor e igual a "+ total+" centimetros");

    }
}