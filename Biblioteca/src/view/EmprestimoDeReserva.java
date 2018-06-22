package view;


import helper.ConversorData;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import persistencia.EmprestimoDAO;
import persistencia.ReservaDAO;
import regras_de_negocio.Emprestimo;
import regras_de_negocio.Reserva;

public class EmprestimoDeReserva extends javax.swing.JFrame {

    private final String arquivoReserva = "/app/database/cadastroReserva.csv";
    private final String arquivoEmprestimo = "/app/database/cadastroEmprestimo.csv";

    static final int DIAS_EMPRESTIMO_PROFESSOR = 60 * 60 * 24 * 15 * 1000;
    static final int DIAS_EMPRESTIMO_ALUNO = 60 * 60 * 24 * 10 * 1000;

    private int clic_tablaReserva;

    public EmprestimoDeReserva() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);

        listarReserva();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaCadastroReserva = new javax.swing.JTable();
        cardCadastro = new javax.swing.JPanel();
        msgErro = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        inputIDLivro = new javax.swing.JTextField();
        inputTitulo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        inputIDCliente = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        fotoCadastro1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        inputTipoCliente = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnEmprestar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        inputIDReserva = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        inputBuscarReserva = new javax.swing.JTextField();
        btnVerEmprestimo = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaCadastroReserva.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tabelaCadastroReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ID-Livro", "ID-Cliente", "Data de Reserva", "Dia de Emprestimo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCadastroReserva.setColumnSelectionAllowed(true);
        tabelaCadastroReserva.setSelectionBackground(new java.awt.Color(0, 204, 204));
        tabelaCadastroReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCadastroReservaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaCadastroReserva);

        cardCadastro.setBackground(new java.awt.Color(255, 255, 255));
        cardCadastro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        msgErro.setBackground(new java.awt.Color(204, 0, 0));
        msgErro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        msgErro.setForeground(new java.awt.Color(255, 51, 51));
        msgErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("ID");

        inputIDLivro.setForeground(new java.awt.Color(102, 102, 102));
        inputIDLivro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputIDLivro.setEnabled(false);
        inputIDLivro.setMinimumSize(new java.awt.Dimension(30, 16));

        inputTitulo.setForeground(new java.awt.Color(102, 102, 102));
        inputTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputTitulo.setEnabled(false);
        inputTitulo.setMaximumSize(new java.awt.Dimension(250, 30));
        inputTitulo.setMinimumSize(new java.awt.Dimension(200, 30));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Titulo");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("NOME");

        inputNome.setForeground(new java.awt.Color(102, 102, 102));
        inputNome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputNome.setEnabled(false);
        inputNome.setMaximumSize(new java.awt.Dimension(250, 30));
        inputNome.setMinimumSize(new java.awt.Dimension(200, 30));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("ID");

        inputIDCliente.setForeground(new java.awt.Color(102, 102, 102));
        inputIDCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputIDCliente.setEnabled(false);
        inputIDCliente.setMinimumSize(new java.awt.Dimension(30, 16));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("TIPO");

        fotoCadastro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotoCadastro1.setText("FOTO");
        fotoCadastro1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fotoCadastro1.setMinimumSize(new java.awt.Dimension(180, 180));
        fotoCadastro1.setPreferredSize(new java.awt.Dimension(180, 180));

        jLabel11.setBackground(new java.awt.Color(199, 199, 199));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("LIVRO");

        jLabel12.setBackground(new java.awt.Color(199, 199, 199));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("CLIENTE");

        inputTipoCliente.setForeground(new java.awt.Color(102, 102, 102));
        inputTipoCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputTipoCliente.setMaximumSize(new java.awt.Dimension(250, 30));
        inputTipoCliente.setMinimumSize(new java.awt.Dimension(200, 30));

        javax.swing.GroupLayout cardCadastroLayout = new javax.swing.GroupLayout(cardCadastro);
        cardCadastro.setLayout(cardCadastroLayout);
        cardCadastroLayout.setHorizontalGroup(
            cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(msgErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(cardCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cardCadastroLayout.createSequentialGroup()
                        .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cardCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cardCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputIDLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fotoCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(cardCadastroLayout.createSequentialGroup()
                        .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cardCadastroLayout.createSequentialGroup()
                                .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(inputTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        cardCadastroLayout.setVerticalGroup(
            cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardCadastroLayout.createSequentialGroup()
                        .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputIDLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(fotoCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cardCadastroLayout.createSequentialGroup()
                        .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(inputIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(msgErro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnEmprestar.setText("EMPRESTAR");
        btnEmprestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmprestarActionPerformed(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("ID");

        inputIDReserva.setForeground(new java.awt.Color(102, 102, 102));
        inputIDReserva.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputIDReserva.setEnabled(false);
        inputIDReserva.setMinimumSize(new java.awt.Dimension(30, 16));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("BUSCAR RESERVA");

        inputBuscarReserva.setForeground(new java.awt.Color(102, 102, 102));
        inputBuscarReserva.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputBuscarReserva.setMinimumSize(new java.awt.Dimension(100, 16));
        inputBuscarReserva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputBuscarReservaKeyReleased(evt);
            }
        });

        btnVerEmprestimo.setText("VER EMPRESTIMOS");
        btnVerEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEmprestimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEmprestar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerEmprestimo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputBuscarReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputIDReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEmprestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputBuscarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(inputIDReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVerEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(cardCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listarReserva(){
        try {
            ReservaDAO cadastroReserva = new ReservaDAO(arquivoReserva);
            ArrayList<Reserva>listaDeReserva = cadastroReserva.recuperar();
            //cria tabela para inclusao
            DefaultTableModel modelReserva = (DefaultTableModel) tabelaCadastroReserva.getModel();
            //Limpa a tabela
            modelReserva.setNumRows(0);
            for (int i = 0; i < listaDeReserva.size(); i++) {
                Reserva aux = listaDeReserva.get(i);
                //Incluir nova linha na Tabela
                modelReserva.addRow(new Object[]{
                    aux.getId_reserva(),
                    aux.getId_livro(),
                    aux.getId_cliente(),
                    aux.getData_reserva(),
                    aux.getData_emprestimo()
                });
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void limparCampos(){
        inputIDCliente.setText("");
        inputIDLivro.setText("");
        inputNome.setText("");
        inputTitulo.setText("");
        inputTipoCliente.setText("");

        inputIDReserva.setText("");
    }

    private void tabelaCadastroReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCadastroReservaMouseClicked
        this.clic_tablaReserva = tabelaCadastroReserva.rowAtPoint(evt.getPoint());

        Object id = tabelaCadastroReserva.getValueAt(clic_tablaReserva, 0);
        Object id_livro = tabelaCadastroReserva.getValueAt(clic_tablaReserva, 1);
        Object id_cliente = tabelaCadastroReserva.getValueAt(clic_tablaReserva, 2);

        inputIDReserva.setText(String.valueOf(id));
        inputIDCliente.setText(String.valueOf(id_livro));
        inputIDLivro.setText(String.valueOf(id_cliente));
    }//GEN-LAST:event_tabelaCadastroReservaMouseClicked

    private void btnEmprestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmprestarActionPerformed
        try {
            EmprestimoDAO cadastroEmprestimo = new EmprestimoDAO(arquivoEmprestimo);

            int id_emprestimo = cadastroEmprestimo.autoincrement();
            int id_cliente = Integer.parseInt(inputIDCliente.getText());
            int id_livro = Integer.parseInt(inputIDLivro.getText());

            Date data_emprestimo = new Date(System.currentTimeMillis());
            Date data_devolucao;
            if ("PROFESSOR".equals(inputTipoCliente.getText())) {
                data_devolucao = new Date(
                    data_emprestimo.getTime() + new Date(DIAS_EMPRESTIMO_PROFESSOR).getTime()
                );
            }else if ("ALUNO".equals(inputTipoCliente.getText())) {
                data_devolucao = new Date(
                    data_emprestimo.getTime() + new Date(DIAS_EMPRESTIMO_ALUNO).getTime()
                );
            }else{
                throw new Exception("Tipo não informado");
            }

            Emprestimo emprestar = new Emprestimo(
                    id_emprestimo,
                    id_cliente,
                    id_livro,
                    ConversorData.formatDate(data_emprestimo),
                    ConversorData.formatDate(data_devolucao)
            );

            cadastroEmprestimo.incluir(emprestar);

            String mensagem = "Sucesso! Ver Emprestimos?";
            String tituloConfirmar = "Confirmação";
            int confirmar = JOptionPane.showConfirmDialog(null, mensagem, tituloConfirmar, JOptionPane.YES_NO_OPTION);

            if (confirmar == JOptionPane.YES_OPTION){
                CadastroEmprestimo reserva = new CadastroEmprestimo();
                reserva.setVisible(true);
                this.dispose();
            }

            listarReserva();

            limparCampos();

            msgErro.setText("");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            msgErro.setText(ex.getMessage());
        }
    }//GEN-LAST:event_btnEmprestarActionPerformed

    private void inputBuscarReservaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputBuscarReservaKeyReleased
        DefaultTableModel table = (DefaultTableModel)tabelaCadastroReserva.getModel();
        String search = inputBuscarReserva.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(table);
        tabelaCadastroReserva.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_inputBuscarReservaKeyReleased

    private void btnVerEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEmprestimoActionPerformed
        try {
            CadastroEmprestimo reserva = new CadastroEmprestimo();
            reserva.setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(EmprestimoDeReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVerEmprestimoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        try {
            CadastroReserva reserva = new CadastroReserva();
            reserva.setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(EmprestimoDeReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmprestar;
    private javax.swing.JButton btnVerEmprestimo;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel cardCadastro;
    private javax.swing.JLabel fotoCadastro1;
    private javax.swing.JTextField inputBuscarReserva;
    private javax.swing.JTextField inputIDCliente;
    private javax.swing.JTextField inputIDLivro;
    private javax.swing.JTextField inputIDReserva;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputTipoCliente;
    private javax.swing.JTextField inputTitulo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel msgErro;
    private javax.swing.JTable tabelaCadastroReserva;
    // End of variables declaration//GEN-END:variables
}
