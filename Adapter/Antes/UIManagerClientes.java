
public class UIManagerClientes {
	public void apresentarClienteGUI(ClientePanel clientePanel, Cliente cliente) {
		clientePanel.setRazaoSocial(cliente.getRazaoSocial());
		clientePanel.setEndereco(cliente.getEndereco());
		clientePanel.setTelefone(cliente.getTelefone());
	}

	public void apresentarClienteGUI(ClientePanel clientePanel, ClienteSistemaZ cliente) {
		clientePanel.setRazaoSocial(cliente.getNome());
		clientePanel.setEndereco(cliente.getEnderecoCompleto());
		clientePanel.setTelefone(cliente.getFone());
	}
}
