package ArrayListas;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


public class AtualizarValores {
    public static void main(String[] args) {


        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] *= 2;
            System.out.println("Números dobrado: " + numeros[i]);
        }
        // metodo toString
        String dadosNumericos = Arrays.toString(numeros);
        System.out.println(dadosNumericos);

        int[] arrayOriginal = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arrayClone = Arrays.copyOf(arrayOriginal, arrayOriginal.length);
        System.out.println(Arrays.toString(arrayClone));
        arrayClone[0] = 10;
        System.out.println(Arrays.toString(arrayClone));
    }

}
