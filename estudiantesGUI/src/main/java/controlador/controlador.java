package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.BaseDeDatos;
import modelo.modelo;
import vista.vista1;
import vista.vista2;
import vista.vista3;

public class controlador implements ActionListener {
    //Atributos de la clase
    modelo model;
    vista1 menu;
    vista2 ingresar;
    vista3 buscar;
    BaseDeDatos bd;
    
    public controlador() {  //constructor
        this.menu = new vista1();  //Nuevo objeto de tipo vista1, ahi veremos el menu
        this.ingresar=new vista2(); //Nuevo objeto de tipo vista2
        this.bd=new BaseDeDatos(); //Nuevo objeto de tipo base de datos
        this.buscar=new vista3();// Nuevo objeto de tipo vista3, aqui buscaremos al estudiante
        menu.getBtn_ingresar().addActionListener(this);
        menu.getBtn_salir().addActionListener(this);
        menu.getBtn_buscar().addActionListener(this);
        ingresar.getBtn_guardar().addActionListener(this);
        ingresar.getBtn_cancelar().addActionListener(this);
        buscar.getBtn_buscar().addActionListener(this);
        buscar.getBtn_cancelar().addActionListener(this);
        
    }
    
    public void iniciar() {
        menu.setVisible(true);
    }
    
    @Override
    //Darle vida a los botones
    public void actionPerformed(ActionEvent e){
        //Aqui los botones del vista_menu
        if (e.getSource() == menu.getBtn_ingresar()) {
            ingresar.setVisible(true);
            menu.dispose();
        }
        if (e.getSource()==menu.getBtn_buscar()){
            buscar.setVisible(true);
            menu.dispose();
        }
        
        if (e.getSource()==menu.getBtn_salir()){
            System.exit(0);
        }
        
        //Aqui los botones de Vista_ingresar
        if (e.getSource()==ingresar.getBtn_guardar()){
            guardar();
        }        
        
        //Aqui los botones de vista_buscar
        if (e.getSource()==buscar.getBtn_buscar()){
            buscar();
        }     
        
        
        //Aqui los botones de modificar
        //Aqui los botones de eliminar
        //Aqui los botones de lista
        //Aqui los botones en comun de todas las vistas
        if (e.getSource()==ingresar.getBtn_cancelar()){
            ingresar.dispose();
            menu.setVisible(true);
        }
    }
    
    public void guardar(){
    String id=ingresar.getTxt_cedula().getText();
    String nombre=ingresar.getTxt_nombre().getText();
    String apellido=ingresar.getTxt_apellido().getText();
    String correo=ingresar.getTxt_correo().getText();
    String telefono=ingresar.getTxt_telefono().getText();
    String programa=ingresar.getTxt_programa().getText();
    modelo nuevoEst=new modelo(id,nombre,apellido,telefono,correo,programa);
    bd.guardarEstudiante(nuevoEst);
    }
    
    
    public void buscar(){
        String id=buscar.getTxt_cedula().getText();
        modelo resultado=bd.buscarEstudiante(id);
        buscar.getTxt_nombre().setText(resultado.getNombre());
        buscar.getTxt_apellido().setText(resultado.getApellido());
        buscar.getTxt_correo().setText(resultado.getCorreo());
        buscar.getTxt_telefono().setText(resultado.getTelefono());
        buscar.getTxt_programa().setText(resultado.getPrograma());
    }
    
}
