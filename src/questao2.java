import java.util.Scanner;

public class questao2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor: ");
        int valor = scanner.nextInt();
        System.out.println(fibVetor(valor));

    }

    private static String fibVetor(int valor){

        int penultimo = 0;
        int antepenultimo = 1;
        int proximo;

        while (true){
            proximo = penultimo + antepenultimo;
            if (proximo == valor){
                return "Está na sequência";
            }
            if (proximo > valor){
                return "Não está na sequência";
            }
            penultimo = antepenultimo;
            antepenultimo = proximo;
        }
    }
}
