package Aula111_ClassesUtilitarias_StringPt04;

public class test01 {
	public static void main(String[] args) {
     String nome = "William Suane";
     System.out.println(nome.substring(0,3));
     System.out.println(nome);      
     nome = nome.concat(" DevDojo");
     System.out.println(nome);
	
	StringBuilder sb = new StringBuilder("Willian Suane");
	sb.append(" DevDojo").append(" Academy");
	sb.reverse();
	sb.reverse();
	sb.delete(0, 3);
	System.out.println(sb);
	}
}
