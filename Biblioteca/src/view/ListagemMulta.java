package view;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import persistencia.MultaDAO;
import regras_de_negocio.Multa;

public class ListagemMulta extends javax.swing.JFrame {
    
    private final String arquivoMulta = "/home/umbrellatec/Documentos/cadastroMulta.csv";

    public ListagemMulta() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        
        listarMulta();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaListagemMulta = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        tabelaListagemMulta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tabelaListagemMulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ID-Cliente", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaListagemMulta.setColumnSelectionAllowed(true);
        tabelaListagemMulta.setSelectionBackground(new java.awt.Color(0, 204, 204));
        jScrollPane3.setViewportView(tabelaListagemMulta);
        tabelaListagemMulta.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listarMulta(){
        try {
            MultaDAO tabela_listagem_multa = new MultaDAO(arquivoMulta);
            ArrayList<Multa>listaDeMulta = tabela_listagem_multa.recuperar();
            //cria tabela para inclusao
            DefaultTableModel modelReserva = (DefaultTableModel) tabelaListagemMulta.getModel();
            //Limpa a tabela 
            modelReserva.setNumRows(0);
            for (int i = 0; i < listaDeMulta.size(); i++) {
                Multa aux = listaDeMulta.get(i);
                //Incluir nova linha na Tabela
                modelReserva.addRow(new Object[]{
                    aux.getId_multa(),
                    aux.getId_cliente(),
                    aux.getValor()
                });
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        try {
            TelaPrincipal principal = new TelaPrincipal();
            principal.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVoltarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabelaListagemMulta;
    // End of variables declaration//GEN-END:variables
}
