
package com.abcbank.abcconverter;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.awt.Image;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Converter extends javax.swing.JFrame {
    
    public Converter() {
        initComponents();
        this.setLocationRelativeTo(null);
        scaleImage();
    }
    
    public void scaleImage(){
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon.png"));
        Image img = icon.getImage();
        Image scaled = img.getScaledInstance(switchButton.getWidth(),switchButton.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaled);
        switchButton.setIcon(scaledIcon);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        resultTextField = new javax.swing.JTextField();
        firstCurrency = new javax.swing.JComboBox<>();
        convertButton = new javax.swing.JButton();
        secondCurrency = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        amountTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        switchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ABC Bank");
        setBackground(new java.awt.Color(255, 255, 255));
        setName("frame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(640, 550));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 550));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Result");

        resultTextField.setEditable(false);
        resultTextField.setBackground(new java.awt.Color(255, 255, 255));
        resultTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        firstCurrency.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        firstCurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Currency...", "USD", "EUR", "GBP", "CAD", "AED", "EGP", "SAR", "INR", "JPY", "CHF", "RUB", "SGD", "SEK", "BRL", "IQD", "MAD", "CNY", "MXN", "KWD", "TRY", "ARS", "LYD", "AUD", " " }));

        convertButton.setBackground(new java.awt.Color(229, 90, 127));
        convertButton.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        convertButton.setForeground(new java.awt.Color(255, 255, 255));
        convertButton.setText("Convert");
        convertButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        convertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });

        secondCurrency.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        secondCurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Currency...", "USD", "EUR", "GBP", "CAD", "AED", "EGP", "SAR", "INR", "JPY", "CHF", "RUB", "SGD", "SEK", "BRL", "IQD", "MAD", "CNY", "MXN", "KWD", "TRY", "ARS", "LYD", "AUD", " " }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("From");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("To");

        amountTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Amount");

        resetButton.setBackground(new java.awt.Color(229, 90, 127));
        resetButton.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        resetButton.setForeground(new java.awt.Color(255, 255, 255));
        resetButton.setText("Reset");
        resetButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        switchButton.setContentAreaFilled(false);
        switchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        switchButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        switchButton.setIconTextGap(0);
        switchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(convertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(amountTextField)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(firstCurrency, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(switchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secondCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultTextField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstCurrency, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secondCurrency, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(switchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(resultTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public double convert(String from, String to, double amount) throws MalformedURLException, IOException{
        double result;
        String url_str = "https://api.exchangerate.host/convert?from=" + from + "&to=" +to;
        URL url = new URL(url_str);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.setRequestMethod("GET");
        request.connect();
        int responseCode = request.getResponseCode();
        
        if(responseCode == HttpURLConnection.HTTP_OK){
            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonobj = root.getAsJsonObject();
            String req_result = jsonobj.get("result").getAsString();
            result = Double.parseDouble(req_result);
            return amount*result;
        }
        else{
            JOptionPane.showMessageDialog(null, "Connection Failed!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return 0;
    }
    
    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButtonActionPerformed
        double amount;
        String from = firstCurrency.getSelectedItem().toString();
        String to = secondCurrency.getSelectedItem().toString();
        String value = "";
        if(firstCurrency.getSelectedIndex() == 0 || secondCurrency.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Please Select a Currency!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            amount = Double.parseDouble(amountTextField.getText());
            value = String.format("%.2f", convert(from, to, amount));
            resultTextField.setText(value + " " + secondCurrency.getSelectedItem());
        }
        catch(NumberFormatException e){
            return;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Connection Failed!", "Connection Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Converter.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_convertButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
            firstCurrency.setSelectedIndex(0);
            secondCurrency.setSelectedIndex(0);
            resultTextField.setText("");
            amountTextField.setText("");

    }//GEN-LAST:event_resetButtonActionPerformed

    private void switchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchButtonActionPerformed
        int firstIndex = firstCurrency.getSelectedIndex();     
        firstCurrency.setSelectedIndex(secondCurrency.getSelectedIndex());
        secondCurrency.setSelectedIndex(firstIndex);
        convertButtonActionPerformed(evt);
    }//GEN-LAST:event_switchButtonActionPerformed

  
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Converter().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountTextField;
    private javax.swing.JButton convertButton;
    private javax.swing.JComboBox<String> firstCurrency;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField resultTextField;
    private javax.swing.JComboBox<String> secondCurrency;
    private javax.swing.JButton switchButton;
    // End of variables declaration//GEN-END:variables
}
