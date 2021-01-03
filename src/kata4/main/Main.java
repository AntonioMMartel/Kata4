/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kata4.main;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

/**
 * @author Antonio Miguel Martel
 */
public class Main {

    public static void main(String[] args) {
        String filename = input("email.txt");
        List<Mail> mailList = process(filename);
        Histogram histograma = output(mailList);
        execute(histograma);
    }
    
    //Input: obtenemos datos
    private static String input(String filename){
        return filename;
    }
    
    //Process: procesamos datos para crear un output
    private static List<Mail> process(String filename){
        return MailListReader.read(filename);
    }
    
    //Output: obtenemos producto que mostrara mi vista.
    private static Histogram output(List<Mail> mailList) {
        return MailHistogramBuilder.build(mailList);
    }
    
    //Execute: mostramos output mediante la/las vistas
    private static void execute(Histogram histograma){
        HistogramDisplay histogramDisplay = new HistogramDisplay(histograma);
        histogramDisplay.execute();
    }
    
}
