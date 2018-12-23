package pk;
import java.util.List;

import java.util.List;

public abstract class Joueur {
	
	protected int id;
	protected int nbGbTransfer;
	protected List<Object> mainJoueur;
	public List<Object> getMainJoueur() {
	return mainJoueur;
	}
	public void tirerCarte(Pioche p) {
		int i=p.getList().size();
		System.out.println(p.getList().get(i-1).toString());
		mainJoueur.add((Object)p.getList().get(i-1));
		p.rermove(i-1);
	}

	public void setMainJoueur(List<Object> mainJoueur) {
		this.mainJoueur = mainJoueur;
	}

	public int getNbGbTransfer() {
		return nbGbTransfer;
	}

	public void setNbGbTransfer(int nbGbTransfer) {
		this.nbGbTransfer = nbGbTransfer;
	}

	public int getId() {
		return this.id;
	}
	public void poserCarte() {
		
	}
	

	public Joueur(int id, int nbGbTransfer) {
		super();
		this.id = id;
		this.nbGbTransfer = nbGbTransfer;
	}
}
