package SolidLSP;

public class BugExecution extends Bug {
    public BugExecution(String description) {
        super(description);
    }

    // Implémentation de la méthode abstraite pour corriger le bug d'exécution
    @Override
    public void corriger() {
        System.out.println("Corriger le bug d'exécution: " + description);
    }
}