package controlador;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import conexion.Conexion;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import vista.InterFacturacion;


public class VentaPDF {

    private String nombreCliente;
    private String cedulaCliente;
    private String telefonoCliente;
    private String direccionCliente;

    private String fechaActual = "";
    private String nombreArchivoPDFVenta = "";

    //metodo para obtener datos del cliente
    public void DatosCliente(int idCliente) {
        Connection cn = Conexion.conectar();
        String sql = "select * from tb_cliente where idCliente = '" + idCliente + "'";
        Statement st;
        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                nombreCliente = rs.getString("nombre") + " " + rs.getString("apellido");
                cedulaCliente = rs.getString("cedula");
                telefonoCliente = rs.getString("telefono");
                direccionCliente = rs.getString("direccion");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener datos del cliente: " + e);
        }
    }

    //metodo para generar la factura de venta
    public void generarFacturaPDF() {
        try {

            //cargar la fecha actual
            fechaActual = obtenerFechaActual();
            
            //cambiar el formato de la fecha de / a _
            String fechaArchivoPDFVenta = reemplazarSeparadoresFecha();
            
            nombreArchivoPDFVenta = "Venta_" + nombreCliente + "_" + fechaArchivoPDFVenta + ".pdf";

            FileOutputStream archivo;
            File file = new File("src/pdf/" + nombreArchivoPDFVenta);
            archivo = new FileOutputStream(file);

            Document doc =crearDocumentoPDF(archivo);

            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
       
            agregarEncabezado(doc);
            agregarDatosCliente(doc, negrita);       
            agregarEspacioEnBlanco(doc);
            agregarProductos(doc, negrita);
            agregarTotalPagar(doc, InterFacturacion.txt_total_pagar.getText());
            agregarFirma(doc);
            agregarMensajeAgradecimiento(doc);
           
           //cerrar el documento y el archivo
           cerrarDocumentoPDF(doc);
           archivo.close();
           
           //abrir el documento al ser generado automaticamente
           abrirArchivoPDF(file);
            
            
        } catch (DocumentException | IOException e) {
            System.out.println("Error en: " + e);
        }
    }
    
    public String obtenerFechaActual() {
        Date date = new Date();
        return new SimpleDateFormat("yyyy/MM/dd").format(date);
    }
    
    private String reemplazarSeparadoresFecha() {
        return fechaActual.replace("/", "_");
    }
    private Document crearDocumentoPDF(FileOutputStream archivo) throws DocumentException{
        Document doc = new Document();
        PdfWriter.getInstance(doc,archivo);
        doc.open();
        return doc;
    }
    
    private void agregarEncabezado(Document doc) throws DocumentException, IOException {
        Image img = Image.getInstance("src/img/ventas_rende.png");
        Paragraph fecha = new Paragraph();
        fecha.add(Chunk.NEWLINE);//agregar nueva linea
        fecha.add("Factura: 001" + "\nFecha: " + fechaActual + "\n\n");

        PdfPTable Encabezado = new PdfPTable(4);
        Encabezado.setWidthPercentage(100);
        Encabezado.getDefaultCell().setBorder(0);//quitar el borde de la tabla
        
         //tamaño de las celdas
        float[] ColumnaEncabezado = new float[]{20f, 30f, 70f, 40f};
        Encabezado.setWidths(ColumnaEncabezado);
        Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
        
        //agregar celdas
        Encabezado.addCell(img);

        String ruc = "0987654321001";
        String nombre = "SUPERMARKET";
        String telefono = "0987654321";
        String direccion = "Via Lactea 234, San borja,Lima";
        String razon = "Tienda en Línea de Productos Multicategoría S.A.";

        Encabezado.addCell("");//celda vacia
        Encabezado.addCell("RUC: " + ruc + "\nNOMBRE: " + nombre + "\nTELEFONO: " + telefono + "\nDIRECCION: " + direccion + "\nRAZON SOCIAL: " + razon);
        Encabezado.addCell(fecha);
        doc.add(Encabezado);
    }
    
    private void agregarDatosCliente(Document doc, Font fuente) throws DocumentException {
        //CUERPO
        Paragraph cliente = new Paragraph();
        cliente.add(Chunk.NEWLINE);//nueva linea
        cliente.add("Datos del cliente: " + "\n\n");
        doc.add(cliente);

        //DATOS DEL CLIENTE
        PdfPTable tablaCliente = new PdfPTable(4);
        tablaCliente.setWidthPercentage(100);
        tablaCliente.getDefaultCell().setBorder(0);//quitar bordes
        
        //tamaño de las celdas
        float[] ColumnaCliente = new float[]{25f, 45f, 30f, 40f};
        tablaCliente.setWidths(ColumnaCliente);
        tablaCliente.setHorizontalAlignment(Element.ALIGN_LEFT);
        PdfPCell cliente1 = new PdfPCell(new Phrase("Cedula/RUC: ", fuente));
        PdfPCell cliente2 = new PdfPCell(new Phrase("Nombre: ", fuente));
        PdfPCell cliente3 = new PdfPCell(new Phrase("Telefono: ", fuente));
        PdfPCell cliente4 = new PdfPCell(new Phrase("Direccion: ", fuente));
        
        //quitar bordes 
        cliente1.setBorder(0);
        cliente2.setBorder(0);
        cliente3.setBorder(0);
        cliente4.setBorder(0);
        
        //agrega las celdas a la tabla
        tablaCliente.addCell(cliente1);
        tablaCliente.addCell(cliente2);
        tablaCliente.addCell(cliente3);
        tablaCliente.addCell(cliente4);
        tablaCliente.addCell(cedulaCliente);
        tablaCliente.addCell(nombreCliente);
        tablaCliente.addCell(telefonoCliente);
        tablaCliente.addCell(direccionCliente);
        
        //agregar la tabla documento
        doc.add(tablaCliente);
    }
    
    private void agregarEspacioEnBlanco(Document doc) throws DocumentException {
        Paragraph espacio = new Paragraph();
        espacio.add(Chunk.NEWLINE);
        espacio.add("");
        espacio.setAlignment(Element.ALIGN_CENTER);
        doc.add(espacio);
    }
    
    private void agregarProductos(Document doc, Font fuente) throws DocumentException {
        
        //AGREGAR LOS PRODUCTOS
        PdfPTable tablaProducto = new PdfPTable(4);
        tablaProducto.setWidthPercentage(100);
        tablaProducto.getDefaultCell().setBorder(0);
        
        //tamaño de celdas
        float[] ColumnaProducto = new float[]{15f, 50f, 15f, 20f};
        tablaProducto.setWidths(ColumnaProducto);
        tablaProducto.setHorizontalAlignment(Element.ALIGN_LEFT);
        PdfPCell producto1 = new PdfPCell(new Phrase("Cantidad: ", fuente));
        PdfPCell producto2 = new PdfPCell(new Phrase("Descripcion: ", fuente));
        PdfPCell producto3 = new PdfPCell(new Phrase("Precio Unitario: ", fuente));
        PdfPCell producto4 = new PdfPCell(new Phrase("Precio Total: ", fuente));
        
        //quitar bordes
        producto1.setBorder(0);
        producto2.setBorder(0);
        producto3.setBorder(0);
        producto4.setBorder(0);
        
        //agregar color al encabezado del producto
        producto1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        producto2.setBackgroundColor(BaseColor.LIGHT_GRAY);
        producto3.setBackgroundColor(BaseColor.LIGHT_GRAY);
        producto4.setBackgroundColor(BaseColor.LIGHT_GRAY);
        
        //agrega celdas a la tabla
        tablaProducto.addCell(producto1);
        tablaProducto.addCell(producto2);
        tablaProducto.addCell(producto3);
        tablaProducto.addCell(producto4);

        for (int i = 0; i < InterFacturacion.jTable_productos.getRowCount(); i++) {
            String producto = InterFacturacion.jTable_productos.getValueAt(i, 1).toString();
            String cantidad = InterFacturacion.jTable_productos.getValueAt(i, 2).toString();
            String precio = InterFacturacion.jTable_productos.getValueAt(i, 3).toString();
            String total = InterFacturacion.jTable_productos.getValueAt(i, 7).toString();

            tablaProducto.addCell(cantidad);
            tablaProducto.addCell(producto);
            tablaProducto.addCell(precio);
            tablaProducto.addCell(total);
        }

        //agregar la tabla documento
        doc.add(tablaProducto);
    }
    
    private void agregarTotalPagar(Document doc, String totalPagar) throws DocumentException {
        Paragraph info = new Paragraph();
        info.add(Chunk.NEWLINE);
        info.add("Total a pagar: " + totalPagar);
        info.setAlignment(Element.ALIGN_RIGHT);
        doc.add(info);
    }

    private void agregarFirma(Document doc) throws DocumentException {
        Paragraph firma = new Paragraph();
        firma.add(Chunk.NEWLINE);
        firma.add("Cancelacion y firma\n\n");
        firma.add("_______________________");
        firma.setAlignment(Element.ALIGN_CENTER);
        doc.add(firma);
    }

    private void agregarMensajeAgradecimiento(Document doc) throws DocumentException {
        Paragraph mensaje = new Paragraph();
        mensaje.add(Chunk.NEWLINE);
        mensaje.add("¡Gracias por su compra!");
        mensaje.setAlignment(Element.ALIGN_CENTER);
        doc.add(mensaje);
    }

    private void cerrarDocumentoPDF(Document doc) {
        doc.close();
    }

    private void abrirArchivoPDF(File file) throws IOException {
        Desktop.getDesktop().open(file);
    }

}
