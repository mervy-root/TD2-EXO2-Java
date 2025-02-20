public class Formation {
    private String Intitule;
    private int NbrJours;
    public Stagiaire[] tabStagiaires;

    // Getters & Setters
    public String getIntitule() {
        return this.Intitule;
    }

    public int getNbrJours() {
        return this.NbrJours;
    }

    public void setIntitule(String Intitule) {
        this.Intitule = Intitule;
    }

    public void setNbrJours(int NbrJours) {
        this.NbrJours = NbrJours;
    }

    // Constructeurs
    public Formation(String Intitule, int NbrJours, Stagiaire[] stagiaires) {
        this.Intitule = Intitule;
        this.NbrJours = NbrJours;
        this.tabStagiaires = stagiaires;
    }

    // calculerMoyenneFormation()
    public float calculerMoyenneFormation() {
        float SumMoy = 0;
        for (Stagiaire stagiaire : tabStagiaires) {
            SumMoy = SumMoy + stagiaire.calculerMoyenne();
        }
        return ((float) SumMoy / (float) this.tabStagiaires.length);
    }

    // getIndexMax()
    public int getIndexMax() {
        int IndiceMax = -1;

        for (int i = 0; i < (this.tabStagiaires.length - 1); i++) {
            if (tabStagiaires[i].calculerMoyenne() < tabStagiaires[i + 1].calculerMoyenne()) {
                IndiceMax = i + 1;
            }
        }
        return IndiceMax;
    }

    // 9 afficherNomMax()
    // Je ne sais pas trop ce que ca signifie
    public void afficherNomMax() {
        int IndiceMax = this.getIndexMax();
        System.out.println("Nom Stagiaire: " + this.tabStagiaires[IndiceMax].getNom() +
                " \n Moyenne: " + this.tabStagiaires[IndiceMax].calculerMoyenne());

    }

    // 11 trouverMoyenneParNom(String Nom)
    public Stagiaire rechercherStagiaireParNom(String Nom) {

        for (Stagiaire stagiaire : this.tabStagiaires) {
            if ((stagiaire.getNom()).equals(Nom)) {
                return stagiaire;
            }
        }
        return null;
    }

    public void trouverMoyenneParNom(String Nom) {
        Stagiaire stagiaire = rechercherStagiaireParNom(Nom);
        if (stagiaire != null)
            System.out.println("Nom Stagiaire: " + stagiaire.getNom() +
                    " \n Moyenne: " + stagiaire.calculerMoyenne());
        else
            System.out.println("Le stagiaire de nom: " + Nom +
                    " n'existe pas dans la base de donnees");
    }

}
