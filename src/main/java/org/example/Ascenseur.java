package org.example;

public class Ascenseur {
    private final int capacite = 1;
    private int positionNumEtage;
    private int destinationEtage;
    private boolean porteEstOuverte;


    public int getCapacite() {
        return capacite;
    }

    public int getPositionNumEtage() {
        return positionNumEtage;
    }

    public void setPositionNumEtage(int positionNumEtage) {
        this.positionNumEtage = positionNumEtage;
    }

    public boolean isPorteEstOuverte() {
        return porteEstOuverte;
    }

    public void setPorteEstOuverte(boolean porteEstOuverte) {
        this.porteEstOuverte = porteEstOuverte;
    }

    public void estAppele(Personne personne){
        //TODO
    }

    public void entre(Personne personne){
        //TODO
    }
    public void arriveAEtage(){
        //TODO
    }
    public void buttonDestinationPresse(int etageDestination) {
        this.destinationEtage = etageDestination;
    }
    public void personneSortAscenceur(Personne personne){
        //TODO
    }
}
