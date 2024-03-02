package Aula66_AssociacaoUnidirecionalpt03;

public class test {
	public static void main(String[] args) {
		professor Professor = new professor("Jiraya-Sensei");
		professor[] Professores = {Professor};
		escola Escola = new escola("Konoha",Professores);
		Escola.imprime();
	}
}