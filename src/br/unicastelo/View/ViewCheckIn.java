package br.unicastelo.View;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.unicastelo.Control.ControleCheckIn;




public class ViewCheckIn extends JInternalFrame{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public JTextField txtnome;
	//public ViewCheckIn(String nome, String documento, String classe, String idVoo, String assentoReservado, String destino){
	public ViewCheckIn(){
		super("Busca Check-In");
		
		getContentPane().setLayout(null);
		setVisible(true);
		setSize(500, 440);
		setClosable(true);
		setResizable(false);
		
	//	this.controle = controle;
		
		
		JLabel lblnome = new JLabel("Nome");
		lblnome.setFont(new Font("Tahoma", Font.BOLD,12));
		lblnome.setBounds(20, 20, 80, 14);
		getContentPane().add(lblnome);
		
		
		txtnome = new JTextField();
		txtnome.setFont(new Font("Tahoma", Font.BOLD,12));
		txtnome.setBounds(20,35, 200,25);
		getContentPane().add(txtnome);
		//txtnome.setText(nome);
		
		
		JLabel lbldocumento = new JLabel("Documento");
		lbldocumento.setFont(new Font("Tahoma", Font.BOLD,12));
		lbldocumento.setBounds(262, 20, 80, 14);
		getContentPane().add(lbldocumento);
		
		
		JTextField txtdocumento = new JTextField();
		txtdocumento.setFont(new Font("Tahoma",Font.BOLD,12));
		txtdocumento.setBounds(262, 35, 200, 25);
		getContentPane().add(txtdocumento);
		//txtdocumento.setText(documento);
		
		JLabel lbldestino = new JLabel("Destino");
		lbldestino.setFont(new Font("Tahoma", Font.BOLD,12));
		lbldestino.setBounds(20, 70, 80, 14);
		getContentPane().add(lbldestino);
		
		JTextField txtdestino = new JTextField();
		txtdestino.setFont(new Font("Tahoma", Font.BOLD,12));
		txtdestino.setBounds(20,85,200,25);
		getContentPane().add(txtdestino);
		//txtdestino.setText(destino);
		
		JLabel lblclasse = new JLabel("Classe");
		lblclasse.setFont(new Font("Tahoma",Font.BOLD,12));
		lblclasse.setBounds(262, 70, 80,14);
		getContentPane().add(lblclasse);
				
		JTextField txtclasse = new JTextField();
		txtclasse.setFont(new Font("Tahoma", Font.BOLD,12));
		txtclasse.setBounds(262, 85, 200, 25);
		getContentPane().add(txtclasse);
		//txtclasse.setText(classe);
		
		
		JLabel lblidVoo = new JLabel("ID-Voo");
		lblidVoo.setFont(new Font("Tahoma",Font.BOLD,12));
		lblidVoo.setBounds(20,120,80,14);
		getContentPane().add(lblidVoo);
		
		JTextField txtidVoo = new JTextField();
		txtidVoo.setFont(new Font("Tahoma", Font.BOLD,12));
		txtidVoo.setBounds(20, 135, 200,25);
		getContentPane().add(txtidVoo);
		//txtidVoo.setText(idVoo);
		
		JLabel lblassReservado = new  JLabel("Ass.Reservado");
		lblassReservado.setFont(new Font("Tahoma",Font.BOLD,12));
		lblassReservado.setBounds(262,120,90,14);
		getContentPane().add(lblassReservado);
		
		JTextField txtassReservado = new JTextField();
		txtassReservado.setFont(new Font("Tahoma",Font.BOLD,12));
		txtassReservado.setBounds(262,135,90,25);
		getContentPane().add(txtassReservado);
		//txtassReservado.setText(assentoReservado);
		
		JLabel lblassDefinido = new JLabel("Ass.Definido");
		lblassDefinido.setFont(new Font("Tahoma",Font.BOLD,12));
		lblassDefinido.setBounds(372, 120, 85,14);
		getContentPane().add(lblassDefinido);
		
		JTextField txtassDefinido = new JTextField();
		txtassDefinido.setFont(new Font("Tahoma",Font.BOLD,12));
		txtassDefinido.setBounds(372,135,90,25);
		getContentPane().add(txtassDefinido);
		
		
		JLabel lblnomeContato = new JLabel("Nome Contato");
		lblnomeContato.setFont(new Font("Tahoma",Font.BOLD,12));
		lblnomeContato.setBounds(20, 170,120, 14);
		getContentPane().add(lblnomeContato);
		
		JTextField txtnomeContato = new JTextField();
		txtnomeContato.setFont(new Font("Tahoma",Font.BOLD,12));
		txtnomeContato.setBounds(20, 185, 200, 25);
		getContentPane().add(txtnomeContato);
	
		
		JLabel lbltelContato = new JLabel("Telefone Contato");
		lbltelContato.setFont(new Font("Tahoma", Font.BOLD,12));
		lbltelContato.setBounds(262,170,120,14);
		getContentPane().add(lbltelContato);
		
		JTextField txttelContato = new JTextField();
		txttelContato.setFont(new Font("Tahoma", Font.BOLD,12));
		txttelContato.setBounds(262, 185, 200, 25);
		getContentPane().add(txttelContato);
		
		
		JLabel lblobs = new JLabel("Obs:");
		lblobs.setFont(new Font("Tahoma",Font.BOLD,12));
		lblobs.setBounds(20, 220, 120, 14);
		getContentPane().add(lblobs);
		
		JTextField txtobs = new JTextField();
		txtobs.setFont(new Font ("Tahoma",Font.BOLD,12));
		txtobs.setBounds(20,235,442,25);
		getContentPane().add(txtobs);

		
		JLabel lblqtdBagMao = new JLabel("Qtd. Bagagem. Mão");
		lblqtdBagMao.setFont(new Font("Tahoma", Font.BOLD,12));
		lblqtdBagMao.setBounds(20,270,140,14);
		getContentPane().add(lblqtdBagMao);
		
		
		JTextField 	txtqtdBagMao = new JTextField();
		txtqtdBagMao.setFont(new Font("Tahoma", Font.BOLD,12));
		txtqtdBagMao.setBounds(20, 285,200,25);
		getContentPane().add(txtqtdBagMao);
	
		
		JLabel lblpesoBagMao = new JLabel("Peso Bagagem Mão");
		lblpesoBagMao.setFont(new Font("Tahoma", Font.BOLD,12));
		lblpesoBagMao.setBounds(262, 270,120,14);
		getContentPane().add(lblpesoBagMao);
		
		JTextField txtpesoBagMao = new JTextField();
		txtpesoBagMao.setFont(new Font("Tahoma",Font.BOLD,12));
		txtpesoBagMao.setBounds(262,285,200,25);
		getContentPane().add(txtpesoBagMao);
	
		
		JLabel lblqtdBagDes = new JLabel("Qtd. Bagagem Despacho");
		lblqtdBagDes.setFont(new Font("Tahoma",Font.BOLD,12));
		lblqtdBagDes.setBounds(20,320, 180, 14);
		getContentPane().add(lblqtdBagDes);
		
		JTextField txtqtdBagDes = new JTextField();
		txtqtdBagDes.setFont(new Font("Tahoma",Font.BOLD,12));
		txtqtdBagDes.setBounds(20,335,200,25);
		getContentPane().add(txtqtdBagDes);
		
		
		
		JLabel lblpesoBagDes = new JLabel("Peso Bagagem Despacho");
		lblpesoBagDes.setFont(new Font("Tahoma", Font.BOLD,12));
		lblpesoBagDes.setBounds(262,320,180,14);
		getContentPane().add(lblpesoBagDes);
		
		JTextField txtpesoBagDes = new JTextField();
		txtpesoBagDes.setFont(new Font("Tahoma",Font.BOLD,12));
		txtpesoBagDes.setBounds(262,335,200,25);
		getContentPane().add(txtpesoBagDes);
		
		
		JButton realizarCheckIn = new JButton("Realizar Check-In");
		realizarCheckIn.setHideActionText(true);
		realizarCheckIn.setBackground(Color.WHITE);
		realizarCheckIn.setFont(new Font("Tahoma", Font.BOLD,12));
		realizarCheckIn.setBounds(172, 380, 160,25);
	    getContentPane().add(realizarCheckIn);
	    
	   
	   	    
	    
	    
	    
	    
		
	}
	
}

	
