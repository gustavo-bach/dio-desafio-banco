import java.util.List;

public class Main {

	public static void main(String[] args) {

		Banco banco = new Banco("Banco");
		
		// Criação das contas com nome e id
		
		Cliente jack = new Cliente(1, "Jack");
		Conta ccJack = new ContaCorrente(jack);
		Conta poupancaJack = new ContaPoupanca(jack);
		banco.adicionarCliente(jack);
		
		Cliente ana = new Cliente(2, "Ana");
		Conta ccAna = new ContaCorrente(ana);
		Conta poupancaAna = new ContaPoupanca(ana);
		banco.adicionarCliente(ana);
		
		// Operações básicas do banco
		
		ccJack.depositar(100);
		ccJack.transferir(50, poupancaJack);
		
		ccJack.imprimirExtrato();
		poupancaJack.imprimirExtrato();
		
		ccAna.depositar(100);
		ccAna.transferir(50, poupancaAna);
		
		ccAna.imprimirExtrato();
		poupancaAna.imprimirExtrato();
		
		// Lista com todos clientes do banco
		
		System.out.println("=== Clientes cadastrados ===");

		// Imprime uma lista com os clientes cadastros e seus respectivos "ID".
		
		List<Cliente> listaClientes = banco.getClientes();
		for (Cliente cliente : listaClientes) {
			System.out.println("Cliente: " + cliente.getNome() + " ID: " + cliente.getId());
		}
		
		// Faz uma busca de cliente por ID
		
		System.out.println("=== Busca ===");
		
		Cliente buscaID = banco.getClienteId(1);
		if (buscaID != null) {
			System.out.println("Cliente: " + buscaID.getNome());
		} else { System.out.println("Não há clientes com esse ID."); }
	}

}
