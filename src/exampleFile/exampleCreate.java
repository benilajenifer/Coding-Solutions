package exampleFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class exampleCreate {

	public static void main(String[] args) throws IOException {

		File file = new File("samplefiles");

		if (!file.exists()) {
			file.mkdir();
		}

		File file1 = new File(file, "xyz.txt");

		if (!file1.exists()) {
			file1.createNewFile();
		}

		FileWriter fw = new FileWriter(file1);

		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("I am benila");
		bw.newLine();
		bw.write("learn");
		bw.flush();

		FileReader fr = new FileReader(file1);

		BufferedReader br = new BufferedReader(fr);

		String line = br.readLine();

		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}

		fr.close();
		br.close();

		PrintWriter pw = new PrintWriter(file1);
		
		pw.flush();

		pw.println("I am learning");
		pw.close();

	}

}
