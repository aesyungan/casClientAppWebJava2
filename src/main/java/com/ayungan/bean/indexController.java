/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ayungan.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import javax.servlet.http.HttpServletRequest;
import org.jasig.cas.client.authentication.AttributePrincipal;

/**
 *
 * @author Alex
 */
@ManagedBean
@ViewScoped
public class indexController {

    String nameUser = "";

    public indexController() {
        System.out.println("Hola");
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        nameUser = "";
        nameUser += request.getRemoteUser();
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

}
