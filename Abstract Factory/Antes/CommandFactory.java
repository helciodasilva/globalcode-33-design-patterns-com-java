
public class CommandFactory {

	public BaseCommand create(String name) {
		BaseCommand command = null;
		if (name.equals("EnviarPedido")) {
			command = new EnviarPorEmail();
		} else if (name.equals("GerarPDF")) {
			command = new GerarPDF();
		}
		return command;
	}

}
