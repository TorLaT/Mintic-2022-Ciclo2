package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.modelo;
import vista.vista1;
import vista.vista2;

public class controlador implements ActionListener {

    modelo model;
    vista1 menu;
    vista2 ingresar;
    
    public controlador() {  //constructor
        this.menu = new vista1();  //Nuevo objeto de tipo vista1, ahi veremos el menu
        this.ingresar=new vista2(); //Nuevo objeto de tipo vista2
        menu.getBtn_ingresar().addActionListener(this);
        menu.getBtn_salir().addActionListener(this);
    }
    
    public void iniciar() {
        menu.setVisible(true);
    }
    
    @Override
    //Darle vida a los botones
    public void actionPerformed(ActionEvent e){
        //Aqui los botones del menu
        if (e.getSource() == menu.getBtn_ingresar()) {
            ingresar.setVisible(true);
            menu.dispose();
        }
        if (e.getSource()==menu.getBtn_salir()){
            System.exit(0);
        }
        
        //Aqui los botones de buscar
        //Aqui los botones de modificar
        //Aqui los botones de eliminar
        //Aqui los botones de lista
        //Aqui los botones en comun
    }
    
}
