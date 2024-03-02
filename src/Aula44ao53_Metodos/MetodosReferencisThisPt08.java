package Aula44ao53_Metodos;

public class MetodosReferencisThisPt08 {
	public static void main(String[] args) {
		MetodosReferenciaThisClassePt08 estudante = new MetodosReferenciaThisClassePt08();
		MetodosReferenciaThisClassePt08 estudante2 = new MetodosReferenciaThisClassePt08();
		
		estudante.nome = "Yuki";
		estudante.idade = 16;
		estudante.sexo = 'M';
		
		estudante2.nome = "Gasai";
		estudante2.idade = 16;
		estudante2.sexo = 'F';

		estudante.imprime();
		estudante2.imprime();
	}
}
