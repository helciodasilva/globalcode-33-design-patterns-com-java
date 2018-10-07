import java.io.InputStream;
import java.util.Properties;

public class AplicativoComAbstractFactory {
	private CommandFactory commandFactory;

	public AplicativoComAbstractFactory() {
	}

	private void initCommandFactory() throws Exception {
		Properties propriedades = new Properties();
		InputStream f = getClass().getResourceAsStream("config.properties");
		propriedades.load(f);
		f.close();
		String nome = propriedades.getProperty("command.factory.class");
		Class classeFactoryCommandFactory = Class.forName(nome);
		commandFactory = (CommandFactory) classeFactoryCommandFactory.newInstance();
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