
package com.mycompany.mercadomaven_hibernate_jpa.view;

import com.mycompany.mercadomaven_hibernate_jpa.Controler.ControllerCadBairro;
import com.mycompany.mercadomaven_hibernate_jpa.Controler.ControllerCadCidade;
import com.mycompany.mercadomaven_hibernate_jpa.Controler.ControllerCadClasse;
import com.mycompany.mercadomaven_hibernate_jpa.Controler.ControllerCadEndereco;
import com.mycompany.mercadomaven_hibernate_jpa.Controler.ControllerCadMarca;
import com.mycompany.mercadomaven_hibernate_jpa.Controler.ControllerCadastroProduto;
import com.mycompany.mercadomaven_hibernate_jpa.Controler.ControllerCadCliente;
import com.mycompany.mercadomaven_hibernate_jpa.Controler.ControllerCadColaborador;
import com.mycompany.mercadomaven_hibernate_jpa.Controler.ControllerCadCondPag;
import com.mycompany.mercadomaven_hibernate_jpa.Controler.ControllerCadFornecedor;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FormMenuPrincipal extends javax.swing.JFrame {

    
    public FormMenuPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemBairro = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCadProduto = new javax.swing.JMenuItem();
        jMenuItemMarca = new javax.swing.JMenuItem();
        jMenuItemClasse = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuColaborador = new javax.swing.JMenuItem();
        jMenuFornecedor = new javax.swing.JMenuItem();
        jMenuCliente = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuConPag = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSair = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Cadastros");

        jMenuItemBairro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemBairro.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\OneDrive\\Documentos\\MavenJPAHibernate\\MercadoMaven_Hibernate_JPA\\src\\main\\java\\com.mycompany.mercadomaven_hibernate_jpa.imagens\\Component.png")); // NOI18N
        jMenuItemBairro.setText("Bairro");
        jMenuItemBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBairroActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemBairro);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\OneDrive\\Documentos\\MavenJPAHibernate\\MercadoMaven_Hibernate_JPA\\src\\main\\java\\com.mycompany.mercadomaven_hibernate_jpa.imagens\\Earth.png")); // NOI18N
        jMenuItem2.setText("Endereço");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\OneDrive\\Documentos\\MavenJPAHibernate\\MercadoMaven_Hibernate_JPA\\src\\main\\java\\com.mycompany.mercadomaven_hibernate_jpa.imagens\\Home.png")); // NOI18N
        jMenuItem3.setText("Cidade");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jMenuItemCadProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCadProduto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\OneDrive\\Documentos\\MavenJPAHibernate\\MercadoMaven_Hibernate_JPA\\src\\main\\java\\com.mycompany.mercadomaven_hibernate_jpa.imagens\\Favourites.png")); // NOI18N
        jMenuItemCadProduto.setText("Produto");
        jMenuItemCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCadProduto);

        jMenuItemMarca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemMarca.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\OneDrive\\Documentos\\MavenJPAHibernate\\MercadoMaven_Hibernate_JPA\\src\\main\\java\\com.mycompany.mercadomaven_hibernate_jpa.imagens\\Green bookmark.png")); // NOI18N
        jMenuItemMarca.setText("Marca");
        jMenuItemMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMarcaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemMarca);

        jMenuItemClasse.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemClasse.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\OneDrive\\Documentos\\MavenJPAHibernate\\MercadoMaven_Hibernate_JPA\\src\\main\\java\\com.mycompany.mercadomaven_hibernate_jpa.imagens\\Clipboard.png")); // NOI18N
        jMenuItemClasse.setText("Classe");
        jMenuItemClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClasseActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemClasse);
        jMenu1.add(jSeparator2);

        jMenuColaborador.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuColaborador.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\OneDrive\\Documentos\\MavenJPAHibernate\\MercadoMaven_Hibernate_JPA\\src\\main\\java\\com.mycompany.mercadomaven_hibernate_jpa.imagens\\Female.png")); // NOI18N
        jMenuColaborador.setText("Colaborador");
        jMenuColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuColaboradorActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuColaborador);

        jMenuFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuFornecedor.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\OneDrive\\Documentos\\MavenJPAHibernate\\MercadoMaven_Hibernate_JPA\\src\\main\\java\\com.mycompany.mercadomaven_hibernate_jpa.imagens\\Delivery.png")); // NOI18N
        jMenuFornecedor.setText("Fornecedor");
        jMenuFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFornecedorActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuFornecedor);

        jMenuCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuCliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\OneDrive\\Documentos\\MavenJPAHibernate\\MercadoMaven_Hibernate_JPA\\src\\main\\java\\com.mycompany.mercadomaven_hibernate_jpa.imagens\\Buy.png")); // NOI18N
        jMenuCliente.setText("Cliente");
        jMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCliente);
        jMenu1.add(jSeparator3);

        jMenuConPag.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuConPag.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\OneDrive\\Documentos\\MavenJPAHibernate\\MercadoMaven_Hibernate_JPA\\src\\main\\java\\com.mycompany.mercadomaven_hibernate_jpa.imagens\\Dollar.png")); // NOI18N
        jMenuConPag.setText("Condição Pagamento");
        jMenuConPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConPagActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuConPag);
        jMenu1.add(jSeparator4);

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\OneDrive\\Documentos\\MavenJPAHibernate\\MercadoMaven_Hibernate_JPA\\src\\main\\java\\com.mycompany.mercadomaven_hibernate_jpa.imagens\\Cancel.png")); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSair);
        jMenu1.add(jSeparator5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Movimentos");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatório");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ajuda");

        jMenuItem1.setText("jMenuItem1");
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed

       FormMenuPrincipal menu = new FormMenuPrincipal();
       menu.dispose();

    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemCadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadProdutoActionPerformed
        FoCadastroProduto telaCadProduto;
        try {
            telaCadProduto = new FoCadastroProduto();
            ControllerCadastroProduto controllerCadastroProduto = new ControllerCadastroProduto(telaCadProduto) {};
            telaCadProduto.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(FormMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_jMenuItemCadProdutoActionPerformed

    private void jMenuItemBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBairroActionPerformed
        FoCadBairroFinal telaCadBairro = new FoCadBairroFinal();
        ControllerCadBairro controllerCadBairro = new ControllerCadBairro(telaCadBairro) {};
        telaCadBairro.setVisible(true);
    }//GEN-LAST:event_jMenuItemBairroActionPerformed

    private void jMenuItemMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMarcaActionPerformed
        FoCadastroMarca telaCadMarca = new FoCadastroMarca();
        ControllerCadMarca controllerCadMarca = new ControllerCadMarca(telaCadMarca) {};
        telaCadMarca.setVisible(true);
    }//GEN-LAST:event_jMenuItemMarcaActionPerformed

    private void jMenuItemClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClasseActionPerformed
        FoCadastroClasse telaCadClasse = new FoCadastroClasse();
        ControllerCadClasse controllerCadClasse = new ControllerCadClasse(telaCadClasse) {};
        telaCadClasse.setVisible(true);
    }//GEN-LAST:event_jMenuItemClasseActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FoCadastroEndereco telaCadEndereco = new FoCadastroEndereco();
        ControllerCadEndereco controllerCadEndereco = new ControllerCadEndereco(telaCadEndereco) {};
        telaCadEndereco.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        FoCadCidade telaCadCidade = new FoCadCidade();
        ControllerCadCidade controllerCadCidade = new ControllerCadCidade(telaCadCidade) {};
        telaCadCidade.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClienteActionPerformed
        try {
            FoCadastroCliente telaCadCliente = new FoCadastroCliente();
            ControllerCadCliente controllerCadCliente = new ControllerCadCliente(telaCadCliente) {};
            telaCadCliente.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(FormMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuClienteActionPerformed

    private void jMenuFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFornecedorActionPerformed
        try {
            FoCadastroFornecedor telaCadFornecedor = new FoCadastroFornecedor();
            ControllerCadFornecedor controllerCadFornecedor = new ControllerCadFornecedor(telaCadFornecedor) {};
            telaCadFornecedor.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(FormMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuFornecedorActionPerformed

    private void jMenuColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuColaboradorActionPerformed
        try {
            FoCadastroColaborador telacadColaborador = new FoCadastroColaborador();
            ControllerCadColaborador controllerCadColaborador = new ControllerCadColaborador(telacadColaborador) {};
            telacadColaborador.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(FormMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuColaboradorActionPerformed

    private void jMenuConPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConPagActionPerformed
        FoCadCondicaoPagamento telaCadCondicaoPagamento;
        try {
            telaCadCondicaoPagamento = new FoCadCondicaoPagamento();
            ControllerCadCondPag controllerCadCondPag = new ControllerCadCondPag(telaCadCondicaoPagamento) {};
            telaCadCondicaoPagamento.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(FormMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_jMenuConPagActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCliente;
    private javax.swing.JMenuItem jMenuColaborador;
    private javax.swing.JMenuItem jMenuConPag;
    private javax.swing.JMenuItem jMenuFornecedor;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemBairro;
    private javax.swing.JMenuItem jMenuItemCadProduto;
    private javax.swing.JMenuItem jMenuItemClasse;
    private javax.swing.JMenuItem jMenuItemMarca;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
