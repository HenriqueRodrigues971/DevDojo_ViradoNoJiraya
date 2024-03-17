package Aula106_ClassesUtilitariaas_Wrappers;

public class test01 {
	public static void main(String[] args) {
		 // Exemplo de uso de wrappers: Convertendo um tipo primitivo byte em um objeto Byte
        byte byteP = 1; // Tipo primitivo byte
        Byte byteObjeto = Byte.valueOf(byteP); // Wrapping: convertendo byte para Byte
        System.out.println("Valor do byte como objeto Byte: " + byteObjeto);
	}
}
