package Controller;

import java.util.ArrayList;
import Model.AlunoModel;
import Model.IdModel;

/**
 *
 * @author daniel
 */
public class Aluno {

    private String nome, ano, id, cids,nascimento;

    public static void cadastra(String nome, String ano, String cids, String nascimento) {
        String id = IdModel.getId();
        IdModel.atualiza();
        Model.AlunoModel.cadastra(id+";"+nome+";"+nascimento+";"+ano+";"+cids);
    }
    
    public static void edita(String id,String nome, String ano, String cids, String nascimento){
        Model.AlunoModel.cadastra(id+";"+nome+";"+nascimento+";"+ano+";"+cids);
    }
    
    public static void deleta(String id){
        Model.AlunoModel.deleta(id);
    }
    
    public static ArrayList<String> getAlunos() {
        return Model.AlunoModel.getAlunos();
    }
}
