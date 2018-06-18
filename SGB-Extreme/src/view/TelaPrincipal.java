package view;

import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaPrincipal extends javax.swing.JFrame {
    public TelaPrincipal() throws IOException {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemClientes = new javax.swing.JMenuItem();
        menuItemLivros = new javax.swing.JMenuItem();
        menuItemAutores = new javax.swing.JMenuItem();
        menuItemUsuarios = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuItemReserva = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jButton1.setText("Acesse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Cadastros");

        menuItemClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        menuItemClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Clientes.png"))); // NOI18N
        menuItemClientes.setText("Clientes");
        menuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemClientesActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemClientes);

        menuItemLivros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK));
        menuItemLivros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Livros.png"))); // NOI18N
        menuItemLivros.setText("Livros");
        menuItemLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLivrosActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemLivros);

        menuItemAutores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        menuItemAutores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Autores.png"))); // NOI18N
        menuItemAutores.setText("Autores");
        jMenu1.add(menuItemAutores);

        menuItemUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK));
        menuItemUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Usuario.png"))); // NOI18N
        menuItemUsuarios.setText("Usuarios");
        menuItemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemUsuarios);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Gestão");

        menuItemReserva.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK));
        menuItemReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Reserva.png"))); // NOI18N
        menuItemReserva.setText("Reserva");
        menuItemReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemReservaActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemReserva);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Emprestimo.png"))); // NOI18N
        jMenuItem1.setText("Emprestimo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Financeiro");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Caixa.png"))); // NOI18N
        jMenuItem2.setText("Caixa");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Multa.png"))); // NOI18N
        jMenuItem3.setText("Multa");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Configurações");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Sair");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 572, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemClientesActionPerformed
        try {
            CadastroCliente cadastro = new CadastroCliente();
            cadastro.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuItemClientesActionPerformed

    private void menuItemLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLivrosActionPerformed
        try {
            CadastroLivro cadastro = new CadastroLivro();
            cadastro.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuItemLivrosActionPerformed

    private void menuItemReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemReservaActionPerformed
        try {
            CadastroReserva emprestimo = new CadastroReserva();
            emprestimo.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuItemReservaActionPerformed

    private void menuItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUsuariosActionPerformed
        try {
            CadastroUsuario cadastroUsuario = new CadastroUsuario();
            cadastroUsuario.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuItemUsuariosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("https://www.senaigo.com.br/").toURI());
        } catch (URISyntaxException | IOException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ListagemMulta multa = new ListagemMulta();
        multa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CadastroEmprestimo cadastroEmprestimo = new CadastroEmprestimo();
        cadastroEmprestimo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem menuItemAutores;
    private javax.swing.JMenuItem menuItemClientes;
    private javax.swing.JMenuItem menuItemLivros;
    private javax.swing.JMenuItem menuItemReserva;
    private javax.swing.JMenuItem menuItemUsuarios;
    // End of variables declaration//GEN-END:variables
}