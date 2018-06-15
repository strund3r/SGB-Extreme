package view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaPrincipal extends javax.swing.JFrame {
    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemClientes = new javax.swing.JMenuItem();
        menuItemLivros = new javax.swing.JMenuItem();
        menuItemAutores = new javax.swing.JMenuItem();
        menuItemUsuarios = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuItemEmprestimo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jMenu1.setText("Cadastros");

        menuItemClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        menuItemClientes.setText("Clientes");
        menuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemClientesActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemClientes);

        menuItemLivros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK));
        menuItemLivros.setText("Livros");
        menuItemLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLivrosActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemLivros);

        menuItemAutores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        menuItemAutores.setText("Autores");
        jMenu1.add(menuItemAutores);

        menuItemUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK));
        menuItemUsuarios.setText("Usuarios");
        menuItemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemUsuarios);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Gestão");

        menuItemEmprestimo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, 0));
        menuItemEmprestimo.setText("Emprestimo");
        menuItemEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEmprestimoActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemEmprestimo);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Financeiro");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Configurações");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Sair");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemClientesActionPerformed
        try {
            CadastroCliente cadastro = new CadastroCliente("/home/umbrellatec/Documentos/cadastroCliente.csv");
            cadastro.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuItemClientesActionPerformed

    private void menuItemLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLivrosActionPerformed
        try {
            CadastroLivro cadastro = new CadastroLivro("/home/umbrellatec/Documentos/cadastroLivro.csv");
            cadastro.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuItemLivrosActionPerformed

    private void menuItemEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEmprestimoActionPerformed
        try {
            CadastroEmprestimo emprestimo = new CadastroEmprestimo("/home/umbrellatec/Documentos/cadastroEmprestimo.csv");
            emprestimo.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuItemEmprestimoActionPerformed

    private void menuItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUsuariosActionPerformed
        try {
            CadastroUsuario cadastroUsuario = new CadastroUsuario("/home/umbrellatec/Documentos/cadastroUsuarios.csv");
            cadastroUsuario.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuItemUsuariosActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuItemAutores;
    private javax.swing.JMenuItem menuItemClientes;
    private javax.swing.JMenuItem menuItemEmprestimo;
    private javax.swing.JMenuItem menuItemLivros;
    private javax.swing.JMenuItem menuItemUsuarios;
    // End of variables declaration//GEN-END:variables
}