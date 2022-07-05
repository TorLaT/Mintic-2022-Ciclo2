package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.baseDeDatos;
import modelo.modelo;
import vista.vista1;
import vista.vista2;
import vista.vista3;

public class controlador implements ActionListener {
    modelo model;
    vista1 menuWindow;
    vista2 ingresarWindow;
    vista3 buscarWindow;
    private baseDeDatos bd;
    
    //Vista Menú Principal
    public controlador() {
        this.menuWindow = new vista1();
        this.ingresarWindow=new vista2();
        this.buscarWindow=new vista3();
        this.bd= new baseDeDatos();
        menuWindow.getBtn_ingresar().addActionListener(this); 
        menuWindow.getBtn_buscar().addActionListener(this);
        menuWindow.getBtn_salir().addActionListener(this);
        ingresarWindow.getBtn_atras().addActionListener(this);
        ingresarWindow.getjBtn_IngresarE().addActionListener(this);
        buscarWindow.getBtn_atras().addActionListener(this);
        
    }
    
    public void iniciar() {
        menuWindow.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Botones del menu principal
        if (e.getSource()==menuWindow.getBtn_ingresar()){  
            menuWindow.dispose();
            ingresarWindow.setVisible(true); 
        }        
        if (e.getSource()==menuWindow.getBtn_buscar()){
            buscarWindow.setVisible(true);
        }
        if (e.getSource()==menuWindow.getBtn_salir()){
            System.exit(0);
        }
        //Botones de ingresar
        if (e.getSource()==ingresarWindow.getjBtn_IngresarE()){
            ingresar();
            System.out.println("Estudiante guardado");
        }
        //Botones de buscar
        //botones de modificar
        //botones de eliminar
        //botones de listar
        //Botones en comun
        if (e.getSource()==ingresarWindow.getBtn_atras()  || e.getSource()==buscarWindow.getBtn_atras()){
            ingresarWindow.dispose();
            buscarWindow.dispose();
            iniciar();
        }

    }    
    public void ingresar(){       
        System.out.println("Debemos ingresar");
        String cedula=ingresarWindow.getTxt_cedula().getText();
        String nombre=ingresarWindow.getTxt_nombre().getText();
        String apellido=ingresarWindow.getTxt_apellido().getText();
        String telefono=ingresarWindow.getTxt_telefono().getText();
        String correo=ingresarWindow.getTxt_correo().getText();
        String programa=ingresarWindow.getTxt_programa().getText();
        modelo temp = new modelo(cedula, nombre,apellido,telefono,correo,programa);
        this.bd.guardarEstudiante(temp);
        this.bd.guardarArchivoEstudiantes();
	System.out.println("Se agregó el estudiante");
    }
    
    
    }

        
    




        
        

         
    
     
    
        
    

   


      

