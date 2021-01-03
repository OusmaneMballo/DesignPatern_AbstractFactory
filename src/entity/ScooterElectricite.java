package entity;

public class ScooterElectricite extends Scooter{

    public ScooterElectricite(String modele, String couleur, int puissance) {
        super(modele, couleur, puissance);
    }

    @Override
    public void affichageCaracteristique() {
        System.out.println("" +
                "\"ScooterElectricite{\" +\n" +
                "                \"modele='\" + modele + '\\'' +\n" +
                "                \", couleur='\" + couleur + '\\'' +\n" +
                "                \", puissance=\" + puissance +\n" +
                "                '}'");
    }

}
