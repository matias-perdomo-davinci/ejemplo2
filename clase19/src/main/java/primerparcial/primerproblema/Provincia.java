package primerparcial.primerproblema;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Provincia {

    // ATRIBUTOS
    String nombre;
    String capital;
    String idioma;
    int poblacion;
    ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();

    // CONSTRUCTORES

    public Provincia (String nombre, String capital, String idioma, int poblacion){
        this.nombre = nombre;
        this.capital = capital;
        this.idioma = idioma;
        this.poblacion = poblacion;
    }

    public Provincia (String nombre) {
        this.nombre = nombre;
    }

    // METODOS

    public void agregarCiudad(Ciudad ciudad){
        this.ciudades.add(ciudad);
    }

    public void eliminarCiudad(Ciudad ciudad){
        this.ciudades.remove(ciudad);
    }

    public void calcularPoblacionProvincia(){
        int suma = 0;
        for (int i = 0; i < this.ciudades.size(); i++) {
            suma += this.ciudades.get(i).poblacion;
        }
        this.poblacion = suma;
    }

}
