/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.gui.billings;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import models.classes.bill.AccountItem;
import models.classes.bill.AccountModel;
import models.classes.bill.Bill;
import models.classes.patient.PatientFull;
import models.classes.patient.PatientTable;
import models.repo.Repository;

/**
 *
 * @author amd
 */
public class InsertBill extends javax.swing.JFrame {

    Repository repo = new Repository();
    List<PatientFull> patients;
    List<AccountItem> items;

    /**
     * Creates new form InsertBill
     */
    public InsertBill() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        items = new ArrayList<>(); // kosarica
        loadPatients();
        loadItems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtAccountItem = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        spnQuantity = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JFormattedTextField();
        btnAddAccountItem = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAccountItems = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtPaymentMethod = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnInsertBill = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblPatients);

        jLabel4.setText("Item:");

        jLabel5.setText("Quantity:");

        spnQuantity.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        jLabel6.setText("Price:");

        txtPrice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        btnAddAccountItem.setText("Add item");
        btnAddAccountItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAccountItemActionPerformed(evt);
            }
        });

        tblAccountItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblAccountItems);

        jLabel7.setText("Payment method:");

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnInsertBill.setText("Insert bill");
        btnInsertBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertBillActionPerformed(evt);
            }
        });

        jLabel1.setText("For patient:");

        jLabel2.setText("List of added items:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnInsertBill)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtAccountItem)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAddAccountItem, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAccountItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddAccountItem)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsertBill)
                            .addComponent(btnCancel))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtPaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 28, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddAccountItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAccountItemActionPerformed
        AccountItem item = new AccountItem();
        item.setName(txtAccountItem.getText());
        item.setPrice(Double.parseDouble(txtPrice.getText().replace(',', '.'))); //neznam bolji nacin
        item.setQuantity(Integer.parseInt(spnQuantity.getValue().toString()));
        items.add(item);
        loadItems();

        //restiraj polja
        txtAccountItem.setText("");
        txtPrice.setText("0");
        spnQuantity.setValue(1);
    }//GEN-LAST:event_btnAddAccountItemActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        new Bills().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnInsertBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertBillActionPerformed
        try {
            if (tblPatients.getSelectedRow() != -1) {
                int patientId = Integer.parseInt(tblPatients.getValueAt(tblPatients.getSelectedRow(), 0).toString());
                Optional<PatientFull> patient = patients.stream().filter(x -> x.getIdPatientFull() == patientId).findFirst();
                Bill bill = new Bill();
                bill.setPaymentMethod(txtPaymentMethod.getText());
                bill.setPatientFull(patient.get());
                bill.setBillDate(new Date(new java.util.Date().getTime()));
                bill.setBillTime(new Time(Calendar.getInstance().getTimeInMillis()));
                bill.setIdBill(
                        repo.insertBill(repo.getSource(),
                                bill.getPaymentMethod(),
                                bill.getPatientFull().getIdPatientFull(),
                                bill.getBillDate(),
                                bill.getBillTime())
                );

                for (AccountItem item : items) {
                    item.setBill(bill);
                }

                repo.insertAccountItems(repo.getSource(), items);
                JOptionPane.showMessageDialog(this, "Bill created sucessfully.");

                new Bills().setVisible(true);
                this.dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnInsertBillActionPerformed

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
            java.util.logging.Logger.getLogger(InsertBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAccountItem;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnInsertBill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spnQuantity;
    private javax.swing.JTable tblAccountItems;
    private javax.swing.JTable tblPatients;
    private javax.swing.JTextField txtAccountItem;
    private javax.swing.JTextField txtPaymentMethod;
    private javax.swing.JFormattedTextField txtPrice;
    // End of variables declaration//GEN-END:variables

    private void loadItems() {
        tblAccountItems.setModel(new AccountModel(items));
        tblAccountItems.setFillsViewportHeight(true);
        tblAccountItems.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    private void loadPatients() {
        try {
            patients = repo.getAllPatientsFull(repo.getSource());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        tblPatients.setModel(new PatientTable(patients));
        tblPatients.setFillsViewportHeight(true);
        tblPatients.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

}
