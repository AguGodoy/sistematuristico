/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import sistematuristico.AccesoData.AlojamientoData;
import sistematuristico.Entidades.Alojamiento;

/**
 *
 * @author crist
 */
public class ABMAlojamiento extends javax.swing.JInternalFrame {
private AlojamientoData aData=new AlojamientoData();


    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    public ABMAlojamiento() {
        initComponents();
        cargarcombobox();
       
        modelo.addRow(new Object[]{123, "dsds", "dasdsa", "sdadsad"});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFull = new javax.swing.JPanel();
        jPanelBody = new javax.swing.JPanel();
        jPanelHead = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextIdAlojamiento = new javax.swing.JTextField();
        jTextImporteD = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxServicio = new javax.swing.JComboBox<>();
        jComboBoxAlojamiento = new javax.swing.JComboBox<>();
        jTextTipoAlojamiento = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jDateChooserIngreso = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        jDateChooserSalida = new com.toedter.calendar.JDateChooser();
        jCheckBoxEstado = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextServicio = new javax.swing.JTextField();
        jTextImporteT = new javax.swing.JTextField();
        jButtonNuevo = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();

        jPanelFull.setBackground(new java.awt.Color(56, 63, 79));
        jPanelFull.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBody.setBackground(new java.awt.Color(56, 63, 79));
        jPanelBody.setPreferredSize(new java.awt.Dimension(1000, 540));

        jPanelHead.setBackground(new java.awt.Color(56, 63, 79));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 237, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seleccion de Alojamiento");

        jSeparator1.setBackground(new java.awt.Color(235, 237, 255));

        jSeparator2.setBackground(new java.awt.Color(235, 237, 255));

        jPanel1.setBackground(new java.awt.Color(56, 63, 79));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(235, 237, 255));
        jLabel3.setText("Id de Alojamiento:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(235, 237, 255));
        jLabel6.setText("Fecha de Ingreso:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(235, 237, 255));
        jLabel10.setText("Tipo de Alojamiento:");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(235, 237, 255));
        jLabel11.setText("Importe Diario:");

        jTextIdAlojamiento.setBackground(new java.awt.Color(56, 63, 79));
        jTextIdAlojamiento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextIdAlojamiento.setForeground(new java.awt.Color(235, 237, 255));
        jTextIdAlojamiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 237, 255)));
        jTextIdAlojamiento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextIdAlojamientoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextIdAlojamientoFocusLost(evt);
            }
        });

        jTextImporteD.setBackground(new java.awt.Color(56, 63, 79));
        jTextImporteD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextImporteD.setForeground(new java.awt.Color(235, 237, 255));
        jTextImporteD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 237, 255)));
        jTextImporteD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextImporteDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextImporteDFocusLost(evt);
            }
        });

        jButtonBuscar.setBackground(new java.awt.Color(47, 52, 67));
        jButtonBuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(235, 237, 255));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(235, 237, 255));
        jLabel13.setText("Importe Total:");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(235, 237, 255));
        jLabel14.setText("Tipo de Servicio");

        jComboBoxServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxAlojamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextTipoAlojamiento.setBackground(new java.awt.Color(56, 63, 79));
        jTextTipoAlojamiento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextTipoAlojamiento.setForeground(new java.awt.Color(235, 237, 255));
        jTextTipoAlojamiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 237, 255)));
        jTextTipoAlojamiento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextTipoAlojamientoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextTipoAlojamientoFocusLost(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(235, 237, 255));
        jLabel15.setText("Estado:");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(235, 237, 255));
        jLabel16.setText("Fecha de Salida:");

        jCheckBoxEstado.setBackground(new java.awt.Color(56, 63, 79));
        jCheckBoxEstado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBoxEstado.setForeground(new java.awt.Color(235, 237, 255));
        jCheckBoxEstado.setText("Activo / Inactivo");
        jCheckBoxEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCheckBoxEstadoMousePressed(evt);
            }
        });
        jCheckBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxEstadoActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(235, 237, 255));
        jLabel17.setText("$:");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(235, 237, 255));
        jLabel18.setText("$:");

        jTextServicio.setBackground(new java.awt.Color(56, 63, 79));
        jTextServicio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextServicio.setForeground(new java.awt.Color(235, 237, 255));
        jTextServicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 237, 255)));
        jTextServicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextServicioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextServicioFocusLost(evt);
            }
        });

        jTextImporteT.setBackground(new java.awt.Color(56, 63, 79));
        jTextImporteT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextImporteT.setForeground(new java.awt.Color(235, 237, 255));
        jTextImporteT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 237, 255)));
        jTextImporteT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextImporteTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextImporteTFocusLost(evt);
            }
        });

        jButtonNuevo.setBackground(new java.awt.Color(47, 52, 67));
        jButtonNuevo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonNuevo.setForeground(new java.awt.Color(235, 237, 255));
        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jButtonGuardar.setBackground(new java.awt.Color(47, 52, 67));
        jButtonGuardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(235, 237, 255));
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonEliminar.setBackground(new java.awt.Color(47, 52, 67));
        jButtonEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(235, 237, 255));
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextImporteD, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextServicio)
                            .addComponent(jTextTipoAlojamiento)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooserIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooserSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(32, 32, 32)
                        .addComponent(jTextIdAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextImporteT, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextIdAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooserIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooserSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextTipoAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextImporteD, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextImporteT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelHeadLayout = new javax.swing.GroupLayout(jPanelHead);
        jPanelHead.setLayout(jPanelHeadLayout);
        jPanelHeadLayout.setHorizontalGroup(
            jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeadLayout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addGroup(jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelHeadLayout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(265, Short.MAX_VALUE))
        );
        jPanelHeadLayout.setVerticalGroup(
            jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeadLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addComponent(jPanelHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addComponent(jPanelHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanelFull.add(jPanelBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFull, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelFull, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextIdAlojamientoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextIdAlojamientoFocusGained
        textBorderFocusGained((JTextField) evt.getComponent());
    }//GEN-LAST:event_jTextIdAlojamientoFocusGained

    private void jTextIdAlojamientoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextIdAlojamientoFocusLost
        textBorderFocusLost((JTextField) evt.getComponent());
    }//GEN-LAST:event_jTextIdAlojamientoFocusLost

    private void jTextImporteDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextImporteDFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextImporteDFocusGained

    private void jTextImporteDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextImporteDFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextImporteDFocusLost

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
    try {
            int id = Integer.parseInt(jTextIdAlojamiento.getText());

           Alojamiento aloja = aData.buscarAlojamiento(id);
            if (aloja != null) {
                
                 jDateChooserIngreso.setDate(java.sql.Date.valueOf(aloja.getFechaIn()));
                 jDateChooserSalida.setDate(java.sql.Date.valueOf(aloja.getFechaOn()));
                String nom = aloja.getNombre();
                String ape = alumno.getApellido();

                jTextApellido.setText(ape + "");
                jTextNombre.setText(nom + "");
                if (alumno.isActivo()) {
                    jRadioButtonActivo.setSelected(true);
                } else {
                    jRadioButtonInactivo.setSelected(true);
                }
                jDateChooser1.setDate(java.sql.Date.valueOf(alumno.getFechaNacimiento()));
                buscar();
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros de alojamiento con ese ID");
                nuevo();
                vaciar();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error: campos vacios ");
        }

                                                
    
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTextTipoAlojamientoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextTipoAlojamientoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTipoAlojamientoFocusGained

    private void jTextTipoAlojamientoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextTipoAlojamientoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTipoAlojamientoFocusLost

    private void jCheckBoxEstadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxEstadoMousePressed

    }//GEN-LAST:event_jCheckBoxEstadoMousePressed

    private void jCheckBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxEstadoActionPerformed

    }//GEN-LAST:event_jCheckBoxEstadoActionPerformed

    private void jTextServicioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextServicioFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextServicioFocusGained

    private void jTextServicioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextServicioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextServicioFocusLost

    private void jTextImporteTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextImporteTFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextImporteTFocusGained

    private void jTextImporteTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextImporteTFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextImporteTFocusLost

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        jButtonGuardar.setText("Guardar");
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEliminarActionPerformed

       // </editor-fold>
    // </editor-fold>  
    
   

    private void textBorderFocusGained(JTextField textField) {
        textField.setBorder(new LineBorder(new Color(83, 81, 251), 3));
    }

    private void textBorderFocusLost(JTextField textField) {
        textField.setBorder(new LineBorder(new Color(235, 237, 255), 1));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JCheckBox jCheckBoxEstado;
    private javax.swing.JComboBox<String> jComboBoxAlojamiento;
    private javax.swing.JComboBox<String> jComboBoxServicio;
    private com.toedter.calendar.JDateChooser jDateChooserIngreso;
    private com.toedter.calendar.JDateChooser jDateChooserSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelFull;
    private javax.swing.JPanel jPanelHead;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextIdAlojamiento;
    private javax.swing.JTextField jTextImporteD;
    private javax.swing.JTextField jTextImporteT;
    private javax.swing.JTextField jTextServicio;
    private javax.swing.JTextField jTextTipoAlojamiento;
    // End of variables declaration//GEN-END:variables
private void cargarcombobox() {
        
            jComboBoxAlojamiento.addItem("Hotel");
            
            jComboBoxAlojamiento.addItem("Hostel");
            jComboBoxAlojamiento.addItem("Casa");
            jComboBoxAlojamiento.addItem("Cabania");
            
            jComboBoxServicio.addItem("Clasico");
            jComboBoxServicio.addItem("Desayuno");
            jComboBoxServicio.addItem("Media Pension");
            jComboBoxServicio.addItem("Todo Incluido");
            
            
       
}
}
