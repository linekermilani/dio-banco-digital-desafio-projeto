import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static final String nome = "LNK-Bank";
	private List<Conta> contas = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public List<Conta> getContas() {
		return contas;
	}
	
	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}
	
	public void exibirContas(Conta conta) {
		conta.imprimirInfosComuns();
	}
}
