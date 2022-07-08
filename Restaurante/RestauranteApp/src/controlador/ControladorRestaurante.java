
package controlador;

import vista.FrmConfirmacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import vista.FrmBebidas;
import vista.FrmEntradas;
import vista.FrmFuerte;
import vista.FrmPostre;

public class ControladorRestaurante implements ActionListener, KeyListener  {
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
        
        objetoVistaBebidas.btnAgregarBebidas.addActionListener(this);
        objetoVistaConfirmacion.btnConfirmar.addActionListener(this);
    }
//    public void agregarBebidas(){
//        String bebidas="Las bebidas escogidas son \n";
//        String aux;
//        if(objetoVistaBebidas.rbCoca.isSelected()){
//            int a;
//            //String coca;
//            a=Integer.parseInt(objetoVistaBebidas.txtCoca.getText());
//            
//            bebidas+="Coca Cola "+"\nCantidad"+ a;
//        }
//        objetoVistaConfirmacion.txaConfirmacion.setText(bebidas); 
//        
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==objetoVistaBebidas.btnAgregarBebidas){
//            agregarBebidas();
//        }
        
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
