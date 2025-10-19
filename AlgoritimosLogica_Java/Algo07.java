import java.util.Scanner;

public class Algo07 {
    public static void main(String[] args) {
        //Variavel 
        int n ;
        Scanner teclado = new Scanner(System.in);

        //Entradas 
        System.out.println("Informe seu numero: ");
        n = teclado.nextInt();

        //Processamento 
        if(n > 100) {
            System.out.println(n);
        }else {
            n = 0;
            System.out.println(n);
        }

        teclado.close();

    }
    
}
