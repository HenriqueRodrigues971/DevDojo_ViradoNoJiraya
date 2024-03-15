package Aula87_InterfacesPt01;

public class DataLoaderTest01 {
 public static void main(String[]args) {
	
	 DataBaseLoader dataBaseLoader = new DataBaseLoader();
	 FileLoader fileLoader = new FileLoader();
	 
	 dataBaseLoader.load();
	 fileLoader.load();
 }	
}
