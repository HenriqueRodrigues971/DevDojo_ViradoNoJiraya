package Aula88_IntefacePt02;

public interface DataLoader {
	/*
	 * Em Java, uma interface é uma estrutura que define um contrato que as classes
	 * devem seguir. Ela contém apenas assinaturas de métodos (sem implementações)
	 * que as classes que a implementam devem fornecer.
	 */
	void load();

	/* Usando o deafult não somos obrigados e implementar os metedos nas classes */
	default void checkPermission() {
		System.out.println("Fazendo checagem de permissões");
	}
}