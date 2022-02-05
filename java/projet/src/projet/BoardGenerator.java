package projet;
import projet.Coordonnee;

public class BoardGenerator {
	private int a;
	public final static int nbrCase = 6;
	
	Case [][] grille = initBoard();
	
	
	
	public static Case[] [] initBoard(){
		
		Case [][] grille = new Case [nbrCase][nbrCase];
		for(int i=0 ; i < nbrCase ; i++) {
			for(int j =0 ; j < nbrCase ; j++) {
				grille[i][j] = new Case();
				grille[i][j].setCoord(new Coordonnee(i , j));
				
					
				
			}
		}
		return grille;
	}
	
	
	
	public static void boucle() {
		for(int i =0 ; i < nbrCase ; i++) {
			for(int j =0 ; j<nbrCase ; j++) {
				grille[i][j] = new Case();
			if(i==0) {
				grille[i][j].topBorder();
				
			}
			if(i==5) {
				grille[i][j].bottomBorder();
			}
			
			
			if(j==0) {
				grille[i][j].leftBorder();
			}
			if(j==5) {
				grille[i][j].rightBorder();
			}
			
			}}
		
		grille[2][5].rightBorder(false);
	
	}




}


