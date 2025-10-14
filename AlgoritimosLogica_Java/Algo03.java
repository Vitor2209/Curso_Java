import java.util.Scanner;

public class Algo03 {

    public static void main(String[] args) {
        
        //Variaveis 
       int num1, num2, soma;
       Scanner teclado = new Scanner(System.in);

       //Entradas 
       System.out.println("Informe o primeiro numero: ");
       num1 = teclado.nextInt();

        System.out.println("Informe o segundo numero: ");
       num2 = teclado.nextInt();

       //Processamento
       soma = (num1 + num2);

       //saida
       System.out.println("A soma e " + soma);

       teclado.close();



    }
}
