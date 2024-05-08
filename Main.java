package SolidLSP;

public class Main {

	public static void main(String[] args) {
		  BugSyntaxe bugSyntaxe = new BugSyntaxe("Erreur de syntaxe dans la méthode foo()");
	        BugExecution bugExecution = new BugExecution("Erreur d'exécution dans la méthode bar()");
	        BugLogique bugLogique = new BugLogique("Erreur logique dans la méthode baz()");

	        // Liste des bugs
	        bugSyntaxe.lister();
	        bugExecution.lister();
	        bugLogique.lister();

	        // Corriger les bugs
	        bugSyntaxe.corriger();
	        bugExecution.corriger();
	        bugLogique.corriger();
	    }

	}
