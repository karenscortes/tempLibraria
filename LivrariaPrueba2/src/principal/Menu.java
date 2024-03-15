
package principal;


import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import utils.BaseDatos;


public class Menu extends javax.swing.JFrame {
    
    private String[] imagenes = new String[6];
    private int posicionActual = 0;
    BaseDatos baseDatos = new BaseDatos();
    public Menu() {
        imagenes[0] = "/imagenesLibros/img1.jpg";
        imagenes[1] = "/imagenesLibros/img2.jpg";
        imagenes[2] = "/imagenesLibros/img3.jpg";
        imagenes[3] = "/imagenesLibros/img4.jpg";
        imagenes[4] = "/imagenesLibros/img5.jpg";
        imagenes[5] = "/imagenesLibros/img6.jpg";
        initComponents();
        initAlternComponents();  
        mostrarImagenes(0);
    }
    
    public void initAlternComponents(){
        setTitle("Menu"); 
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        
        Image icon_user = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_user.png"));
        icon_user = icon_user.getScaledInstance(110, 110, Image.SCALE_SMOOTH);
        etqIconUser.setIcon(new ImageIcon(icon_user));
        
        Image icon_facebook = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_facebook.png"));
        icon_facebook = icon_facebook.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        etqIconFacebook.setIcon(new ImageIcon(icon_facebook));
        
        Image icon_instagram = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_instagram.png"));
        icon_instagram = icon_instagram.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        etqIconInstagram.setIcon(new ImageIcon(icon_instagram));
        
        Image icon_twitter = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_twitter.png"));
        icon_twitter = icon_twitter.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        etqIconTwitter.setIcon(new ImageIcon(icon_twitter));
        
        revalidate();
    }
    
    
    public void mostrarImagenes(int posicion){
        for(int i=0; i<3; i++){
            String img = imagenes[(posicion + i) % imagenes.length];
            
            Image image = getToolkit().createImage(getClass().getResource(img));
            image = image.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
            
            switch(i){
                
                case 0:
                    etqImagen1.setIcon(new ImageIcon(image));
                    break;
                case 1: 
                    etqImagen2.setIcon(new ImageIcon(image));
                    break;
                case 2:
                    etqImagen3.setIcon(new ImageIcon(image));
                    break;
            
            }
        }
            
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        panelRounde1 = new components.PanelRounde();
        etqIconUser = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        btnRegistroUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        etqIconFacebook = new javax.swing.JLabel();
        etqIconTwitter = new javax.swing.JLabel();
        etqIconInstagram = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        contenedorPrincipal = new components.PanelRounde();
        etqLupa = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        etqImagen1 = new javax.swing.JLabel();
        etqImagen2 = new javax.swing.JLabel();
        etqImagen3 = new javax.swing.JLabel();
        etqIzquierda = new javax.swing.JLabel();
        etqDerecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setOpaque(false);

        panel2.setBackground(new java.awt.Color(0, 255, 255));

        panelRounde1.setBackground(new java.awt.Color(255, 255, 255));
        panelRounde1.setOpaque(false);
        panelRounde1.setRoundBottomLeft(50);
        panelRounde1.setRoundBottomRight(50);
        panelRounde1.setRoundTopLeft(50);
        panelRounde1.setRoundTopRight(50);

        etqIconUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqIconUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        etqIconUser.setMaximumSize(new java.awt.Dimension(50, 50));
        etqIconUser.setMinimumSize(new java.awt.Dimension(50, 50));

        btnIniciarSesion.setBackground(new java.awt.Color(0, 0, 0));
        btnIniciarSesion.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        btnRegistroUsuario.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistroUsuario.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnRegistroUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistroUsuario.setText("Registrarse");
        btnRegistroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Síguenos:");

        etqIconFacebook.setForeground(new java.awt.Color(0, 0, 0));
        etqIconFacebook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etqIconTwitter.setForeground(new java.awt.Color(0, 0, 0));
        etqIconTwitter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etqIconInstagram.setForeground(new java.awt.Color(0, 0, 0));
        etqIconInstagram.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelRounde1Layout = new javax.swing.GroupLayout(panelRounde1);
        panelRounde1.setLayout(panelRounde1Layout);
        panelRounde1Layout.setHorizontalGroup(
            panelRounde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRounde1Layout.createSequentialGroup()
                .addGroup(panelRounde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRounde1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelRounde1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelRounde1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRounde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRounde1Layout.createSequentialGroup()
                        .addComponent(etqIconFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etqIconInstagram, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etqIconTwitter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(panelRounde1Layout.createSequentialGroup()
                        .addComponent(btnRegistroUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(panelRounde1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(etqIconUser, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );
        panelRounde1Layout.setVerticalGroup(
            panelRounde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRounde1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(etqIconUser, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnRegistroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(panelRounde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqIconFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqIconTwitter, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqIconInstagram, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRounde1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRounde1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelPrincipal.setBackground(new java.awt.Color(0, 255, 255));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenedorPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        contenedorPrincipal.setOpaque(false);
        contenedorPrincipal.setRoundBottomLeft(50);
        contenedorPrincipal.setRoundBottomRight(50);
        contenedorPrincipal.setRoundTopLeft(50);
        contenedorPrincipal.setRoundTopRight(50);
        contenedorPrincipal.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                contenedorPrincipalComponentAdded(evt);
            }
        });
        contenedorPrincipal.setLayout(null);

        etqLupa.setBackground(new java.awt.Color(255, 255, 255));
        etqLupa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contenedorPrincipal.add(etqLupa);
        etqLupa.setBounds(12, 12, 40, 42);

        jTextField1.setBackground(new java.awt.Color(188, 225, 233));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setText("Ej: Ingrese título, autor, editorial o categoría");
        jTextField1.setBorder(null);
        jTextField1.setCaretColor(new java.awt.Color(204, 204, 204));
        contenedorPrincipal.add(jTextField1);
        jTextField1.setBounds(60, 23, 290, 30);

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        contenedorPrincipal.add(btnBuscar);
        btnBuscar.setBounds(370, 20, 90, 30);

        etqImagen1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contenedorPrincipal.add(etqImagen1);
        etqImagen1.setBounds(70, 130, 97, 157);

        etqImagen2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contenedorPrincipal.add(etqImagen2);
        etqImagen2.setBounds(190, 130, 97, 157);

        etqImagen3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contenedorPrincipal.add(etqImagen3);
        etqImagen3.setBounds(310, 130, 100, 157);

        etqIzquierda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqIzquierda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etqIzquierdaMouseClicked(evt);
            }
        });
        contenedorPrincipal.add(etqIzquierda);
        etqIzquierda.setBounds(12, 188, 40, 39);

        etqDerecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqDerecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etqDerechaMouseClicked(evt);
            }
        });
        contenedorPrincipal.add(etqDerecha);
        etqDerecha.setBounds(420, 190, 40, 37);

        panelPrincipal.add(contenedorPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 480, 460));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //imagenes Contenedor Principal
    private void contenedorPrincipalComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_contenedorPrincipalComponentAdded
        Image icon_lupa = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_lupa.png"));
        icon_lupa = icon_lupa.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        etqLupa.setIcon(new ImageIcon(icon_lupa)); 
        
