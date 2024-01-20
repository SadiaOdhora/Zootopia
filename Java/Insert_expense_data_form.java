package zootop;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Insert_expense_data_form extends javax.swing.JFrame {

    
    public Insert_expense_data_form() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        insert_data_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Anima = new javax.swing.JLabel();
        Food_Type_Cost_field = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Med_Order_Cost_field = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Cleaning_Cost_field = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        back = new javax.swing.JButton();
        Anima1 = new javax.swing.JLabel();
        Food_Type_Id_field1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Med_Order_Id_field1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        insert_data_panel.setBackground(new java.awt.Color(102, 255, 102));
        insert_data_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Expense");
        insert_data_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 58, -1, 64));

        Anima.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        Anima.setForeground(new java.awt.Color(255, 255, 255));
        Anima.setText("Food Cost:");
        insert_data_panel.add(Anima, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 400, -1));

        Food_Type_Cost_field.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        Food_Type_Cost_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Food_Type_Cost_fieldActionPerformed(evt);
            }
        });
        insert_data_panel.add(Food_Type_Cost_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 358, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Medicine Cost      :");
        insert_data_panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 214, -1));

        Med_Order_Cost_field.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        Med_Order_Cost_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Med_Order_Cost_fieldActionPerformed(evt);
            }
        });
        insert_data_panel.add(Med_Order_Cost_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 358, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cleaning Cost :");
        insert_data_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 400, -1));

        Cleaning_Cost_field.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        insert_data_panel.add(Cleaning_Cost_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 358, -1));

        insert.setBackground(new java.awt.Color(255, 255, 102));
        insert.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        insert_data_panel.add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 474, 110, 53));

        back.setBackground(new java.awt.Color(255, 255, 102));
        back.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        insert_data_panel.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(819, 702, 104, 51));

        Anima1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        Anima1.setForeground(new java.awt.Color(255, 255, 255));
        Anima1.setText("Food Type ID :");
        insert_data_panel.add(Anima1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 400, -1));

        Food_Type_Id_field1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        insert_data_panel.add(Food_Type_Id_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 358, -1));

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Medicine Order ID :");
        insert_data_panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 284, 214, -1));

        Med_Order_Id_field1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        Med_Order_Id_field1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Med_Order_Id_field1ActionPerformed(evt);
            }
        });
        insert_data_panel.add(Med_Order_Id_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 358, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(insert_data_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 985, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(insert_data_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
                    .getConnection(
                            "jdbc:sqlserver://localhost:1433;databaseName=Zootopia;selectMethod=cursor", "sa", "S@dia14");
           Statement statement = connection.createStatement();
           statement.executeUpdate("insert into Expense(Food_Type_Id,Food_Cost,Med_Order_Id,Medicine_Cost,Cleaning_Cost) values('"+Integer.parseInt(Food_Type_Id_field1.getText())+"','"+Integer.parseInt(Food_Type_Cost_field.getText())+"','"+Integer.parseInt(Med_Order_Id_field1.getText())+"','"+Integer.parseInt(Med_Order_Cost_field.getText())+"','"+Cleaning_Cost_field.getText()+"')");
           
            JOptionPane.showMessageDialog(null, "Information Stored!");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_insertActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Expense_Window obj = new Expense_Window();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void Med_Order_Cost_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Med_Order_Cost_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Med_Order_Cost_fieldActionPerformed

    private void Med_Order_Id_field1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Med_Order_Id_field1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Med_Order_Id_field1ActionPerformed

    private void Food_Type_Cost_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Food_Type_Cost_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Food_Type_Cost_fieldActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Expense_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Anima;
    private javax.swing.JLabel Anima1;
    private javax.swing.JTextField Cleaning_Cost_field;
    private javax.swing.JTextField Food_Type_Cost_field;
    private javax.swing.JTextField Food_Type_Id_field1;
    private javax.swing.JTextField Med_Order_Cost_field;
    private javax.swing.JTextField Med_Order_Id_field1;
    private javax.swing.JButton back;
    private javax.swing.JButton insert;
    private javax.swing.JPanel insert_data_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
