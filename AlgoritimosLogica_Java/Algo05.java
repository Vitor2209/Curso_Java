import java.util.Scanner;

public class Algo05 {
    public static void main(String[] args) {
        //Variaveis 
        float valor_por_hora, salario;
        int horas_trabalhadas;
        Scanner teclado = new Scanner(System.in);

        //Entradas
        System.out.println("Qual o valor voce ganha por hora?");
        valor_por_hora = teclado.nextInt();

        System.out.println("Quantas horas voce trabalhou neste mes?");
        horas_trabalhadas = teclado.nextInt();

        //Processamento
        salario = (horas_trabalhadas * valor_por_hora);

        //Saida 
        System.out.println("Neste mes voce vai receber R$ " + salario);

        teclado.close();

    }
}
