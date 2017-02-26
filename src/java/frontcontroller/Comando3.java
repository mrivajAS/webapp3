/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontcontroller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;

/**
 *
 * @author entrar
 */
public class Comando3 extends FrontCommand{


    @Override
    public void process() {
        request.setAttribute("mensaje", "Ya no esoty en Comando 1 sino en el <i>Comando 3</i>");
        try {
            forward("/MostrarMensaje");
        } catch (ServletException ex) {
            Logger.getLogger(Comando1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Comando1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
