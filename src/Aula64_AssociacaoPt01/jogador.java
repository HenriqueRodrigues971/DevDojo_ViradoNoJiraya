package Aula64_AssociacaoPt01;

public class jogador {
 private String nome;
 
 public jogador(String nome) {
	 this.nome=nome;
 }
 
 public void setNome(String nome) {
	 this.nome = nome;
 }
 public String getNome() {
	 return nome;
 }
 public void imprime() {
	 System.out.println("Nome: "+this.nome);
 }
}
