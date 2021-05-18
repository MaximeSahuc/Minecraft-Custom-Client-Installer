import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class utils {

	public static void startMinecraftLauncher() {
		Desktop desktop = Desktop.getDesktop();
		try {
			desktop.open(new File(Values.getLauncherPath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void install(){
		FileUtils.createDir(Values.getClientFolder());
		HttpUtils.downloadFile(Values.getServerJarPath(), Values.getClientJarPath(), "Jar");
		if(!Values.isError()){
			HttpUtils.downloadFile(Values.getServerJsonPath(), Values.getClientJsonPath(), "Json");
			startMinecraftLauncher();
			System.exit(0);
		}
	}
}
