/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Application;
import Model.Observation;
import Model.VitalSignHistory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jeelkanzaria
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    private Application application;
    DefaultTableModel viewTableModel;
    Observation selectedObservation;
    
    public ViewJPanel() {
        initComponents();
    }

    ViewJPanel(Application application) {
        initComponents();
        this.application = application;
        this.viewTableModel = (DefaultTableModel) ObservationTable.getModel();
        
        displayObservation();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtTemperature = new javax.swing.JTextField();
        txtBloodPressure = new javax.swing.JTextField();
        btnAddObservation = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ObservationTable = new javax.swing.JTable();
        btnViewObservation = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("VIEW AND UPDATE VITAL SIGN");

        jLabel2.setText("ID");

        jLabel3.setText("Temperature");

        jLabel4.setText("Blood Pressure");

        txtId.setEnabled(false);

        btnAddObservation.setText("UPDATE OBSERVATION");
        btnAddObservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddObservationActionPerformed(evt);
            }
        });

        ObservationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Temperature", "Blood Pressure"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ObservationTable);

        btnViewObservation.setText("VIEW DETAILS");
        btnViewObservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewObservationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddObservation)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(90, 90, 90))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(29, 29, 29)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(13, 13, 13)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(txtTemperature)
                                    .addComponent(txtId))))
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(156, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnViewObservation)
                .addGap(323, 323, 323))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addComponent(btnAddObservation))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(btnViewObservation)
                .addContainerGap(340, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 900, 720));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddObservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddObservationActionPerformed
        // TODO add your handling code here:
        //update observation
        if(!txtId.getText().isEmpty()){
        //call using findObservation or use selected observation id defined above
        //use any of two methods defined below
        
//        Observation o = this.application.getHistory().findObservation(Integer.valueOf(txtId.getText()));
//        o.setBloodPressure(Double.valueOf(txtBloodPressure.getText()));
//        o.setTemperature(Double.valueOf(txtTemperature.getText()));
        
        
        this.selectedObservation.setBloodPressure(Double.valueOf(txtBloodPressure.getText()));
        this.selectedObservation.setTemperature(Double.valueOf(txtTemperature.getText()));

        JOptionPane.showMessageDialog(null,"Updated observations!");
        
        }else{
           JOptionPane.showMessageDialog(null,"Any row selection is not done!"); 
        }
        
        displayObservation();
    }//GEN-LAST:event_btnAddObservationActionPerformed

    private void btnViewObservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewObservationActionPerformed
        // TODO add your handling code here:
        //get row in table
        int selectedRow = ObservationTable.getSelectedRow();
        
        if(selectedRow >=0){
            //we can fetch observation from zeroth position
            this.selectedObservation = (Observation) ObservationTable.getValueAt(selectedRow, 0);
            
            txtId.setText(String.valueOf(this.selectedObservation.getObservationId()));
            txtTemperature.setText(String.valueOf(this.selectedObservation.getTemperature()));
            txtBloodPressure.setText(String.valueOf(this.selectedObservation.getBloodPressure()));
            
        }else
        {
            //no selection made
            JOptionPane.showMessageDialog(null, "Please select row");
        }
    }//GEN-LAST:event_btnViewObservationActionPerformed

    public void displayObservation(){
        
        VitalSignHistory history = this.application.getHistory();
        
        viewTableModel.setRowCount(0);
       
        if(history.getVitalSignHistory().size() >0){
            //display
            
           for(Observation o: history.getVitalSignHistory()){
               //number of colmn = 3   
               
//               Object row[] = new Object[3];
//               row[0] = o.getObservationId();
//               row[1] = o.getTemperature();
//               row[2] = o.getBloodPressure();
               
            //if object is used as datatype
               Object row[] = new Object[3];
               
               row[0] = o;
               row[1] = o.getTemperature();
               row[2] = o.getBloodPressure();
               
               //add row to table
               viewTableModel.addRow(row);
            
        }
           
       }
       else{
                System.out.println("Empty List");
                   }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ObservationTable;
    private javax.swing.JButton btnAddObservation;
    private javax.swing.JButton btnViewObservation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}
