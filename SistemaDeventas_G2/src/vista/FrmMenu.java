package vista;

import controlador.Reportes;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import shared.Constants;

public class FrmMenu extends javax.swing.JFrame {

    public static JDesktopPane jDesktopPane_menu;

    public FrmMenu() {
        initComponents();
        this.setSize(new Dimension(1200, 700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle(Constants.MENU_TITLE_STRING);

        this.setLayout(null);
        jDesktopPane_menu = new JDesktopPane();

        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_menu.setBounds(0, 0, ancho, (alto - 110));
        this.add(jDesktopPane_menu);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_nuevo_usuario = new javax.swing.JMenuItem();
        jMenuItem_gestionar_usuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3_nuevo_producto = new javax.swing.JMenuItem();
        jMenuItem_gestionar_producto = new javax.swing.JMenuItem();
        jMenuItem_actualizar_stock = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_nuevo_cliente = new javax.swing.JMenuItem();
        jMenuItem_gestionar_cliente = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem_nueva_categoria = new javax.swing.JMenuItem();
        jMenuItem_gestionar_categorias = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem_nueva_venta = new javax.swing.JMenuItem();
        jMenuItem_gestionar_ventas = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem_reportes_clientes = new javax.swing.JMenuItem();
        jMenuItem_reportes_categorias = new javax.swing.JMenuItem();
        jMenuItem_reportes_productos = new javax.swing.JMenuItem();
        jMenuItem_reportes_ventas = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem_cerrar_sesion = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem_ver_historial = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        jMenuItem15.setText("jMenuItem15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(229, 211, 147));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario_rende.png"))); // NOI18N
        jMenu1.setText(Constants.GENERAL_USER);
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nuevo_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_nuevo_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente_rende.png"))); // NOI18N
        jMenuItem_nuevo_usuario.setText(Constants.GENERAL_NEW_USER);
        jMenuItem_nuevo_usuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_nuevo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_usuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_nuevo_usuario);

