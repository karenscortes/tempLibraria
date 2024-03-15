
package principal;

import java.awt.Image;
import javax.swing.ImageIcon;
import utils.BaseDatos;


public class RegistroUsuario extends javax.swing.JPanel {

    BaseDatos baseDatos;
    String tipoUsuario;
    
    public RegistroUsuario(BaseDatos baseDatos) {
        this.baseDatos = baseDatos;
        initComponents();
        initAlterComponents();
        
    }
    
    public void initAlterComponents(){
        
        Image icon_userRegistro = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_userRegistro.png"));
        icon_userRegistro = icon_userRegistro.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        etqIconRegistroUser.setIcon(new ImageIcon(icon_userRegistro));
        
        Image icon_carta = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_carta.png"));
        icon_carta = icon_carta.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        etqIconCorreo.setIcon(new ImageIcon(icon_carta));
        
        Image icon_candado = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icon_candado.png"));
        icon_candado = icon_candado.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        etqIconContrasenia.setIcon(new ImageIcon(icon_candado));
    
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelRounde1 = new components.PanelRounde();
        etaTitulo = new javax.swing.JLabel();
        etqNombre = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        etqIconRegistroUser = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        campoTelefono = new javax.swing.JTextField();
        etqTelefono = new javax.swing.JLabel();
        etqCorreo = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        etqIconCorreo = new javax.swing.JLabel();
        etqCorreo1 = new javax.swing.JLabel();
        campoContrasenia = new javax.swing.JTextField();
        etqIconContrasenia = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btnRegistrarUser = new javax.swing.JButton();
        selectTipo = new javax.swing.JComboBox<>();
        etqTelefono1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        panelRounde1.setBackground(new java.awt.Color(255, 255, 255));
        panelRounde1.setOpaque(false);
        panelRounde1.setRoundBottomLeft(50);
        panelRounde1.setRoundBottomRight(50);
        panelRounde1.setRoundTopLeft(50);
        panelRounde1.setRoundTopRight(50);

        etaTitulo.setBackground(new java.awt.Color(255, 255, 255));
        etaTitulo.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        etaTitulo.setForeground(new java.awt.Color(0, 0, 0));
        etaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etaTitulo.setText("Registrarse");

        etqNombre.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etqNombre.setForeground(new java.awt.Color(0, 0, 0));
        etqNombre.setText("Nombre:");

        campoNombre.setBackground(new java.awt.Color(255, 255, 255));
        campoNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campoNombre.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        etqIconRegistroUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        campoTelefono.setBackground(new java.awt.Color(255, 255, 255));
        campoTelefono.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campoTelefono.setBorder(null);

        etqTelefono.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etqTelefono.setForeground(new java.awt.Color(0, 0, 0));
        etqTelefono.setText("Teléfono:");

        etqCorreo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etqCorreo.setForeground(new java.awt.Color(0, 0, 0));
        etqCorreo.setText("Correo:");

        campoCorreo.setBackground(new java.awt.Color(255, 255, 255));
        campoCorreo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campoCorreo.setBorder(null);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        etqIconCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etqCorreo1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etqCorreo1.setForeground(new java.awt.Color(0, 0, 0));
        etqCorreo1.setText("Contraseña:");

        campoContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        campoContrasenia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campoContrasenia.setBorder(null);

        etqIconContrasenia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        btnRegistrarUser.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrarUser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRegistrarUser.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarUser.setText("REGISTRARSE");
        btnRegistrarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUserActionPerformed(evt);
            }
        });

        selectTipo.setBackground(new java.awt.Color(102, 255, 204));
        selectTipo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        selectTipo.setForeground(new java.awt.Color(0, 0, 0));
        selectTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Cliente" }));
        selectTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTipoActionPerformed(evt);
            }
        });

        etqTelefono1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etqTelefono1.setForeground(new java.awt.Color(0, 0, 0));
        etqTelefono1.setText("Tipo de Usuario:");

        javax.swing.GroupLayout panelRounde1Layout = new javax.swing.GroupLayout(panelRounde1);
        panelRounde1.setLayout(panelRounde1Layout);
        panelRounde1Layout.setHorizontalGroup(
            panelRounde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRounde1Layout.createSequentialGroup()
                .addGroup(panelRounde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRounde1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panelRounde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRounde1Layout.createSequentialGroup()
                                .addComponent(etqNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etqIconRegistroUser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRounde1Layout.createSequentialGroup()
                                .addGroup(panelRounde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoContrasenia)
                                    .addGroup(panelRounde1Layout.createSequentialGroup()
                                        .addComponent(etqCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etqIconContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRounde1Layout.createSequentialGroup()
                                .addGroup(panelRounde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelRounde1Layout.createSequentialGroup()
                                        .addGroup(panelRounde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoTelefono))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelRounde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(selectTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(etqTelefono1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))
                                    .addGroup(panelRounde1Layout.createSequentialGroup()
                                        .addGroup(panelRounde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoCorreo)
                                            .addGroup(panelRounde1Layout.createSequentialGroup()
                                                .addComponent(etqCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(etqIconCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(15, 15, 15))))
                    .addGroup(panelRounde1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(etaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRounde1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnRegistrarUser)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        panelRounde1Layout.setVerticalGroup(
            panelRounde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRounde1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelRounde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etqIconRegistroUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(panelRounde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etqTelefono)
                    .addComponent(etqTelefono1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRounde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRounde1Layout.createSequentialGroup()
                        .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(selectTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRounde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqCorreo)
                    .addComponent(etqIconCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRounde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqCorreo1)
                    .addComponent(etqIconContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRounde1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRounde1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 480));
    }// </editor-fold>//GEN-END:initComponents

    private void selectTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTipoActionPerformed
        int opcion = selectTipo.getSelectedIndex();
        
        switch(opcion){
            case 0: 
                tipoUsuario = "Admin";
                break;
            case 1:
                tipoUsuario = "Cliente";
                break;
            default:
                tipoUsuario = "Cliente";
        }
    }//GEN-LAST:event_selectTipoActionPerformed

    private void btnRegistrarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUserActionPerformed

        if(campoNombre.getText().equals("") || campoTelefono.getText().equals("") || campoCorreo.getText().equals("") || campoContrasenia.getText().equals("")){
            Alerta ventana = new Alerta("Se deben ingresar todos los campos solicitados");
        }else{
            
            String nombre = campoNombre.getText();
            String telefono = campoTelefono.getText();
            String correo = campoCorreo.getText();
            String contrasenia = baseDatos.getMD5(campoContrasenia.getText());
            
            boolean bandera = criteriosPassword(contrasenia);
            if(bandera = true){
               Boolean result_insert = baseDatos.insertarPersona(correo,nombre, telefono, tipoUsuario,contrasenia); 
               
                if(result_insert){
                    Alerta ventana = new Alerta("Se ha registrado con exito");
                }else{
                    /* ALERTA DE "NO SE PUDO REALIZAR EL REGISTRO" */
                }
            }
                
        }
    }//GEN-LAST:event_btnRegistrarUserActionPerformed
    
    public boolean criteriosPassword(String password){
        int size = 0;
        int criterios =0;
        int cantidadNumeros = 0;
        int cantidadMayusculas = 0;
        boolean bandera = false;
        
        for (int i = 0; i < password.length(); i++) {
            size++;
            char caracter = password.charAt(i);
            if (Character.isDigit(caracter)) {
                cantidadNumeros++;
            } else if (Character.isUpperCase(caracter)) {
                cantidadMayusculas++;
            }
        }
        
        if(size>=8){
            criterios++;
        }else{
           Alerta ventana = new Alerta("La contraseña debe tener minimo 8 caracteres");
        }
        
        if(cantidadMayusculas>0){
            criterios++;
        }else{
           Alerta ventana = new Alerta("La contraseña debe contar con un caracter mayúscula");
        }
        
        if(cantidadNumeros>0){
            criterios++;
        }else{
           Alerta ventana = new Alerta("La contraseña debe tener valores numéricos");
        }
        
        if(criterios ==3){
            bandera = true;
        }else{
            bandera = false;
        }
        
        return bandera;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarUser;
    private javax.swing.JTextField campoContrasenia;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel etaTitulo;
    private javax.swing.JLabel etqCorreo;
    private javax.swing.JLabel etqCorreo1;
    private javax.swing.JLabel etqIconContrasenia;
    private javax.swing.JLabel etqIconCorreo;
    private javax.swing.JLabel etqIconRegistroUser;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqTelefono1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private components.PanelRounde panelRounde1;
    private javax.swing.JComboBox<String> selectTipo;
    // End of variables declaration//GEN-END:variables
}
