package Code;

import Animaciones.Animaciones;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public final class FrmEmpleados2 extends javax.swing.JFrame {

    String[] Cabecera = {"Nombres", "Apellido Materno", "Apellido Materno", "Area Laboral",
        " Años en Servicio", "Condicion", "Sueldo Base", "Asignacion de Movilidad",
        "Hijos", "Descuento de AFP", "Sueldo Final"};
    String[][] datos = {};
    DefaultTableModel EmpleadosT = new DefaultTableModel(datos, Cabecera);
    File Archivo = new File("Empleados2.txt");
    Empleados E = new Empleados();
    ArrayList<Empleados> Datos = new ArrayList<Empleados>();
    Animaciones animaciones;
    String aCadena;
    String nCadena;
    double asignacionMovilidad;

    public FrmEmpleados2() {
        initComponents();
        tbEmpleados.setModel(EmpleadosT);
        ConfigTable();
        btnEliminar.setEnabled(false);
        btnModifcar.setEnabled(false);
        Mostrar();
        animaciones = new Animaciones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        PnlDatos = new javax.swing.JPanel();
        LblNombre = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        LblAreaLaboral = new javax.swing.JLabel();
        CbxAreaLaboral = new javax.swing.JComboBox<>();
        LblTiempoDeServicio = new javax.swing.JLabel();
        TxtTiempoDeaServicio = new javax.swing.JTextField();
        LblCondicion = new javax.swing.JLabel();
        CbxCondicion = new javax.swing.JComboBox<>();
        lblSueldo = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        lblApellidoPaterno = new javax.swing.JLabel();
        txtApellidoPaterno = new javax.swing.JTextField();
        lblApellidoMaterno = new javax.swing.JLabel();
        txtApellidoMaterno = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnModifcar = new javax.swing.JButton();
        txtNumHijos = new javax.swing.JTextField();
        lblNumHijos = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        pnlResultados = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultados = new javax.swing.JTextArea();
        lblListadoDeEmpleados = new javax.swing.JLabel();
        lblRegistroDeEmpleados = new javax.swing.JLabel();
        PnlModificar = new javax.swing.JPanel();
        CbxModificar = new javax.swing.JComboBox<>();
        lblModificar = new javax.swing.JLabel();
        BtnSeleccionar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        BtnGuardarCambios = new javax.swing.JButton();
        pnlTabla = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbEmpleados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackGround.setBackground(new java.awt.Color(255, 255, 255));
        BackGround.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        BackGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PnlDatos.setBackground(new java.awt.Color(255, 255, 255));
        PnlDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        PnlDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblNombre.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        LblNombre.setText("Nombres:");
        PnlDatos.add(LblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        txtNombres.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNombres.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });
        PnlDatos.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 100, 30));

        LblAreaLaboral.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        LblAreaLaboral.setText("Area Laboral:");
        PnlDatos.add(LblAreaLaboral, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, 20));

        CbxAreaLaboral.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CbxAreaLaboral.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Planificacion", "Ventas", "Marketing" }));
        CbxAreaLaboral.setSelectedIndex(-1);
        CbxAreaLaboral.setToolTipText("Selecciona una opcion");
        CbxAreaLaboral.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        CbxAreaLaboral.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnlDatos.add(CbxAreaLaboral, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 55, 130, 30));

        LblTiempoDeServicio.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        LblTiempoDeServicio.setText("Tiempo de Servicio:");
        PnlDatos.add(LblTiempoDeServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, 30));

        TxtTiempoDeaServicio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TxtTiempoDeaServicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtTiempoDeaServicio.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        TxtTiempoDeaServicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtTiempoDeaServicioKeyTyped(evt);
            }
        });
        PnlDatos.add(TxtTiempoDeaServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 70, 30));

        LblCondicion.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        LblCondicion.setText("Condicion:");
        PnlDatos.add(LblCondicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, 30));

        CbxCondicion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CbxCondicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contratado", "Estable" }));
        CbxCondicion.setSelectedIndex(-1);
        CbxCondicion.setToolTipText("Seleccione una opcion");
        CbxCondicion.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        CbxCondicion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnlDatos.add(CbxCondicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 120, 30));

        lblSueldo.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblSueldo.setText("Sueldo Base:");
        PnlDatos.add(lblSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, 30));

        txtSueldo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSueldo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSueldo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        txtSueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSueldoKeyTyped(evt);
            }
        });
        PnlDatos.add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 70, 30));

        lblApellidoPaterno.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblApellidoPaterno.setText("Apellido Paterno:");
        PnlDatos.add(lblApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, 30));

        txtApellidoPaterno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtApellidoPaterno.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        txtApellidoPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPaternoKeyTyped(evt);
            }
        });
        PnlDatos.add(txtApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 100, 30));

        lblApellidoMaterno.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblApellidoMaterno.setText("Apellido Materno:");
        PnlDatos.add(lblApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 14, -1, 20));

        txtApellidoMaterno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtApellidoMaterno.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        txtApellidoMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMaternoKeyTyped(evt);
            }
        });
        PnlDatos.add(txtApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 110, 30));

        btnSalir.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        PnlDatos.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 90, 30));

        btnGuardar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        PnlDatos.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 90, 30));

        btnNuevo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        PnlDatos.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 90, 30));

        btnModifcar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnModifcar.setText("Modificar");
        btnModifcar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        btnModifcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifcarActionPerformed(evt);
            }
        });
        PnlDatos.add(btnModifcar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 90, 30));

        txtNumHijos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNumHijos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumHijos.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        txtNumHijos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumHijosKeyTyped(evt);
            }
        });
        PnlDatos.add(txtNumHijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 70, 30));

        lblNumHijos.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblNumHijos.setText("Numero de Hijos:");
        PnlDatos.add(lblNumHijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, 30));

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        PnlDatos.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 90, 30));

        BackGround.add(PnlDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 670, 210));

        pnlResultados.setBackground(new java.awt.Color(255, 255, 255));
        pnlResultados.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        pnlResultados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultados.setEditable(false);
        txtResultados.setColumns(20);
        txtResultados.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txtResultados.setRows(5);
        txtResultados.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jScrollPane1.setViewportView(txtResultados);

        pnlResultados.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 440, 190));

        BackGround.add(pnlResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 460, 210));

        lblListadoDeEmpleados.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lblListadoDeEmpleados.setText("Listado de Empleados");
        BackGround.add(lblListadoDeEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

        lblRegistroDeEmpleados.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lblRegistroDeEmpleados.setText("Registro de Empleados #2");
        BackGround.add(lblRegistroDeEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        PnlModificar.setBackground(new java.awt.Color(255, 255, 255));
        PnlModificar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        PnlModificar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CbxModificar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CbxModificar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombres", "Apellido Paterno", "Apellido Materno", "Area Laboral", "Tiempo de servicio", "Condicion", "Sueldo Base", "Hijos" }));
        CbxModificar.setSelectedIndex(-1);
        CbxModificar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        PnlModificar.add(CbxModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, -1));

        lblModificar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblModificar.setText("Seleccione el campo a Modificar");
        PnlModificar.add(lblModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, -1, -1));

        BtnSeleccionar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnSeleccionar.setText("Seleccionar");
        BtnSeleccionar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        BtnSeleccionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeleccionarActionPerformed(evt);
            }
        });
        PnlModificar.add(BtnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 70, -1));

        BtnRegresar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnRegresar.setText("Regresar");
        BtnRegresar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        BtnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        PnlModificar.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 70, -1));

        BtnGuardarCambios.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnGuardarCambios.setText("Guardar");
        BtnGuardarCambios.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        BtnGuardarCambios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarCambiosActionPerformed(evt);
            }
        });
        PnlModificar.add(BtnGuardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 60, -1));

        BackGround.add(PnlModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-300, 280, 240, 100));

        pnlTabla.setBackground(new java.awt.Color(255, 255, 255));
        pnlTabla.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        tbEmpleados.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tbEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Apellido Paterno", "Apellido Materno", "Area Laboral", "Tiempo de servicio(años)", "Condicion", "Sueldo Base", "Asignacion de Movilidad", "Hijos", "Descuento de AFP", "Sueldo Final"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbEmpleadosMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tbEmpleados);

        javax.swing.GroupLayout pnlTablaLayout = new javax.swing.GroupLayout(pnlTabla);
        pnlTabla.setLayout(pnlTablaLayout);
        pnlTablaLayout.setHorizontalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1156, Short.MAX_VALUE)
        );
        pnlTablaLayout.setVerticalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        BackGround.add(pnlTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 1160, 290));

        getContentPane().add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        soloLetras(evt);
    }//GEN-LAST:event_txtNombresKeyTyped

    private void TxtTiempoDeaServicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtTiempoDeaServicioKeyTyped
        soloNumeros(evt);
    }//GEN-LAST:event_TxtTiempoDeaServicioKeyTyped

    private void txtSueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSueldoKeyTyped
        soloNumeros(evt);
    }//GEN-LAST:event_txtSueldoKeyTyped

    private void BtnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeleccionarActionPerformed
        if (CbxModificar.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una opcion");
        } else if (txtNombres.getText().isEmpty()
                || txtApellidoPaterno.getText().isEmpty()
                || txtApellidoMaterno.getText().isEmpty()
                || txtSueldo.getText().isEmpty()
                || TxtTiempoDeaServicio.getText().isEmpty()
                || txtNumHijos.getText().isEmpty()
                || CbxAreaLaboral.getSelectedIndex() == -1
                || CbxCondicion.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro");

        } else {
            SeleccionCbxModificar();
        }
    }//GEN-LAST:event_BtnSeleccionarActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        PanelIzquierda();
        DesactivarCampos();
        Limpiar();
        CbxModificar.setSelectedIndex(-1);
        btnModifcar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnNuevo.setEnabled(true);
        btnSalir.setEnabled(true);
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarCambiosActionPerformed
        if (CbxModificar.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Primero selleccione un campo y realize los cambios correspondientes");
        } else {
            Modificar();
        }
    }//GEN-LAST:event_BtnGuardarCambiosActionPerformed

    private void txtNumHijosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumHijosKeyTyped
        soloNumeros(evt);
    }//GEN-LAST:event_txtNumHijosKeyTyped

    private void txtApellidoPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPaternoKeyTyped
        soloLetras(evt);
    }//GEN-LAST:event_txtApellidoPaternoKeyTyped

    private void txtApellidoMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMaternoKeyTyped
        soloLetras(evt);
    }//GEN-LAST:event_txtApellidoMaternoKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        LlenarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        Limpiar();
        ActivarCampos();
        txtNombres.requestFocus();
        btnModifcar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void tbEmpleadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEmpleadosMousePressed
        btnModifcar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnGuardar.setEnabled(false);
    }//GEN-LAST:event_tbEmpleadosMousePressed

    private void btnModifcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifcarActionPerformed
        PanelDerecha();
        btnModifcar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnNuevo.setEnabled(false);
        btnSalir.setEnabled(false);
    }//GEN-LAST:event_btnModifcarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (txtNombres.getText().isEmpty()
                || txtSueldo.getText().isEmpty()
                || txtApellidoPaterno.getText().isEmpty()
                || txtApellidoMaterno.getText().isEmpty()
                || txtNumHijos.getText().isEmpty()
                || TxtTiempoDeaServicio.getText().isEmpty()
                || CbxAreaLaboral.getSelectedIndex() == -1
                || CbxCondicion.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro");

        } else {
            if (tbEmpleados.getRowCount() == 1) {
                JOptionPane.showMessageDialog(null, "La tabla no puede estar vacia");
            } else {

                Eliminar();
                btnEliminar.setEnabled(false);
                btnModifcar.setEnabled(false);
                btnGuardar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleados2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new FrmEmpleados2().setVisible(true);
        });
    }

    public void soloLetras(java.awt.event.KeyEvent evt) {
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        if (!(mayusculas || minusculas || espacio)) {
            evt.consume();
        }
    }

    public void soloNumeros(java.awt.event.KeyEvent evt) {
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <= 57;
        boolean punto = key == 46;
        if (!(num || punto)) {
            evt.consume();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JButton BtnGuardarCambios;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JButton BtnSeleccionar;
    private javax.swing.JComboBox<String> CbxAreaLaboral;
    private javax.swing.JComboBox<String> CbxCondicion;
    private javax.swing.JComboBox<String> CbxModificar;
    private javax.swing.JLabel LblAreaLaboral;
    private javax.swing.JLabel LblCondicion;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JLabel LblTiempoDeServicio;
    private javax.swing.JPanel PnlDatos;
    private javax.swing.JPanel PnlModificar;
    private javax.swing.JTextField TxtTiempoDeaServicio;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModifcar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblListadoDeEmpleados;
    private javax.swing.JLabel lblModificar;
    private javax.swing.JLabel lblNumHijos;
    private javax.swing.JLabel lblRegistroDeEmpleados;
    private javax.swing.JLabel lblSueldo;
    private javax.swing.JPanel pnlResultados;
    private javax.swing.JPanel pnlTabla;
    private javax.swing.JTable tbEmpleados;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumHijos;
    private javax.swing.JTextArea txtResultados;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables

    //Este metodo configura la tabla
    public void ConfigTable() {
        tbEmpleados.getColumnModel().getColumn(0).setPreferredWidth(100);
        tbEmpleados.getColumnModel().getColumn(1).setPreferredWidth(50);
        tbEmpleados.getColumnModel().getColumn(2).setPreferredWidth(50);
        tbEmpleados.getColumnModel().getColumn(3).setPreferredWidth(50);
        tbEmpleados.getColumnModel().getColumn(4).setPreferredWidth(45);
        tbEmpleados.getColumnModel().getColumn(5).setPreferredWidth(40);
        tbEmpleados.getColumnModel().getColumn(6).setPreferredWidth(30);
        tbEmpleados.getColumnModel().getColumn(7).setPreferredWidth(100);
        tbEmpleados.getColumnModel().getColumn(8).setPreferredWidth(10);
        tbEmpleados.getColumnModel().getColumn(9).setPreferredWidth(50);
        tbEmpleados.getColumnModel().getColumn(10).setPreferredWidth(30);
    }

    //Este metodo limpia todos Jtextfields y comboBoxs dentro del panel llamado PnlDatos
    private void Limpiar() {
        txtNombres.setText("");
        txtApellidoPaterno.setText("");
        txtApellidoMaterno.setText("");
        TxtTiempoDeaServicio.setText("");
        txtSueldo.setText("");
        txtNumHijos.setText("");
        CbxAreaLaboral.setSelectedIndex(-1);
        CbxCondicion.setSelectedIndex(-1);
    }

    // Metodos que configuran la tabla par que muestre los datos correctamente
    public void LlenarTabla() {
        try {
            BufferedReader leer = new BufferedReader(new FileReader(Archivo));
            Object[] tableLines = leer.lines().toArray();
            for (int i = 0; i < tableLines.length; i++) {

                String line = tableLines[i].toString();
                String[] dataRow = line.split(",");
                EmpleadosT.addRow(dataRow);
            }
        } catch (IOException e) {

        }
        brindarInfoTextArea();
    }

    public void LimpiarTabla() {
        DefaultTableModel tb = (DefaultTableModel) tbEmpleados.getModel();
        int a = tbEmpleados.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }
    }
//Este metodo se encarga de seleccionar la asignacion de movilidad segun corresponda

    public void asignarMovilidad() {
        switch (CbxAreaLaboral.getSelectedIndex()) {
            case 0 -> {
                switch (CbxCondicion.getSelectedIndex()) {
                    case 0 ->
                        asignacionMovilidad = Double.parseDouble(txtSueldo.getText()) * 0.07;
                    case 1 ->
                        asignacionMovilidad = Double.parseDouble(txtSueldo.getText()) * 0.09;
                }
            }
            case 1 -> {
                switch (CbxCondicion.getSelectedIndex()) {
                    case 0 ->
                        asignacionMovilidad = Double.parseDouble(txtSueldo.getText()) * 0.08;
                    case 1 ->
                        asignacionMovilidad = Double.parseDouble(txtSueldo.getText()) * 0.12;
                }
            }
            case 2 -> {
                switch (CbxCondicion.getSelectedIndex()) {
                    case 0 ->
                        asignacionMovilidad = Double.parseDouble(txtSueldo.getText()) * 0.12;
                    case 1 ->
                        asignacionMovilidad = Double.parseDouble(txtSueldo.getText()) * 0.16;
                }
            }

        }
    }

    //Este metodo se encarga de guardar los datos en el txt
    public void Guardar() {
        if (txtNombres.getText().isEmpty()
                || txtApellidoPaterno.getText().isEmpty()
                || txtApellidoMaterno.getText().isEmpty()
                || txtSueldo.getText().isEmpty()
                || TxtTiempoDeaServicio.getText().isEmpty()
                || txtNumHijos.getText().isEmpty()
                || CbxAreaLaboral.getSelectedIndex() == -1
                || CbxCondicion.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Rellene todos los Campos");

        } else {
            brindarInfoTextArea();
            asignarMovilidad();
            DecimalFormat df = new DecimalFormat("#0.0");
            double AFP = Double.parseDouble(txtSueldo.getText()) * 0.175;
            double SueldoFinal = (Double.parseDouble(txtSueldo.getText()) + asignacionMovilidad + (Double.parseDouble(txtNumHijos.getText()) * 55)) - AFP;

            String introducirDatos = txtNombres.getText() + "," + txtApellidoPaterno.getText() + ","
                    + txtApellidoMaterno.getText() + "," + CbxAreaLaboral.getSelectedItem().toString() + "," + TxtTiempoDeaServicio.getText() + ","
                    + CbxCondicion.getSelectedItem().toString() + "," + Double.valueOf(txtSueldo.getText()) + "," + df.format(asignacionMovilidad)
                    + "," + Integer.valueOf(txtNumHijos.getText()) + "," + df.format(AFP) + "," + SueldoFinal;
            try {
                FileWriter escribir = new FileWriter(Archivo, true);
                escribir.write(introducirDatos);
                escribir.write(System.getProperty("line.separator"));
                JOptionPane.showMessageDialog(this, "Guardado Correctamente");

                Limpiar();
                escribir.close();
                LimpiarTabla();
                LlenarTabla();

            } catch (HeadlessException | IOException e) {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
            }
            brindarInfoTextArea();
            DesactivarCampos();
        }
    }

    //Este metodo se encarga de brindar la info que nos pide el ejercicio
    public void brindarInfoTextArea() {
        String Linea, Nombres, apellidoP, apellidoM, areaLaboral, condicion, NombreImprimir = "", areaI = "";
        double sueldoFinal, tiempoDeServicio, sueldoBase, movilidad, descAFP, sueldoFM = 999999999, Promedio = 0, promedio2 = 0, tiempoS = 9999999,
                promedioI, porcentajeI = 0, Porcentaje;
        int hijos, contP = 0, contE = 0, contE2 = 0, contE3 = 0;
        char PrimerLetra;

        try {
            BufferedReader leer = new BufferedReader(new FileReader(Archivo));
            while ((Linea = leer.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(Linea, ",");
                Nombres = st.nextToken();
                apellidoP = st.nextToken();
                apellidoM = st.nextToken();
                areaLaboral = st.nextToken();
                tiempoDeServicio = Double.parseDouble(st.nextToken());
                condicion = st.nextToken();
                sueldoBase = Double.parseDouble(st.nextToken());
                movilidad = Double.parseDouble(st.nextToken());
                hijos = Integer.parseInt(st.nextToken());
                descAFP = Double.parseDouble(st.nextToken());
                sueldoFinal = Double.parseDouble(st.nextToken());

                porcentajeI++;

                if (sueldoFM > sueldoFinal && areaLaboral.equalsIgnoreCase("Ventas")
                        && tiempoDeServicio >= 2 && tiempoDeServicio <= 10) {
                    NombreImprimir = Nombres + " " + apellidoP + " " + apellidoM;
                }

                if (areaLaboral.equalsIgnoreCase("Marketing")
                        && condicion.equalsIgnoreCase("Contratado")) {
                    contP++;
                    Promedio = Promedio + sueldoFinal;
                }

                if (condicion.equalsIgnoreCase("Estable") && sueldoFinal >= 2500 && sueldoFinal <= 3500
                        && tiempoDeServicio >= 5 && hijos >= 3) {
                    contE++;
                }

                if (areaLaboral.equalsIgnoreCase("Marketing") && sueldoFinal <= 1200 && movilidad >= 60) {

                    contE2++;
                }

                if (condicion.equalsIgnoreCase("Estable") && tiempoS > tiempoDeServicio && hijos == 0) {
                    tiempoS = tiempoDeServicio;
                    areaI = areaLaboral;
                }

                PrimerLetra = apellidoP.charAt(0);
                if (PrimerLetra == 'A' || PrimerLetra == 'C') {
                    contE3++;
                }
            }

            promedioI = Promedio / contP;
            Porcentaje = contE2 * 100 / porcentajeI;

            txtResultados.setText("El nombre del empleado que tiene el menor sueldo final\n del área de Ventas que tiene entre 2 y 10 años\n de Servicio es: " + NombreImprimir
                    + "\n\nPromedio de Salarios de los empleados contratados\n del área de Marketing: " + promedioI
                    + "\n\nEl número de empleados estables que ganan más\n de S/.2500 y menos de S/ 3500 con más de 5 años\n de servicio y con más de 3 hijos es: " + contE
                    + "\n\nPorcentaje de empleados estables del área de Marketing\n con sueldo menores a S/. 1200\n y asignación de movilidad superior a 60 soles: " + Porcentaje + "%"
                    + "\n\nEl area que tiene el empleado estable con\n el mayor tiempo de servicio sin hijos es: " + areaI
                    + "\n\nEl número de Empleados cuyo apellido Paterno \ninicien con la letra “A” o “C” es: " + contE3);
        } catch (IOException | NumberFormatException e) {
            System.out.println(e);
        }
    }

    //Este metodo muestra los datos en los Jtextfields y comboBoxs cuando se hace click en una fila de la tabla
    public void Mostrar() {
        tbEmpleados.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent Mouse_Event) {
                JTable tabla = (JTable) Mouse_Event.getSource();
                Point point = Mouse_Event.getPoint();
                int Fila = tabla.rowAtPoint(point);
                if (Mouse_Event.getClickCount() == 1) {
                    txtNombres.setText(tbEmpleados.getValueAt(tbEmpleados.getSelectedRow(), 0).toString());
                    txtApellidoPaterno.setText(tbEmpleados.getValueAt(tbEmpleados.getSelectedRow(), 1).toString());
                    txtApellidoMaterno.setText(tbEmpleados.getValueAt(tbEmpleados.getSelectedRow(), 2).toString());
                    CbxAreaLaboral.setSelectedItem(tbEmpleados.getValueAt(tbEmpleados.getSelectedRow(), 3).toString());
                    TxtTiempoDeaServicio.setText(tbEmpleados.getValueAt(tbEmpleados.getSelectedRow(), 4).toString());
                    CbxCondicion.setSelectedItem(tbEmpleados.getValueAt(tbEmpleados.getSelectedRow(), 5).toString());
                    txtSueldo.setText(tbEmpleados.getValueAt(tbEmpleados.getSelectedRow(), 6).toString());
                    txtNumHijos.setText(tbEmpleados.getValueAt(tbEmpleados.getSelectedRow(), 8).toString());
                    asignarMovilidad();
                    DecimalFormat df = new DecimalFormat("#0.00");
                    double AFP = Double.parseDouble(txtSueldo.getText()) * 0.175;
                    double SueldoFinal = (Double.parseDouble(txtSueldo.getText()) + asignacionMovilidad + (Double.parseDouble(txtNumHijos.getText()) * 55)) - AFP;

                    aCadena = txtNombres.getText() + "," + txtApellidoPaterno.getText() + ","
                            + txtApellidoMaterno.getText() + "," + CbxAreaLaboral.getSelectedItem().toString() + "," + TxtTiempoDeaServicio.getText() + ","
                            + CbxCondicion.getSelectedItem().toString() + "," + Double.valueOf(txtSueldo.getText()) + "," + df.format(asignacionMovilidad)
                            + "," + Integer.valueOf(txtNumHijos.getText()) + "," + df.format(AFP) + "," + SueldoFinal;

                    DesactivarCampos();
                }

            }
        });
    }
