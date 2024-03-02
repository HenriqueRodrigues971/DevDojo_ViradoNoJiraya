package Aula70_ExercicioAssociacao;

public class test {
	public static void main(String[] args) {
		aluno A1 = new aluno("Paulo", 19);
		aluno A3 = new aluno("Joana", 14);
		
		professor p1 = new professor("Paulo Freitas", "Desenvolvimento de Software");
		local Local = new local("Avenida kennedy");
		
		seminario s1 = new seminario("Aprendendo java",Local);
		seminario s2 = new seminario("Python",Local);
		
		seminario[] seminarios = { s1, s2 };
		aluno[] Alunos = { A1, A3 };

		A1.setSeminario(s1);
		s1.setAlunos(Alunos);
		p1.setSeminarios(seminarios);
		
		System.out.println("--------Aluno---------");
		A1.imprime();

		System.out.println("--------Seminario--------");
		s1.imprime();
		System.out.println("-----------Professores------------");
		p1.imprime();
	}
}
