import java.util.Scanner;
public class Algo10 {
    public static void main(String[] args) {
        //Variaveis 
        float altura, peso_ideal;
        char sexo;
        Scanner teclado = new Scanner(System.in);

        //Entradas 
        System.out.println("Informe sua altura: ");
        altura = teclado.nextFloat();

        System.out.println("Informe o sexo m/f: ");
        sexo = teclado.next().charAt(0); //"banana"

        //Processamento
        if(sexo == 'm') {
            peso_ideal = (float) (72.7 * altura) - 58;
            System.out.println("Seu peso ideal e " + peso_ideal);
        }
        if(sexo == 'f') {
            peso_ideal = (float) (62.1 * altura) - (float)44.7;
            System.out.println("Seu peso ideal e " + peso_ideal);

        }
        if(sexo != 'm' && sexo != 'f') {
            System.out.println("Sexo nao reconhecido.");
            peso_ideal = 0;
        }
          teclado.close();
    }

        
}
