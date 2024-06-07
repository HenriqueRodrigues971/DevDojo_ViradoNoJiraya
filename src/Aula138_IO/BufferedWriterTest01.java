package Aula138_IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {

    public static void main(String[] args) {
        // Cria um objeto File que representa o arquivo "file.txt"
        File file = new File("file.txt");
        
        // Utiliza um try-with-resources para garantir que os recursos serão fechados corretamente
        try (FileWriter fw = new FileWriter(file, true); // FileWriter para escrever no arquivo, true para append mode
             BufferedWriter bw = new BufferedWriter(fw)) { // BufferedWriter para melhorar a eficiência da escrita
            
            // Escreve uma linha de texto no arquivo
            bw.write("Testando escrever em um arquivo");
            // Adiciona uma nova linha após o texto
            bw.newLine();
            // Garante que todos os dados sejam escritos no arquivo
            bw.flush();
        } catch (IOException e) {
            // Imprime a stack trace em caso de exceção
            e.printStackTrace();
        }
    }
}
