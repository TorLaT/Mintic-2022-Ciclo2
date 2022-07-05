package modelo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class baseDeDatos {
    
   	private ArrayList<modelo> lstEstudiantes;
	
	public baseDeDatos() {
		this.lstEstudiantes = new ArrayList();
	}
	
	public void guardarEstudiante(modelo est) {
		this.lstEstudiantes.add(est);
	}
    
    	public void guardarArchivoEstudiantes() {
            try {
                    FileOutputStream archivo = new FileOutputStream("estudiantes_datos.dat");
                    ObjectOutputStream lapiz = new ObjectOutputStream(archivo);
                    lapiz.writeObject(this.lstEstudiantes);
                    lapiz.close();
                    archivo.close();
            } catch (FileNotFoundException e) {
                    System.out.print("Ruta de archivo no válida");		
            } catch (IOException e) {
                    System.out.println("No se puede escribir en el archivo");
                    e.printStackTrace();
            }
	}
    
}
