package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.BaseDeDatos;
import modelo.modelo;
import vista.vista1;
import vista.vista2;
import vista.vista3;
import vista.vista4;

public class controlador implements ActionListener {
    //Atributos de la clase
    modelo model;
    vista1 menu;
    vista2 ingresar;
    vista3 buscar;
    vista4 modificar;
    BaseDeDatos bd;
    
    public controlador() {  //constructor
        this.menu = new vista1();  //Nuevo objeto de tipo vista1, ahi veremos el menu
        this.ingresar=new vista2(); //Nuevo objeto de tipo vista2
        this.bd=new BaseDeDatos(); //Nuevo objeto de tipo base de datos
        this.buscar=new vista3();// Nuevo objeto de tipo vista3, aqui buscaremos al estudiante
        this.modificar=new vista4();//Nuevo objeto de la vista4, aqui vamos a modiifcar
        menu.getBtn_ingresar().addActionListener(this);
        menu.getBtn_salir().addActionListener(this);
        menu.getBtn_buscar().addActionListener(this);
        menu.getBtn_modificar().addActionListener(this);
        ingresar.getBtn_guardar().addActionListener(this);
        ingresar.getBtn_cancelar().addActionListener(this);
        buscar.getBtn_buscar().addActionListener(this);
        buscar.getBtn_cancelar().addActionListener(this);
        modificar.getBtn_buscar().addActionListener(this);
        modificar.getBtn_modificar().addActionListener(this);
        
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
        
        if (e.getSource()==menu.getBtn_modificar()){
            modificar.setVisible(true);
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
        if (e.getSource()==modificar.getBtn_buscar()){
            mod_buscar();
        }
        
        if (e.getSource()==modificar.getBtn_modificar()){
            modificar();
        }
        
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
    JOptionPane.showMessageDialog(ingresar, "Estudiante guardado correctamente", "Todo salió OK!", 0);
    ingresar.getTxt_nombre().setText(null);
    }
    
    
    public void buscar(){
        ingresar.getTxt_nombre().setText(null);
        String id=buscar.getTxt_cedula().getText();
        modelo resultado=bd.buscarEstudiante(id);
        buscar.getTxt_nombre().setText(resultado.getNombre());
        buscar.getTxt_apellido().setText(resultado.getApellido());
        buscar.getTxt_correo().setText(resultado.getCorreo());
        buscar.getTxt_telefono().setText(resultado.getTelefono());
        buscar.getTxt_programa().setText(resultado.getPrograma());
    }
    
    public void mod_buscar(){
        String id=modificar.getTxt_cedula().getText();
        modelo resultado=bd.buscarEstudiante(id);
        modificar.getTxt_nombre().setText(resultado.getNombre());
        modificar.getTxt_apellido().setText(resultado.getApellido());
        modificar.getTxt_correo().setText(resultado.getCorreo());
        modificar.getTxt_telefono().setText(resultado.getTelefono());
        modificar.getTxt_programa().setText(resultado.getPrograma());
    }
    
    public void modificar(){
        String id=modificar.getTxt_cedula().getText();
        String nombre=modificar.getTxt_nombre().getText();
        String apellido=modificar.getTxt_apellido().getText();
        String correo=modificar.getTxt_correo().getText();
        String telefono=modificar.getTxt_telefono().getText();
        String programa=modificar.getTxt_programa().getText();
        if ("".equals(nombre) || "".equals(apellido)){
            JOptionPane.showMessageDialog(modificar, "No hay datos para modificar", "Not OK!", 0);
        }
        else{
        modelo newEst= new modelo(id, nombre, apellido, telefono, correo,programa);
        bd.modificarEst(id, newEst);
        }
        ingresar.getTxt_nombre().setText(null);  //Ejemplo
    }
    
}
