public class OperadoresComparaçoes {

    public static void main(String[] args) throws Exception {

        String nome = "pessoa";
        String nome2 = "pessoa2";

        System.out.println(nome == nome2); // como é diferente não vai da true

        nome2 = "pessoa";
        System.out.println(nome == nome2); // aqui por ser igual vai dar true

        nome2 = new String("pessoa");

        System.out.println(nome == nome2);// aqui n vai dar true pq é outro objeto e == compara o objeto, com valor
                                          // numérico como ele armazena como dado da certo, mas string n

        System.out.println(nome.equals(nome2)); // aqui da true pq ele n ta analizando o objeto e sim o conteúdo do
                                                // objeto

        boolean cond1 = true;
        boolean cond2 = false;

        if ((cond1 || cond2) && (cond1 && cond2)) { // || ou, && e
            System.out.println("show dbola marcio");
        } else
            System.out.println("graxa veia");

    }
}