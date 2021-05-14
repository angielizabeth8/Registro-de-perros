


package registro.de.perros;


import java.util.Scanner;

/**
 * @author angie
 */

public class RegistroDePerros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
    
        TablaDispersaEnlazada tabla = new TablaDispersaEnlazada();
        int clave;
        long valor;
        int resp;
        TipoPerro encontrado;

        
        do{
        System.out.print(("Menú Principal \n"
                        + "Insertar nuevo perro (1)\nBuscar (2)\nEliminar (3)\nSalir (4)\n"));
        resp=sc.nextInt();
        sc.nextLine();
    
        switch(resp){
            case 1: //nuevo
                 tabla.insertar(new TipoPerro());
            break;
            
            case 2://búsqueda
                System.out.print("Inserte código\n");
                 clave=sc.nextInt();
                 sc.nextLine();                                        
              if(tabla.buscar(clave)==null){
                  System.out.print("No se encontró el perro con el código "+clave+"\n");
              } else {
                  tabla.buscar(clave).perro.MostrarPerro();
              }
            break;
            
            case 3://eliminar
                System.out.print("Inserte código\n");
                 clave=sc.nextInt();
                 sc.nextLine();

                 tabla.eliminar(clave);
             break;
        }
         if(resp!=4){
             System.out.print("Presione 'enter' para continuar ");
             sc.nextLine();
         }
        }while(resp!=4);
    }
    
}
