package proyecto;
       
        import javax.swing.JOptionPane;

public class Insertar_Estudiantes extends javax.swing.JFrame {
    
java.util.ArrayList<proyecto.Estudiante> arreglo = new java.util.ArrayList<>(); 
 
  
    
     public Insertar_Estudiantes() {
        initComponents();
        this.setLocationRelativeTo(null); //Pone el Menu en el Centro
        this.setResizable(false); //Elimina el Boton de Maximizar
        this.setTitle("Insertar Estudiantes"); //Le pone nombre a la ventana
      
         
    }
     
       public Insertar_Estudiantes(java.util.ArrayList<proyecto.Estudiante> x ) { 
       // SE CREA UN CONSTRUCTOR LA CUAL TOMA EL ARRAY LIST CON UNA VARIABLE    
       // LA VARIABLE X TOMA LA REFERENCIA DEL ARRAYLIST CREADO EN EL MENU PRINCIPAL    
        initComponents();
        this.setLocationRelativeTo(null); //Pone el Menu en el Centro
        this.setResizable(false); //Elimina el Boton de Maximizar
        this.setTitle("Insertar Estudiantes"); //Le pone nombre a la ventana
        arreglo = x;
        // LA VARIABLE ARREGLO VA A TENER LOS VALORES DE LA VARIABLE X ES DECIR LOS MISMO PARAMETROS DEL ARRAYLIST 
        // ESTO SE HACE PARA NO CREAR UN NUEVO ARRAY LIST Y QUE CUANDO SE BUSQUE EN OTRO JFRAME SALGA SIN VALORES
         
    }
     
     
    public void ActivaDesactiva(boolean accion){
        jTextNombre.setEditable(accion);
        jTextApellido.setEditable(accion);
        jTextCedula.setEditable(accion);
        jTextEdad.setEditable(accion);
           }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelCedula = new javax.swing.JLabel();
        jLabelEdad = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextApellido = new javax.swing.JTextField();
        jTextCedula = new javax.swing.JTextField();
        jTextEdad = new javax.swing.JTextField();
        jButtonOtroEstudiante = new javax.swing.JButton();
        jButtonMenuAnterior = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListListaEstudiantes = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabelNombre.setText("Nombre del Estudiante :");

        jLabelApellido.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabelApellido.setText("Apellido del Estudiante :");

        jLabelTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabelTitulo.setText("Insertar Estudiantes");

        jLabelCedula.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabelCedula.setText("Cedula del Estudiante :");

        jLabelEdad.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabelEdad.setText("Edad del Estudiante :");

        jTextNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextNombre.setText(" ");
        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });

        jTextApellido.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextApellidoActionPerformed(evt);
            }
        });

        jTextCedula.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        jTextEdad.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEdadActionPerformed(evt);
            }
        });

        jButtonOtroEstudiante.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButtonOtroEstudiante.setText("Insertar Otro Estudiante");
        jButtonOtroEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOtroEstudianteActionPerformed(evt);
            }
        });

        jButtonMenuAnterior.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButtonMenuAnterior.setText("Menu Anterior");
        jButtonMenuAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuAnteriorActionPerformed(evt);
            }
        });

        jButtonGuardar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButtonGuardar.setText("Guardar Estudiante");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jListListaEstudiantes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jButtonMenuAnterior)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 175, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTitulo)
                            .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEdad)
                                    .addComponent(jLabelCedula)
                                    .addComponent(jLabelApellido)
                                    .addComponent(jLabelNombre)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonOtroEstudiante)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelApellido))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCedula))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEdad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonGuardar)
                            .addComponent(jButtonOtroEstudiante)))
                    .addComponent(jScrollPane1))
                .addGap(15, 15, 15)
                .addComponent(jButtonMenuAnterior)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTextApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextApellidoActionPerformed

    private void jTextEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEdadActionPerformed

    private void jButtonOtroEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOtroEstudianteActionPerformed
            jTextNombre.setText("");
            jTextApellido.setText("");
            jTextEdad.setText("");
            jTextCedula.setText("");
            
    }//GEN-LAST:event_jButtonOtroEstudianteActionPerformed

    public void listar() 
    {
        
        javax.swing.DefaultListModel modelo = new javax.swing.DefaultListModel();
        
        for ( int i = 0; i < arreglo.size(); i++) // agrega a la lista los estudiantes --- no al arraylist
        {
           
            modelo.addElement("Nombre Completo: " + arreglo.get(i).getNombre() +
                                              " " + arreglo.get(i).getApellido() + 
                                              ", ID: " + arreglo.get(i).getCedula() + 
                                              ", Edad: " + arreglo.get(i).getEdad() + " años ");
            
            
        }
        jListListaEstudiantes.setModel(modelo);
    }
    
    
    
    
    private void jButtonMenuAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuAnteriorActionPerformed
        MenuAnterior(); //Metodo para volver al menu anterior
        this.hide();
    }//GEN-LAST:event_jButtonMenuAnteriorActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

             if (jButtonGuardar.getText().equalsIgnoreCase(" Guardar ")){
            ActivaDesactiva(true);
            jButtonGuardar.setText(" Guardar ");
                }
             else {
                 // SI CUAQUIERA DE LOS CAMPOS ESTAN VACIOS
            if (jTextNombre.getText().equalsIgnoreCase("") || jTextApellido.getText().equalsIgnoreCase("") 
                                                           || jTextCedula.getText().equalsIgnoreCase("")
                                                           || jTextEdad.getText().equalsIgnoreCase("")){ 
               // mensaje de error para llenar los datos      
            JOptionPane.showMessageDialog( this, " Debe llenar todos los campos. ");
            }
            else{ // si no
            
            arreglo.add(new proyecto.Estudiante ( jTextNombre.getText(),
                                                  jTextApellido.getText(),
                                                  jTextCedula.getText(),
                                                  jTextEdad.getText()));
            
            listar(); 
            
             
             JOptionPane.showMessageDialog( this, " Guardado con exito. ");
             
            
             
                            
    }//GEN-LAST:event_jButtonGuardarActionPerformed
} 
             } 
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Insertar_Estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insertar_Estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insertar_Estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insertar_Estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insertar_Estudiantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonMenuAnterior;
    private javax.swing.JButton jButtonOtroEstudiante;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JList<String> jListListaEstudiantes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextCedula;
    private javax.swing.JTextField jTextEdad;
    private javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables

    public void MenuAnterior() {
        
        new Menu_Principal().setVisible(true); // Conecta la ventana
        this.hide();
        //dispose(); // Elimina la ventana anterior       
        // this.setVisible(false); // Otra forma de Eliminar - Esconder la ventana anterior.
    }
}
