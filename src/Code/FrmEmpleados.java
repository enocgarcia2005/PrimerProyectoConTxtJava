package Code;

import Animaciones.Animaciones;
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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FrmEmpleados extends javax.swing.JFrame {

    String[] Cabecera = {"Nombres y Apellidos", "Area", "Tiempo de Servicio(años)", "Sueldo", "Categoria"};
    String[][] datos = {};
    DefaultTableModel EmpleadosT = new DefaultTableModel(datos, Cabecera);
    File Archivo = new File("Empleados.txt");
    Empleados E = new Empleados();
    ArrayList<Empleados> Datos = new ArrayList<Empleados>();
    Animaciones animaciones;
    String aCadena;
    String nCadena;

    public FrmEmpleados() {
        initComponents();
        BtnModificar.setEnabled(false);
        BtnEliminar.setEnabled(false);
        animaciones = new Animaciones();
        TbEmpleados.setModel(EmpleadosT);
        TbEmpleados.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent Mouse_Event) {
                JTable tabla = (JTable) Mouse_Event.getSource();
                Point point = Mouse_Event.getPoint();
                int Fila = tabla.rowAtPoint(point);
                if (Mouse_Event.getClickCount() == 1) {
                    txtNombres.setText(TbEmpleados.getValueAt(TbEmpleados.getSelectedRow(), 0).toString());
                    CbxAreaLaboral.setSelectedItem(TbEmpleados.getValueAt(TbEmpleados.getSelectedRow(), 1).toString());
                    TxtTiempoDeaServicio.setText(TbEmpleados.getValueAt(TbEmpleados.getSelectedRow(), 2).toString());
                    txtSueldo.setText(TbEmpleados.getValueAt(TbEmpleados.getSelectedRow(), 3).toString());
                    CbxCategoria.setSelectedItem(TbEmpleados.getValueAt(TbEmpleados.getSelectedRow(), 4).toString());

                    txtNombres.setEditable(false);
                    TxtTiempoDeaServicio.setEditable(false);
                    txtSueldo.setEditable(false);
                    CbxAreaLaboral.setEnabled(false);
                    CbxCategoria.setEnabled(false);
                }

            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        PnlModificar = new javax.swing.JPanel();
        CbxModificar = new javax.swing.JComboBox<>();
        lblModificar = new javax.swing.JLabel();
        BtnSeleccionar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        BtnGuardarCambios = new javax.swing.JButton();
        PnlDatos = new javax.swing.JPanel();
        LblNombre = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        LblAreaLaboral = new javax.swing.JLabel();
        CbxAreaLaboral = new javax.swing.JComboBox<>();
        LblTiempoDeServicio = new javax.swing.JLabel();
        TxtTiempoDeaServicio = new javax.swing.JTextField();
        LblCategoria = new javax.swing.JLabel();
        CbxCategoria = new javax.swing.JComboBox<>();
        lblSueldo = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        Header = new javax.swing.JLabel();
        PnlTabla = new javax.swing.JPanel();
        ScrollTB = new javax.swing.JScrollPane();
        TbEmpleados = new javax.swing.JTable();
        PnlBotones = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnNuevo = new javax.swing.JButton();
        titleTb = new javax.swing.JLabel();
        PnlOperaciones = new javax.swing.JPanel();
        ScrollTxt = new javax.swing.JScrollPane();
        TxtResultados = new javax.swing.JTextArea();

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

        PnlModificar.setBackground(new java.awt.Color(255, 255, 255));
        PnlModificar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        PnlModificar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CbxModificar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CbxModificar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombres y Apellidos", "Area Laboral", "Tiempo de servicio", "Sueldo", "Categoria" }));
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

        BackGround.add(PnlModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 100, 240, 100));

        PnlDatos.setBackground(new java.awt.Color(255, 255, 255));
        PnlDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        PnlDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblNombre.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        LblNombre.setText("Nombres y Apellidos:");
        PnlDatos.add(LblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 21));

        txtNombres.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNombres.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });
        PnlDatos.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 11, 340, 30));

        LblAreaLaboral.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        LblAreaLaboral.setText("Area Laboral:");
        PnlDatos.add(LblAreaLaboral, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, 20));

        CbxAreaLaboral.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CbxAreaLaboral.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contabilidad", "Auditoria", "Sistemas" }));
        CbxAreaLaboral.setSelectedIndex(-1);
        CbxAreaLaboral.setToolTipText("Selecciona una opcion");
        CbxAreaLaboral.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        CbxAreaLaboral.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnlDatos.add(CbxAreaLaboral, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 55, 130, 30));

        LblTiempoDeServicio.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        LblTiempoDeServicio.setText("Tiempo de Servicio:");
        PnlDatos.add(LblTiempoDeServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 51, -1, 30));

        TxtTiempoDeaServicio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TxtTiempoDeaServicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtTiempoDeaServicio.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        TxtTiempoDeaServicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtTiempoDeaServicioKeyTyped(evt);
            }
        });
        PnlDatos.add(TxtTiempoDeaServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 51, 70, 30));

        LblCategoria.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        LblCategoria.setText("Categoria:");
        PnlDatos.add(LblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, 30));

        CbxCategoria.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contratado", "Estable" }));
        CbxCategoria.setSelectedIndex(-1);
        CbxCategoria.setToolTipText("Seleccione una opcion");
        CbxCategoria.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        CbxCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnlDatos.add(CbxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 95, 120, 30));

        lblSueldo.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblSueldo.setText("Sueldo:");
        PnlDatos.add(lblSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        txtSueldo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSueldo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSueldo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        txtSueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSueldoKeyTyped(evt);
            }
        });
        PnlDatos.add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 170, 30));

        BackGround.add(PnlDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 510, 140));

        Header.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Header.setText("Registro de Empleados #1");
        BackGround.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 410, 50));

        PnlTabla.setBackground(new java.awt.Color(255, 255, 255));
        PnlTabla.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        TbEmpleados.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(255, 255, 255)));
        TbEmpleados.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TbEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres Y Apellidos", "Area", "Tiempo de Servicio(Años)", "Sueldo", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TbEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TbEmpleadosMousePressed(evt);
            }
        });
        ScrollTB.setViewportView(TbEmpleados);

        javax.swing.GroupLayout PnlTablaLayout = new javax.swing.GroupLayout(PnlTabla);
        PnlTabla.setLayout(PnlTablaLayout);
        PnlTablaLayout.setHorizontalGroup(
            PnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollTB, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
        );
        PnlTablaLayout.setVerticalGroup(
            PnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollTB, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        BackGround.add(PnlTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 780, 210));

        PnlBotones.setBackground(new java.awt.Color(255, 255, 255));
        PnlBotones.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        PnlBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        PnlBotones.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 15, 75, -1));

        BtnEliminar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        BtnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        PnlBotones.add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 15, 82, -1));

        btnSalir.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setToolTipText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        PnlBotones.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 75, -1));

        BtnModificar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnModificar.setText("Modificar");
        BtnModificar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        BtnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        PnlBotones.add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 82, -1));

        BtnNuevo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnNuevo.setText("Nuevo");
        BtnNuevo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        BtnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });
        PnlBotones.add(BtnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 70, -1));

        BackGround.add(PnlBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 220, 140));

        titleTb.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        titleTb.setText("Listado de Empleados");
        BackGround.add(titleTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        PnlOperaciones.setBackground(new java.awt.Color(255, 255, 255));
        PnlOperaciones.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        PnlOperaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtResultados.setEditable(false);
        TxtResultados.setBackground(new java.awt.Color(255, 255, 255));
        TxtResultados.setColumns(20);
        TxtResultados.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TxtResultados.setRows(5);
        TxtResultados.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        ScrollTxt.setViewportView(TxtResultados);

        PnlOperaciones.add(ScrollTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 21, 748, 100));

        BackGround.add(PnlOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 780, 150));

        getContentPane().add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 648));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ConfigTable();
        LlenarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Guardar();
        txtNombres.setEditable(false);
        TxtTiempoDeaServicio.setEditable(false);
        txtSueldo.setEditable(false);
        CbxAreaLaboral.setEnabled(false);
        CbxCategoria.setEnabled(false);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        if (txtNombres.getText().isEmpty()
                || txtSueldo.getText().isEmpty()
                || TxtTiempoDeaServicio.getText().isEmpty()
                || CbxAreaLaboral.getSelectedIndex() == -1
                || CbxCategoria.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro");

        } else {
            if (TbEmpleados.getRowCount() == 1) {
                JOptionPane.showMessageDialog(null, "La tabla no puede estar vacia");
            } else {
                Eliminar();
            }
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        if (!(mayusculas || minusculas || espacio)) {
            evt.consume();
        }

    }//GEN-LAST:event_txtNombresKeyTyped

    private void TxtTiempoDeaServicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtTiempoDeaServicioKeyTyped
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <= 57;
        boolean punto = key == 46;
        if (!(num || punto)) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtTiempoDeaServicioKeyTyped

    private void txtSueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSueldoKeyTyped
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <= 57;
        boolean punto = key == 46;
        if (!(num || punto)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSueldoKeyTyped

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        PanelArriba();
        PanelIzquierda();
    }//GEN-LAST:event_BtnModificarActionPerformed

    public void Guardar() {
        if (txtNombres.getText().isEmpty()
                || txtSueldo.getText().isEmpty()
                || TxtTiempoDeaServicio.getText().isEmpty()
                || CbxAreaLaboral.getSelectedIndex() == -1
                || CbxCategoria.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Rellene todos los Campos");

        } else {

            String Nombre = txtNombres.getText();
            String Area = CbxAreaLaboral.getSelectedItem().toString();
            double Tiempo = Double.parseDouble(TxtTiempoDeaServicio.getText());
            double Sueldo = Double.parseDouble(txtSueldo.getText());
            String Categoria = CbxCategoria.getSelectedItem().toString();
            try {
                FileWriter fw = new FileWriter(Archivo, true);
                fw.write(Nombre);
                fw.write(",");
                fw.write(Area);
                fw.write(",");
                fw.write(String.valueOf(Tiempo));
                fw.write(",");
                fw.write(String.valueOf(Sueldo));
                fw.write(",");
                fw.write(Categoria);
                fw.write(System.getProperty("line.separator"));
                JOptionPane.showMessageDialog(this, "Guardado Correctamente");
                Limpiar();
                fw.close();
                LimpiarTabla();
                LlenarTabla();

                txtNombres.setEditable(false);
                TxtTiempoDeaServicio.setEditable(false);
                txtSueldo.setEditable(false);
                CbxAreaLaboral.setEnabled(false);
                CbxCategoria.setEnabled(false);
                txtNombres.requestFocus();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
            }
            Operaciones();
        }

    }

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
        txtNombres.setText("");
        TxtTiempoDeaServicio.setText("");
        txtSueldo.setText("");
        CbxAreaLaboral.setSelectedIndex(-1);
        CbxCategoria.setSelectedIndex(-1);

        txtNombres.setEditable(true);
        TxtTiempoDeaServicio.setEditable(true);
        txtSueldo.setEditable(true);
        CbxAreaLaboral.setEnabled(true);
        CbxCategoria.setEnabled(true);
        btnGuardar.setEnabled(true);
        txtNombres.requestFocus();
        BtnModificar.setEnabled(false);
        BtnEliminar.setEnabled(false);
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void BtnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeleccionarActionPerformed
        if (CbxModificar.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una opcion");
        } else if (txtNombres.getText().isEmpty()
                || txtSueldo.getText().isEmpty()
                || TxtTiempoDeaServicio.getText().isEmpty()
                || CbxAreaLaboral.getSelectedIndex() == -1
                || CbxCategoria.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro");

        } else {
            modificar();
        }
    }//GEN-LAST:event_BtnSeleccionarActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        PanelDerecha();
        PanelAbajo();
        CbxModificar.setSelectedIndex(-1);
        txtNombres.setEditable(false);
        TxtTiempoDeaServicio.setEditable(false);
        txtSueldo.setEditable(false);
        CbxAreaLaboral.setEnabled(false);
        CbxCategoria.setEnabled(false);
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarCambiosActionPerformed
        if (CbxModificar.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Primero selleccione un campo y realize los cambios correspondientes");
        } else if (txtNombres.getText().isEmpty()
                || txtSueldo.getText().isEmpty()
                || TxtTiempoDeaServicio.getText().isEmpty()
                || CbxAreaLaboral.getSelectedIndex() == -1
                || CbxCategoria.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro");

        } else {
            CambiarLinea();
        }
    }//GEN-LAST:event_BtnGuardarCambiosActionPerformed

    private void TbEmpleadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbEmpleadosMousePressed
        btnGuardar.setEnabled(false);
        BtnModificar.setEnabled(true);
        BtnEliminar.setEnabled(true);
    }//GEN-LAST:event_TbEmpleadosMousePressed

    private void Limpiar() {
        txtNombres.setText("");
        TxtTiempoDeaServicio.setText("");
        txtSueldo.setText("");
        CbxAreaLaboral.setSelectedIndex(-1);
        CbxCategoria.setSelectedIndex(-1);
    }

    private void Operaciones() {
        double Promedio = 0, ContProm = 0;
        int EmpleadosEstables = 0, EmpleadosQueGananMas = 0;
        String Linea, Nombre, Area, Categoria, EmpleadoSueldoMenor = "";
        double Tiempo, Sueldo, SueldoMenor = 99999999;
        try {
            FileReader fr = new FileReader(Archivo);
            BufferedReader br = new BufferedReader(fr);
            while ((Linea = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(Linea, ",");
                Nombre = st.nextToken();
                Area = st.nextToken();
                Tiempo = Double.parseDouble(st.nextToken());
                Sueldo = Double.parseDouble(st.nextToken());
                Categoria = st.nextToken();
                if (Sueldo < SueldoMenor && Area.equalsIgnoreCase("Contabilidad")) {
                    SueldoMenor = Sueldo;
                    EmpleadoSueldoMenor = Nombre;
                }
                if (Categoria.equalsIgnoreCase("Contratado")) {
                    Promedio = Promedio + Sueldo;
                    ContProm++;
                }
                if (Sueldo > 2500 && Sueldo < 3500 && Tiempo >= 5) {
                    EmpleadosQueGananMas++;
                }
                if (Categoria.equalsIgnoreCase("Estable") && Sueldo < 1200 && Area.equalsIgnoreCase("Auditoria")) {
                    EmpleadosEstables++;
                }
            }
            br.close();
            fr.close();
            double PromedioF = (Promedio / ContProm);
            DecimalFormat df = new DecimalFormat("#0.00");
            TxtResultados.setText("El empleado con el menor sueldo del área del Contabilidad es: " + EmpleadoSueldoMenor + ""
                    + " \nPromedio de Salarios de los empleados contratados: "
                    + df.format(PromedioF) + "\nEl número de empleados que ganan más de S/.2500 y menos de S/ 3500 con más de 5 años de servicio es: " + EmpleadosQueGananMas
                    + " \nEl número de empleados estables del área de Auditoria con sueldo menores a S/. 1200 es: " + EmpleadosEstables);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un problema...");
            System.out.println(e);
        }
    }

    private void ConfigTable() {
        TbEmpleados.getColumnModel().getColumn(0).setPreferredWidth(150);
        TbEmpleados.getColumnModel().getColumn(1).setPreferredWidth(50);
        TbEmpleados.getColumnModel().getColumn(2).setPreferredWidth(100);
        TbEmpleados.getColumnModel().getColumn(3).setPreferredWidth(50);
        TbEmpleados.getColumnModel().getColumn(4).setPreferredWidth(50);

    }

    public void PanelAbajo() {
        animaciones.JPanelYAbajo(-150, 80, 15, 10, PnlBotones);
    }

    public void PanelArriba() {
        animaciones.JPanelYArriba(80, -150, 15, 10, PnlBotones);
    }

    public void PanelIzquierda() {
        animaciones.JPanelXIzquierda(820, 550, 15, 10, PnlModificar);
    }

    public void PanelDerecha() {
        animaciones.JPanelXDerecha(550, 820, 15, 10, PnlModificar);
    }

    public void Eliminar() {
        try {
            if (Datos.isEmpty()) {

                LeerDetextoAObjeto();
            }

            FileWriter fw = new FileWriter(Archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            // FileWriter fw=new FileWriter("ListaAsistencia.txt",true);
            String v = txtNombres.getText();

            for (Empleados n : Datos) {
                if (!n.getNombre().equals(v)) {
                    bw.write(n.Nombre + "," + n.Area + "," + n.Tiempo + "," + n.Sueldo + "," + n.Categoria + "\r\n");
                } else {
                    JOptionPane.showMessageDialog(null, "Registro Eliminado");
                }
            }
            bw.close();
            fw.close();
            Datos.clear();
            LimpiarTabla();
            LlenarTabla();
            txtNombres.setText("");
            txtSueldo.setText("");
            TxtTiempoDeaServicio.setText("");
            CbxAreaLaboral.setSelectedItem(-1);
            CbxCategoria.setSelectedItem(-1);
        } catch (Exception ex) {
            //Captura un posible error le imprime en pantalla   
            System.out.println(ex.getMessage());
        }
    }

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
        Operaciones();
    }

    public void LimpiarTabla() {
        DefaultTableModel tb = (DefaultTableModel) TbEmpleados.getModel();
        int a = TbEmpleados.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }
    }

    public void LeerDetextoAObjeto() {

        String Linea, Nombre, Area, Categoria;
        double Tiempo, Sueldo;
        try {
            FileReader fr = new FileReader(Archivo);
            BufferedReader br = new BufferedReader(fr);
            while ((Linea = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(Linea, ",");
                Nombre = st.nextToken();
                Area = st.nextToken();
                Tiempo = Double.parseDouble(st.nextToken());
                Sueldo = Double.parseDouble(st.nextToken());
                Categoria = st.nextToken();
                //lo añado al vector para poder manipular con el 
                E = new Empleados(Nombre, Area, Tiempo, Sueldo, Categoria);

                Datos.add(E);
            }
            fr.close();
            br.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            System.out.println(ex);
        }
    }

    public void CambiarLinea() {
        nCadena = txtNombres.getText() + "," + CbxAreaLaboral.getSelectedItem().toString() + ","
                + TxtTiempoDeaServicio.getText() + "," + txtSueldo.getText() + "," + CbxCategoria.getSelectedItem().toString();

        String nFnuevo = "Modificar.txt";
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

            // Capturo el nombre del fichero antiguo
            String nAntiguo = Archivo.getName();
            // Borro el fichero antiguo
            Archivo.delete();
            //Renombro el fichero auxiliar con el nombre del fichero antiguo
            fNuevo.renameTo(Archivo);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            System.out.println(ex);
        }

        LimpiarTabla();
        LlenarTabla();
    }

    public void modificar() {
        switch (CbxModificar.getSelectedIndex()) {
            case 0:
                txtNombres.setEditable(true);
                txtNombres.requestFocus();
                break;
            case 1:
                CbxAreaLaboral.setEnabled(true);
                CbxAreaLaboral.requestFocus();
                break;
            case 2:
                TxtTiempoDeaServicio.setEditable(true);
                TxtTiempoDeaServicio.requestFocus();
                break;
            case 3:
                txtSueldo.setEditable(true);
                txtSueldo.requestFocus();
                break;
            case 4:
                CbxCategoria.setEnabled(true);
                CbxCategoria.requestFocus();
                break;
        }
        aCadena = txtNombres.getText() + "," + CbxAreaLaboral.getSelectedItem().toString() + ","
                + TxtTiempoDeaServicio.getText() + "," + txtSueldo.getText() + "," + CbxCategoria.getSelectedItem().toString();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardarCambios;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JButton BtnSeleccionar;
    private javax.swing.JComboBox<String> CbxAreaLaboral;
    private javax.swing.JComboBox<String> CbxCategoria;
    private javax.swing.JComboBox<String> CbxModificar;
    private javax.swing.JLabel Header;
    private javax.swing.JLabel LblAreaLaboral;
    private javax.swing.JLabel LblCategoria;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JLabel LblTiempoDeServicio;
    private javax.swing.JPanel PnlBotones;
    private javax.swing.JPanel PnlDatos;
    private javax.swing.JPanel PnlModificar;
    private javax.swing.JPanel PnlOperaciones;
    private javax.swing.JPanel PnlTabla;
    private javax.swing.JScrollPane ScrollTB;
    private javax.swing.JScrollPane ScrollTxt;
    private javax.swing.JTable TbEmpleados;
    private javax.swing.JTextArea TxtResultados;
    private javax.swing.JTextField TxtTiempoDeaServicio;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblModificar;
    private javax.swing.JLabel lblSueldo;
    private javax.swing.JLabel titleTb;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
}
