import java.util.Scanner;

public class Algo04 {
    public static void main(String[] args) {
        //Variaveis 
        int metros, centimetros;
        Scanner xuxa = new Scanner(System.in);

        //Entradas 
        System.out.println("Informe o valor em metros: ");
        metros = xuxa.nextInt();

        //Processamento 
        centimetros = (metros * 100);

        //Saida
        System.out.println(metros + "metros em centimetros e " + centimetros);

        xuxa.close();
    }
    
}
