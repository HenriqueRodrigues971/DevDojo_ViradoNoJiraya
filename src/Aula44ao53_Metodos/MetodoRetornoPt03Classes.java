package Aula44ao53_Metodos;

public class MetodoRetornoPt03Classes {
	public double divideDoisNumeros(double num, double num2) {
       if(num2==0) {
    	  return num/num2;
       }
       return 0;
	}
	public void imprimeDivisao(double num, double num2) {
		if(num2==0) {
			System.out.println("Não existe divisão por zero");
			return; // posso usar no lugar do break, quando o metodo for void, não é obrigatorio nesse caso
		}else {
			System.out.println(num/num2);
		}
	}
}
