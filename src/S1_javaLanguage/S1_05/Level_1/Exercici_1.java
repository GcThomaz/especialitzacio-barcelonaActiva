package S1_javaLanguage.S1_05.Level_1;
import java.io.File;
import java.util.Arrays;
public class Exercici_1 {

        public static void main(String[] args) {
            if (args.length > 0) {
                listarConteudoDiretorio(args[0]);
            } else {
                System.out.println("Please provide the directory path as an argument.");
            }
        }

        private static void listarConteudoDiretorio(String caminho) {
            File diretorio = new File(caminho);
            String[] conteudo = diretorio.list();

            if (conteudo != null) {
                Arrays.sort(conteudo);
                for (String arquivo : conteudo) {
                    System.out.println(arquivo);
                }
            } else {
                System.out.println("The directory is empty or does not exist.");
            }
        }
    }
