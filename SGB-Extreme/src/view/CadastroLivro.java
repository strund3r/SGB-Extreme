package view;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import persistencia.LivroDAO;
import regras_de_negocio.Livro;

public class CadastroLivro extends javax.swing.JFrame {

    private String nomeArquivo = "/home/umbrellatec/Documentos/cadastroLivro.csv";
    private String img = null;
    private int clic_tabla;
    
    public CadastroLivro() throws IOException {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        
        listarCadastros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardCadastro = new javax.swing.JPanel();
        msgErro = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        inputExemplar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        inputID = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        inputAutor = new javax.swing.JTextField();
        inputEdicao = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        inputAno = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        inputDisponibilidade = new javax.swing.JTextField();
        inputTitulo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        inputEditora = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        inputISBN = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        inputBuscarCadastro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCadastroLivro = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cardCadastro.setBackground(new java.awt.Color(255, 255, 255));
        cardCadastro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        msgErro.setBackground(new java.awt.Color(204, 0, 0));
        msgErro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        msgErro.setForeground(new java.awt.Color(255, 51, 51));
        msgErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Exemplar");

        inputExemplar.setForeground(new java.awt.Color(102, 102, 102));
        inputExemplar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputExemplar.setMaximumSize(new java.awt.Dimension(250, 30));
        inputExemplar.setMinimumSize(new java.awt.Dimension(200, 30));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("ID");

        inputID.setForeground(new java.awt.Color(102, 102, 102));
        inputID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputID.setEnabled(false);
        inputID.setMinimumSize(new java.awt.Dimension(30, 16));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Autor");

        inputAutor.setForeground(new java.awt.Color(102, 102, 102));
        inputAutor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputAutor.setMaximumSize(new java.awt.Dimension(250, 30));
        inputAutor.setMinimumSize(new java.awt.Dimension(200, 30));

        inputEdicao.setForeground(new java.awt.Color(102, 102, 102));
        inputEdicao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputEdicao.setMaximumSize(new java.awt.Dimension(250, 30));
        inputEdicao.setMinimumSize(new java.awt.Dimension(200, 30));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Edição");

        inputAno.setForeground(new java.awt.Color(102, 102, 102));
        inputAno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputAno.setMaximumSize(new java.awt.Dimension(250, 30));
        inputAno.setMinimumSize(new java.awt.Dimension(200, 30));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Ano");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Disponibilidade");

        inputDisponibilidade.setForeground(new java.awt.Color(102, 102, 102));
        inputDisponibilidade.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputDisponibilidade.setEnabled(false);
        inputDisponibilidade.setMaximumSize(new java.awt.Dimension(250, 30));
        inputDisponibilidade.setMinimumSize(new java.awt.Dimension(200, 30));

