package ar.org.casa.java.gui;

import ar.org.casa.java.connectors.Connector;
import ar.org.casa.java.entities.Curso;
import ar.org.casa.java.enums.Dia;
import ar.org.casa.java.enums.Turno;
import ar.org.casa.java.repositories.interfaces.I_AlumnoRepository;
import ar.org.casa.java.repositories.interfaces.I_CursoRepository;
import ar.org.casa.java.repositories.jdbc.CursoRepository.AlumnoRepository;
import ar.org.casa.java.repositories.jdbc.CursoRepository.CursoRepository;
import ar.org.casa.java.utils.swing.Table;
import ar.org.casa.java.utils.swing.Validator;
import javax.swing.JOptionPane;


public class FormCursos extends javax.swing.JInternalFrame {
    private I_CursoRepository cr = new CursoRepository(Connector.getConnection());
    private I_AlumnoRepository ar = new AlumnoRepository(Connector.getConnection()); 
    
    public FormCursos() {
        super(
                "Formulario de Cursos",         //title 
                false,                           //resizable 
                true,                           //closable 
                false,                           //maximizable 
                true                            //iconable
        );
        initComponents();
        
        //cargar elementos cmbDia y cmbTurno
        cargarElementos();
    }
    
    private void cargarElementos(){
        //cargar cmbDia
        cmbDia.removeAllItems();
        for(Dia d:Dia.values()) cmbDia.addItem(d);
        
        //cargar cmbTurno
        cmbTurno.removeAllItems();
        for(Turno t:Turno.values()) cmbTurno.addItem(t);
        
        //cargar tblCursos
        new Table().cargar(tblCursos, cr.getAll());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtProfesor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbDia = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbTurno = new javax.swing.JComboBox<>();
        lblInfo = new javax.swing.JLabel();
        btnAlta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCursos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtBuscarTitulo = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnMostrarAlumnos = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Titulo:");

        jLabel2.setText("Profesor:");

        jLabel3.setText("Dia:");

        jLabel4.setText("Turno:");

        lblInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAlta.setText("Dar de Alta");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        tblCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblCursos);

        jLabel5.setText("Buscar Titulo:");

        txtBuscarTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarTituloKeyReleased(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnMostrarAlumnos.setText("Mostrar Alumnos");
        btnMostrarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarAlumnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMostrarAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(cmbDia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbTurno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrarAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        // Evento alta de cursos
        if(!validar()) return;

        Curso curso = new Curso(
                txtTitulo.getText(), 
                txtProfesor.getText(), 
                cmbDia.getItemAt(cmbDia.getSelectedIndex()), 
                cmbTurno.getItemAt(cmbTurno.getSelectedIndex())
        );
        cr.save(curso);
        limpiar();
        
        lblInfo.setText("Se dio de alta el curso id: "+curso.getId());
        //cargar tblCursos
        cargarElementos();
        
    }//GEN-LAST:event_btnAltaActionPerformed

    private void txtBuscarTituloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarTituloKeyReleased
        // Evento buscar por titulo
        new Table().cargar(tblCursos, cr.getLikeTitulo(txtBuscarTitulo.getText()));
        
    }//GEN-LAST:event_txtBuscarTituloKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Evento eliminar
        //obtenemos la fila seleccionada de curso
        int fila = tblCursos.getSelectedRow();
        //si no hay elemento, salimos.
        if(fila==-1) return;
        //obtenemos el id de la fila
        int id = (int) tblCursos.getValueAt(fila, 0);
        if(JOptionPane.showConfirmDialog(this, "Desea borrar el curso Id:"+id+"?")!=0) return;
        //pedimos a la base de datos el id sobre ese objeto de curso
        Curso curso = cr.getById(id);
        //verificamos que el curso no contenga alumnos 
        if(ar.getByCurso(curso).size()!=0){
            JOptionPane.showConfirmDialog(
                    this, "El curso no se puede eliminar, por que contiene Alumnos!",
                    "error",JOptionPane.ERROR_MESSAGE);
        }
        //eliminamos el curso elegido
        cr.remove(cr.getById(id));
        cargarElementos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMostrarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarAlumnosActionPerformed
        // Evento mostrar Alumnos
        //obtenemoo la fila seleccionada de curso
        int fila = tblCursos.getSelectedRow();
        //si no hay elemento, salimos.
        if(fila==-1) return;
        //obtenemos el id de la fila
        int id = (int) tblCursos.getValueAt(fila, 0);
        //pedimos en la base de datos el id de ese objeto de curso
        Curso curso = cr.getById(id);
        //le pasamos el objeto curso a listarAlumnos 
        ListarAlumnos la = new ListarAlumnos(curso);
        //agregamos listaralumno al objeto contenedor
        this.getParent().add(la);
        la.setVisible(true);
        
        
    }//GEN-LAST:event_btnMostrarAlumnosActionPerformed
    private boolean validar(){
        if(!new Validator(txtTitulo).length(3, 20)) return false;
        if(!new Validator(txtProfesor).length(3, 20)) return false;
        return true;
    }
    public void limpiar(){
        txtTitulo.setText("");
        txtProfesor.setText("");
        cmbDia.setSelectedIndex(0);
        cmbTurno.setSelectedIndex(WIDTH);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMostrarAlumnos;
    private javax.swing.JComboBox<Dia> cmbDia;
    private javax.swing.JComboBox<Turno> cmbTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JTable tblCursos;
    private javax.swing.JTextField txtBuscarTitulo;
    private javax.swing.JTextField txtProfesor;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
