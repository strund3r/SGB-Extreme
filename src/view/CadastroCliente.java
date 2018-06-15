package view;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import persistencia.ClienteDAO;
import persistencia.EmprestimoDAO;
import regras_de_negocio.Cliente;
import regras_de_negocio.Emprestimo;
import viacep.ViaCEP;
import viacep.ViaCEPException;

public class CadastroCliente extends javax.swing.JFrame {

    private String nomeArquivo = "/home/umbrellatec/Documentos/cadastroCliente.csv";
                              //"C:\\Users\\tally\\Documents\\cadastro.csv";
    private int clic_tabla;

    public CadastroCliente(String caminho) throws IOException {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);

        listarCadastros();

        FileWriter fw = new FileWriter(caminho, true);
        //Criar o buffer do arquivo
        new BufferedWriter(fw);
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
        msgErro = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        inputComplemento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        inputFone = new javax.swing.JFormattedTextField();
        inputCPF = new javax.swing.JFormattedTextField();
        inputCEP = new javax.swing.JFormattedTextField();
        inputDataNasc = new javax.swing.JFormattedTextField();
        tipoComboBox = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        inputID = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        inputMatricula = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        sexoComboBox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        inputBuscarCadastro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCadastroCliente = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();

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
        inputCidade.setMaximumSize(new java.awt.Dimension(250, 30));
        inputCidade.setMinimumSize(new java.awt.Dimension(200, 30));

        msgErro.setBackground(new java.awt.Color(204, 0, 0));
        msgErro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        msgErro.setForeground(new java.awt.Color(255, 51, 51));
        msgErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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
        inputNome.setMaximumSize(new java.awt.Dimension(250, 30));
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
        inputFone.setMaximumSize(new java.awt.Dimension(250, 30));
        inputFone.setMinimumSize(new java.awt.Dimension(200, 30));

