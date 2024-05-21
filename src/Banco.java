import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
	
	private String nome;
	private List<Cliente> clientes;
	private Map<Integer, Cliente> clientesMap;
	
	public Banco(String nome) {
		this.nome = nome;
		this.clientes = new ArrayList<>();
		this.clientesMap = new HashMap<>();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void adicionarCliente(Cliente cliente) {
		clientesMap.put(cliente.getId(), cliente);
		clientes.add(cliente);
	}
	
	public Cliente getClienteId(int id) {
		return clientesMap.get(id);
	}
	
}
