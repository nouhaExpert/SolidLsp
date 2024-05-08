package SolidLSP;

public abstract class Bug {
    // Attribut commun à toutes les sous-classes
    protected String description;

    // Constructeur
    public Bug(String description) {
        this.description = description;
    }

    // Méthodes communes à toutes les sous-classes
    public void lister() {
        System.out.println("Lister le bug: " + description);
    }

    public void ajouter() {
        System.out.println("Ajouter le bug: " + description);
    }

    public void modifier() {
        System.out.println("Modifier le bug: " + description);
    }

    public void supprimer() {
        System.out.println("Supprimer le bug: " + description);
    }

    // Méthode abstraite pour corriger le bug
    public abstract void corriger();
}
