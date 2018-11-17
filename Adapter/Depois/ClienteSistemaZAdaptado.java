
public class ClienteSistemaZAdaptado implements Cliente {

	private ClienteSistemaZ cliente;

	public ClienteSistemaZAdaptado(ClienteSistemaZ cliente) {
		this.cliente = cliente;
	}

	public void setTelefone(String s) {
		cliente.setFone(s);
	}

	public void setRazaoSocial(String s) {
		cliente.setNome(s);
	}

	public void setEndereco(String s) {
		cliente.setEnderecoCompleto(s);
	}

	public void registrarReclamacao() {
		cliente.reclamar();
	}

	public String getTelefone() {
		return cliente.getFone();
	}

	public String getRazaoSocial() {
		return cliente.getNome();
	}

	public String getEndereco() {
		return cliente.getEnderecoCompleto();
	}
}