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
public class Postre extends Plato{
    
    public Postre() throws IOException {
        super("/data/Postres.txt");
    }
    
}
