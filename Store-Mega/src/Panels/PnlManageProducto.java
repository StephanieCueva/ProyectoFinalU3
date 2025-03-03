/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Panels;

import Conexion.Conexion;
import Controlador.Ctrl_Producto;
import Modelo.entidad.Producto;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JTable;
import java.sql.SQLException;

/**
 *
 * @author JoseS
 */
public class PnlManageProducto extends javax.swing.JPanel {
    
    private int idProducto = 0;
    int obtenerIdCategoriaCombo = 0;
    Conexion conexion = new Conexion();
    
    public PnlManageProducto() {
        initComponents();
        
        this.CargarTablaProducto();
        this.CargarComboCategoria();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new javaswingdev.swing.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtDescripcionp = new Vistas.TextField();
        txtNombrep = new Vistas.TextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCantidadp = new Vistas.TextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPreciop = new Vistas.TextField();
        jLabel7 = new javax.swing.JLabel();
        jCbxIGV = new javax.swing.JComboBox<>();
        jCbxCategoria = new javax.swing.JComboBox<>();

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        roundPanel1.setPreferredSize(new java.awt.Dimension(810, 568));
        roundPanel1.setRound(10);

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/administrar-usuarios.png"))); // NOI18N
        jLabel1.setText("Administrar Producto");

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableProductos);

