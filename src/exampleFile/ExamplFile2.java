package exampleFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExamplFile2 {
	public static void main(String[] args) throws IOException {
		File file = new File("samplefiles");

		if (!file.exists()) {
			file.mkdir();
		}

		File file1 = new File(file, "xyz.txt");

		if (!file1.exists()) {
			file1.createNewFile();
		}

		FileOutputStream fo = new FileOutputStream(file1);

		String line = "I am benkutty";
		fo.write(line.getBytes());
		fo.flush();

		FileInputStream fi = new FileInputStream(file1);

		int i = fi.read();

		while (i != -1) {
			System.out.print((char) i);

			i = fi.read();
		}

		fi.close();

	}

}
