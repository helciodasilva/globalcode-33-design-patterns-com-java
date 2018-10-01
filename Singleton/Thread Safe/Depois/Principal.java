public class Principal {
	public static void main(String[] args) {
		String s = ConfigManager.getInstance().getServerName();
		ConfigManager config = ConfigManager.getInstance();
		String s1 = config.getServerName();
	}
}
