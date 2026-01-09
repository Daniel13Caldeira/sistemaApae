package View;

import Controller.Aluno;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Alunos extends javax.swing.JFrame {

    private static String id;

    public static String getId() {
        return id;
    }

    public Alunos() {
        initComponents();
        preencheTabela();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Alunos().setVisible(true);
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listaAlunosPN = new javax.swing.JPanel();
        listaAlunosSP = new javax.swing.JScrollPane();
        listaAlunosTB = new javax.swing.JTable();
        painel_BTN = new javax.swing.JPanel();
        cadastrarBTN = new javax.swing.JButton();
        editarBTN = new javax.swing.JButton();
        deletarBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APAE Alvinópolis");
        setResizable(false);

        listaAlunosPN.setBackground(new java.awt.Color(249, 160, 63));

        listaAlunosTB.setBackground(java.awt.Color.darkGray);
        listaAlunosTB.setForeground(new java.awt.Color(255, 255, 255));
        listaAlunosTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Data de nascimento", "Idade", "Modalidade de ensino", "Ano Escolar", "Cids"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaAlunosSP.setViewportView(listaAlunosTB);

        painel_BTN.setBackground(new java.awt.Color(249, 160, 63));

        cadastrarBTN.setBackground(java.awt.Color.darkGray);
        cadastrarBTN.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarBTN.setText("Cadastrar");
        cadastrarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBTNActionPerformed(evt);
            }
        });

        editarBTN.setBackground(java.awt.Color.darkGray);
        editarBTN.setForeground(new java.awt.Color(255, 255, 255));
        editarBTN.setText("Editar");
        editarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBTNActionPerformed(evt);
            }
        });

        deletarBTN.setBackground(java.awt.Color.darkGray);
        deletarBTN.setForeground(new java.awt.Color(255, 255, 255));
        deletarBTN.setText("Deletar");
        deletarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_BTNLayout = new javax.swing.GroupLayout(painel_BTN);
        painel_BTN.setLayout(painel_BTNLayout);
        painel_BTNLayout.setHorizontalGroup(
            painel_BTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_BTNLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(painel_BTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deletarBTN)
                    .addComponent(cadastrarBTN)
                    .addComponent(editarBTN))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        painel_BTNLayout.setVerticalGroup(
            painel_BTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_BTNLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(cadastrarBTN)
                .addGap(18, 18, 18)
                .addComponent(editarBTN)
                .addGap(18, 18, 18)
                .addComponent(deletarBTN)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout listaAlunosPNLayout = new javax.swing.GroupLayout(listaAlunosPN);
        listaAlunosPN.setLayout(listaAlunosPNLayout);
        listaAlunosPNLayout.setHorizontalGroup(
            listaAlunosPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaAlunosPNLayout.createSequentialGroup()
                .addComponent(listaAlunosSP, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painel_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        listaAlunosPNLayout.setVerticalGroup(
            listaAlunosPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listaAlunosSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
            .addGroup(listaAlunosPNLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(painel_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listaAlunosPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listaAlunosPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deletarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarBTNActionPerformed
        int linhaSelecionada = listaAlunosTB.getSelectedRow(); // índice da linha selecionada
        if (linhaSelecionada != -1) {
            Aluno.deleta(String.valueOf(listaAlunosTB.getValueAt(linhaSelecionada, 0)));
            setVisible(false);
            new Alunos().setVisible(true);
        }
    }//GEN-LAST:event_deletarBTNActionPerformed

    private void cadastrarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBTNActionPerformed
        //volta para a tela de inicio do cliente
        setVisible(false);
        new Cadastro().setVisible(true);
    }//GEN-LAST:event_cadastrarBTNActionPerformed

    private void editarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBTNActionPerformed
        int linhaSelecionada = listaAlunosTB.getSelectedRow(); // índice da linha selecionada
        if (linhaSelecionada != -1) { // verifica se alguma linha está selecionada
            //"Id", "Nome", "Data de nascimento", "Idade", modalidade,"Ano Escolar", "Cids"
            Aluno aluno = new Aluno(
                    String.valueOf(listaAlunosTB.getValueAt(linhaSelecionada, 1)),//nome
                    String.valueOf(listaAlunosTB.getValueAt(linhaSelecionada, 5)),//ano
                    String.valueOf(listaAlunosTB.getValueAt(linhaSelecionada, 0)),//id
                    String.valueOf(listaAlunosTB.getValueAt(linhaSelecionada, 6)),//cid
                    String.valueOf(listaAlunosTB.getValueAt(linhaSelecionada, 2)),//nasc
                    String.valueOf(listaAlunosTB.getValueAt(linhaSelecionada, 3)),//idade
                    String.valueOf(listaAlunosTB.getValueAt(linhaSelecionada, 4))//modalidade
            );

            setVisible(false);
            new Editar(aluno).setVisible(true);
        }


    }//GEN-LAST:event_editarBTNActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarBTN;
    private javax.swing.JButton deletarBTN;
    private javax.swing.JButton editarBTN;
    private javax.swing.JPanel listaAlunosPN;
    private javax.swing.JScrollPane listaAlunosSP;
    private javax.swing.JTable listaAlunosTB;
    private javax.swing.JPanel painel_BTN;
    // End of variables declaration//GEN-END:variables

    private void preencheTabela() {
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.DARK_GRAY);
        headerRenderer.setForeground(Color.WHITE);
        for (int i = 0; i < listaAlunosTB.getModel().getColumnCount(); i++) {
            listaAlunosTB.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        ArrayList<Aluno> alunos = Aluno.getAlunos();
        DefaultTableModel modelo = (DefaultTableModel) listaAlunosTB.getModel();
        modelo.setRowCount(0);
        for (Aluno a : alunos) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getNascimento(),
                a.getIdade(),
                a.getModalidadeEnsino(),
                a.getAno(),
                a.getCid()
            });
        }

    }
}