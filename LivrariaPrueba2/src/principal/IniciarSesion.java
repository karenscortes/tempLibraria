
package principal;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import utils.BaseDatos;


public class IniciarSesion extends javax.swing.JPanel {
    BaseDatos baseDatos;
    private String correo;
    private String password;
    
    public IniciarSesion(BaseDatos baseDatos) {
        this.baseDatos = baseDatos;
       initComponents();
       initAlterComponents();    
    }
    
    public void initAlterComponents(){
        Image icon_userRegistro = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_userRegistro.png"));
        icon_userRegistro = icon_userRegistro.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        etqImageUser.setIcon(new ImageIcon(icon_userRegistro));
    }
      
    public boolean validarCredenciales(){
       Boolean respuesta = false;
       String validacion[] = baseDatos.consultaLogin(this.correo);
       if(validacion != null){
            if(validacion[0].equals(correo) && validacion[1].equals(password)){
                respuesta = true;
                return respuesta;  
            }
        }   
       return respuesta; 
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelRounde1 = new components.PanelRounde();
        etqTituloIniciar = new javax.swing.JLabel();
        etqUser = new javax.swing.JLabel();
        campoUserName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        etqUser1 = new javax.swing.JLabel();
        campoContrasenia = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        etqOlvidoContrasenia = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JPanel();
        etqBtnIngresar = new javax.swing.JLabel();
        etqImageUser = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        panelRounde1.setBackground(new java.awt.Color(255, 255, 255));
        panelRounde1.setOpaque(false);
        panelRounde1.setPreferredSize(new java.awt.Dimension(320, 400));
        panelRounde1.setRoundBottomLeft(50);
        panelRounde1.setRoundBottomRight(50);
        panelRounde1.setRoundTopLeft(50);
        panelRounde1.setRoundTopRight(50);
        panelRounde1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etqTituloIniciar.setBackground(new java.awt.Color(255, 255, 255));
        etqTituloIniciar.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        etqTituloIniciar.setForeground(new java.awt.Color(0, 0, 0));
        etqTituloIniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTituloIniciar.setText("Iniciar Sesión");
        panelRounde1.add(etqTituloIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 155, 32));

        etqUser.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etqUser.setForeground(new java.awt.Color(0, 0, 0));
        etqUser.setText("Email:");
        panelRounde1.add(etqUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 183, 67, -1));

        campoUserName.setBackground(new java.awt.Color(255, 255, 255));
        campoUserName.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        campoUserName.setForeground(new java.awt.Color(153, 153, 153));
        campoUserName.setText("Ingrese su nombre de usuario");
        campoUserName.setBorder(null);
        campoUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campoUserNameMousePressed(evt);
            }
        });
        panelRounde1.add(campoUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 214, 270, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        panelRounde1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 236, 283, 10));

        etqUser1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etqUser1.setForeground(new java.awt.Color(0, 0, 0));
        etqUser1.setText("Contraseña:");
        panelRounde1.add(etqUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 252, 106, -1));

        campoContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        campoContrasenia.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        campoContrasenia.setForeground(new java.awt.Color(153, 153, 153));
        campoContrasenia.setText("********");
        campoContrasenia.setBorder(null);
        campoContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campoContraseniaMousePressed(evt);
            }
        });
        panelRounde1.add(campoContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 277, 283, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        panelRounde1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 300, 283, 10));

        etqOlvidoContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        etqOlvidoContrasenia.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        etqOlvidoContrasenia.setForeground(new java.awt.Color(0, 0, 0));
        etqOlvidoContrasenia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqOlvidoContrasenia.setText("¿Ha olvidado su contraseña?");
        panelRounde1.add(etqOlvidoContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 322, -1, -1));

        btnIniciar.setBackground(new java.awt.Color(0, 0, 0));
        btnIniciar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etqBtnIngresar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etqBtnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        etqBtnIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqBtnIngresar.setText("INGRESAR");
        etqBtnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etqBtnIngresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etqBtnIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                etqBtnIngresarMouseExited(evt);
            }
        });
        btnIniciar.add(etqBtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        panelRounde1.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, 40));

        etqImageUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelRounde1.add(etqImageUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 120, 100));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panelRounde1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRounde1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void etqBtnIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etqBtnIngresarMouseEntered
        btnIniciar.setBackground(new Color(138,226,224,255));
        etqBtnIngresar.setForeground(new Color(0,0,0,255));
    }//GEN-LAST:event_etqBtnIngresarMouseEntered

    private void etqBtnIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etqBtnIngresarMouseExited
        btnIniciar.setBackground(new Color(0,0,0,255));
        etqBtnIngresar.setForeground(new Color(255,255,255,255));     
    }//GEN-LAST:event_etqBtnIngresarMouseExited

    private void campoUserNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoUserNameMousePressed
         if(campoUserName.getText().equals("Ingrese su nombre de usuario")){
            campoUserName.setText("");
            campoUserName.setForeground(Color.black);
        }
        if (String.valueOf(campoContrasenia.getPassword()).isEmpty()){
            campoContrasenia.setText("********");
            campoContrasenia.setForeground(Color.gray);
        }
    }//GEN-LAST:event_campoUserNameMousePressed

    private void campoContraseniaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoContraseniaMousePressed
         if(String.valueOf(campoContrasenia.getPassword()).equals("********")){
            campoContrasenia.setText("");
            campoContrasenia.setForeground(Color.black);
        }
        if(campoUserName.getText().isEmpty()) {
            campoUserName.setText("Ingrese su nombre de usuario");
            campoUserName.setForeground(Color.gray);
        }
    }//GEN-LAST:event_campoContraseniaMousePressed

    private void etqBtnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etqBtnIngresarMouseClicked
        correo = campoUserName.getText(); 
        char passwor []= campoContrasenia.getPassword();  
        password = new String(passwor);
        
        campoUserName.setText("Ingrese su nombre de usuario");
        campoUserName.setForeground(Color.gray);
        campoContrasenia.setText("********");
        campoContrasenia.setForeground(Color.gray);
        panelRounde1.requestFocus();
  
        boolean band = validarCredenciales();
        if(band){
            System.out.println("Las credenciales coinciden");
        }else{
            System.out.println("Error -> Usuario y contraseñas incorrectos");
        }
    }//GEN-LAST:event_etqBtnIngresarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnIniciar;
    private javax.swing.JPasswordField campoContrasenia;
    private javax.swing.JTextField campoUserName;
    private javax.swing.JLabel etqBtnIngresar;
    private javax.swing.JLabel etqImageUser;
    private javax.swing.JLabel etqOlvidoContrasenia;
    private javax.swing.JLabel etqTituloIniciar;
    private javax.swing.JLabel etqUser;
    private javax.swing.JLabel etqUser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private components.PanelRounde panelRounde1;
    // End of variables declaration//GEN-END:variables
}
