import java.util.Scanner;

public class Algo08 {
    public static void main(String[] args) {
        //Variaveis 
        int numero, a, b;
        Scanner teclado = new Scanner(System.in);

        //Entrada
        System.out.println("Informe um  numero: ");
        numero = teclado.nextInt();

        //Processamento
        if(numero > 0 ) {
            a = numero;
        }else { 
            b = numero;
        }
        //Saida
        System.out.println("numero");
        teclado.close();
    }
}
