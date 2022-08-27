package Execution;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Fonction.FonctionsCalculatrice;
import Fonction.popupimage;

import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;




public class interfaceCalculatrice extends JFrame {

	private JPanel contentPane;

	/*Création des champs de résultat calculatrice*/
	private static JTextField textField; 
	private JTextField textField_1;

	/*Création du nombre mystère*/
	int nombremax =FonctionsCalculatrice.nombremax();
	int nombremystère = FonctionsCalculatrice.nombremystere(nombremax);

	/**********OpérateursCalculs**********/

	double nombrechoisi, resultat;
	int operateur=0;

	public void calcul() {

		switch (operateur)
		{
		case 1: /*addition*/
			resultat = nombrechoisi + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(resultat));
			textField_1.setText("" + resultat);
			popup();

			break;

		case 2: /*soustraction*/

			resultat = nombrechoisi - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(resultat));
			textField_1.setText("" + resultat);
			popup();

			break;

		case 3: /*multiplication*/

			resultat = nombrechoisi * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(resultat));
			textField_1.setText("" + resultat);
			popup();

			break;

		case 4: /*division*/

			resultat = nombrechoisi / Double.parseDouble(textField.getText());
			textField.setText(Double.toString(resultat));
			textField_1.setText("" + resultat);
			popup();
			break;

		default:

			break;
		}
	}

	/*Fonction Pop-up Félicitation*/
	public void popup () {
		if (resultat == nombremystère) {
			popupimage.main(null);}
		else{};
	}


	/**
	 * Launch the application (WINDOWBUILDER).
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaceCalculatrice frame = new interfaceCalculatrice();
					frame.setVisible(true);
					frame.setTitle("Ma Calculatrice");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public interfaceCalculatrice() {

		/************************Propriétées de la Frame************************************/

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);


		/************************BOUTONS****************************/

		/*Bouton 0 à 9 Calculatrice*/

		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textField.setText(textField.getText()+ "1");}});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(20, 377, 70, 65);
		contentPane.add(btnNewButton);


		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+ "2");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(100, 377, 70, 65);
		contentPane.add(btnNewButton_1);


		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+ "3");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBounds(180, 377, 70, 65);
		contentPane.add(btnNewButton_2);


		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+ "4");
			}
		});
		btnNewButton_3.setForeground(new Color(0, 0, 0));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_3.setBounds(20, 291, 70, 65);
		contentPane.add(btnNewButton_3);


		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+ "5");
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_4.setBounds(100, 291, 70, 65);
		contentPane.add(btnNewButton_4);


		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+ "6");
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_5.setBounds(180, 291, 70, 65);
		contentPane.add(btnNewButton_5);


		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+ "7");
			}
		});
		btnNewButton_6.setForeground(new Color(0, 0, 0));
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6.setBounds(20, 203, 70, 65);
		contentPane.add(btnNewButton_6);


		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+ "8");
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_7.setBounds(100, 203, 70, 65);
		contentPane.add(btnNewButton_7);


		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+ "9");
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_8.setBounds(180, 203, 70, 65);
		contentPane.add(btnNewButton_8);


		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+ "0");
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_9.setBounds(100, 452, 70, 65);
		contentPane.add(btnNewButton_9);




		/*Bouton Effacer tout*/
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultat = 0;
				nombrechoisi=0;
				textField.setText("");
				textField_1.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnC.setForeground(Color.RED);
		btnC.setBounds(282, 124, 84, 65);
		contentPane.add(btnC);


		/*Bouton égal*/
		JButton btnNewButton_10 = new JButton("=");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				calcul();
				resultat = nombrechoisi + Double.parseDouble(textField.getText());
				popup();

			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_10.setBounds(180, 452, 70, 65);
		contentPane.add(btnNewButton_10);

		/*Bouton + */
		JButton btnNewButton_11 = new JButton("+");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				nombrechoisi= Double.parseDouble(textField.getText());
				operateur = 1;
				textField.setText("");
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_11.setBounds(282, 452, 84, 65);
		contentPane.add(btnNewButton_11);

		/*Bouton - */
		JButton btnNewButton_12 = new JButton("-");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombrechoisi= Double.parseDouble(textField.getText());
				operateur = 2;
				textField.setText("");	}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_12.setBounds(282, 377, 84, 65);
		contentPane.add(btnNewButton_12);

		/*Bouton X  */
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombrechoisi= Double.parseDouble(textField.getText());
				operateur = 3;
				textField.setText("");

			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnX.setBounds(282, 291, 84, 65);
		contentPane.add(btnX);

		/*Bouton diviser */
		JButton btnNewButton_14 = new JButton("/");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombrechoisi= Double.parseDouble(textField.getText());
				operateur = 4;
				textField.setText("");

			}
		});
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_14.setBounds(282, 203, 84, 65);
		contentPane.add(btnNewButton_14);

		/*Bouton virgule */
		JButton btnNewButton_9_1 = new JButton(".");
		btnNewButton_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+ ".");
			}
		});
		btnNewButton_9_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_9_1.setBounds(20, 452, 70, 65);
		contentPane.add(btnNewButton_9_1);
		
		/*Bouton suppression*/
		JButton btnD = new JButton("DEL");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int longueurMoins1, longueur= 0;
				longueur = textField.getText().length();
				longueurMoins1 = textField.getText().length()-1;
				String retour;
				if (longueur >0){
					/*Création de string pour stocker le nombre et enlever un char*/
					StringBuilder supprimer = new StringBuilder(textField.getText());
					supprimer.deleteCharAt (longueurMoins1);
					retour = supprimer.toString();
					textField.setText(retour);}
				else textField.setText("Rien à effacer :)");}
		});

		btnD.setForeground(Color.BLACK);
		btnD.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnD.setBounds(180, 124, 70, 65);
		contentPane.add(btnD);


		/********** Bouton Indices nombre mystère*********/

		/*Indice Limite de nombre pour nombre mystère*/
		JButton btnNewButton_9_1_1 = new JButton("INDICE 1");
		btnNewButton_9_1_1.setForeground(Color.GRAY);
		btnNewButton_9_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("Le nombre se situe entre 0 est " + nombremax );
			}
		});
		btnNewButton_9_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_9_1_1.setBounds(10, 591, 107, 39);
		contentPane.add(btnNewButton_9_1_1);


		/*Indice Nombre de chiffres dans nombre mystère */
		JButton btnNewButton_9_1_1_1 = new JButton("INDICE 2");
		btnNewButton_9_1_1_1.setForeground(Color.GRAY);
		btnNewButton_9_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nombredechiffre = String.valueOf(nombremystère).length();
				textField.setText("Le nombre a " + nombredechiffre + " de chiffre(s) ");
			}
		});
		btnNewButton_9_1_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_9_1_1_1.setBounds(137, 591, 107, 39);
		contentPane.add(btnNewButton_9_1_1_1);

		/*Nombre mystère pair ou impair"*/
		JButton btnNewButton_9_1_1_2 = new JButton("INDICE 3");
		btnNewButton_9_1_1_2.setForeground(Color.GRAY);
		btnNewButton_9_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (nombremystère % 2 == 0 ) {
					textField.setText("Le nombre est pair et entier");	}
				else textField.setText("Le nombre est impair et entier ");}
		});
		btnNewButton_9_1_1_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_9_1_1_2.setBounds(269, 591, 107, 39);
		contentPane.add(btnNewButton_9_1_1_2);

		/* Premier et dernier chiffre de nombre mystère*/
		JButton btnNewButton_9_1_1_2_1 = new JButton("INDICE 4");
		btnNewButton_9_1_1_2_1.setForeground(Color.GRAY);
		btnNewButton_9_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombremystèretab = Integer.toString(nombremystère);
				char last = nombremystèretab.charAt(nombremystèretab.length()-1);
				char first = nombremystèretab.charAt(0);
				textField.setText("Le nombre commence par " + first + " et se finit par " + last );
			}
		});
		btnNewButton_9_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_9_1_1_2_1.setBounds(63, 640, 107, 39);
		contentPane.add(btnNewButton_9_1_1_2_1);

		/*Affichage nombre mystère*/
		JButton btnNewButton_9_1_1_2_2 = new JButton("SOLUTION");
		btnNewButton_9_1_1_2_2.setForeground(new Color(255, 0, 255));
		btnNewButton_9_1_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("Le nombre mystère était... : " + nombremystère + '!');
				int nombremystère = FonctionsCalculatrice.nombremystere(nombremax);
			}
		});
		btnNewButton_9_1_1_2_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_9_1_1_2_2.setBounds(209, 641, 107, 39);
		contentPane.add(btnNewButton_9_1_1_2_2);


		/***********Titres**********/


		JLabel lblNewLabel = new JLabel("NOMBRE MYSTÈRE À TROUVER ! (Entrez le avec =) \r\n");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(64, 527, 346, 71);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel(FonctionsCalculatrice.createCalc().marque); 
		lblNewLabel_1.setFont(new Font("Georgia", Font.BOLD, 15));
		lblNewLabel_1.setBounds(125, 10, 318, 23);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Année : " + String.valueOf(FonctionsCalculatrice.createCalc().annee));
		lblNewLabel_2.setBounds(45, 689, 82, 25);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Prix : " + String.valueOf(FonctionsCalculatrice.createCalc().prix)+"€");
		lblNewLabel_2_1.setBounds(302, 689, 84, 25);
		contentPane.add(lblNewLabel_2_1);


		/*****Champs de texte*****/

		/*Résultat*/
		textField = new JTextField();
		textField.setBackground(new Color(248, 248, 255));
		textField.setForeground(new Color(0, 0, 0));
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBounds(20, 43, 346, 57);
		textField.setHorizontalAlignment(textField.RIGHT);
		contentPane.add(textField);
		textField.setColumns(10);

		/*Résultat tampon*/
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		textField_1.setBackground(new Color(248, 248, 255));
		textField_1.setForeground(Color.GRAY);
		textField_1.setBounds(20, 144, 149, 39);
		textField_1.setHorizontalAlignment(textField_1.RIGHT);
		contentPane.add(textField_1);
		textField_1.setColumns(10);


		/********Séparateur********/
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 538, 366, 2);
		contentPane.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 690, 366, 2);
		contentPane.add(separator_1);

	}




}
