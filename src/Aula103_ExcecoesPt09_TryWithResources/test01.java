package Aula103_ExcecoesPt09_TryWithResources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class test01 {
    public static void main(String[] args) {
        lerArquivo2();
    }

    // Exemplo básico de try-with-resources
    public static void lerArquivo() {
        try (Reader reader = new BufferedReader(new FileReader("arquivo/testo.txt"))) {
            // Aqui você poderia colocar código para ler o arquivo, mas está vazio porque o exemplo é simples
        } catch (IOException e) {
            // Aqui você lidaria com exceções, se ocorressem
        }
    }

    // Exemplo de try-catch-finally tradicional para fechar recursos
    public static void lerArquivo2() {
        /* Reader = classe responsável pela leitura de arquivos */
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("arquivo/testo.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close(); // Fechando o recurso manualmente no bloco finally
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }

    // Exemplo avançado de try-with-resources com múltiplos recursos
    public static void lerArquivo3() {
        try (Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()) {
            // Aqui você poderia colocar código para usar os recursos leitor1 e leitor2
            // Os recursos serão fechados automaticamente após o bloco try
        } catch (IOException e) {
            // Aqui você lidaria com exceções, se ocorressem durante a utilização dos recursos
        }
    }
}
