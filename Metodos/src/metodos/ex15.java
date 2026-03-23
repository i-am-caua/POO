package metodos;

import java.util.Scanner;

public class ex15 {

    static String inverterManual(String texto) {
        String invertida = "";
        
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }
        
        return invertida;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite uma palavra ou frase para inverter:");
        String original = input.nextLine(); 
        
        String resultado = inverterManual(original);
        
        System.out.println("--- Resultado ---");
        System.out.println("Original: " + original);
        System.out.println("Invertida: " + resultado);
        
        input.close();
    }
}