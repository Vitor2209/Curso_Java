import java.util.Scanner;

public class Algo01 {
    public static void main (String[] args ) {
            //Variaveis
        int num1, num2, soma, multiplicacao;
        Scanner teclado = new Scanner(System.in);
            
        //Entradas 
        System.out.println("Informe o primeiro numero");
        num1 = teclado.nextInt();
        System.out.println("Informe o segundo numero");
        num2 = teclado.nextInt();

        //Processamento 
        soma = num1 + num2;
        multiplicacao = soma * num1;

        //Saida 
        System.out.println("O resultado da multiplicacao e " + multiplicacao);

        teclado.close();

    }
}