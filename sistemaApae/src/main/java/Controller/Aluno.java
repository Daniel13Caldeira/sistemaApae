package Controller;

import java.util.ArrayList;
import Model.AlunoModel;
import Model.IdModel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author daniel
 */
public class Aluno {

    private String nome, ano, id, cids, nascimento, idade, modalidadeEnsino;
    private static ArrayList<String[]> separa = new ArrayList<>();
    private static ArrayList<String> alunos = new ArrayList<>();

    public Aluno(String nome, String ano, String id, String cids, String nascimento, String idade, String modalidadeEnsino) {
        this.nome = nome;
        this.ano = ano;
        this.id = id;
        this.cids = cids;
        this.nascimento = nascimento;
        this.idade = idade;
        this.modalidadeEnsino = modalidadeEnsino;
    }

    public String getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getAno() {
        return this.ano;
    }

    public String getCid() {
        return this.cids;
    }

    public String getNascimento() {
        return this.nascimento;
    }

    public String getIdade() {
        return this.idade;
    }

    public String getModalidadeEnsino() {
        return this.modalidadeEnsino;
    }

    public static void cadastra(String nome, String ano, String cids, String nascimento, String modalidadeEnsino) {
        String id = IdModel.getId();
        IdModel.atualiza();
        Model.AlunoModel.cadastra(id + ";" + nome + ";" + nascimento + ";" + ano + ";" + cids + ";" + modalidadeEnsino);
    }

    public static void edita(String id, String nome, String ano, String cids, String nascimento,String modalidadeEnsino) {
        Model.AlunoModel.edita(id+ ";" + nome + ";" + nascimento + ";" + ano + ";" + cids+";"+modalidadeEnsino);
    }

    public static void deleta(String id) {
        Model.AlunoModel.deleta(id);
    }

    private static int calculaIdade(String dataAtual, String data) {
        int diaAtual = Integer.parseInt(dataAtual.charAt(0) + "") * 10 + Integer.parseInt(dataAtual.charAt(1) + "");
        int mesAtual = Integer.parseInt(dataAtual.charAt(3) + "") * 10 + Integer.parseInt(dataAtual.charAt(4) + "");
        int anoAtual = Integer.parseInt(dataAtual.charAt(6) + "") * 1000 + Integer.parseInt(dataAtual.charAt(7) + "") * 100 + Integer.parseInt(dataAtual.charAt(8) + "") * 10 + Integer.parseInt(dataAtual.charAt(9) + "");
        int dia = Integer.parseInt(data.charAt(0) + "") * 10 + Integer.parseInt(data.charAt(1) + "");
        int mes = Integer.parseInt(data.charAt(3) + "") * 10 + Integer.parseInt(data.charAt(4) + "");
        int ano = Integer.parseInt(data.charAt(6) + "") * 1000 + Integer.parseInt(data.charAt(7) + "") * 100 + Integer.parseInt(data.charAt(8) + "") * 10 + Integer.parseInt(data.charAt(9) + "");
        if (mesAtual < mes) {
            return anoAtual - ano - 1;
        } else {
            if (mesAtual == mes) {
                if (diaAtual < dia) {
                    return anoAtual - ano - 1;
                }
            }
        }
        return anoAtual - ano;

    }

    public static ArrayList<Aluno> getAlunos() {
        ArrayList<Aluno> alunos = new ArrayList<>();
        /*id + ";" + nome + ";" + nascimento + ";" + ano + ";" + cids*/
        //String nome, String ano, String id, String cids, String nascimento, String idade
        ArrayList<String> dados = AlunoModel.getAlunos();
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataAt = dataAtual.format(formatador);
        for (String linha : dados) {
            String[] partes = linha.split(";");
            Aluno a = new Aluno(
                    partes[1], // nome
                    partes[3], // ano
                    partes[0], // id
                    partes[4], // cid
                    partes[2], // nascimento
                    calculaIdade(dataAt, partes[2]) + "", // idade
                    partes[5]

            );
            alunos.add(a);
        }

        return alunos;
    }

}
