package Aula70_ExercicioAssociacao;

public class seminario {
 private String titulo;
 private aluno[] Alunos;
 private local Local;
 
 
 
public seminario(String titulo,  local local) {
	super();
	this.titulo = titulo;
	Local = local;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public aluno[] getAlunos() {
	return Alunos;
}
public void setAlunos(aluno[] Alunos) {
	this.Alunos = Alunos;
}
public local getLocal() {
	return Local;
}
public void setLocal(local Local) {
	this.Local = Local;
}
 public void imprime() {
	 System.out.println("Alunos do seminario: " +this.titulo);
	
	 for (aluno aluno : Alunos) {
		System.out.println(aluno.getNome());
	}
	 System.out.println("Local do seminario:" + Local.getEndereco());
 }
 
}
