public class AplicativoComFactory {

	private CommandFactory commandFactory;

	public AplicativoComFactory() {
		commandFactory = new CommandFactory();
	}

	public void buttonEnviar_clicked() {
		BaseCommand comandoEnviar = commandFactory.create("EnviarPedido");
		comandoEnviar.executar();
	}

	public void buttonGerarPDF_clicked() {
		BaseCommand comandoGerarPDF = commandFactory.create("GerarPDF");
		comandoGerarPDF.executar();
	}

}