package entity;

public class ScooterEssence extends Scooter{
    public ScooterEssence(String modele, String couleur, int puissance) {
        super(modele, couleur, puissance);
    }

    @Override
    public void affichageCaracteristique() {
        System.out.println("" +
                "\"ScooterEssence{\" +\n" +
                "                modele: "+super.modele+"\n" +
                "                couleur: "+super.couleur+"\n" +
                "                puissance: "+super.puissance+"\n" +
                "                '}'");
    }

}
