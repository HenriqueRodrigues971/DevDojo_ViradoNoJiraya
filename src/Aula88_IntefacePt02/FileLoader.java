package Aula88_IntefacePt02;

public class FileLoader implements DataLoader, DataRemover {

	@Override
	public void load() {
 System.out.println("Carregando dados de um arquivo");		
		
	}
	@Override
	public void remove() {
		System.out.println("Removendo dados do arquivo");
		
	}
 
}
