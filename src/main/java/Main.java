import fr.papotecar.back.entities.*;

public class Main {

    public static void main(String[] args) {
        City depart = new City("1", "Paris", 75000);
        City arrive = new City("2", "Bordeaux", 33000);
        City etape1 = new City("3", "Poitiers", 86000);
        City etape2 = new City("4", "Niort", 79000);

        User passager1 = new User("1","Paul","SIMON" );
        User passager2 = new User("2", "Pierre", "LABOUR");
        User passager3 = new User("3", "Jacques", "LOURDO");

        Car voiture1 = new Car("1","Renault", "Clio", "ABCD", 1, 1);

        Trip trajet1 = new Trip("1", depart, arrive, voiture1);


        //Demande de Paul
        Step step1 = new Step("1", depart, etape1, passager1);
        //Demande de Pierre
        Step step2 = new Step("2", etape1, etape2, passager2);
        //Demande de Jacques
        Step step3 = new Step("3", etape1, arrive, passager3);


        System.out.println(trajet1);

        //Ajout de Paul, monte à Paris et descend à Poitier
        trajet1.addStep(step1);

        //Ajout de Pierre, monte à Poitiers et descend à Niort
        trajet1.addStep(step2);

    }
}
