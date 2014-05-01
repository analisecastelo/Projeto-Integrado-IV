package br.unicastelo.Control;
import br.unicastelo.Model.ModelCheckIn;
import br.unicastelo.View.PrincipalTela;
import br.unicastelo.View.ViewCheckIn;

public class ControleCheckIn {
	
     ViewCheckIn view = new ViewCheckIn();
	 ModelCheckIn model = new ModelCheckIn();
	 PrincipalTela telaprincipal = new PrincipalTela(); 	
    public ControleCheckIn(){
        
    }
   
    
    
    String nome = model.getNome();
    public void preencheNome(){
    	view.txtnome.setText(nome);
    	}
    	 
    
    
  public void  handleBntCheckIn(){
	  telaprincipal.contentPane.add(view);
	  view.setVisible(true);
	  
	   	
    }
}

