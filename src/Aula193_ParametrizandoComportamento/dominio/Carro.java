package Aula193_ParametrizandoComportamento.dominio;

public class Carro {
	private String name = "Audi";
	private String color;
	private int year;

	public Carro(String color, int year) {
		this.color = color;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "Carro [name=" + name + ", color=" + color + ", year=" + year + "]";
	}

}
