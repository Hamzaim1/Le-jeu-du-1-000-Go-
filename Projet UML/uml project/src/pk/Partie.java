package pk;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Partie {
	int idPartie;
	int nbJoueur;
	public int getIdPartie() {
		return idPartie;
	}
	public void setIdPartie(int idPartie) {
		this.idPartie = idPartie;
	}
	public int getNbJoueur() {
		return nbJoueur;
	}
	public void setNbJoueur(int nbJoueur) {
		this.nbJoueur = nbJoueur;
	}
	
	
	public void rejoindrePartie(Joueur j) {
		
	}
	
	
	
	/////////////////////////////////////////////
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("-----------------------------------------------------");
		System.out.println("WELCOME TO GAME !!");
		System.out.println("************************************");
		System.out.println();
		System.out.println();
		Scanner stock = new Scanner(System.in);
		int n;
		int diff;
		System.out.println("Entrez le nombre de BOT : ");		
		n= stock.nextInt();
		//creation de  joueur human
		Joueur J=new Human(20,0);
		
		System.out.println("Entrez la diffuculté de BOT : ");
		diff= stock.nextInt();
		
		
		Bot	bot = new Bot(1,0, diff);
		Pioche p=new Pioche();
		System.out.println("GAME IS START  NOW GOOD LUK ...");
		for(int k=0;k<106;k++) {
			J.tirerCarte(p);
			System.out.println("---carte tiré ---");
			System.out.println("vos carte sont : ");
			
			for(int l=0;l<J.getMainJoueur().size();l++) {
				System.out.println("%s"+J.getMainJoueur().get(l).toString());	
			}
			for(int l=0;l<J.getMainJoueur().size();l++) {
				System.out.println("%s"+J.getMainJoueur().get(l).toString());
				
			}
		}
		System.out.println("");

		CarteTransfer t;
		CarteAttack a;
		CarteDefendre d;
		CarteImmunite im;
//
	}
	
}