        btnEliminar.setBackground(new java.awt.Color(255, 145, 56));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorderPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(255, 145, 56));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorderPainted(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Descripción:");

        txtDescripcionp.setLabelText("");

        txtNombrep.setLabelText("");
        txtNombrep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrepActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Cantidad:");

        txtCantidadp.setLabelText("");
        txtCantidadp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadpActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("IGV:");

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Precio:");

        txtPreciop.setLabelText("");
        txtPreciop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPreciopActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Categoria:");

        jCbxIGV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Sin IGV", "18%" }));

        jCbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione categoría" }));

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(50, 50, 50)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDescripcionp, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(txtNombrep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(50, 50, 50)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addComponent(jCbxIGV, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)))
                            .addComponent(txtCantidadp, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPreciop, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCbxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNombrep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPreciop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCantidadp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(27, 27, 27)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescripcionp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jCbxIGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        Ctrl_Producto controlProducto = new Ctrl_Producto();
        if (idProducto == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un producto");
        } else {

            if (!controlProducto.eliminar(idProducto)) {
                JOptionPane.showMessageDialog(null, "Producto eliminado");
                this.CargarTablaProducto();
                this.Limpiar();
                idProducto = 0;
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar producto");
                this.Limpiar();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        Producto producto = new Producto();
        Ctrl_Producto controlProducto = new Ctrl_Producto();
        //Carga método ID de Categoría
        producto.setIdCategoria(obtenerIdCategoriaCombo); 

        if (idProducto == 0) {

            JOptionPane.showMessageDialog(null, "Seleccione un producto");
        } else {

            if (txtNombrep.getText().isEmpty() || txtCantidadp.getText().isEmpty() || txtPreciop.getText().isEmpty() || txtDescripcionp.getText().isEmpty() || jCbxIGV.getSelectedItem().toString().isEmpty() || jCbxCategoria.getSelectedItem().toString().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Complete todos los campos");
            } else {
                producto.setNombre(txtNombrep.getText().trim());
                producto.setCantidad(Integer.parseInt(txtCantidadp.getText().trim()));
                producto.setPrecio(Double.parseDouble(txtPreciop.getText().trim()));
                producto.setDescripcion(txtDescripcionp.getText().trim());
                if(jCbxIGV.getSelectedItem().toString().equals("Sin IGV")){
                    producto.setIgv(0);
                } else if (jCbxIGV.getSelectedItem().toString().equals("18%")){
                    producto.setIgv(18);
                }
                //producto.setIdCategoria(Integer.parseInt(jCbxCategoria.getSelectedItem().toString()));
                producto.setIdCategoria(jCbxCategoria.getSelectedIndex());
                producto.setEstado(1);
                
                if (controlProducto.actualizar(producto, idProducto)) {
                    JOptionPane.showMessageDialog(null, "Producto actualizado");
                    this.Limpiar();
                    this.CargarTablaProducto();
                    idProducto = 0;
                } else {
                    JOptionPane.showMessageDialog(null, "Error al actualizar producto");
                }

            }
            
            
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtNombrepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrepActionPerformed

    private void txtCantidadpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadpActionPerformed

    private void txtPreciopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPreciopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPreciopActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> jCbxCategoria;
    private javax.swing.JComboBox<String> jCbxIGV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableProductos;
    private javaswingdev.swing.RoundPanel roundPanel1;
    private Vistas.TextField txtCantidadp;
    private Vistas.TextField txtDescripcionp;
    private Vistas.TextField txtNombrep;
    private Vistas.TextField txtPreciop;
    // End of variables declaration//GEN-END:variables

    //Limpiar campos
    private void Limpiar() {
        txtNombrep.setText("");
        txtCantidadp.setText("");
        txtPreciop.setText("");
        txtDescripcionp.setText("");
        jCbxIGV.setSelectedIndex(0);
        jCbxCategoria.setSelectedIndex(0);
    }

    public void CargarTablaProducto() {
        Connection con = conexion.getConexion();
        DefaultTableModel model2 = new DefaultTableModel();
        String sql = "select * from tb_producto";

        Statement st;

        try {

            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            PnlManageProducto.jTableProductos = new JTable(model2);
            PnlManageProducto.jScrollPane1.setViewportView(PnlManageProducto.jTableProductos);

            model2.addColumn("ID");
            model2.addColumn("Nombre");
            model2.addColumn("Cantidad");
            model2.addColumn("Precio");
            model2.addColumn("Descripción");
            model2.addColumn("IGV");
            model2.addColumn("Categoria");
            model2.addColumn("Estado");

            while (rs.next()) {
                Object fila[] = new Object[8];
                for (int i = 0; i < 8; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model2.addRow(fila);
            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla de productos: " + e);
        }

        jTableProductos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                int fila_point = jTableProductos.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idProducto = (int) model2.getValueAt(fila_point, columna_point);
                    EnviarDatosProductoSeleccionado(idProducto);
                    
                }
            }
        });
    }
    
    private void EnviarDatosProductoSeleccionado(int idProducto) {
        String igv = "";
        String categoria = "";
        try {

            Connection con = conexion.getConexion();
            PreparedStatement pst = con.prepareStatement("select * from tb_producto where idProducto = '" + idProducto + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {      
                txtNombrep.setText(rs.getString("nombre"));
                txtCantidadp.setText(rs.getString("cantidad"));
                txtPreciop.setText(rs.getString("precio"));
                txtDescripcionp.setText(rs.getString("descripcion"));
                //jCbxIGV.addItem(rs.getString("igv"));
                if(rs.getString("igv").equals("0")){
                    jCbxIGV.setSelectedItem("Sin IGV");
                } else if(rs.getString("igv").equals("18")){
                    jCbxIGV.setSelectedItem("18%");
                }           
                //jCbxCategoria.addItem(rs.getString("idCategoria"));              
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar categoría: " + e);
        }
    }
    //Método para cargar las categorías
    private void CargarComboCategoria() {
        Connection cn = conexion.getConexion();
        String sql = "select * from tb_categoria";
        Statement st;

        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jCbxCategoria.removeAllItems();
            jCbxCategoria.addItem("Seleccione categoría");

            while (rs.next()) {
                jCbxCategoria.addItem(rs.getString("descripcion"));
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al cargar categoría: " + e);
        }
    }
    
    private int IdCategoria() {
        String sql = "select * from tb_categoria where descripcion = '" + this.jCbxCategoria.getSelectedItem() + "'";
        Statement st;
        try {

            Connection cn = conexion.getConexion();

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                obtenerIdCategoriaCombo = rs.getInt("idCategoria");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener ID de categoría");
        }
        return obtenerIdCategoriaCombo;
    }
    
}
