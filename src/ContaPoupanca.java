
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, Banco banco) {
		super(cliente, banco);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(banco.getNome());
		System.out.println("=== Extrato da Conta Poupan�a ===");
		imprimirInfosComuns();
	}
}
