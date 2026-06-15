package exercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeituraArquivo {

    public static void main(String[] args) {
        String caminhoArquivo = "11-trycatch/src/exercicio2/dados.txt";

        BufferedReader leitor = null;

        try {
            leitor = new BufferedReader(new FileReader(caminhoArquivo));

            System.out.println("Conteudo do arquivo \"" + caminhoArquivo + "\":\n");
            System.out.println("--------------------------------------");

            String linha;
            int numeroLinha = 1;
            while ((linha = leitor.readLine()) != null) {
                System.out.println(numeroLinha + " | " + linha);
                numeroLinha++;
            }

            System.out.println("--------------------------------------");
            System.out.println("\nLeitura concluida com sucesso! Total de linhas: " + (numeroLinha - 1));

        } catch (FileNotFoundException e) {
            System.out.println("Erro: O arquivo \"" + caminhoArquivo + "\" nao foi encontrado!");
            System.out.println("Verifique se o arquivo existe no diretorio correto.");
            System.out.println("Detalhes: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            System.out.println("Houve um problema durante a leitura do conteudo.");

        } finally {
            try {
                if (leitor != null) {
                    leitor.close();
                    System.out.println("Recurso do arquivo fechado corretamente.");
                }
            } catch (IOException e) {
                System.out.println("Erro ao fechar o arquivo: " + e.getMessage());
            }
        }
    }
}