// Este metodo quita la posiblidad de introducir nuevos valores

    public void DesactivarCampos() {
        txtNombres.setEditable(false);
        txtApellidoPaterno.setEditable(false);
        txtApellidoMaterno.setEditable(false);
        TxtTiempoDeaServicio.setEditable(false);
        txtSueldo.setEditable(false);
        txtNumHijos.setEditable(false);
        CbxAreaLaboral.setEnabled(false);
        CbxCondicion.setEnabled(false);
    }
// Este metodo activa la posiblidad de introducir nuevos valores

    public void ActivarCampos() {
        txtNombres.setEditable(true);
        txtApellidoPaterno.setEditable(true);
        txtApellidoMaterno.setEditable(true);
        TxtTiempoDeaServicio.setEditable(true);
        txtSueldo.setEditable(true);
        txtNumHijos.setEditable(true);
        CbxAreaLaboral.setEnabled(true);
        CbxCondicion.setEnabled(true);
    }

    //Estos metodos se encargar de realizar las animaciones del panel Modificar
    public void PanelIzquierda() {
        animaciones.JPanelXIzquierda(20, -300, 15, 10, PnlModificar);
    }

    public void PanelDerecha() {
        animaciones.JPanelXDerecha(-300, 20, 15, 10, PnlModificar);
    }

    //Este metodo pasa los datos del archivo de texto a objetos para poder manipular con ellos
    public void LeerDetextoAObjeto() {
        String Linea, Nombres, apellidoP, apellidoM, areaLaboral, condicion;
        double sueldoFinal, tiempoDeServicio, sueldoBase, movilidad, descAFP;
        int hijos;
        try {
            FileReader fr = new FileReader(Archivo);
            BufferedReader br = new BufferedReader(fr);
            while ((Linea = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(Linea, ",");
                Nombres = st.nextToken();
                apellidoP = st.nextToken();
                apellidoM = st.nextToken();
                areaLaboral = st.nextToken();
                tiempoDeServicio = Double.parseDouble(st.nextToken());
                condicion = st.nextToken();
                sueldoBase = Double.parseDouble(st.nextToken());
                movilidad = Double.parseDouble(st.nextToken());
                hijos = Integer.parseInt(st.nextToken());
                descAFP = Double.parseDouble(st.nextToken());
                sueldoFinal = Double.parseDouble(st.nextToken());
                //lo añado al vector para poder manipular con el 
                E = new Empleados(Nombres, apellidoP, apellidoM, areaLaboral,
                        tiempoDeServicio, condicion, sueldoBase, movilidad,
                        hijos, descAFP, sueldoFinal);

                Datos.add(E);
            }
            fr.close();
            br.close();
        } catch (IOException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            System.out.println(ex);
        }
    }

    //Este metodo elimina el registro seleccionado en la tabla
    public void Eliminar() {
        try {
            if (Datos.isEmpty()) {

                LeerDetextoAObjeto();
            }

            try (FileWriter fw = new FileWriter(Archivo); BufferedWriter bw = new BufferedWriter(fw)) {
                String Nombre = txtNombres.getText();
                String ApellidoP = txtApellidoPaterno.getText();
                String ApellidoM = txtApellidoMaterno.getText();
                String Area = CbxAreaLaboral.getSelectedItem().toString();
                String Condicion = CbxCondicion.getSelectedItem().toString();
                for (Empleados n : Datos) {
                    if (!n.getNombre().equals(Nombre)
                            && !n.getApellidoP().equals(ApellidoP)
                            && !n.getApellidoM().equals(ApellidoM)
                            && !n.getArea().equals(Area)
                            && !n.getCategoria().equals(Condicion)) {
                        bw.write(n.Nombre + "," + n.ApellidoP + "," + n.ApellidoM + "," + n.Area + "," + n.Tiempo + "," + n.Categoria
                                + "," + n.Sueldo + "," + n.AsignacionDeM + "," + n.Hijos + "," + n.AFP + "," + n.SueldoF + "\r\n");
                    } else {
                        JOptionPane.showMessageDialog(null, "Registro Eliminado");
                    }
                }
            }
            Datos.clear();
            LimpiarTabla();
            LlenarTabla();
            Limpiar();
        } catch (HeadlessException | IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //Este metodo vincula el CbxModificar con los campos ingresados
    public void SeleccionCbxModificar() {
        switch (CbxModificar.getSelectedIndex()) {
            case 0 -> {
                DesactivarCampos();
                txtNombres.setEditable(true);
                txtNombres.requestFocus();
            }
            case 1 -> {
                DesactivarCampos();
                txtApellidoPaterno.setEditable(true);
                txtApellidoPaterno.requestFocus();
            }
            case 2 -> {
                DesactivarCampos();
                txtApellidoMaterno.setEditable(true);
                txtApellidoMaterno.requestFocus();
            }
            case 3 -> {
                DesactivarCampos();
                CbxAreaLaboral.setEnabled(true);
                CbxAreaLaboral.requestFocus();
            }
            case 4 -> {
                DesactivarCampos();
                TxtTiempoDeaServicio.setEditable(true);
                TxtTiempoDeaServicio.requestFocus();
            }
            case 5 -> {
                DesactivarCampos();
                CbxCondicion.setEnabled(true);
                CbxCondicion.requestFocus();
            }
            case 6 -> {
                DesactivarCampos();
                txtSueldo.setEditable(true);
                txtSueldo.requestFocus();
            }
            case 7 -> {
                DesactivarCampos();
                txtNumHijos.setEditable(true);
                txtNumHijos.requestFocus();
            }
        }
        asignarMovilidad();
        DecimalFormat df = new DecimalFormat("#0.0");
        double AFP = Double.parseDouble(txtSueldo.getText()) * 0.175;
        double SueldoFinal = (Double.parseDouble(txtSueldo.getText()) + asignacionMovilidad + (Double.parseDouble(txtNumHijos.getText()) * 55)) - AFP;

        aCadena = txtNombres.getText() + "," + txtApellidoPaterno.getText() + ","
                + txtApellidoMaterno.getText() + "," + CbxAreaLaboral.getSelectedItem().toString() + "," + TxtTiempoDeaServicio.getText() + ","
                + CbxCondicion.getSelectedItem().toString() + "," + Double.valueOf(txtSueldo.getText()) + "," + df.format(asignacionMovilidad)
                + "," + Integer.valueOf(txtNumHijos.getText()) + "," + df.format(AFP) + "," + SueldoFinal;
        System.out.println(aCadena);
    }

    //Este metodo se encarga de Modificar valores dentro del archivo txt
    public void Modificar() {
        DecimalFormat df = new DecimalFormat("#0.0");
        double AFP = Double.parseDouble(txtSueldo.getText()) * 0.175;
        double SueldoFinal = (Double.parseDouble(txtSueldo.getText()) + asignacionMovilidad + (Double.parseDouble(txtNumHijos.getText()) * 55)) - AFP;

        nCadena = txtNombres.getText() + "," + txtApellidoPaterno.getText() + ","
                + txtApellidoMaterno.getText() + "," + CbxAreaLaboral.getSelectedItem().toString() + "," + TxtTiempoDeaServicio.getText() + ","
                + CbxCondicion.getSelectedItem().toString() + "," + Double.valueOf(txtSueldo.getText()) + "," + df.format(asignacionMovilidad)
                + "," + Integer.valueOf(txtNumHijos.getText()) + "," + df.format(AFP) + "," + SueldoFinal;

        String nFnuevo = "Modificar2.txt";
        File fNuevo = new File(nFnuevo);
        String Linea;
        try {

            FileReader fr = new FileReader(Archivo);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(fNuevo);
            while ((Linea = br.readLine()) != null) {
                String escribir = Linea;
                if (Linea.equals(aCadena)) {

                    fw.write(nCadena);
                    fw.write(System.getProperty("line.separator"));
                } else if (Linea.equalsIgnoreCase(escribir)) {
                    System.out.println(escribir);
                    fw.write(escribir);
                    fw.write(System.getProperty("line.separator"));

                }

            }
            fw.close();
            br.close();
            fr.close();
            String nAntiguo = Archivo.getName();

            Archivo.delete();
            fNuevo.renameTo(Archivo);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            System.out.println(ex);
        }
        LimpiarTabla();
        LlenarTabla();
        brindarInfoTextArea();
    }
}
