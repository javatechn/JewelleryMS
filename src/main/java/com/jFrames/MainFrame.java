
package com.jFrames;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;


public class MainFrame extends javax.swing.JFrame {

    
    public MainFrame() {
        initComponents();
       this.setBounds(0,0, 1370,730);
        this.setBackground(new Color(0,0,0,0));
        jPanel2.setBackground(new Color(0,0,0,0));
        time();
        date();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        btnLogut1 = new javax.swing.JButton();
        labelDate = new javax.swing.JLabel();
        labelTime = new javax.swing.JLabel();
        btnLogut = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Frameadd = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        OrderAdd = new javax.swing.JButton();
        Recordshow = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        Karigar = new javax.swing.JButton();
        Expense = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        Report = new javax.swing.JButton();
        Slip = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(204, 153, 53));

        btnLogut1.setBackground(new java.awt.Color(204, 153, 53));
        btnLogut1.setBorder(null);

        labelDate.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        labelTime.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        btnLogut.setBackground(new java.awt.Color(204, 153, 53));
        btnLogut.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLogut.setText("Logout");
        btnLogut.setBorder(null);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(642, 642, 642)
                .addComponent(labelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 357, Short.MAX_VALUE)
                .addComponent(btnLogut1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogut, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogut, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogut1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/option3.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 700));

        javax.swing.GroupLayout FrameaddLayout = new javax.swing.GroupLayout(Frameadd);
        Frameadd.setLayout(FrameaddLayout);
        FrameaddLayout.setHorizontalGroup(
            FrameaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
        );
        FrameaddLayout.setVerticalGroup(
            FrameaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        jPanel1.add(Frameadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 700));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, -20, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 1130, 700));

        jSeparator1.setBackground(new java.awt.Color(26, 26, 26));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 98, 240, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator10.setBackground(new java.awt.Color(26, 26, 26));
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 626, 240, 20));

        jSeparator9.setBackground(new java.awt.Color(26, 26, 26));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 556, 240, 10));

        jSeparator8.setBackground(new java.awt.Color(26, 26, 26));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 486, 240, 30));

        jButton2.setBackground(new java.awt.Color(204, 153, 53));
        jButton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton2.setText("           Remarks             >");
        jButton2.setBorder(null);
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 240, 50));

        OrderAdd.setBackground(new java.awt.Color(204, 153, 53));
        OrderAdd.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        OrderAdd.setText("             Orders               >");
        OrderAdd.setBorder(null);
        OrderAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderAddActionPerformed(evt);
            }
        });
        jPanel3.add(OrderAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 240, 50));

        Recordshow.setBackground(new java.awt.Color(204, 153, 53));
        Recordshow.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Recordshow.setText("             Records             >");
        Recordshow.setBorder(null);
        Recordshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordshowActionPerformed(evt);
            }
        });
        jPanel3.add(Recordshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 240, 50));

        jButton9.setBackground(new java.awt.Color(204, 153, 53));
        jButton9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton9.setText("          Customer            >");
        jButton9.setBorder(null);
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 240, 50));

        Karigar.setBackground(new java.awt.Color(204, 153, 53));
        Karigar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Karigar.setText("            Karigar              >");
        Karigar.setBorder(null);
        Karigar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KarigarActionPerformed(evt);
            }
        });
        jPanel3.add(Karigar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 240, 50));

        Expense.setBackground(new java.awt.Color(204, 153, 53));
        Expense.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Expense.setText("            Expense            >");
        Expense.setBorder(null);
        Expense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpenseActionPerformed(evt);
            }
        });
        jPanel3.add(Expense, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 240, 50));

        jButton8.setBackground(new java.awt.Color(204, 153, 53));
        jButton8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton8.setText("           Mobile Sms        >");
        jButton8.setBorder(null);
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 240, 50));

        Report.setBackground(new java.awt.Color(204, 153, 53));
        Report.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Report.setText("           Reports              >");
        Report.setBorder(null);
        Report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportActionPerformed(evt);
            }
        });
        jPanel3.add(Report, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 240, 50));

        Slip.setBackground(new java.awt.Color(204, 153, 53));
        Slip.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Slip.setText("            Slip                    >");
        Slip.setBorder(null);
        Slip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlipActionPerformed(evt);
            }
        });
        jPanel3.add(Slip, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, 50));

        jSeparator7.setBackground(new java.awt.Color(26, 26, 26));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 416, 240, -1));

        jSeparator6.setBackground(new java.awt.Color(26, 26, 26));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 240, 80));

        jSeparator5.setBackground(new java.awt.Color(26, 26, 26));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 240, 10));

        jSeparator4.setBackground(new java.awt.Color(26, 26, 26));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 240, -1));

        jSeparator2.setBackground(new java.awt.Color(26, 26, 26));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 240, 10));

        jSeparator3.setBackground(new java.awt.Color(26, 26, 26));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/options.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 700));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, -40, -1, 50));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 280, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OrderAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderAddActionPerformed
        OrderFrame order=new OrderFrame();
        order.setBounds(0, 0, 1127, 700);
        Frameadd.add(order);
        order.show();
    }//GEN-LAST:event_OrderAddActionPerformed

    private void RecordshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecordshowActionPerformed
        Records r=new Records();
        r.setBounds(0, 0, 1127, 700);
        Frameadd.add(r);
        r.show();
    }//GEN-LAST:event_RecordshowActionPerformed

    private void SlipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SlipActionPerformed
        Slip s=new Slip();
        s.setBounds(0, 0, 1127, 700);
        Frameadd.add(s);
        s.show();
    }//GEN-LAST:event_SlipActionPerformed

    private void KarigarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KarigarActionPerformed
        Karigar k=new Karigar();
        k.setBounds(0, 0, 1127, 700);
        Frameadd.add(k);
        k.show();
    }//GEN-LAST:event_KarigarActionPerformed

    private void ExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpenseActionPerformed
        Expense e=new Expense();
        e.setBounds(0, 0, 1127, 700);
        Frameadd.add(e);
        e.show();
    }//GEN-LAST:event_ExpenseActionPerformed

    private void ReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportActionPerformed
        Report r=new Report();
        r.setBounds(0, 0, 1127, 700);
        Frameadd.add(r);
        r.show();
    }//GEN-LAST:event_ReportActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    public void date()
    {
        DateFormat timeFormat = new SimpleDateFormat("dd:MM:yyyy");
        Date date = new Date();
        String time = timeFormat.format(date);
        labelDate.setText(time);
        
    }
    
   public void time()
   {
   
        final DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
        ActionListener timerListener = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Date date = new Date();
                String time = timeFormat.format(date);
                labelTime.setText(time);
            }
        };
        Timer timer = new Timer(1000, timerListener);
        timer.setInitialDelay(0);
        timer.start();
   
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Expense;
    private javax.swing.JPanel Frameadd;
    private javax.swing.JButton Karigar;
    private javax.swing.JButton OrderAdd;
    private javax.swing.JButton Recordshow;
    private javax.swing.JButton Report;
    private javax.swing.JButton Slip;
    private javax.swing.JButton btnLogut;
    private javax.swing.JButton btnLogut1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelTime;
    // End of variables declaration//GEN-END:variables
}
