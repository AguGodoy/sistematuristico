
package vistas;

import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import sistematuristico.AccesoData.PaqueteData;
import static vistas.Menu.InternalNum;
import static vistas.Menu.paquete;

public class Login extends javax.swing.JInternalFrame {

   
    PaqueteData paqueteData = new PaqueteData();
    public Login() {
        initComponents();

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFull = new javax.swing.JPanel();
        jPanelHead = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnSalir = new javax.swing.JPanel();
        jlabel_exit = new javax.swing.JLabel();
        jPanelBody = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtfIdUser = new javax.swing.JTextField();
        jbIngresar = new javax.swing.JButton();
        jtfIdPass = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jtfIdBuscar = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();

        jPanelFull.setBackground(new java.awt.Color(56, 63, 79));
        jPanelFull.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelHead.setBackground(new java.awt.Color(56, 63, 79));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 237, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        jSeparator1.setBackground(new java.awt.Color(235, 237, 255));

        jSeparator2.setBackground(new java.awt.Color(235, 237, 255));

        btnSalir.setBackground(new java.awt.Color(56, 63, 79));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSalirMousePressed(evt);
            }
        });

        jlabel_exit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlabel_exit.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icon_Exit_25px.png"))); // NOI18N

        javax.swing.GroupLayout btnSalirLayout = new javax.swing.GroupLayout(btnSalir);
        btnSalir.setLayout(btnSalirLayout);
        btnSalirLayout.setHorizontalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSalirLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlabel_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        btnSalirLayout.setVerticalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabel_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelHeadLayout = new javax.swing.GroupLayout(jPanelHead);
        jPanelHead.setLayout(jPanelHeadLayout);
        jPanelHeadLayout.setHorizontalGroup(
            jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeadLayout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addGroup(jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelHeadLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelHeadLayout.setVerticalGroup(
            jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeadLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanelFull.add(jPanelHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        jPanelBody.setBackground(new java.awt.Color(56, 63, 79));
        jPanelBody.setPreferredSize(new java.awt.Dimension(1000, 540));

        jPanel1.setBackground(new java.awt.Color(56, 63, 79));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(235, 237, 255));
        jLabel3.setText("Usuario:");

        jtfIdUser.setBackground(new java.awt.Color(56, 63, 79));
        jtfIdUser.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtfIdUser.setForeground(new java.awt.Color(235, 237, 255));
        jtfIdUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 237, 255)));
        jtfIdUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfIdUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfIdUserFocusLost(evt);
            }
        });

        jbIngresar.setBackground(new java.awt.Color(47, 52, 67));
        jbIngresar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbIngresar.setForeground(new java.awt.Color(235, 237, 255));
        jbIngresar.setText("Ingresar");
        jbIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIngresarActionPerformed(evt);
            }
        });

        jtfIdPass.setBackground(new java.awt.Color(56, 63, 79));
        jtfIdPass.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtfIdPass.setForeground(new java.awt.Color(235, 237, 255));
        jtfIdPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 237, 255)));
        jtfIdPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfIdPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfIdPassFocusLost(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(235, 237, 255));
        jLabel11.setText("Contraseña:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(235, 237, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");

        jSeparator3.setBackground(new java.awt.Color(235, 237, 255));

        jSeparator4.setBackground(new java.awt.Color(235, 237, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jbIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtfIdPass, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfIdUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(96, 96, 96))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                            .addComponent(jSeparator3))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtfIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtfIdPass, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jbIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(56, 63, 79));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(235, 237, 255));
        jLabel4.setText("G47 - ");

        jtfIdBuscar.setBackground(new java.awt.Color(56, 63, 79));
        jtfIdBuscar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtfIdBuscar.setForeground(new java.awt.Color(235, 237, 255));
        jtfIdBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 237, 255)));
        jtfIdBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfIdBuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfIdBuscarFocusLost(evt);
            }
        });
        jtfIdBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfIdBuscarKeyTyped(evt);
            }
        });

        jbBuscar.setBackground(new java.awt.Color(47, 52, 67));
        jbBuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbBuscar.setForeground(new java.awt.Color(235, 237, 255));
        jbBuscar.setText("Ingresar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(235, 237, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cargar Paquete");

        jSeparator5.setBackground(new java.awt.Color(235, 237, 255));

        jSeparator6.setBackground(new java.awt.Color(235, 237, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfIdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfIdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );

        jPanelFull.add(jPanelBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1000, 540));

        jSeparator7.setBackground(new java.awt.Color(235, 237, 255));
        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFull, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(495, 495, 495)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(488, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFull, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(233, 233, 233)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(48, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   // </editor-fold> 
    private void btnSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMousePressed
        this.dispose();
    }//GEN-LAST:event_btnSalirMousePressed

    private void jbIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIngresarActionPerformed
       String user="Grupo47";
       String pass="1234";
        if (jtfIdUser.getText().equalsIgnoreCase(user)&&jtfIdPass.getText().equalsIgnoreCase(pass)) {
            dispose();
            InvocarJInternalFrame(new ABMPaquete());
        }
    }//GEN-LAST:event_jbIngresarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try {
            String aux = jtfIdBuscar.getText();
            paquete = paqueteData.buscarPaquete(Integer.parseInt(aux));
            if (paquete.getIdPaquete() != 0) {
                InternalNum = 4;
                InvocarJInternalFrame(new ResumenPaquete());
            } 
        } catch (Exception e) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtfIdUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfIdUserFocusGained
        textBorderFocusGained((JTextField) evt.getComponent());
    }//GEN-LAST:event_jtfIdUserFocusGained

    private void jtfIdUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfIdUserFocusLost
        textBorderFocusLost((JTextField) evt.getComponent());
    }//GEN-LAST:event_jtfIdUserFocusLost

    private void jtfIdPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfIdPassFocusGained
        textBorderFocusGained((JTextField) evt.getComponent());
    }//GEN-LAST:event_jtfIdPassFocusGained

    private void jtfIdPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfIdPassFocusLost
        textBorderFocusLost((JTextField) evt.getComponent());
    }//GEN-LAST:event_jtfIdPassFocusLost

    private void jtfIdBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfIdBuscarFocusLost
        textBorderFocusLost((JTextField) evt.getComponent());
    }//GEN-LAST:event_jtfIdBuscarFocusLost

    private void jtfIdBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfIdBuscarFocusGained
        textBorderFocusGained((JTextField) evt.getComponent());
    }//GEN-LAST:event_jtfIdBuscarFocusGained

    private void jtfIdBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfIdBuscarKeyTyped
        KeyPress(evt, "numero");
    }//GEN-LAST:event_jtfIdBuscarKeyTyped
    private void InvocarJInternalFrame(JInternalFrame frame) {
        BasicInternalFrameUI ui = (BasicInternalFrameUI) frame.getUI();
        ui.setNorthPane(null);
        frame.setBorder(null); // Elimina el borde
        frame.setClosable(false); // Desactiva la opción de cerrar
        frame.setIconifiable(false); // Desactiva la opción de minimizar
        frame.setOpaque(true); // Hace que el contenido sea opaco
        frame.setSize(Menu.Escritorio.getSize()); // Establece el tamaño igual al del desktopPane
        frame.setVisible(true); // Lo hace visible
        Menu.Escritorio.add(frame); // Agrega el JInternalFrame al JDesktopPane
        frame.toFront();
    }
    private void textBorderFocusGained(JTextField textField) {
        textField.setBorder(new LineBorder(new Color(83, 81, 251), 3));
    }

    private void textBorderFocusLost(JTextField textField) {
        textField.setBorder(new LineBorder(new Color(235, 237, 255), 1));
    }
    private void KeyPress(java.awt.event.KeyEvent evt, String Opcion) {
        if (Opcion.equalsIgnoreCase("letra")) {
            char c = evt.getKeyChar();
            if (Character.isDigit(c)) {
                evt.consume(); // Consume el evento si el carácter no es un número
            }
        }
        if (Opcion.equalsIgnoreCase("numero")) {
            char c = evt.getKeyChar();
            if (!Character.isDigit(c)) {
                evt.consume(); // Consume el evento si el carácter no es un número
            }
        }

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelFull;
    private javax.swing.JPanel jPanelHead;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbIngresar;
    private javax.swing.JLabel jlabel_exit;
    private javax.swing.JTextField jtfIdBuscar;
    private javax.swing.JTextField jtfIdPass;
    private javax.swing.JTextField jtfIdUser;
    // End of variables declaration//GEN-END:variables
}
