package SolidLSP;

public class BugLogique extends Bug {
    public BugLogique(String description) {
        super(description);
    }

    // Implémentation de la méthode abstraite pour corriger le bug logique
    @Override
    public void corriger() {
        System.out.println("Corriger le bug logique: " + description);
    }
}
