
package registro.de.perros;

import java.util.Scanner;


public class TipoPerro {
    
    Scanner sc = new Scanner(System.in);
    
    int codigo;
    private String nombre;
    private final String raza;
    private int peso;
    private String nacimiento;
    
    
    public TipoPerro(){
        System.out.print("Número de identificación: ");
        codigo = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Raza: ");
        raza = sc.nextLine();
        System.out.print("Peso: ");
        peso = sc.nextInt();
        sc.nextLine();
        System.out.println("Fecha de nacimiento (dd/mm/AAA): ");
        nacimiento = sc.nextLine();
        
    }
    public int getCodigo(){
        return codigo;
    }
    
    void MostrarPerro (){
        System.out.print("Número de identificación: "+codigo
                + "Nombre: "+nombre+"\n"
                + "Raza: "+raza+"\n"
                + "Peso: "+peso+"\n"
                + "Fecha de nacimiento: "+nacimiento+"\n");
    }
    
};


