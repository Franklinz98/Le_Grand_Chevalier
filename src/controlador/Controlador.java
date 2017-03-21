/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import modelo.Restaurante;
import vista.MenuPrincipal;

/**
 *
 * @author mybas
 */
public class Controlador {
    public static void main(String[] args) throws IOException {
        Restaurante rest = new Restaurante();
        MenuPrincipal MP = new MenuPrincipal();
        MP.setVisible(true);
    }
}
