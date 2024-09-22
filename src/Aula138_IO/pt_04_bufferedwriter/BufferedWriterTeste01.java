package Aula138_IO.pt_04_bufferedwriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTeste01 {
	public static void main(String[] args) {

		File file = new File("file.txt");
		try (FileWriter fw = new FileWriter(file, true); BufferedWriter bw = new BufferedWriter(fw)) {
			bw.write("Testando o BufferedWriter 2");
			bw.newLine();// cria uma nova alinha logo após escrever o texto
			bw.flush();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}