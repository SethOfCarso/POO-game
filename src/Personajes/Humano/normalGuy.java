package Personajes.Humano;

public class normalGuy extends Humano{

  normalGuy(){
	  velocity=4;//0-10
		  hp=25;//0-30
		  damage=6;//0-20
		 range=150;//30-200
		 friendlyFire=false;
		  weapons=true;//portar o no armas
		  attSpeed=2;// .5-3
		  pickUp=true;
		  drop=false;//zombies	
	}
	
	
	public void doDamage() {
		
	}

	
	public void atack() {
		
	}

	public void takeDamage() {
		
	}


	public void die() {
		if(hp==0){
			//ventana game over
		}
	}

	
	
}
