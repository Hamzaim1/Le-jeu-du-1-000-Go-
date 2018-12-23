package pk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Pioche {

	List<Object> list = new ArrayList<Object>();
	
	public Pioche() {
		//cartes transfer		
		for(int i=0;i<10;i++) {
			CarteTransfer card1=new CarteTransfer("25");
		list.add(card1);
		}
		
		for(int i=0;i<10;i++) {
			CarteTransfer card1=new CarteTransfer("25");
			list.add(card1);
			}
		for(int i=0;i<10;i++) {
			CarteTransfer card1=new CarteTransfer("50");
			list.add(card1);
			}
		for(int i=0;i<10;i++) {
			CarteTransfer card1=new CarteTransfer("75");
			list.add(card1);
			}
		for(int i=0;i<12;i++) {
			CarteTransfer card1=new CarteTransfer("100");
			list.add(card1);
			}
		for(int i=0;i<4;i++) {
			CarteTransfer card1=new CarteTransfer("200");
			list.add(card1);
			}
		
		
		//carte attack
		for(int i=0;i<3;i++) {
			CarteAttack card1=new CarteAttack("Panne de réveil");
			list.add(card1);
			}
		for(int i=0;i<3;i++) {
			CarteAttack card1=new CarteAttack("Travaux du tramway");
			list.add(card1);
			}
		for(int i=0;i<3;i++) {
			CarteAttack card1=new CarteAttack("Maladie");
			list.add(card1);
			}
		for(int i=0;i<5;i++) {
			CarteAttack card1=new CarteAttack("Réseau down");
			list.add(card1);
			}
		// carte deffendre
		
		for(int i=0;i<6;i++) {
			CarteAttack card1=new CarteAttack("Pile atomique");
			list.add(card1);
			}
		for(int i=0;i<6;i++) {
			CarteAttack card1=new CarteAttack("Bus magique");
			list.add(card1);
			}
		for(int i=0;i<6;i++) {
			CarteAttack card1=new CarteAttack("Mot du docteur");
			list.add(card1);
			}
		for(int i=0;i<14;i++) {
			CarteAttack card1=new CarteAttack("Contre réseau up");
			list.add(card1);
			}
		for(int i=0;i<6;i++) {
			CarteAttack card1=new CarteAttack("Paracétamol");
			list.add(card1);
			}
		// carte immunité
		CarteImmunite card1=new CarteImmunite("Couche-tot");
			list.add(card1);
			
			CarteImmunite card2=new CarteImmunite("Hélicoptère");
			list.add(card2);
			
			CarteImmunite card3=new CarteImmunite("Santé de fer");
			list.add(card3);
			
			CarteImmunite card4=new CarteImmunite("Proxy");
			list.add(card4);	
		
	}
	
	public void rermove(int i) {
		list.remove(i);
		
	}
	public static void melanger(List<Carte> listt) {
		Collections.shuffle(listt); 
	}
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	
}
