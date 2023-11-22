package org.example;

public class Personne {
    private int positionActuelleEtage;
    private int positionSouhaiteeEtage;

    public int getPositionActuelleEtage() {
        return positionActuelleEtage;
    }

    public void setPositionActuelleEtage(int positionActuelleEtage) {
        this.positionActuelleEtage = positionActuelleEtage;
    }

    public int getPositionSouhaiteeEtage() {
        return positionSouhaiteeEtage;
    }

    public void setPositionSouhaiteeEtage(int positionSouhaiteeEtage) {
        this.positionSouhaiteeEtage = positionSouhaiteeEtage;
    }

    public Personne(int positionActuelleEtage, int positionSouhaiteeEtage) {
        this.positionActuelleEtage = positionActuelleEtage;
        this.positionSouhaiteeEtage = positionSouhaiteeEtage;
    }

    
}
