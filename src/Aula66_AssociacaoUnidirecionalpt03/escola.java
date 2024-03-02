package Aula66_AssociacaoUnidirecionalpt03;

public class escola {
 private String nome;
 private professor[] Professores;
 
 public escola(String nome) {
	 this.nome = nome;
 }
 
 public escola(String nome, professor[] professores) {
	 this.nome = nome;
	 Professores = professores;
 }
 public void imprime() {
	 System.out.println(this.nome);
	 if(Professores == null) return;
	 for (professor Professor : Professores) {
		System.out.println(Professor.getNome());
	}
 }
 

public void setNome(String nome) {
	this.nome = nome;
}
public String getNome() {
	return nome;
}
public void setProfessores(professor[] professores) {
	Professores = professores;
}
public professor[] getProfessores() {
	return Professores;
}
}
