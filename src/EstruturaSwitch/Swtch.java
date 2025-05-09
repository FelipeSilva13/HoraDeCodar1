package EstruturaSwitch;
import java.util.Scanner;

public class Swtch {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
      //  int numero = teclado.nextInt();
        System.out.println("Digite o dia da semana");


        // switch, case e break
        // para validar a semana basead0 no número
        int diaDaSemana = teclado.nextInt();22

        switch (diaDaSemana){

            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Não é um dia da semana");
                break;
        }

    }

}
