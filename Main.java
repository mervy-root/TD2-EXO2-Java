
//import java.text.Normalizer.Form;
//import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Declaration de trois stagiaires

        Stagiaire stagiaire1 = new Stagiaire("Lionel");
        stagiaire1.RandomArrayNotes(5);

        Stagiaire stagiaire2 = new Stagiaire("Messi");
        stagiaire1.RandomArrayNotes(5);

        Stagiaire stagiaire3 = new Stagiaire("Christiano");
        stagiaire3.RandomArrayNotes(5);

        // Creation d'un tableau de stagiaire
        Stagiaire[] tabStagiaires = new Stagiaire[3];
        tabStagiaires[0] = stagiaire1;
        tabStagiaires[1] = stagiaire2;
        tabStagiaires[2] = stagiaire3;

        // Affectation a une meme formation
        Formation formation1 = new Formation("Formation1", 15, tabStagiaires);

        separateur();
        System.out.println("Q 7 : Moyenne des stagiaires d'une formation : " + formation1.calculerMoyenneFormation());
        separateur();
        System.out.println(
                "Q 8 : Indice du stagiare dans le tableau ayant la meilleure mmoyenne : " + formation1.getIndexMax());
        separateur();
        System.out.println("Q 9 : Nom du premier stagiaire ayant la meilleure moyenne de la formation : ");
        formation1.afficherNomMax();
        separateur();
        System.out.println(
                "Q 10 : Note minimale du premier stagiaire du premier stagiaire ayant la meilleure moyenne d'une formation : ");
        formation1.afficherMinMax();
        separateur();
        System.out.println("Q 11 : Trouver la moyenne du premier stagiaire qui s'appelle Messi : ");
        formation1.trouverMoyenneParNom("Messi");
        separateur();

        // float[] tabNotesRandom = RandomArrayNotes((5));

    }

    public static void separateur() {
        System.out.println("");
        System.out.println("---------------------------------------------");
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