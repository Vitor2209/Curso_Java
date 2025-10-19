import java.util.Scanner;

public class Algo06 {
    public static void main(String[] args) {
        //Variaveis
    float altura, peso_ideal;
    Scanner teclado = new Scanner(System.in);

    //Entradas
    System.out.println("Qual a sua altura? ");
    altura = teclado.nextFloat();

    //Processamento
    peso_ideal = (float) (altura * 72.7) - 58; //cast

    //Saida
    System.out.println("Seu peso ideal seria " + peso_ideal);

    teclado.close();
    
    }
    

}
