/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Finestra;

import java.sql.*;
/**
 *
 * @author peppe
 */
public class NewJFrame extends javax.swing.JFrame {

    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rst=null;
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        button1 = new java.awt.Button();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Codice Fiscale");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setLocation(new java.awt.Point(100, 100));
        setPreferredSize(new java.awt.Dimension(720, 480));
        setSize(new java.awt.Dimension(720, 480));
        getContentPane().setLayout(null);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Maschio");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(560, 260, 80, 20);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Femmina");
        jRadioButton2.setToolTipText("");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(560, 280, 90, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Codice Fiscale");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 155, 172, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(150, 200, 180, 30);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(150, 240, 180, 30);

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jFormattedTextField1.setText("gg/mm/aa");
        jFormattedTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextField1);
        jFormattedTextField1.setBounds(150, 380, 160, 30);

        button1.setLabel("Genera");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        getContentPane().add(button1);
        button1.setBounds(450, 340, 190, 70);

        jComboBox1.setEditable(true);
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(150, 280, 180, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "BN", "CE", "NA", "SA", "AV" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(150, 330, 60, 30);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(380, 160, 110, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Finestra/Tessera_Sanitaria_Italia-Fronte.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-30, -10, 720, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
      String cogn,nome,cod="",data;
      char car,car2;
      int i=0,cont=0,cons=0,dim=0;
        cogn=jTextField1.getText();
        nome=jTextField2.getText();
            
       while(cont!=3) //generazione cognome
       {
        car = cogn.charAt(i);
        if (!((car=='a')||(car=='e')||(car=='i')||(car=='o')||(car=='u')))
        {
            cod=cod+String.valueOf(car);  
            cont++;
        }
         i++;
       }       
       
       cont=0;
       i=0;
       dim=nome.length();
       for(int a=0;a<dim;a++) //contare consonanti
       { 
        car2=nome.charAt(a);
        if (!((car2=='a')||(car2=='e')||(car2=='i')||(car2=='o')||(car2=='u')))
        {
           cons=cons+1;
        }
       }
       
      if(cons<=3)
      {
        while(cont!=3) //generazione nome
       {   
        car2 = nome.charAt(i);
        if(!((car2=='a')||(car2=='e')||(car2=='i')||(car2=='o')||(car2=='u')))   
        {
            cod=cod+String.valueOf(car2);
            cont++;
        }  
        i++;
        }
      }
      else
        {
        while(cont!=4)
             {
              car2 = nome.charAt(i);
              if(!((car2=='a')||(car2=='e')||(car2=='i')||(car2=='o')||(car2=='u')))   
               {
                   if(cont!=1)
                   {
                     cod=cod+String.valueOf(car2);
                     cont++;
                   }
                   else cont++;
               }          
               i++;
              }
        }
           
            char DataAnno;  //Data anno
            data=jFormattedTextField1.getText();
            DataAnno=data.charAt(6);
            cod=cod+String.valueOf(DataAnno);
            DataAnno=data.charAt(7);
            cod=cod+String.valueOf(DataAnno);
            char CharMese;       //data mese
            String StringMese="";
          char[] Mesi= {'A','B','C','D','E','H','L','M','P','R','S','T'};
          StringMese=String.valueOf(data.charAt(3));
          StringMese=StringMese+(String.valueOf(data.charAt(4)));
          int IntMese=Integer.parseInt(StringMese);
          for(int z=0;z<13;z++)
          {
           
              if((IntMese-1)==z)
              {
                  cod=cod+String.valueOf(Mesi[z]);
              }
          }
          
          String StringGiorno;         //giorno 
          StringGiorno=String.valueOf(data.charAt(0));
          StringGiorno=StringGiorno+(String.valueOf(data.charAt(1)));
          if(jRadioButton2.isSelected()==true)
          {
           int IntGiorno=Integer.parseInt(StringGiorno);
           IntGiorno=IntGiorno+40;
           StringGiorno=String.valueOf(IntGiorno);
          }      
          cod=cod+StringGiorno;  
          String prov=(String)jComboBox1.getSelectedItem();
          try{
             Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/comuni", "root", "");
             Statement pst = con.createStatement();
             String sql="SELECT * FROM `comuni`";       
              rst = pst.executeQuery(sql);
              while(rst.next())
              {
                  String Com =rst.getString("Comune");
                  String CodCat=rst.getString("CodFisco");
                  if(Com.equals(prov))               
                   cod=cod+CodCat;
              }           
             }
       catch(Exception ex)
            {
          System.out.println(ex);
            }
       cod=cod.toUpperCase();  //trasforma maiuscolo
       jLabel1.setText(cod);
       
        
    }//GEN-LAST:event_button1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        jComboBox1.removeAllItems();
        String temp=(String)jComboBox2.getSelectedItem();
             try{
             Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/comuni", "root", "");
             Statement pst = con.createStatement();
             String sql="SELECT * FROM `comuni`";       
              rst = pst.executeQuery(sql);
              while(rst.next())
              {
                  String Comune= rst.getString("Comune");
                  String Prov=rst.getString("Provincia");
                  if(Prov.equals(temp))               
                 jComboBox1.addItem(Comune);                   
              }           
             }
       catch(Exception ex){
          System.out.println(ex);
            }
       
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    // End of variables declaration//GEN-END:variables
}
