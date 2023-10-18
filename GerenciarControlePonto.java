public class GerenciarControlePonto {
    public static void main(String[] args) throws InterruptedException {
       Gerente gerente = new Gerente(1, "João da Silva", "joao@email.com", "1234567890", "gerente123", "senha123");
       Secretaria telefonista = new Secretaria(2, "Maria Silva", "maria@email.com", "9876543210", "1234567890", "123");
       Secretaria secretaria = new Secretaria(3, "Ana Santos", "ana@email.com", "5551234567", "1234567890", "456");



       ControlePonto controlePonto = new ControlePonto();


//Entrada
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|          Registro de entrada de funcionarios          |");
        System.out.println("+-------------------------------------------------------+\n\n");

        Thread.sleep(2000);

        String entradaGerente = controlePonto.registraEntrada(gerente);
        System.out.println("Entrada do gerente: "+entradaGerente);
        Thread.sleep(1000);
        String entradaTelefonista = controlePonto.registraEntrada(telefonista);
        System.out.println("Entrada da telefonista: "+entradaTelefonista);
        Thread.sleep(1000);
        String entradaSecretaria = controlePonto.registraEntrada(secretaria);
        System.out.println("Entrada da secretaria: "+entradaSecretaria);

//Saida
        System.out.println("\n\n+-------------------------------------------------------+");
        System.out.println("|          Registro de entrada de Saida                 |");
        System.out.println("+-------------------------------------------------------+\n\n");


        Thread.sleep(2000);
        String SaidaGerente = controlePonto.registraSaida(gerente);
        System.out.println("Saida do gerente: " +SaidaGerente);

        Thread.sleep(1000);
        String saidaTelefonista = controlePonto.registraSaida(telefonista);
        System.out.println("Saida da telefonista: "+ saidaTelefonista);

        Thread.sleep(1000);
        String saidaSecretaria = controlePonto.registraSaida(secretaria);
        System.out.println("Saida da secretaria: " + saidaSecretaria);

    }
}
