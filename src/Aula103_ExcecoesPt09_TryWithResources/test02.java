package Aula103_ExcecoesPt09_TryWithResources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test02 {
	public static void main(String[] args) {
        // Chamando o método para escrever em um arquivo
        escreverEmArquivo("arquivo.txt", "Olá, mundo!");

        // Chamando o método para ler o conteúdo do arquivo
        String conteudo = lerArquivo("arquivo.txt");
        System.out.println("Conteúdo do arquivo: " + conteudo);
    }

    // Método para escrever em um arquivo utilizando try-with-resources
    public static void escreverEmArquivo(String nomeArquivo, String texto) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            writer.write(texto); // Escrevendo o texto no arquivo
            System.out.println("Texto escrito no arquivo com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    // Método para ler o conteúdo de um arquivo utilizando try-with-resources
    public static String lerArquivo(String nomeArquivo) {
        StringBuilder conteudo = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                conteudo.append(linha); // Adicionando cada linha ao conteúdo
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        return conteudo.toString();
    }
}
