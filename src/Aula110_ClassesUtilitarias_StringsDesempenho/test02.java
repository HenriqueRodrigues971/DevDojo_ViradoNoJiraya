package Aula110_ClassesUtilitarias_StringsDesempenho;

import java.util.ArrayList;

public class test02 {
    public static void main(String[] args) {
        // Exemplo de concatenação com o operador '+'
        String nome = "João";
        String sobrenome = "Silva";
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println("Nome completo: " + nomeCompleto);

        // Exemplo de concatenação com StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append("Número: ").append(i).append("\n");
        }
        String resultado = sb.toString();
        System.out.println("Resultado StringBuilder:\n" + resultado);

        // Exemplo de concatenação com StringBuffer
        StringBuffer buffer = new StringBuffer();
        buffer.append("Thread: ").append(Thread.currentThread().getName());
        String resultadoBuffer = buffer.toString();
        System.out.println("Resultado StringBuffer: " + resultadoBuffer);
    
    
        // Criando um ArrayList de StringBuilder
        ArrayList<StringBuilder> listaSB = new ArrayList<>();

        // Adicionando StringBuilder à lista
        listaSB.add(new StringBuilder("Primeiro"));
        listaSB.add(new StringBuilder("Segundo"));
        listaSB.add(new StringBuilder("Terceiro"));

        // Manipulando os StringBuilder na lista
        for (StringBuilder sb2 : listaSB) {
            sb2.append(" - Modificado");
        }

        // Imprimindo os StringBuilder modificados
        for (StringBuilder sb2 : listaSB) {
            System.out.println(sb2.toString());
        }
    
    }
    
    
}
