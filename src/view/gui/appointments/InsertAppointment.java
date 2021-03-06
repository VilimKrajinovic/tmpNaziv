/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.gui.appointments;

import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import models.classes.appointment.Appointment;
import models.classes.doctor.Doctor;
import models.classes.doctor.DoctorTable;
import models.classes.patient.PatientFull;
import models.classes.patient.PatientTable;
import models.repo.Repository;

/**
 *
 * @author amd
 */
public class InsertAppointment extends javax.swing.JFrame {

    List<Doctor> doctors;
    List<PatientFull> patients;
    List<Appointment> appointments;
    Repository repo = new Repository();

    /**
     * Creates new form InsertAppointment
     */
    public InsertAppointment() {
        initComponents();

        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        dpDate.setDate(new java.util.Date());


        LoadAppointments();
        LoadDoctors();
        LoadPatients();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctors = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dpDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel8 = new javax.swing.JLabel();
        spStartHour = new javax.swing.JSpinner();
        spStartMinutes = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        spEndHour = new javax.swing.JSpinner();
        spEndMinutes = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSummary = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        txtOrderedTest = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPrescribedMedicine = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtOrderedTreatment = new javax.swing.JTextField();
        btnCreateAppointment = new javax.swing.JButton();
        btnBackToMainMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Select doctor:");

        tblDoctors.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblDoctors);

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
        jScrollPane2.setViewportView(tblPatients);

        jLabel2.setText("For patient:");

        jLabel7.setText("Date:");

        jLabel8.setText("Start time:");

        spStartHour.setModel(new javax.swing.SpinnerNumberModel(8, 8, 18, 1));

        spStartMinutes.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        jLabel9.setText("End time:");

        spEndHour.setModel(new javax.swing.SpinnerNumberModel(8, 8, 19, 1));

        spEndMinutes.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        jLabel13.setText("Summary:");

        txtSummary.setColumns(20);
        txtSummary.setRows(5);
        jScrollPane3.setViewportView(txtSummary);

        jLabel10.setText("Tests:");

        jLabel11.setText("Medicine:");

        jLabel12.setText("Treatment:");

        btnCreateAppointment.setText("Create appointment");
        btnCreateAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAppointmentActionPerformed(evt);
            }
        });

        btnBackToMainMenu.setText("Back to main menu");
        btnBackToMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToMainMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(btnCreateAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(btnBackToMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(spStartHour, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spEndHour, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spStartMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spEndMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOrderedTest)
                            .addComponent(txtPrescribedMedicine)
                            .addComponent(txtOrderedTreatment))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(dpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtOrderedTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(spStartHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spStartMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtPrescribedMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOrderedTreatment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(spEndHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spEndMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnBackToMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCreateAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAppointmentActionPerformed
        if (tblPatients.getSelectedRow() != -1 && tblDoctors.getSelectedRow() != -1) {
            try {
                int patientId = Integer.parseInt(tblPatients.getValueAt(tblPatients.getSelectedRow(), 0).toString());
                Optional<PatientFull> patient = patients.stream().filter(x -> x.getIdPatientFull() == patientId).findFirst();

                int doctorId = Integer.parseInt(tblDoctors.getValueAt(tblDoctors.getSelectedRow(), 0).toString());
                Optional<Doctor> doctor = doctors.stream().filter(x -> x.getIdDoctor() == doctorId).findFirst();

                SimpleDateFormat format = new SimpleDateFormat("HHmm");
                String startHH;
                if ((int) spStartHour.getValue() < 10) { //ne znam bolji nacin
                    startHH = "0" + spStartHour.getValue().toString();
                } else {
                    startHH = spStartHour.getValue().toString();
                }

                String endHH;
                if ((int) spEndHour.getValue() < 10) {
                    endHH = "0" + spEndHour.getValue().toString();
                } else {
                    endHH = spEndHour.getValue().toString();
                }

                Time appointmentStart = new Time(format.parse(startHH + spStartMinutes.getValue().toString()).getTime());
                Time appointmentEnd = new Time(format.parse(endHH + spEndMinutes.getValue().toString()).getTime());
                Date appointmentDate = new Date(dpDate.getDate().getTime());

                if (appointmentStart.after(appointmentEnd)) {
                    JOptionPane.showMessageDialog(this, "Invalid appointment time. Appointment cant end before it starts");
                    return;
                }

                Appointment tmp = new Appointment();
                tmp.setApointmentDate(appointmentDate);
                tmp.setAppointmentEnd(appointmentEnd);
                tmp.setAppointmentStart(appointmentStart);
                tmp.setAppointmentSummary(txtSummary.getText());
                tmp.setDoctor(doctor.get());
                tmp.setPatientFull(patient.get());
                tmp.setMedicine(txtPrescribedMedicine.getText());
                tmp.setOrderedTests(txtOrderedTest.getText());
                tmp.setTreatment(txtOrderedTreatment.getText());
                tmp.setIdAppointment(
                        repo.insertAppointment(repo.getSource(),
                                tmp.getApointmentDate(),
                                tmp.getAppointmentStart(),
                                tmp.getAppointmentEnd(),
                                tmp.getPatientFull().getIdPatientFull(),
                                tmp.getDoctor().getIdDoctor(),
                                tmp.getAppointmentSummary(),
                                tmp.getOrderedTests(),
                                tmp.getMedicine(),
                                tmp.getTreatment())
                );

                JOptionPane.showMessageDialog(this, "Appointment created sucessfully.");

                new Appointments().setVisible(true);
                this.dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }

        }

    }//GEN-LAST:event_btnCreateAppointmentActionPerformed

    private void btnBackToMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToMainMenuActionPerformed
        new Appointments().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackToMainMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackToMainMenu;
    private javax.swing.JButton btnCreateAppointment;
    private org.jdesktop.swingx.JXDatePicker dpDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner spEndHour;
    private javax.swing.JSpinner spEndMinutes;
    private javax.swing.JSpinner spStartHour;
    private javax.swing.JSpinner spStartMinutes;
    private javax.swing.JTable tblDoctors;
    private javax.swing.JTable tblPatients;
    private javax.swing.JTextField txtOrderedTest;
    private javax.swing.JTextField txtOrderedTreatment;
    private javax.swing.JTextField txtPrescribedMedicine;
    private javax.swing.JTextArea txtSummary;
    // End of variables declaration//GEN-END:variables

    private void LoadAppointments() {
        try {
            appointments = repo.getAllAppointments(repo.getSource());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void LoadDoctors() {
        try {
            doctors = repo.getDoctors(repo.getSource());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        tblDoctors.setFillsViewportHeight(true);
        tblDoctors.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblDoctors.setModel(new DoctorTable(doctors));
    }

    private void LoadPatients() {
        try {
            patients = repo.getAllPatientsFull(repo.getSource());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Database communication errror.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        tblPatients.setModel(new PatientTable(patients));
        tblPatients.setFillsViewportHeight(true);
        tblPatients.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}
