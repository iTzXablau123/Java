import java.util.Scanner;

public class At03{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva um numero: ");
        double numero1 = entrada.nextDouble();
        if(numero1 %2==0){
        System.out.println("Seu numero e par");
        }else{
         System.out.println("Seu numero e impar");
        }


    }
}