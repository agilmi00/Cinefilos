/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unileon.EJB;

import com.unileon.modelo.PeliculaGenero;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Cl0ud7
 */
@Stateless
public class PeliculaGeneroFacade extends AbstractFacade<PeliculaGenero> implements PeliculaGeneroFacadeLocal {

    @PersistenceContext(unitName = "cinefilosPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PeliculaGeneroFacade() {
        super(PeliculaGenero.class);
    }
    
}
