
//import java.text.Normalizer.Form;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Declaration de trois stagiaires
        float[] notes1 = RandomArrayNotes(5);
        Stagiaire stagiaire1 = new Stagiaire("Lionel", notes1);

        float[] notes2 = RandomArrayNotes(5);
        Stagiaire stagiaire2 = new Stagiaire("Messi", notes2);

        float[] notes3 = RandomArrayNotes(5);
        Stagiaire stagiaire3 = new Stagiaire("Christiano", notes3);

        // Creation d'un tableau de stagiaire
        Stagiaire[] tabStagiaires = new Stagiaire[5];
        tabStagiaires[0] = stagiaire1;
        tabStagiaires[1] = stagiaire2;
        tabStagiaires[2] = stagiaire3;

        // Affectation a une meme formation
        Formation formation1 = new Formation("Formation1", 15, tabStagiaires);

    }

    // RandomArrayNotes
    public static float[] RandomArrayNotes(int NbreNotes) {
        Random random = new Random();
        float tabNotes[] = new float[NbreNotes];
        for (int i = 0; i < NbreNotes; i++) {
            tabNotes[i] = random.nextFloat(20);
        }
        return tabNotes;
    }
}

/*
 * 12.Dans la méthode main de la classe principale
 * Main, testez toutes les méthodes réalisées dans
 * les questions précédentes (créez par exemple
 * trois objets Stagiaire et affectez-les à une même
 * formation et faites appel aux quatre dernières
 * méthodes que vous avez implémentées).
 */