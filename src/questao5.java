import java.util.Arrays;
import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a palavra: ");
        String palavra = scanner.next();

        System.out.println("palavra original: " + palavra);
        System.out.print("palavra invertida: " );
        System.out.println(inverteString(palavra));

    }

    private static char[] inverteString(String palavra){
        char[] original = palavra.toCharArray();
        char[] invertida = new char[original.length];
        for (int i = 0; i < original.length; i++){
            invertida[i] = original[(original.length - 1) - i];
        }
        return invertida;
    }


}