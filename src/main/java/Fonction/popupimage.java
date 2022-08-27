package Fonction;
 import javax.swing.JOptionPane;
 import javax.swing.ImageIcon;
 

 /*Pop-up si le nombre mystère est trouvé*/
 public class popupimage {


	public static void main(String[] args) {
		
	ImageIcon congrats = new ImageIcon("src/main/images/yourock.jpg");
	JOptionPane.showInternalMessageDialog(null, congrats, "                                                                              Félicitation vous avez trouvé le nombre mystère!!!",1);

	
		}

}


