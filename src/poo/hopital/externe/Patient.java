package poo.hopital.externe;

import poo.Personne;
import poo.hopital.general.Maladie;

public class Patient extends Personne {
    protected Maladie maladie;

    public Maladie getMaladie() {
        return maladie;
    }

    public void setMaladie(Maladie maladie) {
        this.maladie = maladie;
    }
}
