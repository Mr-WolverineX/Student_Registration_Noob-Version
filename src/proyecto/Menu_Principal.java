package proyecto;

public class Menu_Principal extends javax.swing.JFrame {
    
public  static  java.util.ArrayList<proyecto.Estudiante> arreglo = new java.util.ArrayList<proyecto.Estudiante>() ;
       // CREANDO UN ARRAY LIST DE LA CLASE ESTUDIANTE DONDE ESTAN LOS PARAMETROS PARA EL REGISTRO

public static  java.util.ArrayList<proyecto.Notas> notas1 = new  java.util.ArrayList<proyecto.Notas>();
       // CREANDO UN ARRAY LIST DE LA CLASE ESTUDIANTE DONDE ESTAN LOS PARAMETROS DE NOTAS
    
    String lsCedula = "";

    public Menu_Principal() {
        initComponents();
        this.setLocationRelativeTo(null); //Pone el Menu en el Centro
        this.setResizable(false); //Elimina el Boton de Maximizar
        this.setTitle("Menu Principal"); //Le pone nombre a la ventana
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jButtonInsertarEstudiantes = new javax.swing.JButton();
        jButtonInsertarNotas = new javax.swing.JButton();
        jButtonSacarPromedio = new javax.swing.JButton();
        jButtonBuscarMejorNota = new javax.swing.JButton();
        jButtonOrdenarEstudiantes = new javax.swing.JButton();
        jButtonImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabelTitulo.setText("Menu Principal :)");

        jButtonInsertarEstudiantes.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jButtonInsertarEstudiantes.setText("Insertar Estudiantes");
        jButtonInsertarEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarEstudiantesActionPerformed(evt);
            }
        });

        jButtonInsertarNotas.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jButtonInsertarNotas.setText("Insertar Notas de los Estudiantes");
        jButtonInsertarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarNotasActionPerformed(evt);
            }
        });

        jButtonSacarPromedio.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jButtonSacarPromedio.setText("Sacar Promedio del Estudiante");
        jButtonSacarPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSacarPromedioActionPerformed(evt);
            }
        });

        jButtonBuscarMejorNota.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jButtonBuscarMejorNota.setText("Buscar el Estudiante con Mejor Nota");
        jButtonBuscarMejorNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarMejorNotaActionPerformed(evt);
            }
        });

        jButtonOrdenarEstudiantes.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jButtonOrdenarEstudiantes.setText("Ordenar por Nota a los Estudiantes");
        jButtonOrdenarEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarEstudiantesActionPerformed(evt);
            }
        });

        jButtonImprimir.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jButtonImprimir.setText("Imprimir Información");
        jButtonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonInsertarEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInsertarNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSacarPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(194, 194, 194)
                            .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonBuscarMejorNota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonOrdenarEstudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(274, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButtonInsertarEstudiantes)
                .addGap(18, 18, 18)
                .addComponent(jButtonInsertarNotas)
                .addGap(18, 18, 18)
                .addComponent(jButtonSacarPromedio)
                .addGap(18, 18, 18)
                .addComponent(jButtonBuscarMejorNota)
                .addGap(18, 18, 18)
                .addComponent(jButtonOrdenarEstudiantes)
                .addGap(18, 18, 18)
                .addComponent(jButtonImprimir)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInsertarEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarEstudiantesActionPerformed
           InsetarEstudiantes();   //Se crea el metodo  
           this.hide();
    }//GEN-LAST:event_jButtonInsertarEstudiantesActionPerformed

    private void jButtonInsertarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarNotasActionPerformed
            InsertarNotas();
            
            this.hide();
    }//GEN-LAST:event_jButtonInsertarNotasActionPerformed

    private void jButtonSacarPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSacarPromedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSacarPromedioActionPerformed

    private void jButtonBuscarMejorNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarMejorNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuscarMejorNotaActionPerformed

    private void jButtonOrdenarEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarEstudiantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonOrdenarEstudiantesActionPerformed

    private void jButtonImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImprimirActionPerformed
        // TODO add your handling code here:
             
        
        
        for ( int i = 0; i < arreglo.size(); i++){   
            lsCedula = arreglo.get(i).getCedula();
                for ( int j = 0; j <notas1.size(); j++){
                   lsCedula = notas1.get(i).getCedula();  
                     
                           
                            System.out.println("Nombre Completo: "+arreglo.get(j).getNombre() +
                                    " " + arreglo.get(i).getApellido() + ", ID: " + arreglo.get(i).getCedula() +
                                    ", " + arreglo.get(i).getEdad() + " años " +  "\n " + "Notas:" + "\n " +
                                    notas1.get(j).getNota1() + "\n " + notas1.get(j).getNota2() + "\n "  +
                                    notas1.get(j).getNota3() + "\n " + notas1.get(j).getNota4());
        
                            //(arreglo.get(i).getNombre() + " " + arreglo.get(i).getApellido() + "\n " + "Notas:" + "\n " + notas1.get(j).getNota1()+ "\n " + notas1.get(j).getNota2() + "\n "  + notas1.get(j).getNota3() + "\n " + notas1.get(j).getNota4());
                          
                            return;
                            

            // System.out.println("Nombre Completo: "+arreglo.get(j).getNombre() + " " + arreglo.get(i).getApellido() + ", ID: " + arreglo.get(i).getCedula() + ", " + arreglo.get(i).getEdad() + " años " +  "\n " + "Notas:" + "\n " + notas1.get(j).getNota1() + "\n " + notas1.get(j).getNota2() + "\n "  + notas1.get(j).getNota3() + "\n " + notas1.get(j).getNota4());         
              }
        }      
    }//GEN-LAST:event_jButtonImprimirActionPerformed

    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
          }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarMejorNota;
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JButton jButtonInsertarEstudiantes;
    private javax.swing.JButton jButtonInsertarNotas;
    private javax.swing.JButton jButtonOrdenarEstudiantes;
    private javax.swing.JButton jButtonSacarPromedio;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables

    private void InsetarEstudiantes() {
        new Insertar_Estudiantes(arreglo).setVisible(true); // CONECTA LA VENTANA Y LE PASA LA REFERENCIA DEL ARREGLO A INSERTAR ESTUDIANTE
        this.hide(); // Esconde la ventana anterior,
     // this.setVisible(false); // Otra forma de Eliminar - Esconder la ventana anterior.
    }

    public void InsertarNotas() {
        new Insertar_Notas(arreglo,notas1).setVisible(true) ;
        // CONECTA LA VENTANA Y LE PASA LA REFERENCIA DEL ARREGLO  A INSERTAR NOTAS
        //new Insertar_Notas(notas1).setVisible(true);
        // CONECTA LA VENTANA Y LE PASA LA REFERENCIA DEL ARREGLONOTAS A INSERTAR NOTAS
        this.hide();
        
    }
    
    
  

}
