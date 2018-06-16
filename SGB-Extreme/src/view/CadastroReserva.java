package view;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import persistencia.ClienteDAO;
import persistencia.LivroDAO;
import persistencia.ReservaDAO;
import regras_de_negocio.Cliente;
import regras_de_negocio.Livro;
import regras_de_negocio.Reserva;

public class CadastroReserva extends javax.swing.JFrame {
    private String arquivoReserva = "/home/aluno/Documentos/cadastroReserva.csv";
    private String arquivoLivro = "/home/aluno/Documentos/cadastroLivro.csv";
    private String arquivoCliente = "/home/aluno/Documentos/cadastroCliente.csv";
    private String img;
    private int clic_tabla;
    private int clic_tablaLivro;
    private int clic_tablaCliente;

    public CadastroReserva() throws IOException {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        
        listarReserva();
        listarCliente();
        listarLivro();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        fotoCadastro1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        inputTipoCliente = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnReserva = new javax.swing.JButton();
        btnDesistencia = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        inputIDReserva = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCadastroCliente = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCadastroLivro = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        inputBuscarLivro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        inputBuscarCliente = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaCadastroReserva = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                        .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cardCadastroLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(fotoCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cardCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
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
                    .addGroup(cardCadastroLayout.createSequentialGroup()
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
                            .addComponent(inputIDLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(fotoCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnReserva.setText("RESERVA");
        btnReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaActionPerformed(evt);
            }
        });

        btnDesistencia.setText("DESISTENCIA");
        btnDesistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesistenciaActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDesistencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(btnReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputIDReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDesistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

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
        tabelaCadastroCliente.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

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
        tabelaCadastroLivro.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("BUSCAR LIVRO");

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
        tabelaCadastroReserva.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addContainerGap())
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
                modelReserva.addRow(new String[]{
                    String.valueOf(aux.getId_reserva()),
                    String.valueOf(aux.getId_livro()),
                    String.valueOf(aux.getId_cliente()),
                    aux.getData_reserva(),
                    aux.getDia_emprestimo()
                });
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private void listarLivro(){
        try {
            LivroDAO cadastroLivro = new LivroDAO(arquivoLivro);
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
        
        inputIDReserva.setText("");
    }
    
    private void btnReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaActionPerformed
        try {
            ReservaDAO cadastroReserva = new ReservaDAO(arquivoReserva);

            int id_reserva = cadastroReserva.autoincrement();
            int id_cliente = Integer.parseInt(inputIDCliente.getText());
            int id_livro = Integer.parseInt(inputIDLivro.getText());
            //LocalDate data_emprestimo = java.time.LocalDate.now();
            
            Calendar cal = GregorianCalendar.getInstance();
            String data_atual = cal.get(Calendar.DAY_OF_MONTH) + "/" + cal.get(Calendar.MONTH) + "/" + cal.get(Calendar.YEAR);
            
            int data_reserva = 0;
            if ("PROFESSOR".equals(inputTipoCliente.getText())) {
                data_reserva = cal.get(Calendar.DAY_OF_MONTH) + 5;
            }else if("ALUNO".equals(inputTipoCliente.getText())){
                data_reserva = cal.get(Calendar.DAY_OF_MONTH) + 3;
            }else{
                throw new Exception("Tipo não especificado");
            }

            Reserva reserva = new Reserva(id_reserva, id_cliente, id_livro, data_atual, String.valueOf(data_reserva));

            cadastroReserva.incluir(reserva);

            listarReserva();
            listarCliente();
            listarLivro();
            
            limparCampos();

            msgErro.setText("");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            msgErro.setText(ex.getMessage());
        }
    }//GEN-LAST:event_btnReservaActionPerformed

    private void btnDesistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesistenciaActionPerformed
        try {
            String mensagem = "Deseja realmente excluir?";
            String tituloConfirmar = "Confirmação";
            int confirmar = JOptionPane.showConfirmDialog(null, mensagem, tituloConfirmar, JOptionPane.YES_NO_OPTION);
            
            int id = Integer.parseInt(inputIDReserva.getText());

            ReservaDAO cadastroReserva = new ReservaDAO(arquivoReserva);
            if (confirmar == JOptionPane.YES_OPTION){
                cadastroReserva.excluir(id);
            }

            listarReserva();
            listarCliente();
            listarLivro();
            
            limparCampos();

            msgErro.setText("");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            msgErro.setText(ex.getMessage());
        }
    }//GEN-LAST:event_btnDesistenciaActionPerformed

    private void inputBuscarLivroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputBuscarLivroKeyReleased
        DefaultTableModel table = (DefaultTableModel)tabelaCadastroLivro.getModel();
        String search = inputBuscarLivro.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(table);
        tabelaCadastroLivro.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_inputBuscarLivroKeyReleased

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

    private void inputBuscarClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputBuscarClienteKeyReleased
        DefaultTableModel table = (DefaultTableModel)tabelaCadastroCliente.getModel();
        String search = inputBuscarCliente.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(table);
        tabelaCadastroCliente.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_inputBuscarClienteKeyReleased

    private void tabelaCadastroReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCadastroReservaMouseClicked
        this.clic_tabla = tabelaCadastroCliente.rowAtPoint(evt.getPoint());
        
        Object id = tabelaCadastroCliente.getValueAt(clic_tabla, 0);
        
        inputIDReserva.setText(String.valueOf(id));
    }//GEN-LAST:event_tabelaCadastroReservaMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        try {
            TelaPrincipal principal = new TelaPrincipal();
            principal.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(CadastroReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesistencia;
    private javax.swing.JButton btnReserva;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel cardCadastro;
    private javax.swing.JLabel fotoCadastro1;
    private javax.swing.JTextField inputBuscarCliente;
    private javax.swing.JTextField inputBuscarLivro;
    private javax.swing.JTextField inputDisponibilidade;
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
    private javax.swing.JTable tabelaCadastroLivro;
    private javax.swing.JTable tabelaCadastroReserva;
    // End of variables declaration//GEN-END:variables
}