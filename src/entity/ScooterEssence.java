package entity;

public class ScooterEssence extends Scooter{
    public ScooterEssence(String modele, String couleur, int puissance) {
        super(modele, couleur, puissance);
    }

    @Override
    public void affichageCaracteristique() {
        System.out.println("" +
                "\"ScooterEssence{\" +\n" +
                "                \"modele='\" + modele + '\\'' +\n" +
                "                \", couleur='\" + couleur + '\\'' +\n" +
                "                \", puissance=\" + puissance +\n" +
                "                '}'");
    }

}
