package old;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
* Classe Game,
* Lance le jeu 2048 pour pouvoir jouer à une partie.
* 
* @author Joan BELO, Matthieu BURTIN, Joseph DZIMBALKA
*/
public class Game
{
    /**
    * Méthode main,
    * Démarre l'exécution du jeu.
    * @param args 
    */
    public static void main(String args[])
    {
        // --------------------------------
	// Déclaration des variables utiles
        // --------------------------------
        
	boolean end = false;
	String saisie;
	//int num;
	Scanner s = new Scanner(System.in);
	Grid grid = new Grid(4,4);
	
	grid.initGrid();
	grid.displayGrid();
	
	/* ----- */
	
	/*
        System.out.println("---");
	
	Scanner sc = new Scanner(System.in);
	String str;
	
	do
	{
		System.out.print(">> ");
		str = sc.nextLine();
		//grid.helpForOne();
		grid.helpForAll();
		grid.displayGrid();
	} while (str.compareTo("r")==0);
	
	System.out.println("---");
	
	grid.displayGrid();
        */
        
	/* ----- */
		
        // ----------------
        // Lancement du jeu : 
        // répétition de la demande d'une touche et de l'éecution de l'action tant qu'on ne souhaite pas quitter
        // ----------------
        System.out.println("+++"); //System.exit(666);
	while (!end)
	{
            System.out.println("Prochain deplacement : ");
            System.out.println("2 - bas");
            System.out.println("8 - haut");
            System.out.println("4 - gauche");
            System.out.println("6 - droite");
            System.out.println("7 - 1 coup de l'IA");
            System.out.println("9 - Fin de la partie par l'IA");
            System.out.println("Autres commandes :");
            System.out.println("5 - nouvelle grille");
            System.out.println("0 - fin");

            //System.out.println(">> ");
            System.out.println(">> ");
            saisie = s.nextLine();
            //num = parseInt(s.nextLine());
            
            switch(saisie)
            //switch(num)
            {
            	case "2":
                //case 2:
                    grid.moveDown();
                    grid.addCase();
                    System.out.println("BAS");
                    grid.displayGrid();
                    break;
                case "8":
                //case 8:
                    grid.moveUp();
                    grid.addCase();
                    System.out.println("HAUT");
                    grid.displayGrid();
                    break;
		case "4":
		//case 4:
                    grid.moveLeft();
                    grid.addCase();
                    System.out.println("GAUCHE");
                    grid.displayGrid();
                    break;
                case "6":
                //case 6:
                    grid.moveRight();
                    grid.addCase();
                    System.out.println("DROITE");
                    grid.displayGrid();
                    break;
                case "5":
                //case 5:
                    grid.initGrid();
                    grid.displayGrid();
                    break;
                case "0":
                //case 0:
                    end = true;
                    break;
                case "7":
                //case 7:
                    grid.helpForOne();
                    grid.displayGrid();
                    break;
                case "9":
                //case 9:
                    //System.out.println("---");
                    grid.helpForAll();
                    //System.out.println("...");
                    grid.displayGrid();
                    end = true;
                    break;
                default:
                    end = true;
                    break;
            }
	}
        System.out.println("+++");
    }
}
