package entity;

public class AutomobileElectricite extends Automobile{

    public AutomobileElectricite(String modele, int puissance, double espace) {
        super(modele, puissance, espace);
    }

    @Override
    public void affichageCaracteristique() {
        System.out.println("" +
                "\"AutomobileElectricite{\" +\n" +
                "                \"modele='\" + modele + '\\'' +\n" +
                "                \", puissance=\" + puissance +\n" +
                "                \", espace=\" + espace +\n" +
                "                '}'");
    }
}
