import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtils {

	public static void downloadFile(String link, String out, String name) {
		GUI.getStatus().setText("Downloading " + name);
		try {
			URL url = new URL(link);
			HttpURLConnection http = (HttpURLConnection)url.openConnection();
			int fileSize = http.getContentLength();
			BufferedInputStream in = new BufferedInputStream(http.getInputStream());
			FileOutputStream fos = new FileOutputStream(out);
			BufferedOutputStream bous = new BufferedOutputStream(fos, 1024);
			byte[] buffer = new byte[1024];
			int downloaded = 0;
			int read = 0;
			int percentDownload = 0;

			while((read = in.read(buffer, 0, 1024)) >= 0) {
				bous.write(buffer, 0, read);
				downloaded += read;
				percentDownload = (downloaded*100)/fileSize;
				GUI.getProgressBar().setValue(percentDownload);
			}
			bous.close();
			in.close();
			GUI.getStatus().setText("Downloaded " + name);
		} catch (Exception e) {
			GUI.setErrorMessage(e);
		}
	}

}