        inputTitulo.setForeground(new java.awt.Color(102, 102, 102));
        inputTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputTitulo.setMaximumSize(new java.awt.Dimension(250, 30));
        inputTitulo.setMinimumSize(new java.awt.Dimension(200, 30));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Titulo");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Editora");

        inputEditora.setForeground(new java.awt.Color(102, 102, 102));
        inputEditora.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputEditora.setMaximumSize(new java.awt.Dimension(250, 30));
        inputEditora.setMinimumSize(new java.awt.Dimension(200, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("ISBN");

        inputISBN.setForeground(new java.awt.Color(102, 102, 102));
        inputISBN.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputISBN.setMaximumSize(new java.awt.Dimension(250, 30));
        inputISBN.setMinimumSize(new java.awt.Dimension(200, 30));

        javax.swing.GroupLayout cardCadastroLayout = new javax.swing.GroupLayout(cardCadastro);
        cardCadastro.setLayout(cardCadastroLayout);
        cardCadastroLayout.setHorizontalGroup(
            cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardCadastroLayout.createSequentialGroup()
                .addComponent(msgErro, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardCadastroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(cardCadastroLayout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(inputTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(inputExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(inputAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(cardCadastroLayout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(inputEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(inputEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(inputAno, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cardCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputDisponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cardCadastroLayout.setVerticalGroup(
            cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCadastroLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inputAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inputAno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputDisponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msgErro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAlterar.setText("ALTERAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        inputBuscarCadastro.setForeground(new java.awt.Color(102, 102, 102));
        inputBuscarCadastro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputBuscarCadastro.setMinimumSize(new java.awt.Dimension(100, 16));
        inputBuscarCadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputBuscarCadastroKeyReleased(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("BUSCAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputBuscarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputBuscarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAlterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tabelaCadastroLivro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tabelaCadastroLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "Exemplar", "Altor", "Editora", "Edição", "Ano", "Disponibilidade", "ISBN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCadastroLivro.setColumnSelectionAllowed(true);
        tabelaCadastroLivro.setSelectionBackground(new java.awt.Color(0, 204, 204));
        tabelaCadastroLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCadastroLivroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCadastroLivro);
        tabelaCadastroLivro.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

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
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cardCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
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
                .addComponent(cardCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listarCadastros(){
        try {
            LivroDAO cadastroLivro = new LivroDAO(nomeArquivo);
            ArrayList<Livro>listaDeLivros = cadastroLivro.recuperar();
            //cria tabela para inclusao
            DefaultTableModel model = (DefaultTableModel) tabelaCadastroLivro.getModel();
            //Limpa a tabela 
            model.setNumRows(0);
            for (int i = 0; i < listaDeLivros.size(); i++) {
                Livro aux = listaDeLivros.get(i);
                
                //Incluir nova linha na Tabela
                model.addRow(new String[] {
                    String.valueOf(aux.getId()),
                    aux.getTitulo(),
                    String.valueOf(aux.getExemplares()),
                    aux.getAutor(),
                    aux.getEditora(),
                    String.valueOf(aux.getEdicao()),
                    aux.getAno(),
                    String.valueOf(aux.getDisponibilidade()),
                    aux.getIsbn()
                });
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private void limparCampos(){
        inputID.setText("");
        inputTitulo.setText("");
        inputExemplar.setText("");
        inputAutor.setText("");
        inputEditora.setText("");
        inputEdicao.setText("");
        inputAno.setText("");
        inputDisponibilidade.setText("");
        inputISBN.setText("");
    }
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            LivroDAO cadastroLivro = new LivroDAO(nomeArquivo);

            int id = cadastroLivro.autoincrement();
            String titulo = inputTitulo.getText();
            int exemplar = Integer.parseInt(inputExemplar.getText());
            String autor = inputAutor.getText();
            String editora = inputEditora.getText();
            int edicao = Integer.parseInt(inputEdicao.getText());
            String ano = inputAno.getText();
            int disponibilidade = exemplar;
            String isbn = inputISBN.getText();

            Livro livro = new Livro(id, titulo, exemplar, autor, editora, edicao, ano, disponibilidade, isbn);

            cadastroLivro.incluir(livro);

            listarCadastros();
            limparCampos();

            msgErro.setText("");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            msgErro.setText(ex.getMessage());
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            String mensagem = "Deseja realmente alterar?";
            String tituloConfirmar = "Confirmação";
            int confirmar = JOptionPane.showConfirmDialog(null, mensagem, tituloConfirmar, JOptionPane.YES_NO_OPTION);
            
            LivroDAO cadastroLivro = new LivroDAO(nomeArquivo);

            int id = cadastroLivro.autoincrement();
            String titulo = inputTitulo.getText();
            int exemplar = Integer.parseInt(inputExemplar.getText());
            String autor = inputAutor.getText();
            String editora = inputEditora.getText();
            int edicao = Integer.parseInt(inputEdicao.getText());
            String ano = inputAno.getText();
            int disponibilidade = exemplar;
            String isbn = inputISBN.getText();

            Livro livro = new Livro(id, titulo, exemplar, autor, editora, edicao, ano, disponibilidade, isbn);

            if (confirmar == JOptionPane.YES_OPTION){
                cadastroLivro.alterar(id, livro);
            }

            listarCadastros();
            limparCampos();

            msgErro.setText("");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            msgErro.setText(ex.getMessage());
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            String mensagem = "Deseja realmente excluir?";
            String tituloConfirmar = "Confirmação";
            int confirmar = JOptionPane.showConfirmDialog(null, mensagem, tituloConfirmar, JOptionPane.YES_NO_OPTION);
            
            int id = Integer.parseInt(inputID.getText());

            LivroDAO cadastroLivro = new LivroDAO(nomeArquivo);
            if (confirmar == JOptionPane.YES_OPTION){
                cadastroLivro.excluir(id);
            }

            listarCadastros();
            limparCampos();

            msgErro.setText("");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            msgErro.setText(ex.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void inputBuscarCadastroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputBuscarCadastroKeyReleased
        DefaultTableModel table = (DefaultTableModel)tabelaCadastroLivro.getModel();
        String search = inputBuscarCadastro.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(table);
        tabelaCadastroLivro.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_inputBuscarCadastroKeyReleased

    private void tabelaCadastroLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCadastroLivroMouseClicked
        this.clic_tabla = tabelaCadastroLivro.rowAtPoint(evt.getPoint());
        
        Object id = tabelaCadastroLivro.getValueAt(this.clic_tabla, 0);
        Object titulo = tabelaCadastroLivro.getValueAt(this.clic_tabla, 1);
        Object exemplar = tabelaCadastroLivro.getValueAt(this.clic_tabla, 2);
        Object autor = tabelaCadastroLivro.getValueAt(this.clic_tabla, 3);
        Object editora = tabelaCadastroLivro.getValueAt(this.clic_tabla, 4);
        Object edicao = tabelaCadastroLivro.getValueAt(this.clic_tabla, 5);
        Object ano = tabelaCadastroLivro.getValueAt(this.clic_tabla, 6);
        Object disponibilidade = tabelaCadastroLivro.getValueAt(this.clic_tabla, 7);
        Object isbn = tabelaCadastroLivro.getValueAt(this.clic_tabla, 8);
        
        inputID.setText(String.valueOf(id));
        inputTitulo.setText(String.valueOf(titulo));
        inputExemplar.setText(String.valueOf(exemplar));
        inputAutor.setText(String.valueOf(autor));
        inputEditora.setText(String.valueOf(editora));
        inputEdicao.setText(String.valueOf(edicao));
        inputAno.setText(String.valueOf(ano));
        inputDisponibilidade.setText(String.valueOf(disponibilidade));
        inputISBN.setText(String.valueOf(isbn));
    }//GEN-LAST:event_tabelaCadastroLivroMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        try {
            TelaPrincipal principal = new TelaPrincipal();
            principal.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(CadastroLivro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel cardCadastro;
    private javax.swing.JTextField inputAno;
    private javax.swing.JTextField inputAutor;
    private javax.swing.JTextField inputBuscarCadastro;
    private javax.swing.JTextField inputDisponibilidade;
    private javax.swing.JTextField inputEdicao;
    private javax.swing.JTextField inputEditora;
    private javax.swing.JTextField inputExemplar;
    private javax.swing.JTextField inputID;
    private javax.swing.JTextField inputISBN;
    private javax.swing.JTextField inputTitulo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel msgErro;
    private javax.swing.JTable tabelaCadastroLivro;
    // End of variables declaration//GEN-END:variables
}