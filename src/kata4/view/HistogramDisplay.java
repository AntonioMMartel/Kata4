/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kata4.view;
import javax.swing.JPanel;
import kata4.model.Histogram;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 * @author Antonio Miguel Martel
 */
public class HistogramDisplay extends ApplicationFrame{
    private final Histogram<String> histogram;
    
    //Me creas la ventana con su panel y e
    public HistogramDisplay(Histogram<String> histogram) {
        //Invocamos constructor de la superclase
        super("Histograma");        
        this.histogram = histogram;
        //Entonces aqui tenemos el panel que contendrá todo dentro de la ventana
        this.setContentPane(createPanel());
        //Me ajustas todo
        this.pack();
    }
    
    //Creamos el panel
    private JPanel createPanel() {
        //Me crea el panel que tenemos en la transparencia de la practica.
        //Basicamente es lo que me contiene el chart y el dataset
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        return chartPanel;
    }
    
    //Creamos histograma
    private JFreeChart createChart(DefaultCategoryDataset dataset) {
        //Me creas el chart con su nombre y sus ejes con una orientacion de barras vertical y
        JFreeChart chart = ChartFactory.createBarChart("Histograma", 
                                                        "Dominios de email", 
                                                        "Numero de emails", 
                                                        dataset, 
                                                        PlotOrientation.VERTICAL, 
                                                        false, 
                                                        false, 
                                                        rootPaneCheckingEnabled);
        return chart;
    }
    
    //Creamos conjunto de datos
    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(String key : histogram.keySet()){
            dataset.addValue(histogram.get(key), "", key);
        }
        return dataset;
    }
    
    public void execute() {
        this.setVisible(true);
    }
}
