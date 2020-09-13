package proyecto;

import javax.swing.JOptionPane;
//import static proyecto.Menu_Principal.notas1;

public class Insertar_Notas extends javax.swing.JFrame {
  
java.util.ArrayList<proyecto.Estudiante> arreglo = new java.util.ArrayList<>();

java.util.ArrayList<proyecto.Notas> notas1 = new java.util.ArrayList<>();
String cedula = "";

    
 
    
    

     public Insertar_Notas() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Insertar Notas");
        
    }
     
     
     public Insertar_Notas(java.util.ArrayList<proyecto.Estudiante> x, java.util.ArrayList<proyecto.Notas> Y) {
       // SE CREA UN CONSTRUCTOR LA CUAL TOMA EL ARRAY LIST CON UNA VARIABLE    
       // LA VARIABLE X TOMA LA REFERENCIA DEL ARRAYLIST CREADO EN EL MENU PRINCIPAL 
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Insertar Notas");
        arreglo = x;
        notas1 = Y;
        // LA VARIABLE ARREGLO VA A TENER LOS VALORES DE LA VARIABLE X ES DECIR LOS MISMO PARAMETROS DEL ARRAYLIST 
        // ESTO SE HACE PARA NO CREAR UN NUEVO ARRAY LIST Y QUE CUANDO SE BUSQUE EN OTRO JFRAME SALGA SIN VALORES
         
            }
 
   
     
     public void listar(String lsCedula) {
        
        javax.swing.DefaultListModel modelo= new javax.swing.DefaultListModel();
        
        
        
        for ( int i = 0; i < arreglo.size(); i++){
            if (arreglo.get(i).getCedula() == lsCedula){ 
                for ( int j = 0; j <notas1.size(); j++){
                        if (notas1.get(j).getCedula() == lsCedula)  {
                            
                            modelo.addElement("Nombre Completo: " + 
                                    arreglo.get(i).getNombre() + " " + 
                                    arreglo.get(i).getApellido() + "\n " + "Notas:" + "\n " + 
                                    notas1.get(j).getNota1()+ "\n " + 
                                    notas1.get(j).getNota2() + "\n "  + 
                                    notas1.get(j).getNota3() + "\n " + 
                                    notas1.get(j).getNota4());
                              
                              jListNotas.setModel(modelo);
                                System.out.println(modelo);
                         return;  

              }              
           }               
        }   
            
      }
        
   }
     
     
     
        public void ActivaDesactiva(boolean accion){
        JTextNota1.setEditable(accion);
        JTextNota2.setEditable(accion);
        JTextNota3.setEditable(accion);
        JTextNota4.setEditable(accion);
                
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTextBusq_Apellido = new javax.swing.JTextField();
        jApellido = new javax.swing.JLabel();
        JTextBusq_Nombre = new javax.swing.JTextField();
        jNombre = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelInsertarCedula = new javax.swing.JLabel();
        JTextID = new javax.swing.JTextField();
        jLabelNota1 = new javax.swing.JLabel();
        jLabelNota2 = new javax.swing.JLabel();
        jLabelNota3 = new javax.swing.JLabel();
        jLabelNota4 = new javax.swing.JLabel();
        JTextNota1 = new javax.swing.JTextField();
        JTextNota2 = new javax.swing.JTextField();
        JTextNota3 = new javax.swing.JTextField();
        JTextNota4 = new javax.swing.JTextField();
        jButtonGuardarNotas = new javax.swing.JButton();
        jButtonOtroEstudiante = new javax.swing.JButton();
        jButtonMenuAnterior = new javax.swing.JButton();
        jButtonOK = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListNotas = new javax.swing.JList<>();

        JTextBusq_Apellido.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        JTextBusq_Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextBusq_ApellidoActionPerformed(evt);
            }
        });

        jApellido.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jApellido.setText("Apellido");

        JTextBusq_Nombre.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        JTextBusq_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextBusq_NombreActionPerformed(evt);
            }
        });

        jNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jNombre.setText("Nombre");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabelTitulo.setText("Insertar Notas");

        jLabelInsertarCedula.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabelInsertarCedula.setText("Cedula del Estudiante");

        JTextID.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        JTextID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextIDActionPerformed(evt);
            }
        });

        jLabelNota1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabelNota1.setText("Inserte Nota 1");

        jLabelNota2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabelNota2.setText("Inserte Nota 2");

        jLabelNota3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabelNota3.setText("Inserte Nota 3");

        jLabelNota4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabelNota4.setText("Inserte Nota 4");

        JTextNota1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        JTextNota1.setText(" ");
        JTextNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextNota1ActionPerformed(evt);
            }
        });

        JTextNota2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        JTextNota3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        JTextNota4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        jButtonGuardarNotas.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButtonGuardarNotas.setText("Guardar Notas");
        jButtonGuardarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarNotasActionPerformed(evt);
            }
        });

        jButtonOtroEstudiante.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButtonOtroEstudiante.setText("Insertar Notas de Otro Estudiante");
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

        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jListNotas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonGuardarNotas)
                            .addComponent(jLabelNota2)
                            .addComponent(jLabelNota1)
                            .addComponent(jLabelNota3)
                            .addComponent(jLabelNota4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JTextNota4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTextNota3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTextNota2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTextNota1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jButtonMenuAnterior))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonOtroEstudiante))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelInsertarCedula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JTextID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonOK)))))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelInsertarCedula)
                                .addComponent(JTextID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNota1)
                            .addComponent(JTextNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNota2)
                            .addComponent(JTextNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNota3)
                            .addComponent(JTextNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNota4)
                            .addComponent(JTextNota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonOtroEstudiante)
                            .addComponent(jButtonGuardarNotas)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonMenuAnterior)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTextIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextIDActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_JTextIDActionPerformed

    private void JTextNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextNota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextNota1ActionPerformed

    private void jButtonMenuAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuAnteriorActionPerformed
        MenuAnterior(); //Metodo para volver al menu anterior
        this.hide();
    }//GEN-LAST:event_jButtonMenuAnteriorActionPerformed

       
    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed

         String Busqueda;
         for (int i = 0; i < arreglo.size(); i++){

            if (arreglo.get(i).getCedula().equals(JTextID.getText())){

              Busqueda = "";

              Busqueda += "Nombre: " + arreglo.get(i).getNombre() + " " + arreglo.get(i).getApellido()
              +  "\n"+ "Cedula: " + arreglo.get(i).getCedula() ;
                
              cedula = arreglo.get(i).getCedula() ;
              JOptionPane.showMessageDialog(null, Busqueda);
            
            }}



    }//GEN-LAST:event_jButtonOKActionPerformed

    private void JTextBusq_ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextBusq_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextBusq_ApellidoActionPerformed

    private void JTextBusq_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextBusq_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextBusq_NombreActionPerformed
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
   
    }//GEN-LAST:event_formWindowActivated

    private void jButtonOtroEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOtroEstudianteActionPerformed
        // TODO add your handling code here:
            JTextID.setText("");
            JTextNota1.setText("");
            JTextNota2.setText("");
            JTextNota3.setText("");
            JTextNota4.setText("");
            
               
    }//GEN-LAST:event_jButtonOtroEstudianteActionPerformed

    
   
    
    
    private void jButtonGuardarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarNotasActionPerformed
        // TODO add your handling code here:
        
        if (jButtonGuardarNotas.getText().equalsIgnoreCase(" Guardar ")){
            ActivaDesactiva(true);
            jButtonGuardarNotas.setText(" Guardar ");
                }
             else{
            if (JTextNota1.getText().equalsIgnoreCase("") || JTextNota2.getText().equalsIgnoreCase("") 
                                                           || JTextNota3.getText().equalsIgnoreCase("")
                                                           || JTextNota4.getText().equalsIgnoreCase("")){
                    
            JOptionPane.showMessageDialog( this, " Debe introducir todas las notas. ");
            }else{
            
            //arreglo.add(new proyecto.Estudiante(JTextNota1.getText(), JTextNota2.getText(), JTextNota3.getText(), JTextNota4.getText()));
          
            notas1.add( new proyecto.Notas ( JTextNota1.getText(), 
                                             JTextNota2.getText(), 
                                             JTextNota3.getText(), 
                                             JTextNota4.getText(), 
                                             this.cedula));
            
            listar(this.cedula); 
            
             
             JOptionPane.showMessageDialog( this, " Notas guardadas con exito. ");
            }}
    }//GEN-LAST:event_jButtonGuardarNotasActionPerformed

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
            java.util.logging.Logger.getLogger(Insertar_Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insertar_Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insertar_Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insertar_Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insertar_Notas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextBusq_Apellido;
    private javax.swing.JTextField JTextBusq_Nombre;
    private javax.swing.JTextField JTextID;
    private javax.swing.JTextField JTextNota1;
    private javax.swing.JTextField JTextNota2;
    private javax.swing.JTextField JTextNota3;
    private javax.swing.JTextField JTextNota4;
    private javax.swing.JLabel jApellido;
    private javax.swing.JButton jButtonGuardarNotas;
    private javax.swing.JButton jButtonMenuAnterior;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JButton jButtonOtroEstudiante;
    private javax.swing.JLabel jLabelInsertarCedula;
    private javax.swing.JLabel jLabelNota1;
    private javax.swing.JLabel jLabelNota2;
    private javax.swing.JLabel jLabelNota3;
    private javax.swing.JLabel jLabelNota4;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JList<String> jListNotas;
    private javax.swing.JLabel jNombre;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void MenuAnterior() {
        new Menu_Principal().setVisible(true); // Conecta la ventana
       this.hide(); // Elimina la ventana anterior
       }
    
        
}
