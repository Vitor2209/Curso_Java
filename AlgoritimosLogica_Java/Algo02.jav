public class Algo02 {

     import java.Scanner;

     public static void main(String[] arg) {
         //Variaveis
          int quantidade_minima, quantidade_maxima;
          float estoque_medio;
          Scanner teclado = new Scanner(System.in);

          //Entradas
          System.out.print("Informe a quantidade minima: ");
          quantidade_minima = teclado.nextInt();

          System.out.print("Informe a quantidade maxima: ");
          quantidade_maxima = teclado.nextInt();

          //Processamento
          estoque_medio = (quantidade_minima + quantidade_maxima) / 2;

          //Saida 
          System.out.print("O estoque medio " + estoque_medio);

          teclado.close();
          
          
     }
}

