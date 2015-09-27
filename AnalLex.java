package APP3;

/** @author Ahmed Khoumsi */

/**
 * Cette classe effectue l'analyse lexicale
 */
public class AnalLex
{
	public String chaine;

	/**
	 * Constructeur pour l'initialisation d'attribut(s)
	 * @param string 
	 */
	public AnalLex(String chaine)
	{ 
		this.chaine = chaine;
	}

	/**
	 * resteTerminal() retourne : false si tous les terminaux de l'expression
	 * arithmetique ont ete retournes true s'il reste encore au moins un
	 * terminal qui n'a pas ete retourne
	 */
	public boolean resteTerminal()
	{
		//
	}

	/**
	 * prochainTerminal() retourne le prochain terminal Cette methode est une
	 * implementation d'un AEF
	 */
	public Terminal prochainTerminal()
	{
		//
	}

	/**
	 * ErreurLex() envoie un message d'erreur lexicale
	 */
	public void ErreurLex(String s)
	{
		//
	}

	// Methode principale a lancer pour tester l'analyseur lexical
	public static void main(String[] args)
	{
		String toWrite = "";
		System.out.println("Debut d'analyse lexicale");
		if (args.length == 0)
		{
			args = new String[2];
			args[0] = "ExpArith.txt";
			args[1] = "ResultatLexical.txt";
		}
		Reader reader = new Reader(args[0]);

		AnalLex lexical = new AnalLex(reader.toString()); // Creation de l'analyseur
														// lexical

		// Execution de l'analyseur lexical
		Terminal terminal = null;
		while (lexical.resteTerminal())
		{
			terminal = lexical.prochainTerminal();
			toWrite += terminal.chaine + "\n"; // toWrite contient le resultat
		} // d'analyse lexicale
		System.out.println(toWrite); // Ecriture de toWrite sur la console
		Writer writer = new Writer(args[1], toWrite); // Ecriture de toWrite dans
													// fichier args[1]
		System.out.println("Fin d'analyse lexicale");
	}
}
