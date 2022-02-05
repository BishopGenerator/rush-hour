package projet;
import javax.swing.*;
import java.awt.*;
public class Test {
private JFrame frame ; 
private JButton quitter;
private JButton recommencer;
private JButton retour;
private JLabel nbrMov;
private JLabel titre;


public Test() {
	createView();
	createComponent();
}
 
private void createView() {
	frame = new JFrame();
	quitter = new JButton("Quitter");
	 recommencer = new JButton("Recommencer");
	 retour = new JButton  ("Retour");
	 nbrMov = new  JLabel ();
	  titre= new JLabel ("Nombre de mouvement");
	 
		
	
	
}
private void createComponent() {
JPanel	p=new JPanel(new BorderLayout());{
		JPanel center= new JPanel(new FlowLayout(FlowLayout.CENTER)); {
			
		}p.add(center, BorderLayout.CENTER);
		JPanel south = new JPanel(new FlowLayout(FlowLayout.CENTER));{
			
			south.add(quitter);
			south.add(recommencer);
			south.add(retour);
		}
		p.add(south, BorderLayout.SOUTH);
		JPanel east = new JPanel (new FlowLayout(FlowLayout.CENTER));{
			JPanel label = new JPanel(new GridLayout(1, 2)); {
				label.add(titre);
				label.add(nbrMov);
			}
			east.add(label);
		} p.add(east,BorderLayout.EAST);
		
		
	}
	frame.add(p);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
