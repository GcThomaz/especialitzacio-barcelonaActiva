package S1_javaLanguage.S1_05.Level_1;
import java.io.*;
import java.util.Arrays;

public class Exercici_3 {

        public static void main(String[] args) {
            if (args.length > 0) {
                salvarArvoreEmArquivo(args[0], "arvore.txt");
            } else {
                System.out.println("Por favor, forneça o caminho do diretório como argumento.");
            }
        }

        private static void salvarArvoreEmArquivo(String caminho, String arquivoSaida) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(arquivoSaida))) {
                File diretorio = new File(caminho);
                listarArvoreRecursivamenteParaArquivo(diretorio, 0, writer);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private static void listarArvoreRecursivamenteParaArquivo(File diretorio, int nivel, PrintWriter writer) {
            String[] conteudo = diretorio.list();

            if (conteudo != null) {
                Arrays.sort(conteudo);
                for (String arquivo : conteudo) {
                    File elemento = new File(diretorio, arquivo);
                    imprimirInformacoesParaArquivo(elemento, nivel, writer);
                    if (elemento.isDirectory()) {
                        listarArvoreRecursivamenteParaArquivo(elemento, nivel + 1, writer);
                    }
                }
            }
        }

        private static void imprimirInformacoesParaArquivo(File elemento, int nivel, PrintWriter writer) {
            String prefixo = "  ".repeat(nivel);
            String tipo = elemento.isDirectory() ? "D" : "F";
            writer.println(prefixo + tipo + " " + elemento.getName());
        }
    }

