package primerparcial.primerproblema;

import java.util.ArrayList;

public class Pais {

    // ATRIBUTOS
    String nombre;
    String capital;
    String idioma;
    String moneda;
    int poblacion;
    ArrayList<Provincia> provincias = new ArrayList<Provincia>();

    // CONSTRUCTORES

    public Pais (String nombre, String capital, String idioma,String moneda, int poblacion){
        this.nombre = nombre;
        this.capital = capital;
        this.idioma = idioma;
        this.moneda = moneda;
        this.poblacion = poblacion;
    }

    public Pais (String nombre){
        this.nombre = nombre;
    }

    // METODOS

    public void agregarProvincia(Provincia provincia) {
        this.provincias.add(provincia);
    }

    public void eliminarProvincia(Provincia provincia) {
        this.provincias.remove(provincia);
    }

    public void calcularPoblacionPais(){
        int suma = 0;
        for (int i = 0; i < this.provincias.size(); i++) {
            this.provincias.get(i).calcularPoblacionProvincia();
            suma += this.provincias.get(i).poblacion;
        }
        this.poblacion = suma;
    }

}
