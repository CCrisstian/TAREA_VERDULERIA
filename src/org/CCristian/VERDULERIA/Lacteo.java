package org.CCristian.VERDULERIA;

public class Lacteo extends Producto{

    /*----------ATRIBUTOS----------*/
    private int cantidad;
    private int proteinas;
    /*----------ATRIBUTOS----------*/

    /*----------GETTER-SETTER----------*/
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }
    /*----------GETTER-SETTER----------*/

    /*----------CONSTRUCTOR----------*/
    public Lacteo (String nombre, double precio, int cantidad, int proteinas){
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }
    /*----------CONSTRUCTOR----------*/

    /*----------MÉTODO----------*/
    @Override
    public String toString() {
        return super.toString() +
                "\nCantidad : " + cantidad +
                "\nProteínas  : " + proteinas;
    }
    /*----------MÉTODO----------*/

}
