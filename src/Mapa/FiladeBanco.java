package Mapa;

import java.util.ArrayList;

public class FiladeBanco extends javax.swing.JFrame {
    
    private final ArrayList<Senha> senhas = new ArrayList<>();    
     
    public FiladeBanco() {
        initComponents();
        customInitComponents();
    }
    
    public void gerarNovaSenha(char tipo) {     
        Senha senha = new Senha(tipo, 1);
        Integer numero = 0;        
        
        if (! senhas.isEmpty()) {           
            numero = senhas.get(senhas.size() - 1).getNumero();
            senha = new Senha(tipo, numero + 1);            
        }           
        senhas.add(senha);             
        jTextFieldSenha.setText(senha.toString());
    }
 
    public String getSenha(char tipo) {
        Senha senha = null;
               
        if (! senhas.isEmpty()) {
            for(int i = 0; i < senhas.size(); i++) {
                senha = senhas.get(i);
            
                if(senha.getTipo() == tipo) {               
                    senhas.remove(senha);
                    return senha.toString();
                }   
            }             
            senha = senhas.get(0);   
            senhas.remove(senha);         
            return senha.toString();
        }      
        return "SEM SENHAS";
    }
    
    private void customInitComponents() {   
        jLabelCaixa.setText("");          
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSenha = new javax.swing.JLabel();
        jLabelCaixa = new javax.swing.JLabel();
        jPanelClientes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonComum = new javax.swing.JButton();
        jButtonRapido = new javax.swing.JButton();
        jButtonPrioritario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSenha = new javax.swing.JTextField();
        jPanelCaixas = new javax.swing.JPanel();
        jButtonCaixa1 = new javax.swing.JButton();
        jButtonCaixa2 = new javax.swing.JButton();
        jButtonCaixa3 = new javax.swing.JButton();
        jButtonCaixa4 = new javax.swing.JButton();
        jLabelClientes = new javax.swing.JLabel();
        jLabelCaixas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Filas");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabelSenha.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSenha.setText("SENHA");

        jLabelCaixa.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelCaixa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCaixa.setText("CAIXA");

        jPanelClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelClientes.setPreferredSize(new java.awt.Dimension(310, 200));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("TIPO DE ATENDIMENTO");

        jButtonComum.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtonComum.setText("COMUM");
        jButtonComum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComumActionPerformed(evt);
            }
        });

        jButtonRapido.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtonRapido.setText("RÁPIDO");
        jButtonRapido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRapidoActionPerformed(evt);
            }
        });

        jButtonPrioritario.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtonPrioritario.setText("PRIORITÁRIO");
        jButtonPrioritario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrioritarioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("SUA SENHA É:");

        jTextFieldSenha.setEditable(false);
        jTextFieldSenha.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldSenha.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTextFieldSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldSenha.setBorder(null);
        jTextFieldSenha.setFocusable(false);
        jTextFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelClientesLayout = new javax.swing.GroupLayout(jPanelClientes);
        jPanelClientes.setLayout(jPanelClientesLayout);
        jPanelClientesLayout.setHorizontalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldSenha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonComum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRapido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPrioritario)
                .addGap(34, 34, 34))
        );
        jPanelClientesLayout.setVerticalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonComum, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRapido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPrioritario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanelCaixas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelCaixas.setPreferredSize(new java.awt.Dimension(310, 290));

        jButtonCaixa1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonCaixa1.setText("CAIXA1");
        jButtonCaixa1.setPreferredSize(new java.awt.Dimension(90, 30));
        jButtonCaixa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCaixa1ActionPerformed(evt);
            }
        });

        jButtonCaixa2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonCaixa2.setText("CAIXA2");
        jButtonCaixa2.setPreferredSize(new java.awt.Dimension(90, 30));
        jButtonCaixa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCaixa2ActionPerformed(evt);
            }
        });

        jButtonCaixa3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonCaixa3.setText("CAIXA3");
        jButtonCaixa3.setPreferredSize(new java.awt.Dimension(90, 30));
        jButtonCaixa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCaixa3ActionPerformed(evt);
            }
        });

        jButtonCaixa4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonCaixa4.setText("CAIXA4");
        jButtonCaixa4.setPreferredSize(new java.awt.Dimension(90, 30));
        jButtonCaixa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCaixa4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCaixasLayout = new javax.swing.GroupLayout(jPanelCaixas);
        jPanelCaixas.setLayout(jPanelCaixasLayout);
        jPanelCaixasLayout.setHorizontalGroup(
            jPanelCaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCaixasLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanelCaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCaixa3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCaixa1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelCaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCaixasLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButtonCaixa2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCaixasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCaixa4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelCaixasLayout.setVerticalGroup(
            jPanelCaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCaixasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCaixa1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCaixa2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanelCaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCaixa3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCaixa4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabelClientes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelClientes.setText("PAINEL CAIXA");

        jLabelCaixas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelCaixas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCaixas.setText("PAINEL CLIENTES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabelCaixas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelClientes)
                .addGap(114, 114, 114))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCaixas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabelCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClientes)
                    .addComponent(jLabelCaixas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(jPanelCaixas, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonComumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComumActionPerformed
        gerarNovaSenha('C');
    }//GEN-LAST:event_jButtonComumActionPerformed

    private void jButtonRapidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRapidoActionPerformed
        gerarNovaSenha('R');
    }//GEN-LAST:event_jButtonRapidoActionPerformed

    private void jButtonPrioritarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrioritarioActionPerformed
        gerarNovaSenha('P');
    }//GEN-LAST:event_jButtonPrioritarioActionPerformed

    private void jTextFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSenhaActionPerformed
    
    }//GEN-LAST:event_jTextFieldSenhaActionPerformed

    private void jButtonCaixa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCaixa1ActionPerformed

        jLabelSenha.setText(getSenha('P'));
      
        jLabelCaixa.setText("CAIXA1");
    }//GEN-LAST:event_jButtonCaixa1ActionPerformed

    private void jButtonCaixa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCaixa2ActionPerformed
        jLabelSenha.setText(getSenha('R'));
        jLabelCaixa.setText("CAIXA2");
    }//GEN-LAST:event_jButtonCaixa2ActionPerformed

    private void jButtonCaixa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCaixa3ActionPerformed
        jLabelSenha.setText(getSenha('R'));
        jLabelCaixa.setText("CAIXA3");
    }//GEN-LAST:event_jButtonCaixa3ActionPerformed
    
    
    private void jButtonCaixa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCaixa4ActionPerformed
        jLabelSenha.setText(getSenha('C'));
        jLabelCaixa.setText("CAIXA4");
    }//GEN-LAST:event_jButtonCaixa4ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FiladeBanco().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCaixa1;
    private javax.swing.JButton jButtonCaixa2;
    private javax.swing.JButton jButtonCaixa3;
    private javax.swing.JButton jButtonCaixa4;
    private javax.swing.JButton jButtonComum;
    private javax.swing.JButton jButtonPrioritario;
    private javax.swing.JButton jButtonRapido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCaixa;
    private javax.swing.JLabel jLabelCaixas;
    private javax.swing.JLabel jLabelClientes;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JPanel jPanelCaixas;
    private javax.swing.JPanel jPanelClientes;
    private javax.swing.JTextField jTextFieldSenha;
    // End of variables declaration//GEN-END:variables
}
