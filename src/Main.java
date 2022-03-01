
public class Main {

	public static void main(String[] args) {
	
		Menu menu = new Menu();
		
		Cliente lineker = new Cliente("Lineker");
		Banco banco = new Banco();
		Conta cc = new ContaCorrente(lineker, banco);
		Conta poupanca = new ContaPoupanca(lineker, banco);
		
		banco.adicionarConta(cc);
		banco.adicionarConta(poupanca);
		
		menu.exibirMenu();
		
		menu.acoesMenu(cc, poupanca);
	}
}
