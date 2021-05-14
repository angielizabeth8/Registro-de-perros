
package registro.de.perros;

/**
 *
 * @author angie
 */
public class Elemento {
    TipoPerro perro;
    Elemento sgte;
    public Elemento(TipoPerro e){
        perro = e;
        sgte = null;
    }

    public TipoPerro getPerro(){
    return perro;
    }
};
