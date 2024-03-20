package Aula106_ClassesUtilitariaas_Wrappers;
/*
Wrappers são classes que encapsulam tipos primitivos de dados em Java, transformando-os em objetos. Eles são úteis quando precisamos trabalhar com tipos primitivos em contextos que requerem objetos, como coleções (Listas, Conjuntos, Mapas) e APIs que esperam objetos em vez de tipos primitivos.

Existem diferentes tipos de wrappers para os tipos primitivos em Java:
- Integer para int
- Double para double
- Character para char
- Boolean para boolean, entre outros.

Os wrappers também fornecem métodos úteis para conversão entre tipos primitivos e objetos, operações matemáticas, manipulação de strings e funcionalidades adicionais. Um exemplo comum de uso de wrappers é quando precisamos armazenar valores inteiros em uma Lista, que só aceita objetos. Nesse caso, usamos o wrapper Integer para encapsular o valor inteiro.

Aqui está um exemplo simples de uso de wrappers:
*/

public class test01 {
    public static void main(String[] args) {
        // Criando uma variável primitiva do tipo byte
        byte byteP = 1;

        // Usando o wrapper Byte para transformar o tipo primitivo em objeto
        Byte byteWrapper = Byte.valueOf(byteP);

        // Agora podemos usar métodos e atributos do wrapper Byte
        System.out.println("Valor do byte: " + byteWrapper);

        // Também podemos desfazer o encapsulamento e obter o valor primitivo novamente
        byte byteDesencapsulado = byteWrapper.byteValue();
        System.out.println("Valor desencapsulado do byte: " + byteDesencapsulado);
    }
}

