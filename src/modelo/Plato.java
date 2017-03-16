/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author mybas
 */
public abstract class Plato {
    class Ing {

        String nombre;
        int codigo;
        float cantidad;
        Ing link;
    }
    
    private float precio;

    private String nombreplato;

    private int cantidad;

    private Ing ptr;

    Ing AgregarIngrediente(Ing ptr, String nom, float cant, int cod) {
        Ing p = new Ing();
        p.cantidad=cant;
        p.nombre=nom;
        p.codigo=cod;
        if (ptr == null) {
            ptr = p;
        } else {
            Ing q = ptr;
            while (q.link != null) {
                q = q.link;
            }
            q.link = p;
        }
        return ptr;
    }

    public Plato(float precio, String nombreplato, String nom, float cant, int cod) {
        this.ptr=null;
        this.precio = precio;
        this.nombreplato = nombreplato;
        ptr=AgregarIngrediente(ptr,nom, cant, cod);
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombreplato() {
        return nombreplato;
    }

    public void setNombreplato(String nombreplato) {
        this.nombreplato = nombreplato;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
