/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontcontroller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

/**
 *
 * @author entrar
 */
public class Comando1 extends FrontCommand{

    @Override
    public void process() {
        HttpSession sesion=request.getSession();
        ArrayList list=(ArrayList) sesion.getAttribute("lista");
        if(list==null)
        {
            list=new ArrayList();
            sesion.setAttribute("lista", list);
        }
        String nombre=request.getParameter("lista");
        if(nombre!=null)
        {
            list.add(nombre);
            request.setAttribute("lista", list);
        }
        
        try {
            forward("/MostrarMensaje");
        } catch (ServletException ex) {
            Logger.getLogger(Comando1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Comando1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