        Image icon_flechaIzquierda = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_flechaIzquierda.png"));
        icon_flechaIzquierda = icon_flechaIzquierda.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        etqIzquierda.setIcon(new ImageIcon(icon_flechaIzquierda)); 
        
        Image icon_flechaDerecha = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_flechaDerecha.png"));
        icon_flechaDerecha = icon_flechaDerecha.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        etqDerecha.setIcon(new ImageIcon(icon_flechaDerecha)); 
    }//GEN-LAST:event_contenedorPrincipalComponentAdded

    //Manipular slider derecha
    private void etqDerechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etqDerechaMouseClicked
        posicionActual = (posicionActual +1 )% imagenes.length;
        mostrarImagenes(posicionActual);
    }//GEN-LAST:event_etqDerechaMouseClicked

    //Manipular slider Izquierda
    private void etqIzquierdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etqIzquierdaMouseClicked
        posicionActual = (posicionActual -1 + imagenes.length) % imagenes.length;
        mostrarImagenes(posicionActual);
    }//GEN-LAST:event_etqIzquierdaMouseClicked

    private void btnRegistroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroUsuarioActionPerformed
        RegistroUsuario nuevo = new RegistroUsuario(baseDatos);

        nuevo.setPreferredSize(panelPrincipal.getPreferredSize());
        nuevo.setSize(panelPrincipal.getSize());

        contenedorPrincipal.removeAll();
        contenedorPrincipal.add(nuevo);

        repaint();
        revalidate();
    }//GEN-LAST:event_btnRegistroUsuarioActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        IniciarSesion nuevo = new IniciarSesion(baseDatos);

        nuevo.setPreferredSize(panelPrincipal.getPreferredSize());
        nuevo.setSize(panelPrincipal.getSize());

        contenedorPrincipal.removeAll();
        contenedorPrincipal.add(nuevo);

        repaint();
        revalidate();
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRegistroUsuario;
    private components.PanelRounde contenedorPrincipal;
    private javax.swing.JLabel etqDerecha;
    private javax.swing.JLabel etqIconFacebook;
    private javax.swing.JLabel etqIconInstagram;
    private javax.swing.JLabel etqIconTwitter;
    private javax.swing.JLabel etqIconUser;
    private javax.swing.JLabel etqImagen1;
    private javax.swing.JLabel etqImagen2;
    private javax.swing.JLabel etqImagen3;
    private javax.swing.JLabel etqIzquierda;
    private javax.swing.JLabel etqLupa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panelPrincipal;
    private components.PanelRounde panelRounde1;
    // End of variables declaration//GEN-END:variables

}


