import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        String nome = "Gustavo Fritche";
        String tipoDeConta = "Corrente";
        double saldoConta = 2500.00;
        int opcao = 0;
        double receber = 0;
        double transferir = 0;

        System.out.println("***********************");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoDeConta);
        System.out.println("Saldo inicial: " + saldoConta);
        System.out.println("***********************");

        String operacao;
        operacao = """
                
                Operações
                
                1- Consulta saldos
                2- Recerber valor
                3- Transferir valor
                4- Sair
                
                Digite a operação desejada:
                """;
        System.out.println(operacao);

        while (opcao != 4){
            System.out.println(operacao);
            opcao = leitura.nextInt();
            if (opcao == 1){
                System.out.println("Saldo atual: " + saldoConta);
            } else if (opcao == 2) {
                System.out.println("Informe o valor a receber:");
                receber = leitura.nextDouble();
                saldoConta = saldoConta + receber;
            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir:");
                transferir = leitura.nextDouble();
                if (transferir > saldoConta){
                    System.out.println("Saldo invalido");
                } else {
                    saldoConta = saldoConta - transferir;
                }
            } else if (opcao != 4) {
                System.out.println("Opção invalida");
            }
        }
    }
}