/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unileon.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@ApplicationScoped
public class PlantillaController implements Serializable {
    
    public void verificarYMostrar(){
        
        if (FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario") == null){
            System.out.println("permisosInsuficientes.xhtml");
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("/Cinefilos/publico/permisosInsuficientes.xhtml");
            } catch (IOException ex) {
                Logger.getLogger(PlantillaController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void salir() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        try {  
            FacesContext.getCurrentInstance().getExternalContext().redirect("/Cinefilos");
        } catch (IOException ex) {
            Logger.getLogger(PlantillaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
