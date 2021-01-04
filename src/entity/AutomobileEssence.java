package entity;

public class AutomobileEssence extends Automobile{

    public AutomobileEssence(String modele, int puissance, double espace) {
        super(modele, puissance, espace);
    }

    @Override
    public void affichageCaracteristique() {
        System.out.println("" +
                "\"AutomobileEssence{\"+\n" +
                "                \"modele: "+super.modele+"\n" +
                "                \"puissance: "+super.puissance +"\n" +
                "                \"espace: "+super.espace +"\n" +
                "                '}'");
    }

}
