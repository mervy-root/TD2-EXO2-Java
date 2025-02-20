public class Stagiaire {
    private String Nom;
    private float[] Notes;

    // Getters & Setters
    public String getNom() {
        return this.Nom;
    }

    public float[] getNotes() {
        return this.Notes;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setNotes(float[] Notes) {
        this.Notes = Notes;
    }

    // Constructeur surcharge
    public Stagiaire(String Nom, float[] Notes) {
        this.Nom = Nom;
        this.Notes = Notes;
    }

    // CalculerSomme
    public float calculerSomme() {
        float Somme = 0;
        for (float var : this.Notes) {
            Somme += var;
        }
        return Somme;
    }

    // CalculerMoyenne
    public float calculerMoyenne() {
        return this.calculerSomme() / ((float) this.Notes.length);
    }

    // Notes Max et Min d'un etudiant
    public float trouverMin() {
        float noteMin = this.Notes[0];
        for (float var : this.Notes) {
            if (noteMin > var) {
                noteMin = var;
            }
        }
        return noteMin;
    }

    public float trouverMax() {
        float noteMax = this.Notes[0];
        for (float var : this.Notes) {
            if (noteMax < var) {
                noteMax = var;
            }
        }
        return noteMax;
    }

}