package entity;

public class ScooterElectricite extends Scooter{

    public ScooterElectricite(String modele, String couleur, int puissance) {
        super(modele, couleur, puissance);
    }

    @Override
    public void affichageCaracteristique() {
        System.out.println("" +
                "\"ScooterElectricite{\" +\n" +
                "                modele: "+super.modele+"\n" +
                "                couleur: "+super.couleur+"\n" +
                "                puissance: "+super.puissance+"\n" +
                "                '}'");
    }

}
