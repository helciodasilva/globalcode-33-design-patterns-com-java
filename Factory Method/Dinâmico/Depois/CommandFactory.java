import java.io.FileInputStream;
import java.util.Properties;

public class CommandFactory {

	Properties apelidosComandos = new Properties();

	public CommandFactory() {
		try {
			apelidosComandos.load(new FileInputStream("commands.properties"));
		} catch (Exception ex) {
		}
	}

	public BaseCommand create(String name) {
		BaseCommand command = null;
		String stringClasse = apelidosComandos.getProperty(name);
		try {
			Class classe = Class.forName(stringClasse);
			Object object = classe.newInstance();
			command = (BaseCommand) object;
		} catch (Exception trateme) {
		}
		return command;
	}
}