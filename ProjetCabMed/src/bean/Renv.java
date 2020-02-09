/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Date;


/**
 *
 * @author Hamza
 */
public class Renv {
    private int id;
    private Date jour_date;
    private int id_client;
    private int id_creneau;

    public Renv(int id, Date jour_date, int id_client, int id_creneau) {
        this.id = id;
        this.jour_date = jour_date;
        this.id_client = id_client;
        this.id_creneau = id_creneau;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getJour_date() {
        return jour_date;
    }

    public void setJour_date(Date jour_date) {
        this.jour_date = jour_date;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public int getId_creneau() {
        return id_creneau;
    }

    public void setId_creneau(int id_creneau) {
        this.id_creneau = id_creneau;
    }
    
    
}