        jMenuItem_gestionar_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones_rende.png"))); // NOI18N
        jMenuItem_gestionar_usuario.setText(Constants.MENU_MANAGEMENT_USER_STRING);
        jMenuItem_gestionar_usuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_gestionar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_usuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_gestionar_usuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto_rende.png"))); // NOI18N
        jMenu2.setText(Constants.MENU_PRODUCT_STRING);
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem3_nuevo_producto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem3_nuevo_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-producto_rende.png"))); // NOI18N
        jMenuItem3_nuevo_producto.setText(Constants.MENU_NEW_PRODUCT_STRING);
        jMenuItem3_nuevo_producto.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem3_nuevo_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3_nuevo_productoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3_nuevo_producto);

        jMenuItem_gestionar_producto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto22_rende.png"))); // NOI18N
        jMenuItem_gestionar_producto.setText(Constants.MENU_MANAGEMENT_PRODUCT_STRING);
        jMenuItem_gestionar_producto.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_gestionar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_productoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_gestionar_producto);

        jMenuItem_actualizar_stock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_actualizar_stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo_rende.png"))); // NOI18N
        jMenuItem_actualizar_stock.setText(Constants.MENU_UPDATE_STOCK_STRING)
        jMenuItem_actualizar_stock.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_actualizar_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_actualizar_stockActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_actualizar_stock);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente_rende.png"))); // NOI18N
        jMenu3.setText("Cliente");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nuevo_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_nuevo_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente_rende.png"))); // NOI18N
        jMenuItem_nuevo_cliente.setText(Constants.MENU_NEW_CLIENT_STRING);
        jMenuItem_nuevo_cliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_nuevo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_clienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_nuevo_cliente);

        jMenuItem_gestionar_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente_rende.png"))); // NOI18N
        jMenuItem_gestionar_cliente.setText(Constants.MENU_MANAGEMENT_CLIENT_STRING);
        jMenuItem_gestionar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_clienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_gestionar_cliente);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias_rende.png"))); // NOI18N
        jMenu4.setText(Constants.MENU_CATEGORY_STRING);
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nueva_categoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_nueva_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo_rende.png"))); // NOI18N
        jMenuItem_nueva_categoria.setText(Constants.MENU_NEW_CATEGORY_STRING);
        jMenuItem_nueva_categoria.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_nueva_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nueva_categoriaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_nueva_categoria);

        jMenuItem_gestionar_categorias.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_categorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias_rende.png"))); // NOI18N
        jMenuItem_gestionar_categorias.setText(Constants.MENU_MANAGEMENT_CATEGORY_STRING);
        jMenuItem_gestionar_categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_categoriasActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_gestionar_categorias);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito_rende.png"))); // NOI18N
        jMenu5.setText(Constants.MENU_CHECKIN_STRING);
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nueva_venta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_nueva_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir_rende.png"))); // NOI18N
        jMenuItem_nueva_venta.setText(Constants.MENU_NEW_SALE_STRING);
        jMenuItem_nueva_venta.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_nueva_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nueva_ventaActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_nueva_venta);

        jMenuItem_gestionar_ventas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones_rende.png"))); // NOI18N
        jMenuItem_gestionar_ventas.setText(Constants.MENU_MANAGEMENT_SALE_STRING);
        jMenuItem_gestionar_ventas.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_gestionar_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_ventasActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_gestionar_ventas);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reportes_rende.png"))); // NOI18N
        jMenu6.setText(Constants.MENU_REPORT_STRING);
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_reportes_clientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_reportes_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1_rende.png"))); // NOI18N
        jMenuItem_reportes_clientes.setText("Reportes Clientes");
        jMenuItem_reportes_clientes.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_reportes_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reportes_clientesActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_reportes_clientes);

        jMenuItem_reportes_categorias.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_reportes_categorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1_rende.png"))); // NOI18N
        jMenuItem_reportes_categorias.setText(Constants.MENU_REPORT_CLIENT_STRING);
        jMenuItem_reportes_categorias.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_reportes_categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reportes_categoriasActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_reportes_categorias);

        jMenuItem_reportes_productos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_reportes_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1_rende.png"))); // NOI18N
        jMenuItem_reportes_productos.setText(Constants.MENU_REPORT_PRODUCT_STRING);
        jMenuItem_reportes_productos.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_reportes_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reportes_productosActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_reportes_productos);

        jMenuItem_reportes_ventas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_reportes_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1_rende.png"))); // NOI18N
        jMenuItem_reportes_ventas.setText(Constants.MENU_REPORT_SALES_STRING);
        jMenuItem_reportes_ventas.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_reportes_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reportes_ventasActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_reportes_ventas);

        jMenuBar1.add(jMenu6);

        jMenu8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem_cerrar_sesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_cerrar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion_rende.png"))); // NOI18N
        jMenuItem_cerrar_sesion.setText(Constants.GENERAL_CLOSE_SESSION_STRING);
        jMenuItem_cerrar_sesion.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem_cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_cerrar_sesionActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem_cerrar_sesion);

        jMenuBar1.add(jMenu8);

        jMenu7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_ver_historial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_ver_historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1_rende.png"))); // NOI18N
        jMenuItem_ver_historial.setText(Constants.MENU_VIEW_RECORD_STRING);
        jMenuItem_ver_historial.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem_ver_historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ver_historialActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem_ver_historial);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_reportes_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reportes_ventasActionPerformed
        Reportes reporte = new Reportes();
        reporte.ReportesVentas();
    }//GEN-LAST:event_jMenuItem_reportes_ventasActionPerformed

    private void jMenuItem_nueva_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nueva_categoriaActionPerformed
        InterCategoria interCategoria = new InterCategoria();
        jDesktopPane_menu.add(interCategoria);
        interCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nueva_categoriaActionPerformed

    private void jMenuItem_gestionar_categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_categoriasActionPerformed
        InterGestionarCategoria interGestionarCategoria = new InterGestionarCategoria();
        jDesktopPane_menu.add(interGestionarCategoria);
        interGestionarCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_categoriasActionPerformed

    private void jMenuItem3_nuevo_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3_nuevo_productoActionPerformed
        InterProducto interProducto = new InterProducto();
        jDesktopPane_menu.add(interProducto);
        interProducto.setVisible(true);
    }//GEN-LAST:event_jMenuItem3_nuevo_productoActionPerformed

    private void jMenuItem_gestionar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_productoActionPerformed
        InterGestionarProducto interGestionarProducto = new InterGestionarProducto();
        jDesktopPane_menu.add(interGestionarProducto);
        interGestionarProducto.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_productoActionPerformed

    private void jMenuItem_nuevo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_clienteActionPerformed
        InterCliente interCliente = new InterCliente();
        jDesktopPane_menu.add(interCliente);
        interCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevo_clienteActionPerformed

    private void jMenuItem_gestionar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_clienteActionPerformed
        InterGestionarCliente interGestionarCliente = new InterGestionarCliente();
        jDesktopPane_menu.add(interGestionarCliente);
        interGestionarCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_clienteActionPerformed

    private void jMenuItem_actualizar_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_actualizar_stockActionPerformed
        InterActualizarStock interActualizarStock = new InterActualizarStock();
        jDesktopPane_menu.add(interActualizarStock);
        interActualizarStock.setVisible(true);
    }//GEN-LAST:event_jMenuItem_actualizar_stockActionPerformed

    private void jMenuItem_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_cerrar_sesionActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem_cerrar_sesionActionPerformed

    private void jMenuItem_nuevo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_usuarioActionPerformed
        InterUsuario interUsuario = new InterUsuario();
        jDesktopPane_menu.add(interUsuario);
        interUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevo_usuarioActionPerformed

    private void jMenuItem_gestionar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_usuarioActionPerformed
        InterGestionarUsuario interGestionarUsuario = new InterGestionarUsuario();
        jDesktopPane_menu.add(interGestionarUsuario);
        interGestionarUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_usuarioActionPerformed

    private void jMenuItem_nueva_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nueva_ventaActionPerformed
        InterFacturacion interFacturacion = new InterFacturacion();
        jDesktopPane_menu.add(interFacturacion);
        interFacturacion.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nueva_ventaActionPerformed

    private void jMenuItem_gestionar_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_ventasActionPerformed
        InterGestionarVentas interGestionarVentas = new InterGestionarVentas();
        jDesktopPane_menu.add(interGestionarVentas);
        interGestionarVentas.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_ventasActionPerformed

    private void jMenuItem_reportes_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reportes_clientesActionPerformed
        Reportes reporte = new Reportes();
        reporte.ReportesClientes();
    }//GEN-LAST:event_jMenuItem_reportes_clientesActionPerformed

    private void jMenuItem_reportes_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reportes_productosActionPerformed
        Reportes reporte = new Reportes();
        reporte.ReportesProductos();
    }//GEN-LAST:event_jMenuItem_reportes_productosActionPerformed

    private void jMenuItem_reportes_categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reportes_categoriasActionPerformed
        Reportes reporte = new Reportes();
        reporte.ReportesCategorias();
    }//GEN-LAST:event_jMenuItem_reportes_categoriasActionPerformed

    private void jMenuItem_ver_historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ver_historialActionPerformed
        InterGraficas interGraficas = new InterGraficas();
        jDesktopPane_menu.add(interGraficas);
        interGraficas.setVisible(true);
    }//GEN-LAST:event_jMenuItem_ver_historialActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem3_nuevo_producto;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem_actualizar_stock;
    private javax.swing.JMenuItem jMenuItem_cerrar_sesion;
    private javax.swing.JMenuItem jMenuItem_gestionar_categorias;
    private javax.swing.JMenuItem jMenuItem_gestionar_cliente;
    private javax.swing.JMenuItem jMenuItem_gestionar_producto;
    private javax.swing.JMenuItem jMenuItem_gestionar_usuario;
    private javax.swing.JMenuItem jMenuItem_gestionar_ventas;
    private javax.swing.JMenuItem jMenuItem_nueva_categoria;
    private javax.swing.JMenuItem jMenuItem_nueva_venta;
    private javax.swing.JMenuItem jMenuItem_nuevo_cliente;
    private javax.swing.JMenuItem jMenuItem_nuevo_usuario;
    private javax.swing.JMenuItem jMenuItem_reportes_categorias;
    private javax.swing.JMenuItem jMenuItem_reportes_clientes;
    private javax.swing.JMenuItem jMenuItem_reportes_productos;
    private javax.swing.JMenuItem jMenuItem_reportes_ventas;
    private javax.swing.JMenuItem jMenuItem_ver_historial;
    // End of variables declaration//GEN-END:variables
}
