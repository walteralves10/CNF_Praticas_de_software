package view;

import Controler.Controle;
import Model.DisciplinaBEAN;
import Model.FaculdadeBEAN;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author rezende
 */
public class Disciplina extends javax.swing.JFrame {

    javax.swing.table.DefaultTableModel modelo;
    Controle controle = new Controle();

    public Disciplina() {
        initComponents();

        atualizaTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        codigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        pesquisa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        novo = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cargahoraria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        faculdadeCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(436, 421));

        jLabel4.setText("ID");

        jLabel1.setText("Nome");

        pesquisa.setText("Pesquisa");
        pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaActionPerformed(evt);
            }
        });

        jLabel3.setText("Status");

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATIVADO", "DESATIVADO" }));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nome"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabela);

        novo.setText("Novo");
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });

        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("DISCIPLINAS");

        jLabel5.setText("Carga H.");

        faculdadeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        jLabel6.setText("Faculdade");

        jButton1.setText("limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(novo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pesquisa))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cargahoraria)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(faculdadeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6))))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisa)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargahoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faculdadeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar)
                    .addComponent(excluir)
                    .addComponent(cancelar)
                    .addComponent(novo)
                    .addComponent(jButton1))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        limpaCampos();
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        DisciplinaBEAN disc = new DisciplinaBEAN(Integer.parseInt(codigo.getText()));
        controle.deleteDisciplina(disc);
        atualizaTabela();
        limpaCampos();
    }//GEN-LAST:event_excluirActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        FaculdadeBEAN listaUnicaFaculdade = new FaculdadeBEAN();
        listaUnicaFaculdade.setNome_faculdade((String) faculdadeCombo.getSelectedItem());
        listaUnicaFaculdade = controle.unicaFaculdade(listaUnicaFaculdade);

        DisciplinaBEAN disc = new DisciplinaBEAN(Integer.parseInt(codigo.getText()), nome.getText(), Integer.parseInt(cargahoraria.getText()),
                listaUnicaFaculdade.getCodigo_faculdade(), status.getSelectedIndex());

        controle.updateDisciplina(disc);
        atualizaTabela();
        limpaCampos();
    }//GEN-LAST:event_salvarActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
        //DisciplinaBEAN listaDisciplina
        //      = controle.listaStatusDisciplina(Integer.parseInt(codigo.getText()));

        FaculdadeBEAN listaUnicaFaculdade = new FaculdadeBEAN();
        listaUnicaFaculdade.setNome_faculdade((String) faculdadeCombo.getSelectedItem());
        listaUnicaFaculdade = controle.unicaFaculdade(listaUnicaFaculdade);

        DisciplinaBEAN disc = new DisciplinaBEAN(nome.getText(), Integer.parseInt(cargahoraria.getText()),
                listaUnicaFaculdade.getCodigo_faculdade(), 0);
        controle.addDisciplina(disc);
        atualizaTabela();
        limpaCampos();
    }//GEN-LAST:event_novoActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        int linhaEditora = tabela.getSelectedRow();

        this.codigo.setText(tabela.getValueAt(linhaEditora, 0).toString());
        this.nome.setText(tabela.getValueAt(linhaEditora, 1).toString());

        DisciplinaBEAN listaDisciplina
                = controle.listaStatusDisciplina(Integer.parseInt(tabela.getValueAt(linhaEditora, 0).toString()));
        FaculdadeBEAN listaUnicaFaculdade
                = controle.listaStatusFaculdade(listaDisciplina.getFk_codigo_faculdade());

        //this.cpf.setText(tabela.getValueAt(linhaEditora, 2).toString());
        // this.status.setText(tabela.getValueAt(linhaEditora, 3).toString());
        if (listaDisciplina.getStatus_disciplina() == 0) {
            this.status.setSelectedIndex(0);
        } else {
            this.status.setSelectedIndex(1);
        }
        this.cargahoraria.setText(String.valueOf(listaDisciplina.getCarga_horaria_disciplina()));
        this.faculdadeCombo.setSelectedItem(listaUnicaFaculdade.getNome_faculdade());
    }//GEN-LAST:event_tabelaMouseClicked

    private void pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaActionPerformed
        DisciplinaBEAN disc = new DisciplinaBEAN();
        disc.setNome_disciplina(nome.getText());
        //disc.setCarga_horaria_disciplina(Integer.parseInt(cargahoraria.getText()));
        disc.setStatus_disciplina(status.getSelectedIndex());
        if (faculdadeCombo.getSelectedItem().equals("-")) {
            //disc.setFk_codigo_faculdade();
        } else {
            FaculdadeBEAN listaUnicaFaculdade = new FaculdadeBEAN();
            listaUnicaFaculdade.setNome_faculdade((String) faculdadeCombo.getSelectedItem());
            listaUnicaFaculdade = controle.unicaFaculdade(listaUnicaFaculdade);
            disc.setFk_codigo_faculdade(listaUnicaFaculdade.getCodigo_faculdade());
        }

        ArrayList<DisciplinaBEAN> listDisciplina = controle.listaDisciplinaPorNome(disc);

        if (listDisciplina.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Disciplina não encontrada!");
        } else {
            preencher_tabela(listDisciplina);
        }
    }//GEN-LAST:event_pesquisaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpaCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Disciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Disciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Disciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Disciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Disciplina().setVisible(true);
//            }
//        });
//    }
    private void limpaCampos() {
        codigo.setText("");
        nome.setText("");
        cargahoraria.setText("");
    }

    public void preencher_tabela(List<DisciplinaBEAN> listDisciplinas) {

        tabela.getColumnModel().getColumn(0).setPreferredWidth(500);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(500);
        //tabela.getColumnModel().getColumn(2).setPreferredWidth(500);
        //tabela.getColumnModel().getColumn(3).setPreferredWidth(500);

        modelo.setNumRows(0);
        try {
            for (DisciplinaBEAN disc : listDisciplinas) {
                modelo.addRow(new Object[]{disc.getCodigo_disciplina(), disc.getNome_disciplina()});
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados - " + erro);
        }
    }

    private void preencher_comboBox(List<FaculdadeBEAN> listaFaculdades) {
        faculdadeCombo.removeAllItems();
        try {

            for (FaculdadeBEAN facul : listaFaculdades) {
                faculdadeCombo.addItem(facul.getNome_faculdade());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados - " + e);
        }
    }

    private void atualizaTabela() {
        this.modelo = (javax.swing.table.DefaultTableModel) tabela.getModel();

        List<DisciplinaBEAN> listaDisciplinas = controle.listaDisciplinas();
        preencher_tabela(listaDisciplinas);

        List<FaculdadeBEAN> listaFaculdades = controle.listaFaculdades();
        preencher_comboBox(listaFaculdades);
        codigo.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cargahoraria;
    private javax.swing.JTextField codigo;
    private javax.swing.JButton excluir;
    private javax.swing.JComboBox<String> faculdadeCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nome;
    private javax.swing.JButton novo;
    private javax.swing.JButton pesquisa;
    private javax.swing.JButton salvar;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
