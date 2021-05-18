import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class GUI{

	private static JLabel status;
	private static JProgressBar progressBar;

	public GUI() {
		JFrame f = new JFrame();
		JPanel p = new JPanel();

		status = new JLabel("Checking for update..");
		status.setForeground(new Color(0, 189, 95));
		status.setFont(new Font("Verdana", Font.PLAIN, 18));
		status.setHorizontalAlignment(JLabel.CENTER);
		status.setVerticalAlignment(JLabel.TOP);

		progressBar = new JProgressBar(0, 100);
		progressBar.setForeground(new Color(0, 189, 95));
		progressBar.setBackground(new Color(56, 56, 56));
		progressBar.setBorderPainted(false);
		progressBar.setFont(new Font("Verdana", Font.PLAIN, 18));
		progressBar.setValue(0);
		progressBar.setStringPainted(true);
		progressBar.setSize(Values.getWindowWidth()-10, 20);

		p.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		p.setBackground(new Color(36, 36, 36));
		p.add(status);
		p.add(progressBar);

		f.add(p, null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Client installer");
		f.setPreferredSize(new Dimension(Values.getWindowWidth(), Values.getWindowHeight()));
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		URL url = getClass().getResource("icon.png");
		ImageIcon imgicon = new ImageIcon(url);
		f.setIconImage(imgicon.getImage());
		f.pack();
		f.setVisible(true);

		utils.install();
	}

	public static JProgressBar getProgressBar() {
		return progressBar;
	}

	public static JLabel getStatus() {
		return status;
	}

	public static void setErrorMessage(Exception e) {
		Throwable message = e.fillInStackTrace();
		getStatus().setText("ERROR");
		getStatus().setForeground(new Color(189, 0, 0));
		getStatus().setText(String.valueOf(message));
		Values.setError(true);
	}
}
