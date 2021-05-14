
package registro.de.perros;

/**
 *
 * @author angie
 */
public class TablaDispersaEnlazada {
  static final double R = 0.618034;
  static final int M = 50;
  private int numElementos;
  private double factorCarga;
  private Elemento [] tabla;
  
  //...

  public TablaDispersaEnlazada(){   //constructor
    tabla = new Elemento[M];
    for (int k = 0; k < M; k++)
        tabla[k] = null;
    numElementos = 0;
  }

  static int dispersion(long x){
    double t;
    int v;
    t = R * x - Math.floor(R * x); // parte decimal
    v = (int) (M * t);
    return v;
  }


    public void insertar(TipoPerro s){
        int posicion;
        Elemento nuevo;
        posicion = dispersion(s.getCodigo());
        nuevo = new Elemento(s);
        nuevo.sgte = tabla[posicion];
        tabla[posicion] = nuevo;
        numElementos++;
    }

  boolean conforme(TipoPerro a){
      if(a==null){
          System.out.print("No se eliminarán datos\n");
      } else {
        System.out.println("Se eliminarán los siguientes datos: \n");
        a.MostrarPerro();
      }
      return true;
  }

  public void eliminar(int codigo){
    int posicion;
    posicion = dispersion(codigo);
    if (tabla[posicion] != null){   //no está vacía
        Elemento anterior, actual;
        anterior = null;
        actual = tabla[posicion];
        while ((actual.sgte != null) && actual.getPerro().getCodigo() != codigo){
            anterior = actual;
            actual = actual.sgte;
        }
        if (actual.getPerro().getCodigo() != codigo)
            System.out.println("No se encuentra en la tabla el socio " + codigo);
        else if (conforme (actual.getPerro())){     //se retira el nodo
            if (anterior == null) // primer nodo
                tabla[posicion] = actual.sgte;
        else
            anterior.sgte = actual.sgte;
        actual = null;
        numElementos--;
        }
    }
  }
  
  public Elemento buscar(int codigo){
    Elemento p = null;
    int posicion;
    posicion = dispersion(codigo);
    if (tabla[posicion] != null){
        p = tabla[posicion];
        while ((p.sgte != null) && p.perro.codigo != codigo){
            p = p.sgte;}
        if (p.perro.codigo != codigo){
            p = null;}
    }
    return p;
  }
  
}
