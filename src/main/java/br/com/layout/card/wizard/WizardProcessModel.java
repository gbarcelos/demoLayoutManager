package br.com.layout.card.wizard;

import java.util.List;

import javax.swing.JPanel;

public interface WizardProcessModel {
	/**
     * Returns the descriptive values for the wizard steps.
     *
     * @return the descriptive steps
     */
    public String[] getSteps();

    /**
     * Increments the current index.
     */
    public boolean next();
    
    /**
     * Decrements the current index.
     */
    public boolean previous();
    
    /**
     * Returns the step text at the specified index.
     *
     * @param index - the index
     */
    public String getStep(int index);

    /**
     * Returns the title text at the specified index.
     *
     * @param index - the index
     */
    public String getTitle(int index);

    /**
     * Returns the titles for each panel.
     *
     * @return the panel titles
     */
    public String[] getTitles();
    
    /**
     * Returns the next panel in the wizard and increments the 
     * selected index.
     *
     * @return the next panel
     */
    public JPanel getNextPanel();

    /**
     * Returns the previous panel in the wizard and decrements the 
     * selected index.
     *
     * @return the previous panel
     */
    public JPanel getPreviousPanel();

    /**
     * Returns whether there is a valid panel to be selected next.
     *
     * @return true | false
     */
    public boolean hasNext();

    /**
     * Returns whether there is a valid panel to be selected previous.
     *
     * @return true | false
     */
    public boolean hasPrevious();

    /**
     * Returns the current index in the model.
     *
     * @return the currently selected index
     */
    public int getSelectedIndex();
    
    /**
     * Returns the index of the specified panel in this model.
     *
     * @param panel - the panel
     * @return the panel index
     */
    public int getIndexOf(JPanel panel);
    
    /**
     * Returns the panel at the specified index.
     *
     * @param index - the panel to be retrieved
     */
    public JPanel getPanelAt(int index);
    
    /**
     * Adds the specified panel to the end of the model.
     *
     * @param panel - the panel to be added
     */
    public void addPanel(JPanel panel);
    
    /**
     * Returns the number of panel components in this model.
     *
     * @return the panel count
     */
    public int getPanelCount();

    /**
     * Returns a list of panels making up this model.
     *
     * @return the panels collection
     */
    public List<JPanel> getPanels();

    /**
     * Sets the list of panels making up this model.
     *
     * @param panels - the panels
     */
    public void setPanels(List<JPanel> panels);
}