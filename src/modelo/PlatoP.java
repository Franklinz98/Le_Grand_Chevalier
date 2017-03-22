/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.IOException;

/**
 *
 * @author mybas
 */
public class PlatoP extends Plato{
    
    public PlatoP() throws IOException {
        super("Platos.txt");
    }
    public static String Buscarnombre(int codigo){
        Inventario p=ptr;
        while (p.codigo!=codigo&&p.link!=null){
            p=p.link;
        }
        return p.nombre;
    }
    static public int Buscarprecio (int codigo){
        Inventario p=ptr;
        while (p.codigo!=codigo&&p.link!=null){
            p=p.link;
        }
        return p.precio;
    }
}
