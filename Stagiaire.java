import java.util.Random;

public class Stagiaire {
    private String Nom;
    private float[] Notes;

    public final static int NBRE_NOTES = 5;

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
        this.Notes = new float[NBRE_NOTES];
        this.Notes = Notes;
    }

    // Constructeur surcharge
    public Stagiaire(String Nom) {
        this.Nom = Nom;
        this.Notes = new float[5];
        // this.Notes = null;
    }

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
        return this.calculerSomme() / ((float) Stagiaire.NBRE_NOTES);
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

    // RandomArrayNotes
    public float[] RandomArrayNotes(int NbreNotes) {
        Random random = new Random();
        // float tabNotes[] = new float[NbreNotes];
        this.Notes = new float[NbreNotes];
        for (int i = 0; i < NbreNotes; i++) {
            this.Notes[i] = random.nextFloat(20);
        }
        return getNotes();
    }

    public void afficherArrayNotes() {
        System.out.println("notes random : ");
        // float[] tabNotesRandom = RandomArrayNotes((5));
        for (float tmp : this.Notes) {
            System.out.println(tmp);
        }
    }

    public String toString() {
        String str;
        str = "Nom stagiaire : " + this.getNom() +
                "\n\tNotes : " + this.afficherNotes();
        return str;
    }

    public String afficherNotes() {
        String notesString = "";
        for (float tmp : this.Notes) {
            notesString += tmp + "\t";
        }
        return notesString;
    }
}