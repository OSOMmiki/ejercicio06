package es.cic.taller.ejercicio06;



import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;

import com.vaadin.ui.Component;
import com.vaadin.ui.GridLayout;

import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {
	private TapeteForm tapete1 = new TapeteForm(this,1);
	private TapeteForm tapete2 = new TapeteForm(this,2);
	private TapeteForm tapete3 = new TapeteForm(this,3);
	private TapeteForm tapete4 = new TapeteForm(this,4);
	 private GridLayout mesa;
    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	
    	final VerticalLayout layout = new VerticalLayout();
    	
       Component[] tapetes = {tapete1,tapete2,tapete3,tapete4};
        
        
        mesa = new GridLayout();
        mesa.addStyleName("outlined");
        mesa.setSpacing(true);
        mesa.setSizeFull();
        generateMatrixGrid(4, 2,tapetes);
        layout.addComponents(mesa);
        setContent(layout);
    }
    

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
    private void generateMatrixGrid(final int rows, final int columns,Component[] tapetes) {
        mesa.removeAllComponents();
        mesa.setRows(rows);
        mesa.setColumns(columns);
        int i=0;
        for (int row = 0; row < mesa.getRows(); row++) {
            for (int col = 0; col < mesa.getColumns(); col++) {
                if (col==0) {
                	Component tapete = tapetes[i];
                	mesa.addComponent(tapete);
                	i++;
                                }
                mesa.setRowExpandRatio(row, 9.0f);
                mesa.setColumnExpandRatio(col, 4.0f);
            }
        }
    }
}
