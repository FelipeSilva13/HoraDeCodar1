package ParImpar;

import java.util.Scanner;

public class Paridade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero: ");

        int numero = teclado.nextInt();

        String resultado = "";

        if (numero % 2 == 0){
            resultado = "Par";
        }else {
            resultado = "Impar";
        }
        System.out.println("O número é: " + resultado);


        teclado.close();
    }

}
