public class Voiture {
    public static final int ACCELERATION = 10;
    public static final int MAX_SPEED = 120;
    private String modele;
    private String couleur;
    private int vitesse;

    public Voiture(String model, String color) {
        this.modele = model;
        this.couleur = color;
        this.vitesse = 0;
    }

    public int getVitesse() {
        return this.vitesse;
    }

    public void accelerer() {
        if (vitesse + ACCELERATION <= MAX_SPEED) {
            vitesse += ACCELERATION;
            // afficher détails
            System.out.println("Modèle : " + modele);
            System.out.println("Couleur : " + couleur);
            System.out.println("Vitesse actuelle : " + vitesse);
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void ralentir() {
        if (vitesse - ACCELERATION >= 0) {
            vitesse -= ACCELERATION;
            // afficher détails
            System.out.println("Modèle : " + modele);
            System.out.println("Couleur : " + couleur);
            System.out.println("Vitesse actuelle : " + vitesse);
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }
}

