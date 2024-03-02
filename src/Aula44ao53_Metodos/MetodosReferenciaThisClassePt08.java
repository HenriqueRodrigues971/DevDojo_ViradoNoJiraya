package Aula44ao53_Metodos;

public class MetodosReferenciaThisClassePt08 {
	public String nome;
	public int idade;
	public char sexo;
	
	public void imprime() {
		//this(esse) => usamos quando queremos nos referir a algo que esta dentro do mesmo objeto
		System.out.println(this.nome);
		System.out.println(this.idade);
		System.out.println(this.sexo);

		
	}
}
