package Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class AlunoModel {

    private static File abreArquivo() {
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            return new File("dados\\alunos.txt");
        } else {
            //File arquivo = new File("caminho linux");
            return new File("dados//alunos.txt");
        }
    }

    public static void cadastra(String dados) {
        //define o arquivo de salvamento
        File arquivo = abreArquivo();
        try {
            FileWriter escrita = new FileWriter(arquivo, true); //define o escritor
            BufferedWriter escritor = new BufferedWriter(escrita);//buffer de escrita
            //escreve no arquivo e vai pra próxima linha
            escritor.write(dados);
            escritor.newLine();
            escritor.flush();
            escritor.close();//fecha o buffer
            escrita.close();//fecha o escritor
        } catch (IOException ex) {
        }
    }

    public static void deleta(String id) {
        File arquivo = abreArquivo();
        ArrayList<String> salvar = new ArrayList<>();
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            //primeira linha a ser salva
            String linha = leitor.readLine();
            while (linha != null) {
                if (!id.equals(linha.split(";")[0])) {
                    salvar.add(linha);
                }
                linha = leitor.readLine();
            }
            leitor.close();
            leitura.close();
        } catch (IOException ex) {
        }
        try {
            FileWriter escritaAux = new FileWriter(arquivo, false);//apaga todo o arquivo
            escritaAux.close();//fecha o escritot
        } catch (IOException ex) {
        }
        try {
            FileWriter escrita = new FileWriter(arquivo, true);//define o escritor
            BufferedWriter escritor = new BufferedWriter(escrita);//buffer de escrita
            for (int i = 0; i < salvar.size(); i++) {//escreve o que estava no array no arquivo
                escritor.write(salvar.get(i));
                escritor.newLine();
            }
            escritor.flush();
            escrita.close();
            escritor.close();
        } catch (IOException ex) {
        }
    }

    public void altera(String id, String dados) {
        deleta(id);
        cadastra(dados);
    }

    public static ArrayList<String> getAlunos() {
        File arquivo = abreArquivo();
        ArrayList<String> alunos = new ArrayList<String>();
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            String linha = leitor.readLine();//primeira linha a ser salvo
            while (linha != null) {//linha null = final do arquivo
                alunos.add(linha);
                linha = leitor.readLine();//pega proxima linha
            }
            leitor.close();//fecha o buffer
            leitura.close();//fecha o leitor
        } catch (IOException ex) {
        }
        return alunos;
    }

    public String getAluno(String id) {
        File arquivo = abreArquivo();
        String aluno="";
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            String linha = leitor.readLine();//primeira linha a ser salvo
            while (linha != null) {//linha null = final do arquivo
                /*
                if(if==arquivo id){
                aluno = linha;
                break;
                }
                */
                linha = leitor.readLine();//pega proxima linha
            }
            leitor.close();//fecha o buffer
            leitura.close();//fecha o leitor
        } catch (IOException ex) {
        }
        return aluno;
    }
}
