import java.util.Scanner;

public class Algo09 {
    public static void main(String[] args) {
        //Variaveis 
        int numero, p = 0, i = 0;
        Scanner teclado = new Scanner(System.in);

        //Entradas
        System.out.println("Informe um numero: ");
        numero = teclado.nextInt();

        //Processamento 
        if(numero % 2 == 0) {
            p = numero;
        }else {
            i = numero;
        }

        System.out.println(p);
         System.out.println(i);

         teclado.close();
    }
}
