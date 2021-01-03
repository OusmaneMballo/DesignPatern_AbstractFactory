package entity;

public class AutomobileEssence extends Automobile{

    public AutomobileEssence(String modele, int puissance, double espace) {
        super(modele, puissance, espace);
    }

    @Override
    public void affichageCaracteristique() {
        System.out.println("" +
                "\"AutomobileEssence{\" +\n" +
                "                \"modele='\" + modele + '\\'' +\n" +
                "                \", puissance=\" + puissance +\n" +
                "                \", espace=\" + espace +\n" +
                "                '}'");
    }

}
