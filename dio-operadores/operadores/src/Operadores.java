public class Operadores {
    public static void main(String[] args) throws Exception {
        /* operadores unários */
        int numero = 5;
        numero = -numero;
        System.out.println(numero);
        System.out.println(-numero); // negativa positivo, positiva negativo
        System.out.println(--numero); // diminui um
        System.out.println(++numero); // aumenta um

        numero = numero * -2;
        System.out.println(numero);

        int numero2 = 1;
        System.out.println(++numero2); // prefixo aumenta antes de ir com deus
        System.out.println(numero2++); // sufixo aumenta dps na proxima
        System.out.println(++numero2);
        boolean variavel = true;
        System.out.println(!variavel); // ! vai inverter a o boolean

        // operadores ternários, vai funcionar como se fosse um "if" e "else", mas numa
        // linha só
        int a, b;
        a = 5;
        b = 6;

        String resultado = "";
        if (a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);

        String resultado2 = a == b ? "verdadeiro" : "falso";
        System.out.println(resultado2);

    }

}
