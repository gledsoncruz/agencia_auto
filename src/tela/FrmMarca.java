/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import dao.MarcaDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modelo.Marca;

/**
 *
 * @author gledson.cruz
 */
public class FrmMarca extends javax.swing.JInternalFrame {
    
    //Declaracao das variaveis globais
    Marca marca = new Marca();
    MarcaDao marcaDao = new MarcaDao();
    List<Marca> marcas = new ArrayList<>();

    /**
     * Creates new form FrmMarca
     */
    public FrmMarca() {
        initComponents();
        this.marcas = marcaDao.carregarTodos();
        carregarTabela(this.marcas);
    }
    /**
     * Metodo que carrega uma lista de marcas para a tabela da tela
     * @param marcas 
     */
    private void carregarTabela(List<Marca> marcas) {
        
        MarcaTableModel tabela = new MarcaTableModel(marcas);
        tblMarcas.setModel(tabela);
        tblMarcas.setRowHeight(30);
        tblMarcas.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        tblMarcas.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblMarcas.getColumnModel().getColumn(1).setPreferredWidth(600);

    }
    
    /**
     * Metodo para limpar os campos
     */
    private void limparCampos() {
        txtMarca.setText("");
        txtConsultar.setText("");
    }

    /**
     * Metodo que controla o estado dos botoes
     */
    private void ctrlBtn() {
        btnInserir.setEnabled(!btnInserir.isEnabled());
        btnAlterar.setEnabled(!btnAlterar.isEnabled());
        btnExcluir.setEnabled(!btnExcluir.isEnabled());
        btnCancelar.setEnabled(!btnCancelar.isEnabled());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMarca = new javax.swing.JPanel();
        lblMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        pnlBotoes = new javax.swing.JPanel();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        pnlTabela = new javax.swing.JPanel();
        lblConsultar = new javax.swing.JLabel();
        txtConsultar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMarcas = new javax.swing.JTable();

        setTitle("Marca");

        pnlMarca.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblMarca.setText("Nome da Marca:");

        javax.swing.GroupLayout pnlMarcaLayout = new javax.swing.GroupLayout(pnlMarca);
        pnlMarca.setLayout(pnlMarcaLayout);
        pnlMarcaLayout.setHorizontalGroup(
            pnlMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMarcaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMarcaLayout.setVerticalGroup(
            pnlMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMarcaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlBotoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotoesLayout = new javax.swing.GroupLayout(pnlBotoes);
        pnlBotoes.setLayout(pnlBotoesLayout);
        pnlBotoesLayout.setHorizontalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInserir)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBotoesLayout.setVerticalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTabela.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblConsultar.setText("Consultar");

        txtConsultar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultarKeyReleased(evt);
            }
        });

        tblMarcas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblMarcas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMarcasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMarcas);

        javax.swing.GroupLayout pnlTabelaLayout = new javax.swing.GroupLayout(pnlTabela);
        pnlTabela.setLayout(pnlTabelaLayout);
        pnlTabelaLayout.setHorizontalGroup(
            pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                    .addGroup(pnlTabelaLayout.createSequentialGroup()
                        .addComponent(lblConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTabelaLayout.setVerticalGroup(
            pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConsultar)
                    .addComponent(txtConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        // TODO add your handling code here:
        // Seto o nome da marca no Objeto marca
        this.marca.setNome(txtMarca.getText());
        // Chamo o metodo salvar do marcaDao passando o objeto marca como parametro
        this.marcaDao.salvar(marca);
        // Recarrego a lista de marcas
        this.marcas = marcaDao.carregarTodos();
        // Recarrego a tabela de marcas da tela
        carregarTabela(marcas);
        // Limpo os campos
        limparCampos();
        // Jogo o foco no campo marca da tela
        txtMarca.requestFocus();
        // Apresento a mensagem na tela
        JOptionPane.showMessageDialog(this, "Salvo com sucesso!",
                "Informação", JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_btnInserirActionPerformed

    private void tblMarcasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMarcasMouseClicked
        // TODO add your handling code here:        
        if (evt.getClickCount() > 1) {
            // Pego a linha selecionada da tabela e jogo pro objeto
            this.marca = this.marcas.get(tblMarcas.convertRowIndexToModel(tblMarcas.getSelectedRow()));
            // Jogo o nome da marca na caixa de texto
            txtMarca.setText(this.marca.getNome());
            ctrlBtn();
        }

    }//GEN-LAST:event_tblMarcasMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:

        this.marca.setNome(txtMarca.getText());
        this.marcaDao.alterar(this.marca);
        // Recarrego a lista de marcas
        this.marcas = marcaDao.carregarTodos();
        // Recarrego a tabela de marcas da tela
        carregarTabela(marcas);
        // Limpo os campos
        limparCampos();
        // Jogo o foco no campo marca da tela
        txtMarca.requestFocus();
        JOptionPane.showMessageDialog(this, "Alterado com sucesso!",
                "Informação", JOptionPane.INFORMATION_MESSAGE);

        ctrlBtn();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        if (this.marca.getModelos().size() > 0) {
            JOptionPane.showMessageDialog(this, "Essa marca possui modelo(s) relacionado(s)",
                    "Informação", JOptionPane.ERROR_MESSAGE);
        } else {
            int selectedOption = JOptionPane.showConfirmDialog(null, "Tem certeza?", "Sistema informa:", JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_OPTION) {

                this.marcaDao.excluir(this.marca);
                // Recarrego a lista de marcas
                this.marcas = marcaDao.carregarTodos();
                // Recarrego a tabela de marcas da tela
                carregarTabela(this.marcas);
                // Limpo os campos
                limparCampos();
                // Jogo o foco no campo marca da tela
                txtMarca.requestFocus();
                ctrlBtn();
                JOptionPane.showMessageDialog(this, "Excluido com sucesso",
                        "Informação", JOptionPane.INFORMATION_MESSAGE);
            }

        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtConsultarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultarKeyReleased
        // TODO add your handling code here:
        //if (txtConsultar.getText().length() > 5) {
        this.marcas = marcaDao.carregarPorNome(txtConsultar.getText());
        carregarTabela(this.marcas);
        //}
    }//GEN-LAST:event_txtConsultarKeyReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        limparCampos();
        txtMarca.requestFocus();
        this.marca = new Marca();
        ctrlBtn();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConsultar;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlMarca;
    private javax.swing.JPanel pnlTabela;
    private javax.swing.JTable tblMarcas;
    private javax.swing.JTextField txtConsultar;
    private javax.swing.JTextField txtMarca;
    // End of variables declaration//GEN-END:variables
}
