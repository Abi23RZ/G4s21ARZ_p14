/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21arz_p14;
import ConexionDAO.Conexion;
import DTO.Datos;
import javax.swing.JOptionPane;


/**
 *
 * @author ABITA
 */
public class G4s21ARZ_p14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                new JFPrincipal().setVisible(true);
        Conexion conexion = new Conexion();
            conexion.Abrir();
            Datos datos = new Datos("Abigail Ramirez",19,"Abigailr4152@gmail.com");
           if(conexion.actualizar(datos)){
               System.out.println("se actualizo correctamente");
           }else{
               System.out.println("no se logro la cactualizacion");
           }
        conexion.cerrar();   
    }
       
   
    }
    

