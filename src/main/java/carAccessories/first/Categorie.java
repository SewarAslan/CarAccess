package carAccessories.first;

import java.util.LinkedList;

public class Categorie {
String categorieName;
public LinkedList<Product> categorieofProdLL;

public Categorie(String name) {
	this.categorieName=name;
	categorieofProdLL=new LinkedList<Product>();}


public String toString() {
	 String newS="Categorie Name= "+this.categorieName+"\n products in it?\n";
	 newS+="----------------------------------";
			 return newS;
	}

}
