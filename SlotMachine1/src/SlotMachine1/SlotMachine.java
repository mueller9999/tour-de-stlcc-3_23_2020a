/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SlotMachine1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author miken
 */
public class SlotMachine extends javax.swing.JFrame
{

    
    public static double startingAmount1;
    public static int matched1 =0;
    public static int matched2 =0;
    public static int matched3 =0;
    public static int matched4 =0;
    
    public static int wins =0;
    
    /**
     * Creates new form SlotMachine
     */
    public SlotMachine()
    {
        
        initComponents();
    }

    public SlotMachine(double startingAmount)
    {
    
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        startingAmount1=0.0;
      
        startingAmount1 = startingAmount;
       // static int startingAmount1 startingAmount;
        jLabel5.setText("$ " + String.format("%.2f",startingAmount));
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Spin");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlotMachine1/aa13.png"))); // NOI18N
        jLabel4.setVisible(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlotMachine1/aa12.png"))); // NOI18N
        jLabel3.setVisible(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlotMachine1/aa3.png"))); // NOI18N
        jLabel2.setVisible(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlotMachine1/aa1.png")));
        jLabel1.setVisible(false);

        jLabel6.setText("Current Amount:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                .addGap(165, 165, 165)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(429, Short.MAX_VALUE))
        );

        pack();
        
    }
    
    
    
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("SPin");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlotMachine1/aa13.png"))); // NOI18N
        jLabel4.setVisible(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlotMachine1/aa12.png"))); // NOI18N
        jLabel3.setVisible(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlotMachine1/aa3.png"))); // NOI18N
        jLabel2.setVisible(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlotMachine1/aa1.png")));
        jLabel1.setVisible(false);

        jLabel6.setText("Current Amount:");

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 282, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(367, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                        .addGap(165, 165, 165)
                        .addComponent(jLabel6))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
    
        
        
        
        int rand1 = 1 + (int)(Math.random() * 27); 
        int rand2 = 1 + (int)(Math.random() * 27);
        int rand3 = 1 + (int)(Math.random() * 27); 
        int rand4 = 1 + (int)(Math.random() * 27);
       
        int numberMatched =1;
        
        
        
        if(rand1==rand2){ numberMatched++; }
        if(rand1==rand3){ numberMatched++; }
        if(rand1==rand4){ numberMatched++; }
        if(rand2 != rand1 && rand2 == rand3) { numberMatched++; }
        if(rand2 != rand1 && rand2 == rand4) { numberMatched++; }
        if(rand3 != rand1 && rand3 != rand2 && rand3 == rand4) { numberMatched++; } 

        if(numberMatched==1)
        {
            
            startingAmount1-=10.0;
            jLabel5.setText( "$" + String.format("%.2f",startingAmount1)+": Matched none");
            //lblMessage.setText("Matched None");
           // jTextField1.setText("Matched None");
            System.out.println("matched none");
        }
        else if(numberMatched==2)
        {
            
            startingAmount1+=20.0;
            jLabel5.setText("$"+ String.format("%.2f",startingAmount1) + ": Matched 2!");
            System.out.println("matched 2");
        }
         else if(numberMatched==3)
        {
            
            startingAmount1+=40.0;
            jLabel5.setText("$"+String.format("%.2f",startingAmount1)+": Matched 3!");
            System.out.println("matched 3");
        }
         else if(numberMatched==4)
        {
            
            startingAmount1+=100.0;
            jLabel5.setText("$"+String.format("%.2f",startingAmount1)+": Matched 4!");
            
            System.out.println("matched 4");
        }
        
        if(startingAmount1 <=0)
        {
             int input = JOptionPane.showConfirmDialog(null,
                "Your out of money", "out of money", JOptionPane.DEFAULT_OPTION);
             
            System.out.println(input);
            
            System.exit(0);
        }
        
        
            //pic1[i] =getImage(getDocumentBase(),"aa" + (i +1) + ".png");
            
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlotMachine1/aa"+rand1+".png")));
            
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlotMachine1/aa"+rand2+".png")));
            
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlotMachine1/aa"+rand3+".png")));
            
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlotMachine1/aa"+rand4+".png")));
            
          
     
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
      
       
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        /*
        if((jLabel1.getIcon()==jLabel2.getIcon()) && 
                (jLabel2.getIcon() == jLabel3.getIcon())//4 of a kind
                && (jLabel3.getIcon() ==jLabel4.getIcon()))
        {
            
            startingAmount1+=100.0;
            jLabel6.setText(String.format("%.2f",startingAmount1));
        }
        if((jLabel1.getIcon()==jLabel2.getIcon())) //two of a kind
                
        {
            
            startingAmount1+=20.0;
            jLabel5.setText(String.format("%.2f",startingAmount1));
        }
         if((jLabel3.getIcon()==jLabel4.getIcon()))//two of a kind
                
        {
            
            startingAmount1+=20.0;
            jLabel5.setText(String.format("%.2f",startingAmount1));
        }
         
        if((jLabel4.getIcon()==jLabel2.getIcon()))//two of a kind
                
        {
            
            startingAmount1+=20.0;
            jLabel5.setText(String.format("%.2f",startingAmount1));
        }
        if((jLabel4.getIcon()==jLabel1.getIcon()))//two of a kind
                
        {
            
            startingAmount1+=20.0;
            jLabel5.setText(String.format("%.2f",startingAmount1));
        } 
        if((jLabel2.getIcon()==jLabel3.getIcon()))//two of a kind
                
        {
            
            startingAmount1+=20.0;
            jLabel5.setText(String.format("%.2f",startingAmount1));
        } 
        
         if((jLabel3.getIcon()==jLabel1.getIcon()))//two of a kind
                
        {
            
            startingAmount1+=20.0;
            jLabel5.setText(String.format("%.2f",startingAmount1));
        }
         
         if((jLabel1.getIcon()==jLabel4.getIcon()))//two of a kind
                
        {
            
            startingAmount1+=20.0;
            jLabel5.setText(String.format("%.2f",startingAmount1));
        }
      
         
         
         
         
        if((jLabel1.getIcon()==jLabel2.getIcon()) && 
               (jLabel2.getIcon() ==jLabel3.getIcon()))//three of a kind 
        {
             startingAmount1+=40.0;
            jLabel5.setText(String.format("%.2f",startingAmount1));        
                    
                    
        }       
        
         if((jLabel4.getIcon()==jLabel3.getIcon()) && (jLabel2.getIcon() ==jLabel3.getIcon()))//three of a kind
        {
             startingAmount1+=40.0;
            jLabel5.setText(String.format("%.2f",startingAmount1));        
                    
                    
        }       
        if((jLabel1.getIcon()==jLabel4.getIcon()) && (jLabel4.getIcon() ==jLabel2.getIcon()))//three of a kind
        {
             startingAmount1+=40.0;
            jLabel5.setText(String.format("%.2f",startingAmount1));        
                    
                    
        }      
        if((jLabel3.getIcon()==jLabel4.getIcon()) && (jLabel4.getIcon() == jLabel1.getIcon()))//three of a kind
        {
             startingAmount1+=40.0;
            jLabel5.setText(String.format("%.2f",startingAmount1));        
                    
                    
        }
         if ((jLabel1.getIcon()!=jLabel2.getIcon())&&(jLabel2.getIcon()
                 != jLabel3.getIcon())&& (jLabel3.getIcon()!= jLabel4.getIcon())) 
         {
             
              startingAmount1-=10.0;
            jLabel5.setText(String.format("%.2f",startingAmount1));
             
         }
         
        */
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextField1ActionPerformed
    {//GEN-HEADEREND:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(SlotMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(SlotMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(SlotMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(SlotMachine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                String input = JOptionPane.showInputDialog("Enter a starting amount");
                System.out.println("starting amount: " + Integer.parseInt(input));
                if(input!=null)
                {
                      new SlotMachine(Integer.parseInt(input)).setVisible(true);
                    
                    
                }
                else 
                {
                    System.exit(0);
                    
                }
              
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private static javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel jLabel2;
    private static javax.swing.JLabel jLabel3;
    private static javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblMessage;
    // End of variables declaration//GEN-END:variables
}
