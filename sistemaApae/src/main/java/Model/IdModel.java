package Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author daniel
 */
public class IdModel {
    private static File abreArquivo() {
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            return new File("dados\\id.txt");
        } else {
            //File arquivo = new File("caminho linux");
            return new File("dados//id.txt");
        }
    }

    public static void atualiza() {
        //define o arquivo de salvamento
        File arquivo = abreArquivo();
        int id = Integer.parseInt(IdModel.getId())+1;
        try {
            FileWriter escrita = new FileWriter(arquivo, false); //define o escritor
            BufferedWriter escritor = new BufferedWriter(escrita);//buffer de escrita
            //escreve no arquivo e vai pra próxima linha
            escritor.write(id+"");
            escritor.newLine();
            escritor.flush();
            escritor.close();//fecha o buffer
            escrita.close();//fecha o escritor
        } catch (IOException ex) {
        }
    }
    
    public static String getId() {
        File arquivo = abreArquivo();
        String id="";
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            id = leitor.readLine();//primeira linha a ser salvo
            
            leitor.close();//fecha o buffer
            leitura.close();//fecha o leitor
        } catch (IOException ex) {
        }
        return id;
    }
}
