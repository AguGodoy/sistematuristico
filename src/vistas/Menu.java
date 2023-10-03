package vistas;

import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        jcbABM.setVisible(false);JLabelABM.setVisible(false);
        setColor(btnDestino);
        indDestino.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarraLateral = new javax.swing.JPanel();
        btnDestino = new javax.swing.JPanel();
        indDestino = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnAlojamiento = new javax.swing.JPanel();
        indAlojamiento = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnTransoporte = new javax.swing.JPanel();
        indTransoporte = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btn_login = new javax.swing.JLabel();
        btnResumen = new javax.swing.JPanel();
        indResumen = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JLabel();
        jPanelMarcoArriba = new javax.swing.JPanel();
        jcbABM = new javax.swing.JComboBox<>();
        JLabelABM = new javax.swing.JLabel();
        jPanelMarcoAbajo = new javax.swing.JPanel();
        jPanelMarcoDerecha = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        Escritorio = new javax.swing.JDesktopPane()
        ;

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraLateral.setBackground(new java.awt.Color(23, 35, 51));
        BarraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDestino.setBackground(new java.awt.Color(23, 35, 51));
        btnDestino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDestinoMousePressed(evt);
            }
        });

        indDestino.setOpaque(false);
        indDestino.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout indDestinoLayout = new javax.swing.GroupLayout(indDestino);
        indDestino.setLayout(indDestinoLayout);
        indDestinoLayout.setHorizontalGroup(
            indDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        indDestinoLayout.setVerticalGroup(
            indDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Destino");

        javax.swing.GroupLayout btnDestinoLayout = new javax.swing.GroupLayout(btnDestino);
        btnDestino.setLayout(btnDestinoLayout);
        btnDestinoLayout.setHorizontalGroup(
            btnDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDestinoLayout.createSequentialGroup()
                .addComponent(indDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        btnDestinoLayout.setVerticalGroup(
            btnDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDestinoLayout.createSequentialGroup()
                .addComponent(indDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btnDestinoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        BarraLateral.add(btnDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 130, -1));

        btnAlojamiento.setBackground(new java.awt.Color(23, 35, 51));
        btnAlojamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAlojamientoMousePressed(evt);
            }
        });

        indAlojamiento.setOpaque(false);
        indAlojamiento.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout indAlojamientoLayout = new javax.swing.GroupLayout(indAlojamiento);
        indAlojamiento.setLayout(indAlojamientoLayout);
        indAlojamientoLayout.setHorizontalGroup(
            indAlojamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        indAlojamientoLayout.setVerticalGroup(
            indAlojamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Alojamiento");

        javax.swing.GroupLayout btnAlojamientoLayout = new javax.swing.GroupLayout(btnAlojamiento);
        btnAlojamiento.setLayout(btnAlojamientoLayout);
        btnAlojamientoLayout.setHorizontalGroup(
            btnAlojamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAlojamientoLayout.createSequentialGroup()
                .addComponent(indAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        btnAlojamientoLayout.setVerticalGroup(
            btnAlojamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAlojamientoLayout.createSequentialGroup()
                .addComponent(indAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btnAlojamientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        BarraLateral.add(btnAlojamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 130, -1));

        btnTransoporte.setBackground(new java.awt.Color(23, 35, 51));
        btnTransoporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTransoporteMousePressed(evt);
            }
        });

        indTransoporte.setOpaque(false);
        indTransoporte.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout indTransoporteLayout = new javax.swing.GroupLayout(indTransoporte);
        indTransoporte.setLayout(indTransoporteLayout);
        indTransoporteLayout.setHorizontalGroup(
            indTransoporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        indTransoporteLayout.setVerticalGroup(
            indTransoporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Transporte");

        javax.swing.GroupLayout btnTransoporteLayout = new javax.swing.GroupLayout(btnTransoporte);
        btnTransoporte.setLayout(btnTransoporteLayout);
        btnTransoporteLayout.setHorizontalGroup(
            btnTransoporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTransoporteLayout.createSequentialGroup()
                .addComponent(indTransoporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        btnTransoporteLayout.setVerticalGroup(
            btnTransoporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTransoporteLayout.createSequentialGroup()
                .addComponent(indTransoporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btnTransoporteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        BarraLateral.add(btnTransoporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 130, -1));

        btn_login.setBackground(new java.awt.Color(187, 187, 187));
        btn_login.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icon_Contacts_25px.png"))); // NOI18N
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_loginMousePressed(evt);
            }
        });
        BarraLateral.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, 70));

        btnResumen.setBackground(new java.awt.Color(23, 35, 51));
        btnResumen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnResumenMousePressed(evt);
            }
        });

        indResumen.setOpaque(false);
        indResumen.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout indResumenLayout = new javax.swing.GroupLayout(indResumen);
        indResumen.setLayout(indResumenLayout);
        indResumenLayout.setHorizontalGroup(
            indResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        indResumenLayout.setVerticalGroup(
            indResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Resumen");

        javax.swing.GroupLayout btnResumenLayout = new javax.swing.GroupLayout(btnResumen);
        btnResumen.setLayout(btnResumenLayout);
        btnResumenLayout.setHorizontalGroup(
            btnResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnResumenLayout.createSequentialGroup()
                .addComponent(indResumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        btnResumenLayout.setVerticalGroup(
            btnResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnResumenLayout.createSequentialGroup()
                .addComponent(indResumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btnResumenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        BarraLateral.add(btnResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 130, -1));

        btn_exit.setBackground(new java.awt.Color(187, 187, 187));
        btn_exit.setForeground(new java.awt.Color(187, 187, 186));
        btn_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icon_Exit_25px.png"))); // NOI18N
        btn_exit.setText("Salir");
        btn_exit.setToolTipText("");
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_exitMousePressed(evt);
            }
        });
        BarraLateral.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, -1, 46));

        getContentPane().add(BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 720));

        jPanelMarcoArriba.setBackground(new java.awt.Color(23, 35, 51));
        jPanelMarcoArriba.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelMarcoArribaMouseDragged(evt);
            }
        });
        jPanelMarcoArriba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelMarcoArribaMousePressed(evt);
            }
        });

        jcbABM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        JLabelABM.setForeground(new java.awt.Color(187, 187, 186));
        JLabelABM.setText("ABM de");

        javax.swing.GroupLayout jPanelMarcoArribaLayout = new javax.swing.GroupLayout(jPanelMarcoArriba);
        jPanelMarcoArriba.setLayout(jPanelMarcoArribaLayout);
        jPanelMarcoArribaLayout.setHorizontalGroup(
            jPanelMarcoArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMarcoArribaLayout.createSequentialGroup()
                .addContainerGap(999, Short.MAX_VALUE)
                .addComponent(JLabelABM)
                .addGap(18, 18, 18)
                .addComponent(jcbABM, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanelMarcoArribaLayout.setVerticalGroup(
            jPanelMarcoArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMarcoArribaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMarcoArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbABM, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(JLabelABM))
                .addContainerGap())
        );

        getContentPane().add(jPanelMarcoArriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 40));

        jPanelMarcoAbajo.setBackground(new java.awt.Color(23, 35, 51));

        javax.swing.GroupLayout jPanelMarcoAbajoLayout = new javax.swing.GroupLayout(jPanelMarcoAbajo);
        jPanelMarcoAbajo.setLayout(jPanelMarcoAbajoLayout);
        jPanelMarcoAbajoLayout.setHorizontalGroup(
            jPanelMarcoAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        jPanelMarcoAbajoLayout.setVerticalGroup(
            jPanelMarcoAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelMarcoAbajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 680, -1, -1));

        jPanelMarcoDerecha.setBackground(new java.awt.Color(23, 35, 51));

        javax.swing.GroupLayout jPanelMarcoDerechaLayout = new javax.swing.GroupLayout(jPanelMarcoDerecha);
        jPanelMarcoDerecha.setLayout(jPanelMarcoDerechaLayout);
        jPanelMarcoDerechaLayout.setHorizontalGroup(
            jPanelMarcoDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanelMarcoDerechaLayout.setVerticalGroup(
            jPanelMarcoDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelMarcoDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 40, 40, 640));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1110, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Escritorio)
                .addGap(0, 0, 0))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 1110, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int xx, xy;
    private void jPanelMarcoArribaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMarcoArribaMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanelMarcoArribaMousePressed

    private void jPanelMarcoArribaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMarcoArribaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanelMarcoArribaMouseDragged

    private void btn_loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMousePressed
        jcbABM.setVisible(true);
        JLabelABM.setVisible(true);
    }//GEN-LAST:event_btn_loginMousePressed

    private void btnDestinoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDestinoMousePressed
        setColor(btnDestino);
        indDestino.setOpaque(true);
        resetColor(new JPanel[]{btnAlojamiento, btnTransoporte, btnResumen}, new JPanel[]{indAlojamiento, indTransoporte, indResumen});
    }//GEN-LAST:event_btnDestinoMousePressed

    private void btnTransoporteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransoporteMousePressed
        setColor(btnTransoporte);
        indTransoporte.setOpaque(true);
        resetColor(new JPanel[]{btnAlojamiento, btnDestino, btnResumen}, new JPanel[]{indAlojamiento, indDestino, indResumen});
    }//GEN-LAST:event_btnTransoporteMousePressed

    private void btnAlojamientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlojamientoMousePressed
        setColor(btnAlojamiento);
        indAlojamiento.setOpaque(true);
        resetColor(new JPanel[]{btnDestino, btnTransoporte, btnResumen}, new JPanel[]{indDestino, indTransoporte, indResumen});
        // Test frame = new Test();
        //InvocarJInternalFrame(frame);
    }//GEN-LAST:event_btnAlojamientoMousePressed

    private void btnResumenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResumenMousePressed
        setColor(btnResumen);
        indResumen.setOpaque(true);
        resetColor(new JPanel[]{btnDestino, btnAlojamiento, btnTransoporte,}, new JPanel[]{indDestino, indAlojamiento, indTransoporte});  
        InvocarJInternalFrame(new ABMCiudad());
    }//GEN-LAST:event_btnResumenMousePressed

    private void btn_exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMousePressed
        System.exit(0);
    }//GEN-LAST:event_btn_exitMousePressed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    private void setColor(JPanel pane) {
        pane.setBackground(new Color(41, 57, 80));
    }

    private void resetColor(JPanel[] pane, JPanel[] indicators) {
        for (int i = 0; i < pane.length; i++) {
            pane[i].setBackground(new Color(23, 35, 51));

        }
        for (int i = 0; i < indicators.length; i++) {
            indicators[i].setOpaque(false);
        }

    }

    private void InvocarJInternalFrame(JInternalFrame frame) {
        BasicInternalFrameUI ui = (BasicInternalFrameUI) frame.getUI();
        ui.setNorthPane(null);
        frame.setBorder(null); // Elimina el borde
        frame.setClosable(false); // Desactiva la opción de cerrar
        frame.setIconifiable(false); // Desactiva la opción de minimizar
        frame.setOpaque(true); // Hace que el contenido sea opaco
        frame.setSize(Escritorio.getSize()); // Establece el tamaño igual al del desktopPane
        frame.setVisible(true); // Lo hace visible
        Escritorio.add(frame); // Agrega el JInternalFrame al JDesktopPane
    }
     // <editor-fold defaultstate="collapsed" desc="Declaracion de Variables">    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraLateral;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JLabel JLabelABM;
    private javax.swing.JPanel btnAlojamiento;
    private javax.swing.JPanel btnDestino;
    private javax.swing.JPanel btnResumen;
    private javax.swing.JPanel btnTransoporte;
    private javax.swing.JLabel btn_exit;
    private javax.swing.JLabel btn_login;
    private javax.swing.JPanel indAlojamiento;
    private javax.swing.JPanel indDestino;
    private javax.swing.JPanel indResumen;
    private javax.swing.JPanel indTransoporte;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelMarcoAbajo;
    private javax.swing.JPanel jPanelMarcoArriba;
    private javax.swing.JPanel jPanelMarcoDerecha;
    private javax.swing.JComboBox<String> jcbABM;
    // End of variables declaration//GEN-END:variables
// </editor-fold>
}
