package vistas;

import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import sistematuristico.AccesoData.PaqueteData;
import sistematuristico.Entidades.*;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        InvocarJInternalFrame(new Idle());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarraLateral = new javax.swing.JPanel();
        BarraLateralHead = new javax.swing.JPanel();
        btn_login = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnDestino = new javax.swing.JPanel();
        indDestino = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnAlojamiento = new javax.swing.JPanel();
        indAlojamiento = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnTransoporte = new javax.swing.JPanel();
        indTransoporte = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnResumen = new javax.swing.JPanel();
        indResumen = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JPanel();
        indExit = new javax.swing.JPanel();
        jlabel_exit = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanelMarcoArriba = new javax.swing.JPanel();
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

        BarraLateral.setBackground(new java.awt.Color(47, 52, 67));
        BarraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraLateralHead.setBackground(new java.awt.Color(47, 52, 67));

        btn_login.setBackground(new java.awt.Color(187, 187, 187));
        btn_login.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btn_login.setForeground(new java.awt.Color(235, 237, 255));
        btn_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo.png"))); // NOI18N
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_loginMousePressed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(187, 187, 186));
        jSeparator1.setForeground(new java.awt.Color(187, 187, 186));

        javax.swing.GroupLayout BarraLateralHeadLayout = new javax.swing.GroupLayout(BarraLateralHead);
        BarraLateralHead.setLayout(BarraLateralHeadLayout);
        BarraLateralHeadLayout.setHorizontalGroup(
            BarraLateralHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLateralHeadLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(BarraLateralHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BarraLateralHeadLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        BarraLateralHeadLayout.setVerticalGroup(
            BarraLateralHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraLateralHeadLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        BarraLateral.add(BarraLateralHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 150));

        btnDestino.setBackground(new java.awt.Color(47, 52, 67));
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

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/alfiler.png"))); // NOI18N
        jLabel8.setText("   Destino      ");

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

        BarraLateral.add(btnDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 240, -1));

        btnAlojamiento.setBackground(new java.awt.Color(47, 52, 67));
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

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/hotel (2).png"))); // NOI18N
        jLabel10.setText("  Alojamiento");

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

        BarraLateral.add(btnAlojamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 240, -1));

        btnTransoporte.setBackground(new java.awt.Color(47, 52, 67));
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

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/transporte (1).png"))); // NOI18N
        jLabel11.setText("  Transporte ");

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

        BarraLateral.add(btnTransoporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 240, -1));

        btnResumen.setBackground(new java.awt.Color(47, 52, 67));
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

        jLabel12.setBackground(new java.awt.Color(47, 52, 67));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/visa.png"))); // NOI18N
        jLabel12.setText("  Resumen   ");

        javax.swing.GroupLayout btnResumenLayout = new javax.swing.GroupLayout(btnResumen);
        btnResumen.setLayout(btnResumenLayout);
        btnResumenLayout.setHorizontalGroup(
            btnResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnResumenLayout.createSequentialGroup()
                .addComponent(indResumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
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

        BarraLateral.add(btnResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 240, -1));

        btnSalir.setBackground(new java.awt.Color(47, 52, 67));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSalirMousePressed(evt);
            }
        });

        indExit.setOpaque(false);
        indExit.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout indExitLayout = new javax.swing.GroupLayout(indExit);
        indExit.setLayout(indExitLayout);
        indExitLayout.setHorizontalGroup(
            indExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        indExitLayout.setVerticalGroup(
            indExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jlabel_exit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlabel_exit.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/salida (1).png"))); // NOI18N
        jlabel_exit.setText("  Salir");

        javax.swing.GroupLayout btnSalirLayout = new javax.swing.GroupLayout(btnSalir);
        btnSalir.setLayout(btnSalirLayout);
        btnSalirLayout.setHorizontalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSalirLayout.createSequentialGroup()
                .addComponent(indExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jlabel_exit, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        btnSalirLayout.setVerticalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSalirLayout.createSequentialGroup()
                .addComponent(indExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
            .addGroup(btnSalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabel_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        BarraLateral.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 240, -1));

        jSeparator2.setBackground(new java.awt.Color(187, 187, 186));
        jSeparator2.setForeground(new java.awt.Color(187, 187, 186));
        BarraLateral.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 612, 190, -1));

        getContentPane().add(BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 720));

        jPanelMarcoArriba.setBackground(new java.awt.Color(47, 52, 67));
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

        javax.swing.GroupLayout jPanelMarcoArribaLayout = new javax.swing.GroupLayout(jPanelMarcoArriba);
        jPanelMarcoArriba.setLayout(jPanelMarcoArribaLayout);
        jPanelMarcoArribaLayout.setHorizontalGroup(
            jPanelMarcoArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        jPanelMarcoArribaLayout.setVerticalGroup(
            jPanelMarcoArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelMarcoArriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 60));

        jPanelMarcoAbajo.setBackground(new java.awt.Color(47, 52, 67));

        javax.swing.GroupLayout jPanelMarcoAbajoLayout = new javax.swing.GroupLayout(jPanelMarcoAbajo);
        jPanelMarcoAbajo.setLayout(jPanelMarcoAbajoLayout);
        jPanelMarcoAbajoLayout.setHorizontalGroup(
            jPanelMarcoAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanelMarcoAbajoLayout.setVerticalGroup(
            jPanelMarcoAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelMarcoAbajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 700, 1000, 20));

        jPanelMarcoDerecha.setBackground(new java.awt.Color(47, 52, 67));

        javax.swing.GroupLayout jPanelMarcoDerechaLayout = new javax.swing.GroupLayout(jPanelMarcoDerecha);
        jPanelMarcoDerecha.setLayout(jPanelMarcoDerechaLayout);
        jPanelMarcoDerechaLayout.setHorizontalGroup(
            jPanelMarcoDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanelMarcoDerechaLayout.setVerticalGroup(
            jPanelMarcoDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelMarcoDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 40, 720));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        Escritorio.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                EscritorioComponentAdded(evt);
            }
        });

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 1000, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int xx, xy;
    PaqueteData paqueteData = new PaqueteData();
    static Paquete paquete = new Paquete();
    static int InternalNum;
    static int guardarIdAlojamiento;
    static int guardarIdTransporte;

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
        try {
            String title = "Administracion / Seleccion de paquete";
            String message = "Si entra a Administracion/Seleccion de Paquete puede perder el progreso del paquete\n"
                    + "Esta seguro que quiere entrar a Administracion y Seleccion de Paquete?";
            int respuesta = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                Escritorio.removeAll();
            InvocarJInternalFrame(new Idle());
            InvocarJInternalFrame(new Login());
            }

            
        }catch (Exception e) {
            System.out.println("Error");
    }

    }//GEN-LAST:event_btn_loginMousePressed

    private void btnDestinoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDestinoMousePressed
        InternalNum = 1;
        SelecCiudad();
        Escritorio.removeAll();
        Escritorio.repaint();
        InvocarJInternalFrame(new SeleccionCiudad());
    }//GEN-LAST:event_btnDestinoMousePressed

    private void btnTransoporteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransoporteMousePressed
        if (InternalNum > 3) {
            InternalNum = 3;
            SelecTransporte();
            InvocarJInternalFrame(new SeleccionTransporte());
        }
    }//GEN-LAST:event_btnTransoporteMousePressed

    private void btnAlojamientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlojamientoMousePressed
        if (InternalNum > 2) {
            InternalNum = 2;
            SelecAlojamiento();
            InvocarJInternalFrame(new SeleccionAlojamiento());
        }
    }//GEN-LAST:event_btnAlojamientoMousePressed

    private void btnResumenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResumenMousePressed
        if (InternalNum > 4) {
            InternalNum = 4;
            SelecResumen();
            InvocarJInternalFrame(new ResumenPaquete());
        }
    }//GEN-LAST:event_btnResumenMousePressed

    private void btnSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMousePressed
        System.exit(0);
    }//GEN-LAST:event_btnSalirMousePressed

    private void EscritorioComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_EscritorioComponentAdded
        switch (InternalNum) {
            case 1:
                SelecCiudad();
                break;
            case 2:
                SelecAlojamiento();
                break;
            case 3:
                SelecTransporte();
                break;
            case 4:
                SelecResumen();
                break;
            default:
                resetColor(new JPanel[]{btnDestino, btnAlojamiento, btnTransoporte, btnResumen}, new JPanel[]{indDestino, indAlojamiento, indTransoporte, indResumen});
        }

    }//GEN-LAST:event_EscritorioComponentAdded

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
            java.util.logging.Logger.getLogger(Menu.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        pane.setBackground(new Color(83, 81, 251));
    }

    private void resetColor(JPanel[] pane, JPanel[] indicators) {
        for (int i = 0; i < pane.length; i++) {
            pane[i].setBackground(new Color(47, 52, 67));

        }
        for (int i = 0; i < indicators.length; i++) {
            indicators[i].setOpaque(false);
        }

    }

    private void SelecCiudad() {
        setColor(btnDestino);
        indDestino.setOpaque(true);
        resetColor(new JPanel[]{btnAlojamiento, btnTransoporte, btnResumen}, new JPanel[]{indAlojamiento, indTransoporte, indResumen});
    }

    private void SelecAlojamiento() {
        setColor(btnAlojamiento);
        indAlojamiento.setOpaque(true);
        resetColor(new JPanel[]{btnDestino, btnTransoporte, btnResumen}, new JPanel[]{indDestino, indTransoporte, indResumen});
    }

    private void SelecTransporte() {
        setColor(btnTransoporte);
        indTransoporte.setOpaque(true);
        resetColor(new JPanel[]{btnAlojamiento, btnDestino, btnResumen}, new JPanel[]{indAlojamiento, indDestino, indResumen});
    }

    private void SelecResumen() {
        setColor(btnResumen);
        indResumen.setOpaque(true);
        resetColor(new JPanel[]{btnDestino, btnAlojamiento, btnTransoporte,}, new JPanel[]{indDestino, indAlojamiento, indTransoporte});
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
        frame.moveToFront();
    }
    // <editor-fold defaultstate="collapsed" desc="Declaracion de Variables">    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraLateral;
    private javax.swing.JPanel BarraLateralHead;
    public static javax.swing.JDesktopPane Escritorio;
    private javax.swing.JPanel btnAlojamiento;
    private javax.swing.JPanel btnDestino;
    private javax.swing.JPanel btnResumen;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JPanel btnTransoporte;
    private javax.swing.JLabel btn_login;
    private javax.swing.JPanel indAlojamiento;
    private javax.swing.JPanel indDestino;
    private javax.swing.JPanel indExit;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlabel_exit;
    // End of variables declaration//GEN-END:variables
// </editor-fold>
}
