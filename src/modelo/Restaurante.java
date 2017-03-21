/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.jcp.xml.dsig.internal.dom.Utils;
import vista.MenuPrincipal;

/**
 *
 * @author mybas
 */
public class Restaurante {

    static class Ingrediente {

        String nombre;
        double cantidad;
        Ingrediente link;
    }

    static class Inventario {

        int codigo;
        String nombre;
        Ingrediente ptri;
        int precio;
        Inventario link;
    }

    static Inventario ptrPlatos;
    static Inventario ptrBebidas;
    static Inventario ptrPostres;

    static Ingrediente agregaringrediente(Ingrediente ptr, String nombre, double cantidad) {
        Ingrediente p = new Ingrediente();
        p.nombre = nombre;
        p.cantidad = cantidad;
        if (ptr == null) {
            ptr = p;
        } else {
            Ingrediente q = ptr;
            while (q.link != null) {
                q = q.link;
            }
            q.link = p;
        }
        return ptr;
    }

    static Inventario agregarProducto(Inventario ptr, int codigo, String nombre, String ingredientes, String cantidad, int precio) {
        Inventario p = new Inventario();
        p.codigo = codigo;
        p.nombre = nombre;
        p.precio = precio;
        String[] nomi = ingredientes.split(",");
        String[] canti = cantidad.split(",");

        int s = nomi.length;
        for (int i = 0; i < s; i++) {
            double temp = Double.parseDouble(canti[i]);
            //System.out.print(nomi[i] + " " + temp + " | ");
            p.ptri = agregaringrediente(p.ptri, nomi[i], temp);
        }
        if (ptr == null) {
            ptr = p;
        } else {
            Inventario q = ptr;
            while (q.link != null) {
                q = q.link;
            }
            q.link = p;
        }
        //System.out.println();
        return ptr;
    }

    /**
     * @param args the command line arguments
     */
    static void inventario() throws FileNotFoundException, IOException {
        File plato = new File(Utils.class.getResource("/data/Platos.txt").getPath());
        BufferedReader bf;
        bf = new BufferedReader(new FileReader(plato));
        String Linea;
        while ((Linea = bf.readLine()) != null) {
            String[] info = Linea.split(";");
            ptrPlatos = agregarProducto(ptrPlatos, Integer.parseInt(info[0]), info[1], info[2], info[3], Integer.parseInt(info[4]));
        }
        //System.out.println();
        //System.out.println();
        plato = new File(Utils.class.getResource("/data/Bebidas.txt").getPath());
        bf = new BufferedReader(new FileReader(plato));
        while ((Linea = bf.readLine()) != null) {
            String[] info = Linea.split(";");
            ptrBebidas = agregarProducto(ptrBebidas, Integer.parseInt(info[0]), info[1], info[2], info[3], Integer.parseInt(info[4]));
        }
        //System.out.println();
        //System.out.println();
        plato = new File(Utils.class.getResource("/data/Postres.txt").getPath());
        bf = new BufferedReader(new FileReader(plato));
        while ((Linea = bf.readLine()) != null) {
            String[] info = Linea.split(";");
            ptrPostres = agregarProducto(ptrPostres, Integer.parseInt(info[0]), info[1], info[2], info[3], Integer.parseInt(info[4]));
        }
    }

    public static void main(String[] args) throws IOException {
        inventario();
        MenuPrincipal MP = new MenuPrincipal();
        MP.setVisible(true);
    }

}
