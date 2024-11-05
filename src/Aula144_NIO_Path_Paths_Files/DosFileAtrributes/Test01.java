package Aula144_NIO_Path_Paths_Files.DosFileAtrributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

/**
 * Esta classe demonstra como trabalhar com os atributos de arquivos do tipo DOS
 * (Disk Operating System) em Java, utilizando a API NIO (New Input/Output).
 * 
 * A classe usa as interfaces `DosFileAttributes` e `DosFileAttributeView`: -
 * `DosFileAttributes`: é usada para ler atributos específicos do sistema DOS,
 * como se um arquivo está oculto (hidden) ou se é somente leitura (read-only).
 * - `DosFileAttributeView`: permite alterar esses atributos DOS de arquivos.
 * Com ela, podemos, por exemplo, tornar um arquivo oculto ou somente leitura.
 * 
 * O código mostra como: 1. Verificar se um arquivo existe e criá-lo, caso não
 * exista. 2. Ler os atributos atuais do arquivo, como visibilidade (oculto) e
 * permissão de escrita. 3. Alterar esses atributos para ocultar o arquivo e
 * torná-lo somente leitura. 4. Confirmar as mudanças feitas nos atributos.
 */
public class Test01 {
	public static void main(String[] args) throws IOException {
		// Define o caminho para o arquivo "teste.txt" dentro da pasta "pasta"
		Path path = Paths.get("pasta/teste.txt");

		// Verifica se o arquivo não existe. Se não existir, cria o arquivo
		if (Files.notExists(path))
			Files.createFile(path);

		// Lê os atributos do arquivo, especificamente os atributos DOS (como se ele
		// está oculto ou somente leitura)
		DosFileAttributes dosFileAttribues = Files.readAttributes(path, DosFileAttributes.class);

		// Exibe se o arquivo está oculto
		System.out.println(dosFileAttribues.isHidden());

		// Exibe se o arquivo está marcado como somente leitura
		System.out.println(dosFileAttribues.isReadOnly());

		// Obtém a visualização de atributos DOS do arquivo, para permitir a alteração
		// dos atributos
		DosFileAttributeView fileAttributesView = Files.getFileAttributeView(path, DosFileAttributeView.class);

		// Define o arquivo como oculto
		fileAttributesView.setHidden(true);

		// Define o arquivo como somente leitura
		fileAttributesView.setReadOnly(true);

		// Lê e exibe os atributos atualizados (após modificar) para verificar se as
		// alterações foram aplicadas
		System.out.println(fileAttributesView.readAttributes().isHidden());
		System.out.println(fileAttributesView.readAttributes().isReadOnly());
	}
}
