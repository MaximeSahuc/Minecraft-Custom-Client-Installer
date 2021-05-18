import java.io.File;

public class FileUtils {
	public static void createDir(String folder) {
		File theDir = new File(folder);
		if (!theDir.exists()){
		    theDir.mkdirs();
		}
	}
}
