import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class TrabP1 {
    private static Set<String> mergeFiles(String inputFile1, String inputFile2) {
        /*
        O uso do Set (conjunto) na implementação do código garante que não haverá 
        registros duplicados na lista combinada e no arquivo de saída.
        */
        Set<String> mergedFiles = new HashSet<>();

        try (BufferedReader reader1 = new BufferedReader(new FileReader(inputFile1));
             BufferedReader reader2 = new BufferedReader(new FileReader(inputFile2))) {

            String line;

            // Lê o primeiro arquivo e adiciona os registros à lista combinada
            while ((line = reader1.readLine()) != null) {
                mergedFiles.add(line);
            }

            // Lê o segundo arquivo e adiciona os registros à lista combinada
            while ((line = reader2.readLine()) != null) {
                mergedFiles.add(line);
            }

        } catch (IOException e){}
        return mergedFiles;
    }

        private static boolean writeMergedFiles(String outputFile, Set<String> mergedFiles) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            // Escreve os registros combinados no arquivo de saída
            for (String lineString : mergedFiles) {
                writer.write(lineString);
                writer.newLine();
            }

            return true;

        } catch (IOException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String file1Name = "arquivo1.txt"; // Nome do primeiro arquivo de entrada
        String file2Name = "arquivo2.txt"; // Nome do segundo arquivo de entrada
        String outputFile = "arquivo_saida.txt"; // Nome do arquivo de saída

        Set<String> mergedFiles = mergeFiles(file1Name, file2Name);

        if (writeMergedFiles(outputFile, mergedFiles)) {
            System.out.println("Arquivo de saída gerado com sucesso.");
        } else {
            System.out.println("Ocorreu um erro ao gerar o arquivo de saída.");
        }
    }
}
