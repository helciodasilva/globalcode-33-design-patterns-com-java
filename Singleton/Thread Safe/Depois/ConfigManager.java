public class ConfigManager {
	private static ConfigManager instance;
	private String serverName;

	private ConfigManager() {
	}

	public static synchronized ConfigManager getInstance() {
		if (instance == null)
			instance = new ConfigManager();
		return instance;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
}