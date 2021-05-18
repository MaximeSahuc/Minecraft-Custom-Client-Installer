public class Values {

	private final static String launcherPath = System.getenv("ProgramFiles(X86)") +"\\Minecraft Launcher\\MinecraftLauncher.exe";

	private final static String profilesPath = System.getProperty("user.home")+"\\AppData\\Roaming\\.minecraft\\launcher_profiles.json";
	private final static String clientFolder = System.getProperty("user.home")+"\\AppData\\Roaming\\.minecraft\\versions\\CustomVersion";

	private final static String serverJarPath = "https://raw.githubusercontent.com/MaximeSahuc/Minecraft-Custom-Client-Installer/main/custom_version/custom_version.jar";
	private final static String serverJSONpath = "https://raw.githubusercontent.com/MaximeSahuc/Minecraft-Custom-Client-Installer/main/custom_version/custom_version.json";

	private final static String clientJarPath = clientFolder + "\\CustomVersion.jar";
	private final static String clientJSONpath = clientFolder + "\\CustomVersion.json";

	private final static int windowHeight = 160;
	private final static int windowWidth = 270;

	private static boolean error = false;

	public static boolean isError() {
		return error;
	}

	public static void setError(boolean error) {
		Values.error = error;
	}

	public static String getLauncherPath() {
		return launcherPath;
	}

	public static String getProfilesPath() {
		return profilesPath;
	}

	public static String getClientFolder() {
		return clientFolder;
	}

	public static String getServerJarPath() {
		return serverJarPath;
	}

	public static String getServerJsonPath() {
		return serverJSONpath;
	}

	public static String getClientJarPath() {
		return clientJarPath;
	}

	public static String getClientJsonPath() {
		return clientJSONpath;
	}

	public static int getWindowHeight() {
		return windowHeight;
	}

	public static int getWindowWidth() {
		return windowWidth;
	}
	
}
