/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcular;

import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }

    
   
  // variável do tipo char para armazenar o simbolo de cada um das operação da matemática 
   char  sinal;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TXTCALCULO = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton07 = new javax.swing.JButton();
        jButton08 = new javax.swing.JButton();
        jButtonSoma = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonSubtracao = new javax.swing.JButton();
        jButton01 = new javax.swing.JButton();
        jButton02 = new javax.swing.JButton();
        jButtonMultiplicacao = new javax.swing.JButton();
        jButton03 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonDivisao = new javax.swing.JButton();
        jButtonPonto = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButtoniGUAL = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setBackground(new java.awt.Color(255, 255, 0));

        jPanel3.setBackground(new java.awt.Color(0, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("                   Calculadora");

        TXTCALCULO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(TXTCALCULO, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTCALCULO, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton07.setText("7");
        jButton07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton07ActionPerformed(evt);
            }
        });

        jButton08.setText("8");
        jButton08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton08ActionPerformed(evt);
            }
        });

        jButtonSoma.setText("+");
        jButtonSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSomaActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButtonSubtracao.setText("-");
        jButtonSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubtracaoActionPerformed(evt);
            }
        });

        jButton01.setText("1");
        jButton01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton01ActionPerformed(evt);
            }
        });

        jButton02.setText("2");
        jButton02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton02ActionPerformed(evt);
            }
        });

        jButtonMultiplicacao.setText("*");
        jButtonMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicacaoActionPerformed(evt);
            }
        });

        jButton03.setText("3");
        jButton03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton03ActionPerformed(evt);
            }
        });

        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButtonDivisao.setText("/");
        jButtonDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivisaoActionPerformed(evt);
            }
        });

        jButtonPonto.setText(".");
        jButtonPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPontoActionPerformed(evt);
            }
        });

        jButton16.setText("CE");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButtoniGUAL.setText("=");
        jButtoniGUAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoniGUALActionPerformed(evt);
            }
        });

        jButton18.setText("c");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton01, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton07, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton08, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton03, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtoniGUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSoma, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(jButtonSubtracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonMultiplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonDivisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton07, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jButton08, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton01, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton02, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton03, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtoniGUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    
    private void jButton01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton01ActionPerformed
        // TODO add your handling code here:
        
        TXTCALCULO.setText(TXTCALCULO.getText()+"1");
    }//GEN-LAST:event_jButton01ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
         TXTCALCULO.setText("");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        // TODO add your handling code here:
          TXTCALCULO.setText(TXTCALCULO.getText()+"0");
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButton02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton02ActionPerformed
        // TODO add your handling code here:
          TXTCALCULO.setText(TXTCALCULO.getText()+"2");
    }//GEN-LAST:event_jButton02ActionPerformed

    private void jButton03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton03ActionPerformed
        // TODO add your handling code here:
          TXTCALCULO.setText(TXTCALCULO.getText()+"3");
    }//GEN-LAST:event_jButton03ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
          TXTCALCULO.setText(TXTCALCULO.getText()+"4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
          TXTCALCULO.setText(TXTCALCULO.getText()+"5");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
          TXTCALCULO.setText(TXTCALCULO.getText()+"6");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton07ActionPerformed
        // TODO add your handling code here:
          TXTCALCULO.setText(TXTCALCULO.getText()+"7");
    }//GEN-LAST:event_jButton07ActionPerformed

    private void jButton08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton08ActionPerformed
        // TODO add your handling code here:
          TXTCALCULO.setText(TXTCALCULO.getText()+"8");
    }//GEN-LAST:event_jButton08ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
          TXTCALCULO.setText(TXTCALCULO.getText()+"9");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButtonSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSomaActionPerformed
        // TODO add your handling code here:
         sinal='+';
           TXTCALCULO.setText(TXTCALCULO.getText()+sinal);
      
    }//GEN-LAST:event_jButtonSomaActionPerformed

    private void jButtonPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPontoActionPerformed
        // TODO add your handling code here:
        TXTCALCULO.setText(TXTCALCULO.getText()+".");
    }//GEN-LAST:event_jButtonPontoActionPerformed

    private void jButtoniGUALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoniGUALActionPerformed
    
      // Condições para realizar as operações    
        if(sinal=='+'){
            valorTotal(sinal);
        }
         if(sinal=='-'){
             valorTotal(sinal);
         }
         if(sinal=='*'){
              valorTotal(sinal);
         }
          if(sinal=='/'){
              valorTotal(sinal);
         }
         
    }//GEN-LAST:event_jButtoniGUALActionPerformed

      //Método para calculor os valores conforme o sinal passado no paramentro
    public double valorTotal(char sinal){
       //Variavel para armazenar o total de cada operação
        double resultado=0;
        
         // recebendo o sinal do paramentro
        switch (sinal) {
            case '-':
                {
                    // Operação para fazer a subtração
                    String []md=TXTCALCULO.getText().split("-");
                    String p1=md[0];
                    String p2=md[1];
                    double valorP1 =Double.parseDouble(p1);
                    double valorP2 =Double.parseDouble(p2);
                    double total=valorP1-valorP2;
                    TXTCALCULO.setText(""+total);
                    resultado=total;
                    break;
                }
            case '+':
                {
                    // Operação para fazer a adição
                    String []md=TXTCALCULO.getText().replace("+"," ").split(" ");
                    String p1=md[0];
                    String p2=md[1];
                    double valorP1 =Double.parseDouble(p1);
                    double valorP2 =Double.parseDouble(p2);
                    double total=valorP1+valorP2;
                    TXTCALCULO.setText(""+total);
                    resultado=total;
                    break;
                }
            case '*':
                {
                    // Operação para fazer a multiplicação
                    String []md=TXTCALCULO.getText().replace("*"," ").split(" ");
                    String p1=md[0];
                    String p2=md[1];
                    double valorP1 =Double.parseDouble(p1);
                    double valorP2 =Double.parseDouble(p2);
                    double total=valorP1*valorP2;
                    TXTCALCULO.setText(""+total);
                    resultado=total;
                    break;
                }
            case '/':
                {
                    // Operação para fazer a divisão
                    String []md=TXTCALCULO.getText().split("/");
                    String p1=md[0];
                    String p2=md[1];
                    double valorP1 =Double.parseDouble(p1);
                    double valorP2 =Double.parseDouble(p2);
                    double total=valorP1/valorP2;
                    TXTCALCULO.setText(""+total);
                    resultado=total;
                    break;
                }
            default:
                break;
        }
        // retorna o total da operação que foi executada
      return resultado;
    }
    
    private void jButtonSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubtracaoActionPerformed
    
             sinal='-';
           TXTCALCULO.setText(TXTCALCULO.getText()+sinal);
    }//GEN-LAST:event_jButtonSubtracaoActionPerformed

    private void jButtonMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicacaoActionPerformed

         sinal='*';     
           TXTCALCULO.setText(TXTCALCULO.getText()+sinal);
    }//GEN-LAST:event_jButtonMultiplicacaoActionPerformed

    private void jButtonDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivisaoActionPerformed
        // TODO add your handling code here:
         sinal='/';
           TXTCALCULO.setText(TXTCALCULO.getText()+sinal);
    }//GEN-LAST:event_jButtonDivisaoActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
          TXTCALCULO.setText(TXTCALCULO.getText()+"0");
          
    }//GEN-LAST:event_jButton18ActionPerformed

  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXTCALCULO;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton01;
    private javax.swing.JButton jButton02;
    private javax.swing.JButton jButton03;
    private javax.swing.JButton jButton07;
    private javax.swing.JButton jButton08;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonDivisao;
    private javax.swing.JButton jButtonMultiplicacao;
    private javax.swing.JButton jButtonPonto;
    private javax.swing.JButton jButtonSoma;
    private javax.swing.JButton jButtonSubtracao;
    private javax.swing.JButton jButtoniGUAL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
