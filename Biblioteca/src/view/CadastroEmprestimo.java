package view;

import helper.ConversorData;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import persistencia.ClienteDAO;
import persistencia.EmprestimoDAO;
import persistencia.LivroDAO;
import regras_de_negocio.Cliente;
import regras_de_negocio.Emprestimo;
import regras_de_negocio.Livro;

public class CadastroEmprestimo extends javax.swing.JFrame {

    private final String arquivoEmprestimo = "/app/database/cadastroEmprestimo.csv";
    private final String arquivoLivro = "/app/database/cadastroLivro.csv";
    private final String arquivoCliente = "/app/database/cadastroCliente.csv";
    private final String arquivoMulta = "/app/database/cadastroMulta.csv";

    private int clic_tablaEmprestimo;
    private int clic_tablaLivro;
    private int clic_tablaCliente;

    static final int DIAS_EMPRESTIMO_PROFESSOR = 60 * 60 * 24 * 15 * 1000;
    static final int DIAS_EMPRESTIMO_ALUNO = 60 * 60 * 24 * 10 * 1000;

    public CadastroEmprestimo() throws Exception {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);

        listarEmprestimo();
        listarCliente();
        listarLivro();

        //multa();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputBuscarLivro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        inputBuscarCliente = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaCadastroEmprestimo = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCadastroCliente = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCadastroLivro = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnEmprestimo = new javax.swing.JButton();
        btnDevolucao = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        inputIDEmprestimo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        inputBuscarReserva = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cardCadastro = new javax.swing.JPanel();
        msgErro = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        inputIDLivro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        inputDisponibilidade = new javax.swing.JTextField();
        inputTitulo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        inputIDCliente = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        inputTipoCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inputBuscarLivro.setForeground(new java.awt.Color(102, 102, 102));
        inputBuscarLivro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputBuscarLivro.setMinimumSize(new java.awt.Dimension(100, 16));
        inputBuscarLivro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputBuscarLivroKeyReleased(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("BUSCAR CLIENTE");

        inputBuscarCliente.setForeground(new java.awt.Color(102, 102, 102));
        inputBuscarCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputBuscarCliente.setMinimumSize(new java.awt.Dimension(100, 16));
        inputBuscarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputBuscarClienteKeyReleased(evt);
            }
        });

        tabelaCadastroEmprestimo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tabelaCadastroEmprestimo.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaCadastroEmprestimo.setColumnSelectionAllowed(true);
        tabelaCadastroEmprestimo.setSelectionBackground(new java.awt.Color(0, 204, 204));
        tabelaCadastroEmprestimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCadastroEmprestimoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaCadastroEmprestimo);

        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        tabelaCadastroCliente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tabelaCadastroCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCadastroCliente.setColumnSelectionAllowed(true);
        tabelaCadastroCliente.setSelectionBackground(new java.awt.Color(0, 204, 204));
        tabelaCadastroCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCadastroClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCadastroCliente);

        tabelaCadastroLivro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tabelaCadastroLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "Disponibilidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCadastroLivro.setSelectionBackground(new java.awt.Color(0, 204, 204));
        tabelaCadastroLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCadastroLivroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaCadastroLivro);

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnEmprestimo.setText("EMPRESTIMO");
        btnEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmprestimoActionPerformed(evt);
            }
        });

        btnDevolucao.setText("DEVOLUCAO");
        btnDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucaoActionPerformed(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("ID");

        inputIDEmprestimo.setForeground(new java.awt.Color(102, 102, 102));
        inputIDEmprestimo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputIDEmprestimo.setEnabled(false);
        inputIDEmprestimo.setMinimumSize(new java.awt.Dimension(30, 16));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEmprestimo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDevolucao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputBuscarReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputIDEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputBuscarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputIDEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("BUSCAR LIVRO");

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
        inputTipoCliente.setEnabled(false);
        inputTipoCliente.setMaximumSize(new java.awt.Dimension(250, 30));
        inputTipoCliente.setMinimumSize(new java.awt.Dimension(200, 30));

        javax.swing.GroupLayout cardCadastroLayout = new javax.swing.GroupLayout(cardCadastro);
        cardCadastro.setLayout(cardCadastroLayout);
        cardCadastroLayout.setHorizontalGroup(
            cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(msgErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(cardCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(cardCadastroLayout.createSequentialGroup()
                        .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(cardCadastroLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inputTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(cardCadastroLayout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inputIDLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(cardCadastroLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputDisponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 149, Short.MAX_VALUE))))
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(cardCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cardCadastroLayout.setVerticalGroup(
            cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputDisponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputIDLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msgErro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputBuscarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cardCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cardCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputBuscarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
    private void multa() throws Exception{
        EmprestimoDAO cadastroEmprestimo = new EmprestimoDAO(arquivoEmprestimo);
        ArrayList<Emprestimo> listaDeEmprestimo = cadastroEmprestimo.recuperar();

        MultaDAO cadastroMulta = new MultaDAO(arquivoMulta);
        ArrayList<Multa> listaDeMulta = cadastroMulta.recuperar();

        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Calendar dataAtual = new GregorianCalendar();
        Calendar deleta_devolucao = new GregorianCalendar();
        Calendar nova_data = new GregorianCalendar();

        Date dataSystem = new Date();
        String converter = format.format(dataSystem);
        dataAtual.setTime(ConversorData.toDate(converter));

        float valor = 2;

        for (int i = 0; i < listaDeEmprestimo.size(); i++) {
            Emprestimo emprestimo = listaDeEmprestimo.get(i);
            deleta_devolucao.setTime(ConversorData.toDate(emprestimo.getData_devolucao()));

            if(dataAtual.getTimeInMillis() > deleta_devolucao.getTimeInMillis()){
                if (listaDeMulta.isEmpty()) {
                    Multa multa = new Multa(cadastroMulta.autoincrement(), emprestimo.getId_cliente(), emprestimo.getData_devolucao(), valor);
                    cadastroMulta.incluir(multa);
                }else{
                    for (int m = 0; m < listaDeMulta.size(); m++) {
                        Multa aux = listaDeMulta.get(m);
                        nova_data.setTime(ConversorData.toDate(aux.getData()));
                        if (aux.getId_cliente() == emprestimo.getId_cliente()) {
                            if (dataAtual.getTimeInMillis() > nova_data.getTimeInMillis()) {
                                valor = aux.getValor();
                                valor += 2;
                                Multa multa = new Multa(aux.getId_multa(), emprestimo.getId_cliente(), String.valueOf(dataAtual), valor);
                                cadastroMulta.alterar(aux.getId_multa(), multa);
                            }
                        }
                    }
                }
            }
        }
    }
*/
    private void listarEmprestimo(){
        try {
            EmprestimoDAO cadastroEmprestimo = new EmprestimoDAO(arquivoEmprestimo);
            ArrayList<Emprestimo>listaDeEmprestimo = cadastroEmprestimo.recuperar();
            //cria tabela para inclusao
            DefaultTableModel modelEmprestimo = (DefaultTableModel) tabelaCadastroEmprestimo.getModel();
            //Limpa a tabela
            modelEmprestimo.setNumRows(0);
            for (int i = 0; i < listaDeEmprestimo.size(); i++) {
                Emprestimo aux = listaDeEmprestimo.get(i);
                //Incluir nova linha na Tabela
                modelEmprestimo.addRow(new Object[]{
                    aux.getId_emprestimo(),
                    aux.getId_livro(),
                    aux.getId_cliente(),
                    aux.getData_emprestimo(),
                    aux.getData_devolucao()
                });
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void listarLivro(){
        try {
            LivroDAO cadastroLivro = new LivroDAO();
            ArrayList<Livro>listaDeLivros = cadastroLivro.recuperar();
            //cria tabela para inclusao
            DefaultTableModel modelLivros = (DefaultTableModel) tabelaCadastroLivro.getModel();
            //Limpa a tabela
            modelLivros.setNumRows(0);
            for (int i = 0; i < listaDeLivros.size(); i++) {
                Livro aux = listaDeLivros.get(i);

                String[] saida = {
                    String.valueOf(aux.getId()),
                    String.valueOf(aux.getTitulo()),
                    String.valueOf(aux.getDisponibilidade()),
                };
                //Incluir nova linha na Tabela
                modelLivros.addRow(saida);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void listarCliente(){
        try {
            ClienteDAO cadastroCliente = new ClienteDAO(arquivoCliente);
            ArrayList<Cliente>listaDeClientes = cadastroCliente.recuperar();
            //cria tabela para inclusao
            DefaultTableModel modelClientes = (DefaultTableModel) tabelaCadastroCliente.getModel();
            //Limpa a tabela
            modelClientes.setNumRows(0);
            for (int i = 0; i < listaDeClientes.size(); i++) {
                Cliente aux = listaDeClientes.get(i);

                String[] saida = {
                    String.valueOf(aux.getId()),
                    String.valueOf(aux.getNome()),
                    String.valueOf(aux.getTipo()),
                };
                //Incluir nova linha na Tabela
                modelClientes.addRow(saida);
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
        inputDisponibilidade.setText("");
        inputTipoCliente.setText("");

        inputIDEmprestimo.setText("");
    }

    private void inputBuscarLivroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputBuscarLivroKeyReleased
        DefaultTableModel table = (DefaultTableModel)tabelaCadastroLivro.getModel();
        String search = inputBuscarLivro.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(table);
        tabelaCadastroLivro.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_inputBuscarLivroKeyReleased

    private void inputBuscarClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputBuscarClienteKeyReleased
        DefaultTableModel table = (DefaultTableModel)tabelaCadastroCliente.getModel();
        String search = inputBuscarCliente.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(table);
        tabelaCadastroCliente.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_inputBuscarClienteKeyReleased

    private void tabelaCadastroEmprestimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCadastroEmprestimoMouseClicked
        this.clic_tablaEmprestimo = tabelaCadastroEmprestimo.rowAtPoint(evt.getPoint());

        Object id = tabelaCadastroEmprestimo.getValueAt(clic_tablaEmprestimo, 0);
        Object id_livro = tabelaCadastroEmprestimo.getValueAt(clic_tablaEmprestimo, 1);
        Object id_cliente = tabelaCadastroEmprestimo.getValueAt(clic_tablaEmprestimo, 2);

        inputIDEmprestimo.setText(String.valueOf(id));
        inputIDCliente.setText(String.valueOf(id_livro));
        inputIDLivro.setText(String.valueOf(id_cliente));
    }//GEN-LAST:event_tabelaCadastroEmprestimoMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        try {
            TelaPrincipal principal = new TelaPrincipal();
            principal.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(CadastroReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void tabelaCadastroClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCadastroClienteMouseClicked
        this.clic_tablaCliente = tabelaCadastroCliente.rowAtPoint(evt.getPoint());

        Object id = tabelaCadastroCliente.getValueAt(clic_tablaCliente, 0);
        Object nome = tabelaCadastroCliente.getValueAt(clic_tablaCliente, 1);
        Object tipo = tabelaCadastroCliente.getValueAt(clic_tablaCliente, 2);

        inputIDCliente.setText(String.valueOf(id));
        inputNome.setText(String.valueOf(nome));
        inputTipoCliente.setText(String.valueOf(tipo));
    }//GEN-LAST:event_tabelaCadastroClienteMouseClicked

    private void tabelaCadastroLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCadastroLivroMouseClicked
        this.clic_tablaLivro = tabelaCadastroLivro.rowAtPoint(evt.getPoint());

        Object id = tabelaCadastroLivro.getValueAt(clic_tablaLivro, 0);
        Object titulo = tabelaCadastroLivro.getValueAt(clic_tablaLivro, 1);
        Object disponibilidade = tabelaCadastroLivro.getValueAt(clic_tablaLivro, 2);

        inputIDLivro.setText(String.valueOf(id));
        inputTitulo.setText(String.valueOf(titulo));
        inputDisponibilidade.setText(String.valueOf(disponibilidade));
    }//GEN-LAST:event_tabelaCadastroLivroMouseClicked

    private void btnEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmprestimoActionPerformed
        try {
            EmprestimoDAO cadastroEmprestimo = new EmprestimoDAO(arquivoEmprestimo);

            int id_emprestimo = cadastroEmprestimo.autoincrement();
            int id_cliente = Integer.parseInt(inputIDCliente.getText());
            int id_livro = Integer.parseInt(inputIDLivro.getText());

            LivroDAO cadastroLivro = new LivroDAO();
            ArrayList<Livro> listaDeLivro = cadastroLivro.recuperar();
            for (int i = 0; i < listaDeLivro.size(); i++) {
                Livro livro = listaDeLivro.get(i);
                if (livro.getId() == id_livro) {
                    if (livro.getDisponibilidade() != 1) {
                        int subtraiDisponibilidade = livro.getDisponibilidade() - 1;
                        Livro livro_alterar = new Livro(
                            livro.getId(),
                            livro.getTitulo(),
                            livro.getExemplares(),
                            livro.getAutor(),
                            livro.getEditora(),
                            livro.getEdicao(),
                            livro.getAno(),
                            subtraiDisponibilidade,
                            livro.getIsbn()
                        );
                        cadastroLivro.alterar(livro.getId(), livro_alterar);
                    }else{
                        throw new Exception("Livro indisponivel para reserva - Apenas 1");
                    }
                }
            }

            Date data_devolucao = new Date(System.currentTimeMillis());
            Date data_emprestimo;
            if ("PROFESSOR".equals(inputTipoCliente.getText())) {
                data_emprestimo = new Date(
                    data_devolucao.getTime() + new Date(DIAS_EMPRESTIMO_PROFESSOR).getTime()
                );
            }else if ("ALUNO".equals(inputTipoCliente.getText())) {
                data_emprestimo = new Date(
                    data_devolucao.getTime() + new Date(DIAS_EMPRESTIMO_ALUNO).getTime()
                );
            }else{
                throw new Exception("Tipo não informado");
            }

            Emprestimo emprestimo = new Emprestimo(id_emprestimo, id_cliente, id_livro, ConversorData.formatDate(data_devolucao), ConversorData.formatDate(data_emprestimo));

            cadastroEmprestimo.incluir(emprestimo);

            listarEmprestimo();
            listarCliente();
            listarLivro();

            limparCampos();

            msgErro.setText("");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            msgErro.setText(ex.getMessage());
        }
    }//GEN-LAST:event_btnEmprestimoActionPerformed

    private void btnDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucaoActionPerformed
        try {
            String mensagem = "Deseja realmente excluir?";
            String tituloConfirmar = "Confirmação";
            int confirmar = JOptionPane.showConfirmDialog(null, mensagem, tituloConfirmar, JOptionPane.YES_NO_OPTION);

            int id = Integer.parseInt(inputIDEmprestimo.getText());
            int id_livro = Integer.parseInt(inputIDLivro.getText());

            EmprestimoDAO cadastroEmprestimo = new EmprestimoDAO(arquivoEmprestimo);
            if (confirmar == JOptionPane.YES_OPTION){
                cadastroEmprestimo.excluir(id);
            }

            LivroDAO cadastroLivro = new LivroDAO();
            ArrayList<Livro> listaDeLivro = cadastroLivro.recuperar();
            for (int i = 0; i < listaDeLivro.size(); i++) {
                Livro livro = listaDeLivro.get(i);
                if (livro.getId() == id_livro) {
                    if (livro.getDisponibilidade() != 1) {
                        int subtraiDisponibilidade = livro.getDisponibilidade() + 1;
                        Livro livro_alterar = new Livro(
                            livro.getId(),
                            livro.getTitulo(),
                            livro.getExemplares(),
                            livro.getAutor(),
                            livro.getEditora(),
                            livro.getEdicao(),
                            livro.getAno(),
                            subtraiDisponibilidade,
                            livro.getIsbn()
                        );
                        cadastroLivro.alterar(livro.getId(), livro_alterar);
                    }else{
                        throw new Exception("Livro indisponivel para reserva - Apenas 1");
                    }
                }
            }

            listarEmprestimo();
            listarCliente();
            listarLivro();

            limparCampos();

            msgErro.setText("");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            msgErro.setText(ex.getMessage());
        }
    }//GEN-LAST:event_btnDevolucaoActionPerformed

    private void inputBuscarReservaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputBuscarReservaKeyReleased
        DefaultTableModel table = (DefaultTableModel)tabelaCadastroEmprestimo.getModel();
        String search = inputBuscarReserva.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(table);
        tabelaCadastroEmprestimo.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_inputBuscarReservaKeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDevolucao;
    private javax.swing.JButton btnEmprestimo;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel cardCadastro;
    private javax.swing.JTextField inputBuscarCliente;
    private javax.swing.JTextField inputBuscarLivro;
    private javax.swing.JTextField inputBuscarReserva;
    private javax.swing.JTextField inputDisponibilidade;
    private javax.swing.JTextField inputIDCliente;
    private javax.swing.JTextField inputIDEmprestimo;
    private javax.swing.JTextField inputIDLivro;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel msgErro;
    private javax.swing.JTable tabelaCadastroCliente;
    private javax.swing.JTable tabelaCadastroEmprestimo;
    private javax.swing.JTable tabelaCadastroLivro;
    // End of variables declaration//GEN-END:variables
}
