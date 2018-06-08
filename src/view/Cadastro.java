package view;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import persistencia.ClienteDAO;
import regras_de_negocio.Cliente;
import viacep.ViaCEP;
import viacep.ViaCEPException;



public class Cadastro extends javax.swing.JFrame {

    private String nomeArquivo = "/home/umbrellatec/Documentos/cadastro.csv";
                              //"C:\\Users\\tally\\Documents\\cadastro.csv";
    private String img;
    
    private int clic_tabla;
    
    public Cadastro() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        
        listarCadastros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardCadastro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputBairro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputLogradouro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputUF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        inputCidade = new javax.swing.JTextField();
        msgErroCEP = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        inputComplemento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        inputSexo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        inputFone = new javax.swing.JFormattedTextField();
        inputCPF = new javax.swing.JFormattedTextField();
        inputCEP = new javax.swing.JFormattedTextField();
        inputDataNasc = new javax.swing.JFormattedTextField();
        fotoCadastro = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        btnAbrirFoto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        inputBuscarCadastro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCadastroCliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(590, 0));

        cardCadastro.setBackground(new java.awt.Color(255, 255, 255));
        cardCadastro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("CEP");

        inputBairro.setForeground(new java.awt.Color(102, 102, 102));
        inputBairro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputBairro.setMinimumSize(new java.awt.Dimension(160, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("BAIRRO");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("RUA");

        inputLogradouro.setForeground(new java.awt.Color(102, 102, 102));
        inputLogradouro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("UF");

        inputUF.setForeground(new java.awt.Color(102, 102, 102));
        inputUF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputUF.setMinimumSize(new java.awt.Dimension(30, 16));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("CIDADE");

        inputCidade.setForeground(new java.awt.Color(102, 102, 102));
        inputCidade.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputCidade.setMinimumSize(new java.awt.Dimension(100, 16));

        msgErroCEP.setBackground(new java.awt.Color(204, 0, 0));
        msgErroCEP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        msgErroCEP.setForeground(new java.awt.Color(255, 51, 51));
        msgErroCEP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("COMPLEMENTO");

        inputComplemento.setForeground(new java.awt.Color(102, 102, 102));
        inputComplemento.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("NOME");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("SEXO");

        inputSexo.setForeground(new java.awt.Color(102, 102, 102));
        inputSexo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputSexo.setMinimumSize(new java.awt.Dimension(120, 30));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("CPF");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("TELEFONE");

        inputNome.setForeground(new java.awt.Color(102, 102, 102));
        inputNome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputNome.setMinimumSize(new java.awt.Dimension(200, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("DATA DE NASCIMENTO");

        inputFone.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        try {
            inputFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inputFone.setMinimumSize(new java.awt.Dimension(200, 30));

        inputCPF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        try {
            inputCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inputCPF.setMinimumSize(new java.awt.Dimension(200, 30));

        inputCEP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        try {
            inputCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inputCEP.setMinimumSize(new java.awt.Dimension(150, 30));
        inputCEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputCEPKeyReleased(evt);
            }
        });

        inputDataNasc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        try {
            inputDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inputDataNasc.setMinimumSize(new java.awt.Dimension(120, 30));

        fotoCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotoCadastro.setText("FOTO");
        fotoCadastro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fotoCadastro.setMinimumSize(new java.awt.Dimension(180, 180));
        fotoCadastro.setPreferredSize(new java.awt.Dimension(180, 180));

        jComboBoxTipo.setForeground(new java.awt.Color(51, 51, 51));
        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALUNO", "PROFESSOR" }));
        jComboBoxTipo.setBorder(null);
        jComboBoxTipo.setMinimumSize(new java.awt.Dimension(150, 30));
        jComboBoxTipo.setPreferredSize(new java.awt.Dimension(56, 30));

        btnAbrirFoto.setText("ABRIR");
        btnAbrirFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirFotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cardCadastroLayout = new javax.swing.GroupLayout(cardCadastro);
        cardCadastro.setLayout(cardCadastroLayout);
        cardCadastroLayout.setHorizontalGroup(
            cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardCadastroLayout.createSequentialGroup()
                .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cardCadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cardCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cardCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputUF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cardCadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputComplemento))
                    .addGroup(cardCadastroLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cardCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cardCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputCEP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputLogradouro))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cardCadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputFone, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                    .addComponent(msgErroCEP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fotoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbrirFoto))
                .addContainerGap())
        );
        cardCadastroLayout.setVerticalGroup(
            cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCadastroLayout.createSequentialGroup()
                .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardCadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fotoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAbrirFoto))
                    .addGroup(cardCadastroLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputFone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(inputBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(inputUF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(msgErroCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
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

        tabelaCadastroCliente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tabelaCadastroCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "CPF", "Sexo", "CEP", "Rua", "Complemento", "Bairro", "Cidade", "UF", "Data Nasc.", "Tipo"
            }
        ));
        tabelaCadastroCliente.setColumnSelectionAllowed(true);
        tabelaCadastroCliente.setSelectionBackground(new java.awt.Color(0, 204, 204));
        tabelaCadastroCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCadastroClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCadastroCliente);
        tabelaCadastroCliente.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cardCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void listarCadastros(){
        try {
            ArrayList <Cliente> listaDeClientes;
            ClienteDAO cadastroClientes = new ClienteDAO(nomeArquivo);
            listaDeClientes = cadastroClientes.recuperar();
            //cria tabela para inclusao
            DefaultTableModel model = (DefaultTableModel) tabelaCadastroCliente.getModel();
            //Limpa a tabela 
            model.setNumRows(0);
            for (int pos = 0; pos < listaDeClientes.size(); pos++) {
                String[] saida = new String[12];
                Cliente aux = listaDeClientes.get(pos);
                saida[0] = aux.getNome();
                saida[1] = aux.getFone();
                saida[2] = aux.getCpf();
                saida[3] = aux.getSexo();
                saida[4] = aux.getCep();
                saida[5] = aux.getLogradouro();
                saida[6] = aux.getComplemento();
                saida[7] = aux.getBairro();
                saida[8] = aux.getCidade();
                saida[9] = aux.getUf();
                saida[10] = aux.getDataNasc();
                saida[11] = aux.getTipo();
                //Incluir nova linha na Tabela
                model.addRow(saida);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void limparCampos(){
        inputNome.setText("");
        inputFone.setText("");
        inputCPF.setText("");
        inputSexo.setText("");
        inputCEP.setText("");
        inputLogradouro.setText("");
        inputComplemento.setText("");
        inputBairro.setText("");
        inputCidade.setText("");
        inputUF.setText("");
        inputDataNasc.setText("");
    }
    
    private void buscarCep() throws ViaCEPException, Exception{
        ViaCEP viaCep = new ViaCEP();
        if(inputCEP.getText().length()==9){
            viaCep.buscar(inputCEP.getText().replaceAll("[^0-9]", ""));
            inputLogradouro.setText(viaCep.getLogradouro());
            inputComplemento.setText(viaCep.getComplemento());
            inputBairro.setText(viaCep.getBairro());
            inputCidade.setText(viaCep.getLocalidade());
            inputUF.setText(viaCep.getUf());
        }else{
            inputLogradouro.setText("");
            inputComplemento.setText("");
            inputBairro.setText("");
            inputCidade.setText("");
            inputUF.setText("");
        }

        if(inputCEP.getText().length()>9){
            throw new Exception("CEP Ultrapassa a quantidade de digitos");
        }else{
            msgErroCEP.setText("");
        }
    }
    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            ClienteDAO cliente = new ClienteDAO(nomeArquivo);

            int id = cliente.recuperar().size();
            //int id = 0;
            
            String itemSelecionado = jComboBoxTipo.getSelectedItem().toString();

            Cliente objeto = new Cliente(id, inputNome.getText(), inputFone.getText(), inputCPF.getText(), inputSexo.getText(), inputCEP.getText(), inputLogradouro.getText(), inputComplemento.getText(), inputBairro.getText(), inputCidade.getText(), inputUF.getText(), inputDataNasc.getText(), itemSelecionado, this.img);

            cliente.incluir(objeto);
            
            listarCadastros();
            limparCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAbrirFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirFotoActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File arquivo = chooser.getSelectedFile();
        String caminho = arquivo.getAbsolutePath();


        ImageIcon foto = new ImageIcon(Toolkit.getDefaultToolkit().getImage(caminho));
        Image imagem = foto.getImage();
        Image fotoResized = imagem.getScaledInstance(fotoCadastro.getWidth(), fotoCadastro.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon fotoPronta = new ImageIcon(fotoResized);
        fotoCadastro.setIcon(fotoPronta);
        
        img = caminho;
    }//GEN-LAST:event_btnAbrirFotoActionPerformed

    private void inputBuscarCadastroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputBuscarCadastroKeyReleased
        DefaultTableModel table = (DefaultTableModel)tabelaCadastroCliente.getModel();
        String search = inputBuscarCadastro.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(table);
        tabelaCadastroCliente.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_inputBuscarCadastroKeyReleased

    private void tabelaCadastroClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCadastroClienteMouseClicked
        this.clic_tabla = tabelaCadastroCliente.rowAtPoint(evt.getPoint());
        
        Object nome = tabelaCadastroCliente.getValueAt(this.clic_tabla, 0);
        Object fone = tabelaCadastroCliente.getValueAt(this.clic_tabla, 1);
        Object cpf = tabelaCadastroCliente.getValueAt(this.clic_tabla, 2);
        Object sexo = tabelaCadastroCliente.getValueAt(this.clic_tabla, 3);
        Object cep = tabelaCadastroCliente.getValueAt(this.clic_tabla, 4);
        Object logradouro = tabelaCadastroCliente.getValueAt(this.clic_tabla, 5);
        Object complemento = tabelaCadastroCliente.getValueAt(this.clic_tabla, 6);
        Object bairro = tabelaCadastroCliente.getValueAt(this.clic_tabla, 7);
        Object cidade = tabelaCadastroCliente.getValueAt(this.clic_tabla, 8);
        Object Uf = tabelaCadastroCliente.getValueAt(this.clic_tabla, 9);
        Object dataNasc = tabelaCadastroCliente.getValueAt(this.clic_tabla, 10);
        Object tipo = tabelaCadastroCliente.getValueAt(this.clic_tabla, 11);
        
        inputNome.setText(String.valueOf(nome));
        inputFone.setText(String.valueOf(fone));
        inputCPF.setText(String.valueOf(cpf));
        inputSexo.setText(String.valueOf(sexo));
        inputCEP.setText(String.valueOf(cep));
        inputLogradouro.setText(String.valueOf(logradouro));
        inputComplemento.setText(String.valueOf(complemento));
        inputBairro.setText(String.valueOf(bairro));
        inputCidade.setText(String.valueOf(cidade));
        inputUF.setText(String.valueOf(Uf));
        inputDataNasc.setText(String.valueOf(dataNasc));
    }//GEN-LAST:event_tabelaCadastroClienteMouseClicked

    private void inputCEPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCEPKeyReleased
        try {
            buscarCep();
        } catch (Exception ex) {
            msgErroCEP.setText(ex.getMessage());
        }
    }//GEN-LAST:event_inputCEPKeyReleased

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            String nome = inputNome.getText();
            
            ClienteDAO cliente = new ClienteDAO(nomeArquivo);
            cliente.excluir(nome);
            
            listarCadastros();
            limparCampos();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            String nome = inputNome.getText();
            String itemSelecionado = jComboBoxTipo.getSelectedItem().toString();
            
            ClienteDAO cliente = new ClienteDAO(nomeArquivo);
            
            int id = cliente.recuperar().size();
            //int id = 0;
            
            Cliente objeto = new Cliente(id, inputNome.getText(), inputFone.getText(), inputCPF.getText(), inputSexo.getText(), inputCEP.getText(), inputLogradouro.getText(), inputComplemento.getText(), inputBairro.getText(), inputCidade.getText(), inputUF.getText(), inputDataNasc.getText(), itemSelecionado, this.img);
            
            cliente.alterar(nome, objeto);
            
            listarCadastros();
            limparCampos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirFoto;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JPanel cardCadastro;
    private javax.swing.JLabel fotoCadastro;
    private javax.swing.JTextField inputBairro;
    private javax.swing.JTextField inputBuscarCadastro;
    private javax.swing.JFormattedTextField inputCEP;
    private javax.swing.JFormattedTextField inputCPF;
    private javax.swing.JTextField inputCidade;
    private javax.swing.JTextField inputComplemento;
    private javax.swing.JFormattedTextField inputDataNasc;
    private javax.swing.JFormattedTextField inputFone;
    private javax.swing.JTextField inputLogradouro;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputSexo;
    private javax.swing.JTextField inputUF;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel msgErroCEP;
    private javax.swing.JTable tabelaCadastroCliente;
    // End of variables declaration//GEN-END:variables
}