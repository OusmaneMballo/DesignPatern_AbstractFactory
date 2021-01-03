package entity;

public abstract class Automobile {

        protected String modele;
        protected int puissance;
        protected double espace;

    public Automobile(String modele, int puissance, double espace) {
        this.modele = modele;
        this.puissance = puissance;
        this.espace = espace;
    }

    public abstract void affichageCaracteristique();
}
