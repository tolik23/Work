import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Connection {

	public void connect(String link, String fileName) {
		InputStream inputStream = null;
		FileOutputStream outputStream = null;

		try {
			URL url = new URL(link);
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

			int responseCode = httpURLConnection.getResponseCode();

			if (responseCode == HttpURLConnection.HTTP_OK) {

				inputStream = httpURLConnection.getInputStream();

				// проверка имени файла на соответствие
				Pattern pattern = Pattern.compile("\\.(xml|json)");
				Matcher matcher = pattern.matcher(fileName);

				if (matcher.find()) {
				} else {
					System.out.println("Формат файла не соответствует");
				}

				File file = new File(fileName);
				outputStream = new FileOutputStream(file);

				int byteRead = -1;
				byte[] buffer = new byte[1024];

				while ((byteRead = inputStream.read(buffer)) != -1) {
					outputStream.write(buffer, 0, byteRead);
				}

			} else {
				System.out.println("ERROR = " + responseCode);
			}

		} catch (Exception e) {
			System.out.println("ERROR = " + e.getMessage());
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				System.out.println("inputStream close = " + e.getMessage());
			}
			try {
				outputStream.close();
			} catch (IOException e) {
				System.out.println("outputStream close = " + e.getMessage());
			}
		}
	}
}
