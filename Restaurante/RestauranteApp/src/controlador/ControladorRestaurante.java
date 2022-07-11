
package controlador;

import vista.FrmConfirmacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Pedido;
import modelo.PedidosDAO;
import vista.FrmBebidas;
import vista.FrmEntradas;
import vista.FrmFuerte;
import vista.FrmPostre;

public class ControladorRestaurante implements ActionListener, KeyListener  {
    Pedido ped= new Pedido();
    PedidosDAO pedDAO= new PedidosDAO();
    FrmBebidas objetoVistaBebidas= new FrmBebidas();
    FrmEntradas objetoVistaEntradas= new FrmEntradas();
    FrmFuerte objetoVistaFuerte= new FrmFuerte();
    FrmPostre objetoVistaPostre= new FrmPostre();
    FrmConfirmacion objetoVistaConfirmacion= new FrmConfirmacion();
//Jeimy no tocar 
    public ControladorRestaurante() {
        objetoVistaBebidas.rbCoca.addActionListener(this);
        objetoVistaBebidas.txtCoca.addKeyListener(this);
        objetoVistaBebidas.rbFanta.addActionListener(this);
        objetoVistaBebidas.rbSprit.addActionListener(this);
        objetoVistaBebidas.txtPedidoBebidas.addKeyListener(this);
        objetoVistaBebidas.btnAgregarBebidas.addActionListener(this);
        objetoVistaConfirmacion.btnConfirmar.addActionListener(this);
        
    }
    public void llenarTabla(JTable tablaD){
        DefaultTableModel modeloT= new DefaultTableModel();
        tablaD.setModel(modeloT);
        modeloT.addColumn("Numero de pedido");
        modeloT.addColumn("Descripcion");
        modeloT.addColumn("Cantidad");
        modeloT.addColumn("Total");
        Object [] columna = new Object[4];
        int numReg = pedDAO.obtenerPedidos().size();
        for(int i=0; i<numReg ;i++){
           ped=(Pedido)pedDAO.obtenerPedidos().get(i);
           if(objetoVistaBebidas.rbCoca.isSelected()){
               columna[0]=ped.getNumeroPedido();
               columna[1]=ped.getNombrePedido();
               columna[2]= ped.getCantidad();
               columna[3]= (ped.getCantidad()*1);
           }
           
        }
        
    }
        @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objetoVistaBebidas.btnAgregarBebidas){
            String numPedido=objetoVistaBebidas.txtPedidoBebidas.getText();
            String nombrePed=objetoVistaBebidas.rbCoca.getLabel();
            String cantidad= objetoVistaBebidas.txtCoca.getText();
            Pedido objPed= new Pedido(numPedido,nombrePed, Integer.parseInt(cantidad));
            pedDAO.insertarPedidos(objPed);
        }
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
