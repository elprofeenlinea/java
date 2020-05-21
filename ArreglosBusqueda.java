
package cursojava;
import javax.swing.*;

public class ArreglosBusqueda {

    static String nombres[] = new String[5];

    
    public static void main(String[] args) {

        nombres[0]="Juan";
        nombres[1]="Nico";
        nombres[2]="Pedro";
        nombres[3]="Ana";
        nombres[4]="Maria";
        
        String buscado=JOptionPane.showInputDialog("Ingrese un nombre a buscar");
        boolean encontrado=false;
        int i=0;
        while (i <nombres.length) {
            if (buscado.equals(nombres[i])) {
            encontrado=true;
            
            
                       
        } 
            i++;
        }
        
        if (encontrado==true) {
            JOptionPane.showMessageDialog(null, "El nombre " + buscado + " si existe en el arreglo");
            
        } else {
            
            JOptionPane.showMessageDialog(null, "El nombre " + buscado + " No se encuentra en el arreglo");
        }
    }
    
    
}
