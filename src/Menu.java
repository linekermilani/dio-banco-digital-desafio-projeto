import java.util.Scanner;

public class Menu {

	int opcao;
	Scanner scanner = new Scanner(System.in);

	public void exibirMenu() {
		System.out.println("1 - Extrato da Conta Corrente");
		System.out.println("2 - Extrato da Conta Poupan�a");
		System.out.println("3 - Transfer�ncia");
		System.out.println("4 - Dep�sito");
		System.out.println("5 - Saque");
		System.out.println("0 - Sair");
	}
	
	public void acoesMenu(Conta cc, Conta poupanca) {
		do {
			System.out.print("Informe a op��o desejada: ");
			opcao = scanner.nextInt();
			switch (opcao) {
			case 1:
				cc.imprimirExtrato();
				exibirMenu();
				break;
			case 2:
				poupanca.imprimirExtrato();
				exibirMenu();
				break;
			case 3:
				System.out.print("Informe o valor da Transfer�ncia: ");
				double valor = scanner.nextDouble();
				System.out.println("Qual a forma que deseja transferir?");
				System.out.println("1 - de Conta Corrente para Poupan�a");
				System.out.println("2 - de Poupan�a para Conta Corrente");
				System.out.println("3 - Voltar");
				int opcaoConta = scanner.nextInt(); 
				if(opcaoConta == 1) {
					cc.transferir(valor, poupanca);
					System.out.println("Transfer�ncia de R$" + String.format("%.2f", valor) + " Realizada!");
				} else if(opcaoConta == 2) {
					poupanca.transferir(valor, cc);
					System.out.println("Transfer�ncia de R$" + String.format("%.2f", valor) + " Realizada!");
				} else {
					exibirMenu();
					break;
				}
				exibirMenu();
				break;
			case 4:
				System.out.print("Informe o valor do Dep�sito: ");
				valor = scanner.nextDouble();
				System.out.println("Em qual conta deseja depositar?");
				System.out.println("1 - Conta Corrente");
				System.out.println("2 - Conta Poupan�a");
				System.out.println("3 - Voltar");
				opcaoConta = scanner.nextInt(); 
				if(opcaoConta == 1) {
					cc.depositar(valor);
					System.out.println("Dep�sito de R$" + String.format("%.2f", valor) + " Realizado!");
				} else if(opcaoConta == 2) {
					poupanca.depositar(valor);
					System.out.println("Dep�sito de R$" + String.format("%.2f", valor) + " Realizado!");
				} else {
					exibirMenu();
					break;
				}
				exibirMenu();
				break;
			case 5:
				System.out.print("Informe o valor do Saque: ");
				valor = scanner.nextDouble();
				System.out.println("De qual conta deseja sacar?");
				System.out.println("1 - Conta Corrente");
				System.out.println("2 - Conta Poupan�a");
				System.out.println("3 - Voltar");
				opcaoConta = scanner.nextInt(); 
				if(opcaoConta == 1) {
					cc.sacar(valor);
					System.out.println("Saque de R$" + String.format("%.2f", valor) + " Realizado!");
				} else if(opcaoConta == 2) {
					poupanca.sacar(valor);
					System.out.println("Saque de R$" + String.format("%.2f", valor) + " Realizado!");
				} else {
					exibirMenu();
					break;
				}
				exibirMenu();
				break;
			default:
				System.out.println("Encerrado!");
				break;
			}
		} while (opcao != 0);
	}
}
