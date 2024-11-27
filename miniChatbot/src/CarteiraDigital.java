import java.util.Scanner;

public class CarteiraDigital {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0; // Iniciando o saldo com zero

        while (true) {
            System.out.println("Escolha uma opção:  1- Adicionar dinheiro  2- Realizar pagamento  3 - Verificar saldo  4- Sair");
            String opcao = scanner.nextLine(); // Captura a opção do usuário
            String resposta = analisarPergunta(opcao, saldo, scanner); // Passa o saldo atual e o scanner
            System.out.println(resposta);

            // Verifica se o usuário deseja sair
            if (opcao.equals("4")) {
                System.out.println("Saindo...");
                break;
            }
        }
        scanner.close(); // Fecha o scanner
    }

    public static String analisarPergunta(String opcao, double saldo, Scanner scanner) {
        switch(opcao) {
            case "1":
                System.out.print("Digite o valor que você quer adicionar: ");
                double adicionar = scanner.nextDouble();
                saldo += adicionar; // Adiciona o valor ao saldo
                scanner.nextLine(); // Limpa a linha do scanner
                return "Valor adicionado com sucesso! Saldo atual: R$ " + saldo;

            case "2":
                System.out.print("Digite o valor do pagamento: ");
                double pagamento = scanner.nextDouble();
                if (pagamento <= saldo) {
                    saldo -= pagamento; // Deduz o pagamento do saldo
                    scanner.nextLine(); // Limpa a linha do scanner
                    return "Pagamento realizado com sucesso! Saldo atual: R$ " + saldo;
                } else {
                    scanner.nextLine(); // Limpa a linha do scanner
                    return "Saldo insuficiente para realizar o pagamento.";
                }

            case "3":
                return "Saldo atual: R$ " + saldo;

            case "4":
                return "Encerrando a carteira digital.";

            default:
                return "Opção inválida! Por favor, escolha uma opção entre 1 e 4.";
        }
    }
}