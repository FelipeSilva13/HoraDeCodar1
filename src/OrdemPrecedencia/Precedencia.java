package OrdemPrecedencia;

public class Precedencia {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean c = true;

        boolean resultado = a && b || c;
        System.out.println(resultado);

        boolean resultado2 = (a && b) || c;
        System.out.println(resultado2);

        boolean resultado3 = a && !(b || c);
        System.out.println(resultado3);

        boolean resultado4 = !(a && b) || c;
        System.out.println(resultado4);
    }
}
