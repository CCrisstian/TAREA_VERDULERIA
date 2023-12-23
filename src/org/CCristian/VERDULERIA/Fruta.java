package org.CCristian.VERDULERIA;

public class Fruta extends Producto{

    /*----------ATRIBUTOS----------*/
    private double peso;
    private String color;
    /*----------ATRIBUTOS----------*/

    /*----------GETTER-SETTER----------*/
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    /*----------GETTER-SETTER----------*/

    /*----------CONSTRUCTOR----------*/
    public Fruta (String nombre, double precio, double peso, String color){
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }
    /*----------CONSTRUCTOR----------*/

    /*----------MÉTODO----------*/
    @Override
    public String toString(){
        return super.toString() +
                "\nPeso : " + peso +
                "\nColor : " + color;
    }
    /*----------MÉTODO----------*/


}
