import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Donatello da Silva";
        String tipoConta = "Conta Corrente";
        double saldo = 1599.00;
        double valor = 0;
        int opcao = 0;

        System.out.println("\n**************************");
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo da conta: R$   " + saldo);
        System.out.println("\n**************************");

        String menu = """ 
                ** Digite a sua opção **
                1 - Consultar saldo
                2 - Depositar valor
                3 - Sacar valor
                4 - Sair
                            
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("\n*************************");
                    System.out.println("Saldo da conta é R$ " + saldo);
                    System.out.println("\n*************************");
                }
                case 2 -> {
                    System.out.println("Qual valor a depositar? ");
                    valor = leitura.nextDouble();
                    saldo += valor;
                    System.out.println("\n*************************");
                    System.out.println("Operação CONCLUIDA! O seu saldo atual é R$ " + saldo);
                    System.out.println("\n*************************");
                }
                case 3 -> {
                    System.out.println("Qual é o valor para sacar? ");
                    valor = leitura.nextDouble();

                    if ( valor >= saldo){
                        System.out.println("SAQUE CANCELADO! NÃO HÁ SALDO SUFICIENTE NA CONTA.");
                    } else{
                        saldo -= valor;
                        System.out.println("Operação concluída!");
                    }

                    System.out.println("\n*************************");
                    System.out.println("O seu saldo atual é R$ " + saldo);
                    System.out.println("\n*************************");
                }
                case 4 -> {break;}

            } if (opcao != 4) {
                System.out.println("Opção inválida");

            }
        }
    }
}