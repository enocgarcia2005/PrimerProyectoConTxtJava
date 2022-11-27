package Code;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.table.DefaultTableModel;

public final class FrmNotas extends javax.swing.JFrame {

    String[] Cabecera = {"Apellidos Y Nombres", "Nota de Practicas", "Evaluacion Formativa ", "Nota de Exposicion",
        " Promedio", "Semestre", "Escuela"};
    String[][] datos = {};
    DefaultTableModel NotasT = new DefaultTableModel(datos, Cabecera);
    File Archivo = new File("Notas.txt");

    public FrmNotas() {
        initComponents();
        tbNotas.setModel(NotasT);
        LlenarTabla();
        tbNotas.getColumnModel().getColumn(0).setPreferredWidth(130);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNotas = new javax.swing.JTable();
        lblHeader = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResultados = new javax.swing.JTextArea();
        btnSalir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackGround.setBackground(new java.awt.Color(255, 255, 255));
        BackGround.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        BackGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbNotas.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        tbNotas.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tbNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Apellidos y Nombres", "Nota de Practicas", "Evaluacion Formativa", "Nota de Exposicion", "Promedio", "Semestre", "Escuela"
            }
        ));
        tbNotas.setEnabled(false);
        jScrollPane1.setViewportView(tbNotas);

        BackGround.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 74, 960, -1));

        lblHeader.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lblHeader.setText("Informacion de \"Notas.txt\"");
        BackGround.add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 25, -1, -1));

        txtResultados.setEditable(false);
        txtResultados.setColumns(20);
        txtResultados.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtResultados.setRows(5);
        txtResultados.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jScrollPane2.setViewportView(txtResultados);

        BackGround.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 534, 452, 220));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Multiply_32px.png"))); // NOI18N
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSalirMousePressed(evt);
            }
        });
        BackGround.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, -1, -1));

        getContentPane().add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMousePressed
      this.dispose();
    }//GEN-LAST:event_btnSalirMousePressed

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
            java.util.logging.Logger.getLogger(FrmNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmNotas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTable tbNotas;
    private javax.swing.JTextArea txtResultados;
    // End of variables declaration//GEN-END:variables

    // Metodos que configuran la tabla par que muestre los datos correctamente
    public void LlenarTabla() {
        try {
            BufferedReader leer = new BufferedReader(new FileReader(Archivo));
            Object[] tableLines = leer.lines().toArray();
            for (int i = 0; i < tableLines.length; i++) {

                String line = tableLines[i].toString();
                String[] dataRow = line.split("#");
                NotasT.addRow(dataRow);
            }
        } catch (IOException e) {

        }
       brindarInfoTextArea();
    }
//Metodo que realiza las operaciones que pide el ejercicio
    public void brindarInfoTextArea() {
        String Linea, NombresyA, Semestre, Escuela, nom = "", escNom = "";
        double nPracticas, eFormativa, nExposicion, Promedio, Aprobados = 0, porcentajeAp = 0, promM = 0;
        int NumEF = 0, NumS = 0, TotalA = 0;
        try {
            FileReader fr = new FileReader(Archivo);
            BufferedReader leer = new BufferedReader(fr);
            while ((Linea = leer.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(Linea, "#");
                NombresyA = st.nextToken();
                nPracticas = Double.parseDouble(st.nextToken());
                eFormativa = Double.parseDouble(st.nextToken());
                nExposicion = Double.parseDouble(st.nextToken());
                Promedio = Double.parseDouble(st.nextToken());
                Semestre = st.nextToken();
                Escuela = st.nextToken();

                if (eFormativa < 12 && Escuela.equalsIgnoreCase("Sistemas")) {
                    NumEF++;
                }

                if (Promedio >= 14 && Semestre.length() == 7 && Escuela.equalsIgnoreCase("Sistemas")) {
                    NumS++;
                }

                if (Escuela.equalsIgnoreCase("Industrial")) {
                    TotalA++;
                    if (nPracticas >= 12 && nExposicion >= 12) {
                        Aprobados++;
                        porcentajeAp = Aprobados * 100 / TotalA;
                    }
                }

                if (promM < Promedio) {
                    promM = Promedio;
                    nom = NombresyA;
                    escNom = Escuela;
                }
            }
            txtResultados.setText("Número de alumnos Reprobados en la Evaluación Formativa \nde la Escuela de Sistemas: " + NumEF
                    + "\n\nNúmero de alumnos de Sistemas en el semestre II que tienen \npromedio >= 14: " + NumS
                    + "\n\nPorcentaje de Alumnos de alumnos de Industrial\n que tienen aprobados la Nota de\n"
                    + "Prácticas y Exposición: " + porcentajeAp+"%"
                    + "\n\nNombre del alumno que tiene el mayor Promedio\ne indique a que escuela pertenece: " + nom + " / " + escNom);
        } catch (IOException e) {

        }
    }
}
