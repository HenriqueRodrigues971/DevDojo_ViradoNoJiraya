package Aula70_ExercicioAssociacao;

public class professor {
 private String nome;
 private String especialidade;
 private seminario[] seminarios;
 
 
 
public professor(String nome, String especialidade) {
	super();
	this.nome = nome;
	this.especialidade = especialidade;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getEspecialidade() {
	return especialidade;
}
public void setEspecialidade(String especialidade) {
	this.especialidade = especialidade;
}
public seminario[] getSeminarios() {
	return seminarios;
}
public void setSeminarios(seminario[] seminarios) {
	this.seminarios = seminarios;
}
 
 public void imprime() {
	 System.out.println("Nome do professor: " + this.nome);
	 System.out.println("Especialidade: " +this.especialidade);
	 System.out.println("Seminarios deste professor: ");
	 if(seminarios == null) return;
    for (seminario seminario : seminarios) {
		System.out.println(seminario.getTitulo());
	}
 }
}
