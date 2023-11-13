package S1_javaLanguage.S1_05.Level_1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
public class Exercici_2 {


        public static void main(String[] args) {
            if (args.length > 0) {
                listarArvoreDiretorios(args[0]);
            } else {
                System.out.println("Please provide the directory path as an argument.");
            }
        }

        private static void listarArvoreDiretorios(String caminho) {
            File diretorio = new File(caminho);
            listarArvoreRecursivamente(diretorio, 0);
        }

        private static void listarArvoreRecursivamente(File diretorio, int nivel) {
            String[] conteudo = diretorio.list();

            if (conteudo != null) {
                Arrays.sort(conteudo);
                for (String arquivo : conteudo) {
                    File elemento = new File(diretorio, arquivo);
                    imprimirInformacoes(elemento, nivel);
                    if (elemento.isDirectory()) {
                        listarArvoreRecursivamente(elemento, nivel + 1);
                    }
                }
            }
        }

        private static void imprimirInformacoes(File elemento, int nivel) {
            String prefixo = "  ".repeat(nivel);
            String tipo = elemento.isDirectory() ? "D" : "F";
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String dataModificacao = sdf.format(new Date(elemento.lastModified()));

            System.out.println(prefixo + tipo + " " + elemento.getName() + " (" + dataModificacao + ")");
        }
    }
