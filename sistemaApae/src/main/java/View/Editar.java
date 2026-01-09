package View;

import Controller.Aluno;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Editar extends javax.swing.JFrame {

    Aluno aluno;

    public Editar(Aluno aluno) {
        this.aluno = aluno;
        initComponents();
        nomeTF.setText(aluno.getNome());
        cidsTF.setText(aluno.getCid());
        nascimentoFTF.setText(aluno.getNascimento());
        anoEscolarFTF.setText(aluno.getAno());
        String modalidade = aluno.getModalidadeEnsino();
        if (modalidade.equals("Creche")) {
            crecheRB.setSelected(true);
        } else {
            if (modalidade.equals("Educação infantil")) {
                educacaoInfantilRB.setSelected(true);
            } else {
                if (modalidade.equals("Ensino fundamental anos iniciais")) {
                    ensinoFundamentalRB.setSelected(true);

                } else {
                    if (modalidade.equals("EJA anos iniciais")) {
                        ejaRB.setSelected(true);
                    } else {
                        atividadesComplementaresRB.setSelected(true);
                    }
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modalidadeEnsinoBG = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        modalidadeEnsinoPN = new javax.swing.JPanel();
        crecheRB = new javax.swing.JRadioButton();
        educacaoInfantilRB = new javax.swing.JRadioButton();
        ensinoFundamentalRB = new javax.swing.JRadioButton();
        modalidadeEnsinoLB = new javax.swing.JLabel();
        atividadesComplementaresRB = new javax.swing.JRadioButton();
        ejaRB = new javax.swing.JRadioButton();
        formPN = new javax.swing.JPanel();
        nascimentoLB = new javax.swing.JLabel();
        nomeLB = new javax.swing.JLabel();
        nomeTF = new javax.swing.JTextField();
        nascimentoFTF = new javax.swing.JFormattedTextField();
        anoEscolarFTF = new javax.swing.JFormattedTextField();
        cidsLB = new javax.swing.JLabel();
        cidsTF = new javax.swing.JTextField();
        anoEscolarLB = new javax.swing.JLabel();
        tituloPN = new javax.swing.JPanel();
        tituloLB = new javax.swing.JLabel();
        botoesPN = new javax.swing.JPanel();
        editarBTN = new javax.swing.JButton();
        cancelarBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APAE Alvinópolis");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(249, 160, 63));

        modalidadeEnsinoPN.setBackground(new java.awt.Color(249, 160, 63));

        modalidadeEnsinoBG.add(crecheRB);
        crecheRB.setText("Creche");
        crecheRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crecheRBActionPerformed(evt);
            }
        });

        modalidadeEnsinoBG.add(educacaoInfantilRB);
        educacaoInfantilRB.setText("Educação infantil");

        modalidadeEnsinoBG.add(ensinoFundamentalRB);
        ensinoFundamentalRB.setText("Ensino Fundamental Anos Iniciais");

        modalidadeEnsinoLB.setBackground(new java.awt.Color(249, 160, 63));
        modalidadeEnsinoLB.setForeground(new java.awt.Color(255, 255, 255));
        modalidadeEnsinoLB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        modalidadeEnsinoLB.setText("Modalidade de ensino:");

        modalidadeEnsinoBG.add(atividadesComplementaresRB);
        atividadesComplementaresRB.setText("Atividades Complementares");

        modalidadeEnsinoBG.add(ejaRB);
        ejaRB.setText("EJA Anos Iniciais");

        javax.swing.GroupLayout modalidadeEnsinoPNLayout = new javax.swing.GroupLayout(modalidadeEnsinoPN);
        modalidadeEnsinoPN.setLayout(modalidadeEnsinoPNLayout);
        modalidadeEnsinoPNLayout.setHorizontalGroup(
            modalidadeEnsinoPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modalidadeEnsinoPNLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(modalidadeEnsinoPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crecheRB)
                    .addComponent(educacaoInfantilRB)
                    .addComponent(atividadesComplementaresRB)
                    .addComponent(ejaRB)
                    .addComponent(ensinoFundamentalRB)
                    .addComponent(modalidadeEnsinoLB))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        modalidadeEnsinoPNLayout.setVerticalGroup(
            modalidadeEnsinoPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modalidadeEnsinoPNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modalidadeEnsinoLB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crecheRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(educacaoInfantilRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ensinoFundamentalRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ejaRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atividadesComplementaresRB)
                .addGap(22, 22, 22))
        );

        formPN.setBackground(new java.awt.Color(249, 160, 63));

        nascimentoLB.setBackground(new java.awt.Color(249, 160, 63));
        nascimentoLB.setForeground(new java.awt.Color(255, 255, 255));
        nascimentoLB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nascimentoLB.setText("Data de nascimento");

        nomeLB.setBackground(new java.awt.Color(249, 160, 63));
        nomeLB.setForeground(new java.awt.Color(255, 255, 255));
        nomeLB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nomeLB.setText("Nome");

        nomeTF.setBackground(java.awt.Color.darkGray);
        nomeTF.setForeground(new java.awt.Color(249, 160, 63));
        nomeTF.setEnabled(false);
        nomeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTFActionPerformed(evt);
            }
        });

        nascimentoFTF.setBackground(java.awt.Color.darkGray);
        nascimentoFTF.setColumns(10);
        nascimentoFTF.setForeground(new java.awt.Color(249, 160, 63));
        try {
            nascimentoFTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        nascimentoFTF.setToolTipText("");
        nascimentoFTF.setEnabled(false);

        anoEscolarFTF.setBackground(java.awt.Color.darkGray);
        anoEscolarFTF.setForeground(new java.awt.Color(249, 160, 63));
        anoEscolarFTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        anoEscolarFTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anoEscolarFTFActionPerformed(evt);
            }
        });

        cidsLB.setBackground(new java.awt.Color(249, 160, 63));
        cidsLB.setForeground(new java.awt.Color(255, 255, 255));
        cidsLB.setText("CIDs");

        cidsTF.setBackground(java.awt.Color.darkGray);
        cidsTF.setForeground(new java.awt.Color(249, 160, 63));

        anoEscolarLB.setBackground(new java.awt.Color(249, 160, 63));
        anoEscolarLB.setForeground(new java.awt.Color(255, 255, 255));
        anoEscolarLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        anoEscolarLB.setText("Ano escolar");

        javax.swing.GroupLayout formPNLayout = new javax.swing.GroupLayout(formPN);
        formPN.setLayout(formPNLayout);
        formPNLayout.setHorizontalGroup(
            formPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPNLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPNLayout.createSequentialGroup()
                        .addGroup(formPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeLB, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cidsLB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(formPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomeTF, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                            .addComponent(cidsTF)))
                    .addGroup(formPNLayout.createSequentialGroup()
                        .addComponent(nascimentoLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nascimentoFTF, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formPNLayout.createSequentialGroup()
                        .addComponent(anoEscolarLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(anoEscolarFTF, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 70, Short.MAX_VALUE))
        );
        formPNLayout.setVerticalGroup(
            formPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPNLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidsLB, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidsTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nascimentoLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nascimentoFTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(formPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anoEscolarFTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anoEscolarLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tituloPN.setBackground(new java.awt.Color(249, 160, 63));

        tituloLB.setBackground(new java.awt.Color(249, 160, 63));
        tituloLB.setFont(new java.awt.Font("Dialog", 0, 28)); // NOI18N
        tituloLB.setForeground(new java.awt.Color(255, 255, 255));
        tituloLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLB.setText("Editar");
        tituloLB.setToolTipText("");

        javax.swing.GroupLayout tituloPNLayout = new javax.swing.GroupLayout(tituloPN);
        tituloPN.setLayout(tituloPNLayout);
        tituloPNLayout.setHorizontalGroup(
            tituloPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tituloPNLayout.createSequentialGroup()
                .addComponent(tituloLB, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addContainerGap())
        );
        tituloPNLayout.setVerticalGroup(
            tituloPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tituloPNLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(tituloLB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        botoesPN.setBackground(new java.awt.Color(249, 160, 63));

        editarBTN.setBackground(java.awt.Color.darkGray);
        editarBTN.setForeground(new java.awt.Color(255, 255, 255));
        editarBTN.setText("Editar");
        editarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBTNActionPerformed(evt);
            }
        });

        cancelarBTN.setBackground(java.awt.Color.darkGray);
        cancelarBTN.setForeground(new java.awt.Color(255, 255, 255));
        cancelarBTN.setText("Cancelar");
        cancelarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botoesPNLayout = new javax.swing.GroupLayout(botoesPN);
        botoesPN.setLayout(botoesPNLayout);
        botoesPNLayout.setHorizontalGroup(
            botoesPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoesPNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editarBTN)
                .addGap(18, 18, 18)
                .addComponent(cancelarBTN)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        botoesPNLayout.setVerticalGroup(
            botoesPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botoesPNLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(botoesPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botoesPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modalidadeEnsinoPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(tituloPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(164, 164, 164))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(formPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(tituloPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modalidadeEnsinoPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botoesPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 240, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBTNActionPerformed
        setVisible(false);
        new Alunos().setVisible(true);
    }//GEN-LAST:event_cancelarBTNActionPerformed

    private void editarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBTNActionPerformed

        if (nomeTF.getText().equals("") || anoEscolarFTF.getText().equals("") || nascimentoFTF.getText().equals("") || cidsTF.getText().equals("") || modalidadeEnsinoBG.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Há algum campo em branco!", "Aviso!", JOptionPane.PLAIN_MESSAGE);
        } else {
            if (verificaData()) {
                String modalidade = "";
                //System.out.println(modalidadeEnsinoBG.getSelection().toString());
                if (crecheRB.isSelected()) {
                    modalidade = "Creche";
                } else {
                    if (educacaoInfantilRB.isSelected()) {
                        modalidade = "Educação infantil";
                    } else {
                        if (ensinoFundamentalRB.isSelected()) {
                            modalidade = "Ensino fundamental anos iniciais";
                        } else {
                            if (ejaRB.isSelected()) {
                                modalidade = "EJA anos iniciais";
                            } else {
                                modalidade = "Atividades complementares";
                            }
                        }
                    }
                }
                Aluno.edita(this.aluno.getId(), nomeTF.getText(), anoEscolarFTF.getText(), cidsTF.getText(), nascimentoFTF.getText(), modalidade);
                setVisible(false);
                new Alunos().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Data inválida", "Aviso!", JOptionPane.PLAIN_MESSAGE);
            }
        }


    }//GEN-LAST:event_editarBTNActionPerformed

    private void nomeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTFActionPerformed

    private void crecheRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crecheRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crecheRBActionPerformed

    private void anoEscolarFTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anoEscolarFTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anoEscolarFTFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField anoEscolarFTF;
    private javax.swing.JLabel anoEscolarLB;
    private javax.swing.JRadioButton atividadesComplementaresRB;
    private javax.swing.JPanel botoesPN;
    private javax.swing.JButton cancelarBTN;
    private javax.swing.JLabel cidsLB;
    private javax.swing.JTextField cidsTF;
    private javax.swing.JRadioButton crecheRB;
    private javax.swing.JButton editarBTN;
    private javax.swing.JRadioButton educacaoInfantilRB;
    private javax.swing.JRadioButton ejaRB;
    private javax.swing.JRadioButton ensinoFundamentalRB;
    private javax.swing.JPanel formPN;
    private javax.swing.JPanel jPanel1;
    private javax.swing.ButtonGroup modalidadeEnsinoBG;
    private javax.swing.JLabel modalidadeEnsinoLB;
    private javax.swing.JPanel modalidadeEnsinoPN;
    private javax.swing.JFormattedTextField nascimentoFTF;
    private javax.swing.JLabel nascimentoLB;
    private javax.swing.JLabel nomeLB;
    private javax.swing.JTextField nomeTF;
    private javax.swing.JLabel tituloLB;
    private javax.swing.JPanel tituloPN;
    // End of variables declaration//GEN-END:variables
    private boolean verificaData() {
        String data = nascimentoFTF.getText();
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataAtual.format(formatador);
        int dia = Integer.parseInt(data.charAt(0) + "") * 10 + Integer.parseInt(data.charAt(1) + "");
        int mes = Integer.parseInt(data.charAt(3) + "") * 10 + Integer.parseInt(data.charAt(4) + "");
        int ano = Integer.parseInt(data.charAt(6) + "") * 1000 + Integer.parseInt(data.charAt(7) + "") * 100 + Integer.parseInt(data.charAt(8) + "") * 10 + Integer.parseInt(data.charAt(9) + "");
        int diaAtual = Integer.parseInt(dataFormatada.charAt(0) + "") * 10 + Integer.parseInt(dataFormatada.charAt(1) + "");
        int mesAtual = Integer.parseInt(dataFormatada.charAt(3) + "") * 10 + Integer.parseInt(dataFormatada.charAt(4) + "");
        int anoAtual = Integer.parseInt(dataFormatada.charAt(6) + "") * 1000 + Integer.parseInt(dataFormatada.charAt(7) + "") * 100 + Integer.parseInt(dataFormatada.charAt(8) + "") * 10 + Integer.parseInt(dataFormatada.charAt(9) + "");
        if (mes > 12 || dia > numDias(mes, ano) || ano > anoAtual || dia < 1 || mes < 1) {
            return false;
        }
        if (ano == anoAtual) {
            if (mes > mesAtual) {
                return false;
            }
            if (mes == mesAtual) {
                if (dia > diaAtual) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean verificaBissexto(int ano) {
        if (ano % 4 != 0) {
            return false;
        }
        if (ano % 400 == 0) {
            return true;
        }
        return ano % 100 != 0;
    }

    private int numDias(int mes, int ano) {
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
            case 4, 6, 9, 11 -> {
                return 30;
            }
            case 2 -> {
                if (verificaBissexto(ano)) {
                    return 29;
                }
                return 28;
            }

        }
        return 0;
    }
}
