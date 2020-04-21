
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.border.Border;

public class SlotMachineApp extends javax.swing.JFrame {

    Random ran = new Random();
    int x1,x2,x3,x4;
    String im1,im2,im3,im4, detail;
    int m4=0,m3=0,m2=0, win=0, lose=0, score=0;
    Timer timer, timer2, timer3, timer4;
    int i=0, ii=0, iii=0, iv=0, timeMin=1, timeMax=10, mm, deci, topup;
    int count=0, sst, check=0, sk=0;
    int arr[] = new int[5];
    Border border = BorderFactory.createLineBorder(Color.red, 2);

    
    public SlotMachineApp(int ss) {
        initComponents();
        setLocation(300,70);
        for(int i=0; i<5; i++){
            sst = ran.nextInt((50 - 1)+1) + 1;
            arr[i] = sst;
        }
        for(int i=0; i<50; i++){
          //System.out.print(arr[i]+" ");
        }
        jBar.setMinimum(timeMin);
        jBar.setMaximum(timeMax);
        jBar.setStringPainted(true);
        jBar.setForeground(Color.red);
        jBar.setBackground(Color.orange);
        topup = ss; score = topup; LabScore.setText("Score > "+score);
        //timer.addActionListener(null);
        
        timer = new Timer(100, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    i += 1; setIcons1();
                    if (i == timeMax) { timer.stop();
                        if(check==1){
                            x1 = sst; lab1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aa"+x1+".png")));
                        }else{}
                    }
            } 
        });
        timer2 = new Timer(200, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    ii += 1; setIcons2();
                    if (ii == timeMax) { timer2.stop();  
                        if(check==1){
                            x2 = sst; lab2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aa"+x2+".png")));
                        }else{}
                    }
            } 
        });
        timer3 = new Timer(300, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    iii += 1; setIcons3();
                    if (iii == timeMax) { timer3.stop(); 
                        if(check==1){
                            x3 = sst; lab3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aa"+x3+".png")));
                        }else{}
                    }
            } 
        });
        timer4 = new Timer(400, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    iv += 1; setIcons4(); jBar.setValue(iv); 
                    if (iv == timeMax) { timer4.stop();  
                        if(check==1){
                            x4 = sst; lab4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aa"+x4+".png")));
                            check=0;
                        }else{}
                    setLabels();  
                    }
            } 
        });
    }
    
    public void setIcons1()
    {
        x1 = ran.nextInt((27 - 1)+1) + 1; im1="/aa"+x1+".png";
        lab1.setIcon(new javax.swing.ImageIcon(getClass().getResource(im1)));
    }
    public void setIcons2()
    {
        x2 = ran.nextInt((27 - 1)+1) + 1; im2="/aa"+x2+".png";
        lab2.setIcon(new javax.swing.ImageIcon(getClass().getResource(im2)));
    }
    public void setIcons3()
    {
        x3 = ran.nextInt((27 - 1)+1) + 1; im3="/aa"+x3+".png"; 
        lab3.setIcon(new javax.swing.ImageIcon(getClass().getResource(im3)));
    }
    public void setIcons4()
    {
        x4 = ran.nextInt((27 - 1)+1) + 1;  im4="/aa"+x4+".png";
        lab4.setIcon(new javax.swing.ImageIcon(getClass().getResource(im4)));
    }
    
    public void setLabels()
    {
        if(x1==x2){ mm++; }
        if(x1==x3){ mm++; }
        if(x1==x4){ mm++; }
        if(x2 != x1 && x2 == x3) { mm++; }
        if(x2 != x1 && x2 == x4) { mm++; }
        if(x3 != x1 && x3 != x2 && x3 == x4) { mm++; }
        
        if(mm==4){ m4++; labMa4.setText("Matched Four > "+m4); 
        win++; labWin.setText("Win > "+win); score=score+100; 
        labMa4.setForeground(Color.blue); detail="WOW!!! You have matched ALL FOUR!! +100 points";}
        if(mm==3){ m3++; labMa3.setText("Matched Three > "+m3); 
        win++; labWin.setText("Win > "+win); score=score+50; 
        labMa3.setForeground(Color.blue); detail="Great!! You have matched THREE!! +50 points";}
        if(mm==2){ m2++; labMa2.setText("Matched Two > "+m2); 
        win++; labWin.setText("Win > "+win); score=score+20; 
        labMa2.setForeground(Color.blue); detail="Sweet! You have matched TWO!! +20 points";}
        if(mm==1){ lose++; labLose.setText("Lose > "+lose); 
        score=score-10; labLose.setForeground(Color.red); detail="OOPS! There's no any match! -10 points";}
        LabScore.setText("Score > "+score);
        btnBoard.setText("$"+(score-topup));
        if(score > topup)
        {
            btnBoard.setBackground(Color.green);
        }
        if(score < topup)
        {
            btnBoard.setBackground(Color.red);
        }
        labDet.setText(detail);
        System.out.println(""+x1+","+x2+","+x3+","+x4+" > Matched: "+mm);
        if(score < 1)
        {
            setVisible(false);
            do{
                deci = Integer.parseInt(JOptionPane.showInputDialog("You Have Lost All Your Money. \nPress 1 to Topup\nPress 2 to Exit"));
            }while(deci != 1 && deci != 2);
            
            if(deci==1)
            {
                do{
                    score = Integer.parseInt(JOptionPane.showInputDialog("Enter Topup Amount: (Min=20) "));
                }while(score < 20); setVisible(true); topup = topup+score; LabScore.setText("Score > "+score);
            }
            else{
                JOptionPane.showMessageDialog(null,"It's Another Bad Day!! \n\nYou have Spent $"+topup
                    +"\nAnd Lost All of Them\nNow You Are Going Back With $0");
                dispose();
            }
        }
        btnSpin.setEnabled(true); btnExit.setEnabled(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lab1 = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        lab3 = new javax.swing.JLabel();
        lab4 = new javax.swing.JLabel();
        btnSpin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        labMa4 = new javax.swing.JLabel();
        labMa3 = new javax.swing.JLabel();
        labMa2 = new javax.swing.JLabel();
        labWin = new javax.swing.JLabel();
        labLose = new javax.swing.JLabel();
        LabScore = new javax.swing.JLabel();
        labDet = new javax.swing.JLabel();
        jBar = new javax.swing.JProgressBar();
        btnBoard = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lab1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Virus\\Documents\\NetBeansProjects\\SlotMachine\\src\\aa1.png")); // NOI18N

        lab2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Virus\\Documents\\NetBeansProjects\\SlotMachine\\src\\aa3.png")); // NOI18N

        lab3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Virus\\Documents\\NetBeansProjects\\SlotMachine\\src\\aa5.png")); // NOI18N

        lab4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Virus\\Documents\\NetBeansProjects\\SlotMachine\\src\\aa7.png")); // NOI18N

        btnSpin.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnSpin.setText("SPIN");
        btnSpin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpinActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        labMa4.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        labMa4.setText("Matched Four > 0");

        labMa3.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        labMa3.setText("Matched Three > 0");

        labMa2.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        labMa2.setText("Matched Two > 0");

        labWin.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        labWin.setText("Win > 0");

        labLose.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        labLose.setText("Lose > 0");

        LabScore.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        LabScore.setText("Score > 0");
        LabScore.setToolTipText("");

        labDet.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        labDet.setText("-");

        btnBoard.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnBoard.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labMa4)
                                    .addComponent(labMa3)
                                    .addComponent(labMa2))
                                .addGap(239, 239, 239)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabScore)
                                    .addComponent(labLose)
                                    .addComponent(labWin)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lab1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lab2)
                                        .addGap(53, 53, 53)
                                        .addComponent(lab3))
                                    .addComponent(jBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(58, 58, 58)
                                .addComponent(lab4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labDet)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lab2)
                    .addComponent(lab3)
                    .addComponent(lab1)
                    .addComponent(lab4))
                .addGap(29, 29, 29)
                .addComponent(labDet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labMa4)
                    .addComponent(labWin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labMa3)
                    .addComponent(labLose))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labMa2)
                    .addComponent(LabScore))
                .addGap(35, 35, 35)
                .addComponent(btnBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSpinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpinActionPerformed
        mm=1; i=0; ii=0; iii=0; iv=0; count++;
        if(count==arr[0] || count==arr[1] || count==arr[2] || count==arr[3] || count==arr[4])
        {
            sst = ran.nextInt((5 - 1)+1) + 1;
            if(sst==1)
            {
                check=1; sst = ran.nextInt((11 - 1)+1) + 1;
            }else{System.out.println("Checked is "+sst); }
        }
        btnSpin.setEnabled(false); btnExit.setEnabled(false);
        labMa4.setForeground(Color.black); labMa3.setForeground(Color.black);
        labMa2.setForeground(Color.black); labLose.setForeground(Color.black);
        labDet.setText("Spinning . . . ");
        lab1.setBorder(null); lab2.setBorder(null); lab3.setBorder(null); lab4.setBorder(null);
        timer.start(); timer2.start(); timer3.start(); timer4.start();
    }//GEN-LAST:event_btnSpinActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        
        if(score > topup)
        {
            JOptionPane.showMessageDialog(null,"It's A Good Day! \n\nYou have Spent $"+topup
                    +"\nAnd Earned Extra $"+(score-topup)
                    +"\nNow You Are Having a Total of $"+score); 
            dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"It's Another Bad Day!! \n\nYou have Spent $"+topup
                    +"\nAnd Lost $"+(topup-score)
                    +"\nNow You Are Having a Total of $"+score);
            dispose();
        }
        
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        int score;
        do{
            score = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Starting Amount: (Min=30) "));
        }while(score < 30);
        
        
        SlotMachineApp ss = new SlotMachineApp(score);
        ss.setTitle("Slot Machine by UPIN!!");
        ss.setVisible(true);
          
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel LabScore;
    public static javax.swing.JButton btnBoard;
    public static javax.swing.JButton btnExit;
    public static javax.swing.JButton btnSpin;
    public static javax.swing.JProgressBar jBar;
    public static javax.swing.JLabel lab1;
    public static javax.swing.JLabel lab2;
    public static javax.swing.JLabel lab3;
    public static javax.swing.JLabel lab4;
    public static javax.swing.JLabel labDet;
    public static javax.swing.JLabel labLose;
    public static javax.swing.JLabel labMa2;
    public static javax.swing.JLabel labMa3;
    public static javax.swing.JLabel labMa4;
    public static javax.swing.JLabel labWin;
    // End of variables declaration//GEN-END:variables
}
