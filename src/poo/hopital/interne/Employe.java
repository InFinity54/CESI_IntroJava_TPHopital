package poo.hopital.interne;

import poo.Personne;

public class Employe extends Personne {
    protected int salaire;

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
}
