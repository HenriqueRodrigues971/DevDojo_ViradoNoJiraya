package Aula82_EnumeracaoPt03;

public enum TipoPagamento {
	DEBITO{
/*Sobrescrevendo o calcularDesconto*/
		@Override
		public double calcularDesconto(double valor) {
			return valor * 0.10;
		}
		
	}, CREDITO{
		@Override
		public double calcularDesconto(double valor) {
			return valor * 0.05;
		}
	};

	public double calcularDesconto(double valor) {
		return 0;
	}
}
