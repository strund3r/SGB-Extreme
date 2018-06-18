package view;

import java.awt.Color;
import java.util.ArrayList;
import persistencia.UsuarioDAO;
import regras_de_negocio.Usuario;

public class Logar extends javax.swing.JFrame {
    
    private String nomeArquivo = "/home/umbrellatec/Documentos/cadastroUsuarios.csv";
    private char senhaVisivel;

    public Logar() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        
        senhaVisivel = inputSenha.getEchoChar();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardCadastro3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        inputLogin = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        inputSenha = new javax.swing.JPasswordField();
        jLabellogin = new javax.swing.JLabel();
        jLabelsenha = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabellogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        msgErro = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabelolhoFechado = new javax.swing.JLabel();
        btnAcessar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1366, 768));

        cardCadastro3.setBackground(new java.awt.Color(255, 255, 255));
        cardCadastro3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("SENHA");

        inputLogin.setForeground(new java.awt.Color(102, 102, 102));
        inputLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputLogin.setMaximumSize(new java.awt.Dimension(250, 30));
        inputLogin.setMinimumSize(new java.awt.Dimension(200, 30));
        inputLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputLoginKeyPressed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("LOGIN");

        inputSenha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSenhaActionPerformed(evt);
            }
        });
        inputSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputSenhaKeyPressed(evt);
            }
        });

        jLabellogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Porta Login.png"))); // NOI18N

        jLabelsenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Chave Login.png"))); // NOI18N

        javax.swing.GroupLayout cardCadastro3Layout = new javax.swing.GroupLayout(cardCadastro3);
        cardCadastro3.setLayout(cardCadastro3Layout);
        cardCadastro3Layout.setHorizontalGroup(
            cardCadastro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCadastro3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cardCadastro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardCadastro3Layout.createSequentialGroup()
                        .addComponent(jLabellogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addGroup(cardCadastro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cardCadastro3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabelsenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cardCadastro3Layout.setVerticalGroup(
            cardCadastro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCadastro3Layout.createSequentialGroup()
                .addGroup(cardCadastro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardCadastro3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(cardCadastro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabellogin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardCadastro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelsenha)
                    .addGroup(cardCadastro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inputSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabellogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabellogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabellogo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabellogo)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        msgErro.setBackground(new java.awt.Color(204, 0, 0));
        msgErro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        msgErro.setForeground(new java.awt.Color(255, 51, 51));
        msgErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Mostrar Senha");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabelolhoFechado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Olho Fechado.png"))); // NOI18N

        btnAcessar.setText("Acessar");
        btnAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessarActionPerformed(evt);
            }
        });
        btnAcessar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAcessarKeyPressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/transferir.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(msgErro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelolhoFechado)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAcessar)
                            .addComponent(jCheckBox1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelolhoFechado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msgErro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cardCadastro3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cardCadastro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessarActionPerformed
        try {
            UsuarioDAO cadastroUsuario = new UsuarioDAO(nomeArquivo);
            
            String login = inputLogin.getText();
            String senha = inputSenha.getText();
            
            ArrayList<Usuario> listaDeUsuario = cadastroUsuario.recuperar();

            for (int i = 0; i < listaDeUsuario.size(); i++) {
                Usuario aux = listaDeUsuario.get(i);
                if (aux.getLogin().equals(login) && aux.getSenha().equals(senha)) {
                    TelaPrincipal principal = new TelaPrincipal();
                    principal.setVisible(true);
                    this.dispose();
                }
            }
            
            if ("admin".equals(login) && "admin123".equals(senha)) {
                TelaPrincipal principal = new TelaPrincipal();
                principal.setVisible(true);
                this.dispose();
            }else{
                throw new Exception("Usuário ou senha incorreto");
            }
            
            msgErro.setText("");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            msgErro.setText(ex.getMessage());
        }
    }//GEN-LAST:event_btnAcessarActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
       
        if (jCheckBox1.isSelected()){
        inputSenha.setEchoChar('\0');
        jLabelolhoFechado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Olho Aberto.png")));
        
        } else {
        
            inputSenha.setEchoChar(senhaVisivel);
            jLabelolhoFechado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Olho Fechado.png")));
        
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void inputSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSenhaActionPerformed

    private void inputLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputLoginKeyPressed
         
        if (evt.getKeyCode() == evt.VK_ENTER){
            inputSenha.requestFocus();
        }
        
    }//GEN-LAST:event_inputLoginKeyPressed

    private void inputSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputSenhaKeyPressed
            
        if (evt.getKeyCode() == evt.VK_ENTER){
            btnAcessar.requestFocus();
        }
    }//GEN-LAST:event_inputSenhaKeyPressed

    private void btnAcessarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAcessarKeyPressed
            
        if (evt.getKeyCode() == evt.VK_ENTER){
            
            
        }
    }//GEN-LAST:event_btnAcessarKeyPressed
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcessar;
    private javax.swing.JPanel cardCadastro3;
    private javax.swing.JTextField inputLogin;
    private javax.swing.JPasswordField inputSenha;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabellogin;
    private javax.swing.JLabel jLabellogo;
    private javax.swing.JLabel jLabelolhoFechado;
    private javax.swing.JLabel jLabelsenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel msgErro;
    // End of variables declaration//GEN-END:variables
}