package SolidLSP;

public class BugSyntaxe extends Bug {
    public BugSyntaxe(String description) {
        super(description);
    }

    // Implémentation de la méthode abstraite pour corriger le bug de syntaxe
    @Override
    public void corriger() {
        System.out.println("Corriger le bug de syntaxe: " + description);
    }
}
