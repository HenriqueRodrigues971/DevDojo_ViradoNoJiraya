package Aula169_Collections.SortingLists.dominio;

public class Smarthphone {
	private String serialNumber;
	private String marca;

	public Smarthphone(String serialNumber, String marca) {
		super();
		this.serialNumber = serialNumber;
		this.marca = marca;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Smathphone [serialNumber=" + serialNumber + ", marca=" + marca + "]";
	}

}
