/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author jacqu
 */
public class Ticket
{
    private int idTicket, numUser, numEtat;
    private String nomTicket;
    private String dateTicket;
    private String nomEtat;

    public Ticket(int idTicket, int numUser, int numEtat, String nomTicket, String dateTicket) {
        this.idTicket = idTicket;
        this.numUser = numUser;
        this.numEtat = numEtat;
        this.nomTicket = nomTicket;
        this.dateTicket = dateTicket;
    }
    
    
    
    public Ticket(int unId, String unNom, String uneDate, String unNomEtat)
    {
        idTicket = unId;
        nomTicket = unNom;
        dateTicket = uneDate;
        nomEtat = unNomEtat;       
    }

    public int getIdTicket() {
        return idTicket;
    }

    public String getNomTicket() {
        return nomTicket;
    }

    public void setNomTicket(String nomTicket) {
        this.nomTicket = nomTicket;
    }

    public String getDateTicket() {
        return dateTicket;
    }

    public void setDateTicket(String dateTicket) {
        this.dateTicket = dateTicket;
    }

    public String getNomEtat() {
        return nomEtat;
    }

    public void setNomEtat(String nomEtat) {
        this.nomEtat = nomEtat;
    }

    /**
     * @return the numUser
     */
    public int getNumUser() {
        return numUser;
    }

    /**
     * @param numUser the numUser to set
     */
    public void setNumUser(int numUser) {
        this.numUser = numUser;
    }

    /**
     * @return the numEtat
     */
    public int getNumEtat() {
        return numEtat;
    }

    /**
     * @param numEtat the numEtat to set
     */
    public void setNumEtat(int numEtat) {
        this.numEtat = numEtat;
    }
}
