package Personajes.Humano;

import Personajes.Personajes;

public abstract class Humano implements Personajes{
	public double velocity=0;//0-10
	 int hp=0;//0-30
	 int damage=0;//0-20
	 int range=0;//30-200
	 boolean friendlyFire=false;
	 boolean weapons=false;//portar o no armas
	 double attSpeed=0;// .5-3
	 boolean pickUp=false;
	 boolean drop=false;//zombies
	
	 void upStats(){
		 // añadir mejora de stats al final de cada ronda
	 }
	public void move() {
		//implementar uso de botones para moverse al precionar, mantener y quitar 
		}
	
	
	
		
		
	

}
