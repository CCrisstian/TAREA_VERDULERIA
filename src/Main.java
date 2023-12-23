import org.CCristian.VERDULERIA.*;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Lacteo NuevoLacteo1 = new Lacteo("Lacteo1",20D,1,100);
        Lacteo NuevoLacteo2 = new Lacteo("Lacteo2",25D,3,200);

        Fruta NuevaFruta1 = new Fruta("Fruta1",30D,2D,"Rojo");
        Fruta NuevaFruta2 = new Fruta("Fruta2",10D,20D,"Verde");

        Limpieza NuevoLimpieza1 = new Limpieza("Limpieza1",6D,"Detergente",1D);
        Limpieza NuevoLimpieza2 = new Limpieza("Limpieza2",5D,"Jabón",5D);

        NoPerecible NoPerecible1 = new NoPerecible("Picadillo",1D,3,30);
        NoPerecible NoPerecible2 = new NoPerecible("Atún",8D,4,60);

        Carrito Carrito_de_Compras = new Carrito();

        Carrito_de_Compras.addItemCarrito(NuevoLacteo1);
        Carrito_de_Compras.addItemCarrito(NuevoLacteo2);
        Carrito_de_Compras.addItemCarrito(NuevaFruta1);
        Carrito_de_Compras.addItemCarrito(NuevaFruta2);
        Carrito_de_Compras.addItemCarrito(NuevoLimpieza1);
        Carrito_de_Compras.addItemCarrito(NuevoLimpieza2);
        Carrito_de_Compras.addItemCarrito(NoPerecible1);
        Carrito_de_Compras.addItemCarrito(NoPerecible2);

        System.out.printf(Carrito_de_Compras.GenerarDetalle());



    }

}