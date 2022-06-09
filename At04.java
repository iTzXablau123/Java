import java.util.Scanner;

public class At04{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva a velocidade do carro: ");
        double numero1 = entrada.nextDouble();
        if (numero1 > 80){
            Double acima = numero1 - 80;
            double multa = acima * 5;
            System.out.println("Voce ultrapassou a velocidade permitida, sua multa e de "+multa+" reais");
        }else{
            System.out.println("Voce esta dentro do limite permitido");
        }


    }
}