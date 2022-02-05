package projet;
import projet.CaseState;
import projet.BoardGenerator;
import projet.Coordonnee;
public class Case {
private CaseState state;
private boolean top;
private boolean bottom;
private boolean right;
private boolean left;
private Coordonnee coord;


public Case() {
state=CaseState.LIBRE;	
top = false;
bottom = false;
right= false;
left = false;
}

public Case(Coordonnee coord) {
	this.coord= coord;
	state=CaseState.LIBRE;
	top = false;
	bottom = false;
	right= false;
	left = false;
}

 public boolean canMooveTop() {
	 return !top;
 }
 public boolean canMooveBottom() {
	 return !bottom;
 }
 public boolean canMooveRight() {
	 return !right;
 }
 public boolean canMooveLeft() {
	 return !left;
 }
 public CaseState getCaseState() {
	 return  this.state;
 }
 public boolean isFree() {
	 return this.state == CaseState.LIBRE;
 }
 
 public void setCaseSate(CaseState state) {
	 this.state = state;  	 
 }
 public Coordonnee getCoord() {
	 return this.coord;
 }
 public void setCoord(Coordonnee coord) {
	 this.coord= coord;
 }
  
 public void topBorder() {
	 this.top=true;
 }
 public void bottomBorder( ) {
	 this.bottom=true;
 }
 public void rightBorder( ) {
	 this.right=true;
 }
 public void leftBorder() {
	 this.left=true;
 }
}