        inputCPF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        try {
            inputCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inputCPF.setMaximumSize(new java.awt.Dimension(250, 30));
        inputCPF.setMinimumSize(new java.awt.Dimension(200, 30));

        inputCEP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        try {
            inputCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inputCEP.setMaximumSize(new java.awt.Dimension(250, 30));
        inputCEP.setMinimumSize(new java.awt.Dimension(200, 30));
        inputCEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputCEPFocusLost(evt);
            }
        });

        inputDataNasc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        try {
            inputDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inputDataNasc.setMinimumSize(new java.awt.Dimension(120, 30));

        tipoComboBox.setForeground(new java.awt.Color(51, 51, 51));
        tipoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALUNO", "PROFESSOR" }));
        tipoComboBox.setBorder(null);
        tipoComboBox.setMinimumSize(new java.awt.Dimension(150, 30));
        tipoComboBox.setPreferredSize(new java.awt.Dimension(56, 30));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("ID");

        inputID.setForeground(new java.awt.Color(102, 102, 102));
        inputID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputID.setEnabled(false);
        inputID.setMinimumSize(new java.awt.Dimension(30, 16));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("E-MAIL");

        inputEmail.setForeground(new java.awt.Color(102, 102, 102));
        inputEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputEmail.setMaximumSize(new java.awt.Dimension(250, 30));
        inputEmail.setMinimumSize(new java.awt.Dimension(200, 30));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("TIPO");

        inputMatricula.setForeground(new java.awt.Color(102, 102, 102));
        inputMatricula.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputMatricula.setMaximumSize(new java.awt.Dimension(250, 30));
        inputMatricula.setMinimumSize(new java.awt.Dimension(200, 30));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("MATRICULA");

        sexoComboBox.setForeground(new java.awt.Color(51, 51, 51));
        sexoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MASCULINO", "FEMININO" }));
        sexoComboBox.setBorder(null);
        sexoComboBox.setMinimumSize(new java.awt.Dimension(150, 30));
        sexoComboBox.setPreferredSize(new java.awt.Dimension(56, 30));

        javax.swing.GroupLayout cardCadastroLayout = new javax.swing.GroupLayout(cardCadastro);
        cardCadastro.setLayout(cardCadastroLayout);
        cardCadastroLayout.setHorizontalGroup(
            cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardCadastroLayout.createSequentialGroup()
                .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardCadastroLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(cardCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 129, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputLogradouro, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                            .addGroup(cardCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 171, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputFone, javax.swing.GroupLayout.PREFERRED_SIZE, 142, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(cardCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipoComboBox, 0, 293, Short.MAX_VALUE))
                            .addGroup(cardCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputUF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(cardCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 164, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sexoComboBox, 0, 150, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputDataNasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(msgErro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cardCadastroLayout.setVerticalGroup(
            cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCadastroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputFone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inputDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sexoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inputCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(inputBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inputComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inputCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputUF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inputMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(msgErro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(18, 164, Short.MAX_VALUE)
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
                "ID", "Nome", "Telefone", "CPF", "E-mail", "Sexo", "CEP", "Rua", "Complemento", "Bairro", "Cidade", "UF", "Data Nasc.", "", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
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
        tabelaCadastroCliente.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

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
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(cardCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listarCadastros(){
        try {
            ClienteDAO cadastroClientes = new ClienteDAO(nomeArquivo);
            ArrayList<Cliente>listaDeClientes = cadastroClientes.recuperar();
            //cria tabela para inclusao
            DefaultTableModel model = (DefaultTableModel) tabelaCadastroCliente.getModel();
            //Limpa a tabela
            model.setNumRows(0);
            for (int i = 0; i < listaDeClientes.size(); i++) {
                Cliente aux = listaDeClientes.get(i);

                //Incluir nova linha na Tabela
                model.addRow(new String[]{
                    String.valueOf(aux.getId()),
                    aux.getNome(),
                    aux.getFone(),
                    aux.getCpf(),
                    aux.getEmail(),
                    aux.getSexo(),
                    aux.getCep(),
                    aux.getLogradouro(),
                    aux.getComplemento(),
                    aux.getBairro(),
                    aux.getCidade(),
                    aux.getUf(),
                    aux.getDataNasc(),
                    aux.getMatricula(),
                    aux.getTipo()
                });
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void limparCampos(){
        inputID.setText("");
        inputNome.setText("");
        inputFone.setText("");
        inputCPF.setText("");
        inputEmail.setText("");
        inputCEP.setText("");
        inputLogradouro.setText("");
        inputComplemento.setText("");
        inputBairro.setText("");
        inputCidade.setText("");
        inputUF.setText("");
        inputMatricula.setText("");
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
            msgErro.setText("");
        }
    }

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            ClienteDAO cadastroClientes = new ClienteDAO(nomeArquivo);

            int id = cadastroClientes.autoincrement();
            String nome = inputNome.getText();
            String telefone = inputFone.getText();
            String cpf = inputCPF.getText();
            String email = inputEmail.getText();
            String sexo = sexoComboBox.getSelectedItem().toString();
            String cep = inputCEP.getText();
            String logradouro = inputLogradouro.getText();
            String complemento = inputComplemento.getText();
            String bairro = inputBairro.getText();
            String cidade = inputCidade.getText();
            String uf = inputUF.getText();
            String dataNasc = inputDataNasc.getText();
            String matricula = inputMatricula.getText();
            String itemSelecionado = tipoComboBox.getSelectedItem().toString();

            Cliente cliente = new Cliente(id,nome,telefone,cpf,email,sexo,cep,logradouro,complemento,bairro,cidade,uf,dataNasc,matricula,itemSelecionado);

            cadastroClientes.incluir(cliente);

            listarCadastros();
            limparCampos();

            msgErro.setText("");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            msgErro.setText(ex.getMessage());
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void inputBuscarCadastroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputBuscarCadastroKeyReleased
        DefaultTableModel table = (DefaultTableModel)tabelaCadastroCliente.getModel();
        String search = inputBuscarCadastro.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(table);
        tabelaCadastroCliente.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_inputBuscarCadastroKeyReleased

    private void tabelaCadastroClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCadastroClienteMouseClicked
        this.clic_tabla = tabelaCadastroCliente.rowAtPoint(evt.getPoint());

        Object id = tabelaCadastroCliente.getValueAt(this.clic_tabla, 0);
        Object nome = tabelaCadastroCliente.getValueAt(this.clic_tabla, 1);
        Object fone = tabelaCadastroCliente.getValueAt(this.clic_tabla, 2);
        Object cpf = tabelaCadastroCliente.getValueAt(this.clic_tabla, 3);
        Object email = tabelaCadastroCliente.getValueAt(this.clic_tabla, 4);
        Object sexo = tabelaCadastroCliente.getValueAt(this.clic_tabla, 5);
        Object cep = tabelaCadastroCliente.getValueAt(this.clic_tabla, 6);
        Object logradouro = tabelaCadastroCliente.getValueAt(this.clic_tabla, 7);
        Object complemento = tabelaCadastroCliente.getValueAt(this.clic_tabla, 8);
        Object bairro = tabelaCadastroCliente.getValueAt(this.clic_tabla, 9);
        Object cidade = tabelaCadastroCliente.getValueAt(this.clic_tabla, 10);
        Object Uf = tabelaCadastroCliente.getValueAt(this.clic_tabla, 11);
        Object dataNasc = tabelaCadastroCliente.getValueAt(this.clic_tabla, 12);
        Object matricula = tabelaCadastroCliente.getValueAt(this.clic_tabla, 13);
        Object tipo = tabelaCadastroCliente.getValueAt(this.clic_tabla, 14);

        inputID.setText(String.valueOf(id));
        inputNome.setText(String.valueOf(nome));
        inputFone.setText(String.valueOf(fone));
        inputCPF.setText(String.valueOf(cpf));
        inputEmail.setText(String.valueOf(email));
        sexoComboBox.setSelectedItem(sexo);
        inputCEP.setText(String.valueOf(cep));
        inputLogradouro.setText(String.valueOf(logradouro));
        inputComplemento.setText(String.valueOf(complemento));
        inputBairro.setText(String.valueOf(bairro));
        inputCidade.setText(String.valueOf(cidade));
        inputUF.setText(String.valueOf(Uf));
        inputDataNasc.setText(String.valueOf(dataNasc));
        inputMatricula.setText(String.valueOf(matricula));
        tipoComboBox.setSelectedItem(tipo);
    }//GEN-LAST:event_tabelaCadastroClienteMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            int id = Integer.parseInt(inputID.getText());

            ClienteDAO cadastroClientes = new ClienteDAO(nomeArquivo);

            EmprestimoDAO emprestimoDAO = new EmprestimoDAO("/home/umbrellatec/Documentos/cadastroEmprestimo.csv");
            ArrayList<Emprestimo> listaDeEmprestimo = emprestimoDAO.recuperar();
            for (int i = 0; i < listaDeEmprestimo.size(); i++) {
                Emprestimo aux = listaDeEmprestimo.get(i);
                if (aux.getId_cliente() != id) {
                    cadastroClientes.excluir(id);
                }else{
                    throw new Exception("Pendente em Emprestimo");
                }
            }

            listarCadastros();
            limparCampos();

            msgErro.setText("");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            msgErro.setText(ex.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            ClienteDAO cadastroClientes = new ClienteDAO(nomeArquivo);

            int id = Integer.parseInt(inputID.getText());
            String nome = inputNome.getText();
            String telefone = inputFone.getText();
            String cpf = inputCPF.getText();
            String email = inputEmail.getText();
            String sexo = sexoComboBox.getSelectedItem().toString();
            String cep = inputCEP.getText();
            String logradouro = inputLogradouro.getText();
            String complemento = inputComplemento.getText();
            String bairro = inputBairro.getText();
            String cidade = inputCidade.getText();
            String uf = inputUF.getText();
            String dataNasc = inputDataNasc.getText();
            String matricula = inputMatricula.getText();
            String itemSelecionado = tipoComboBox.getSelectedItem().toString();

            Cliente cliente = new Cliente(id,nome,telefone,cpf,email,sexo,cep,logradouro,complemento,bairro,cidade,uf,dataNasc,matricula,itemSelecionado);

            cadastroClientes.alterar(id, cliente);

            listarCadastros();
            limparCampos();

            msgErro.setText("");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            msgErro.setText(ex.getMessage());
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void inputCEPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCEPFocusLost
        try {
            buscarCep();
            msgErro.setText("");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            msgErro.setText(ex.getMessage());
        }
    }//GEN-LAST:event_inputCEPFocusLost

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaPrincipal principal = new TelaPrincipal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel cardCadastro;
    private javax.swing.JTextField inputBairro;
    private javax.swing.JTextField inputBuscarCadastro;
    private javax.swing.JFormattedTextField inputCEP;
    private javax.swing.JFormattedTextField inputCPF;
    private javax.swing.JTextField inputCidade;
    private javax.swing.JTextField inputComplemento;
    private javax.swing.JFormattedTextField inputDataNasc;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JFormattedTextField inputFone;
    private javax.swing.JTextField inputID;
    private javax.swing.JTextField inputLogradouro;
    private javax.swing.JTextField inputMatricula;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputUF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JLabel msgErro;
    private javax.swing.JComboBox<String> sexoComboBox;
    private javax.swing.JTable tabelaCadastroCliente;
    private javax.swing.JComboBox<String> tipoComboBox;
    // End of variables declaration//GEN-END:variables
}
