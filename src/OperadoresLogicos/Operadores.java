package OperadoresLogicos;

public class Operadores {
    public static void main(String[] args) {
        // AND
       int idade = 18;
        boolean habilitado = true;

        System.out.println(idade >= 18 && habilitado);
        System.out.println(idade >= 18 && habilitado == true);

        boolean habiltadoVencida = false;
        System.out.println(idade >= 18 && habiltadoVencida);

        // OR
        boolean estaChovendo = false;
        boolean temGuardaChuva = true;

        System.out.println(estaChovendo || temGuardaChuva );
        System.out.println(estaChovendo || temGuardaChuva == true);

        System.out.println(10 > 20 && 100 == 200);
        System.out.println(20 > 10 || 100 == 200);


        // usuario pode participar do clube
        // precisa ser > 16 anos OU ser membro
        int idade2 = 16;
        boolean ehmembro = false;
        if (idade2 > 16 || ehmembro);

        if (idade2 >=16 || ehmembro) {
            System.out.println("Você pode entrar");
        } else {
            System.out.println("Entrada negada");

        }

        // NOT
        System.out.println(estaChovendo);
        System.out.println(!estaChovendo);

        System.out.println(estaChovendo || !temGuardaChuva);
        System.out.println(!(estaChovendo || !temGuardaChuva));

    }



}
