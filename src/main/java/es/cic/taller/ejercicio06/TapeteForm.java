package es.cic.taller.ejercicio06;

import com.vaadin.data.Binder;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class TapeteForm extends FormLayout{
	 private VerticalLayout layout = new VerticalLayout();
	    
	    private TextField carta1 = new TextField();
	    
	    private TextField carta2 = new TextField();
	    
	    private TextField carta3 = new TextField();
	    
	    private TextField carta4 = new TextField();

	    private Binder<Tapete> binder = new Binder<>(Tapete.class);
	    
	    private MyUI myUI;
	    
	    public TapeteForm(MyUI myUI) {
	        this.myUI = myUI;
	        addComponents(carta1,carta2,carta3,carta4);
	
	    }
	    
	 
	    }

