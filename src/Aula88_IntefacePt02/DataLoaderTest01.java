package Aula88_IntefacePt02;

public class DataLoaderTest01 {
	public static void main(String[] args) {

		DataBaseLoader dataBaseLoader = new DataBaseLoader();
		FileLoader fileLoader = new FileLoader();

		dataBaseLoader.load();
		fileLoader.load();

		dataBaseLoader.remove();
		dataBaseLoader.checkPermission();
		fileLoader.checkPermission();
	}
}
