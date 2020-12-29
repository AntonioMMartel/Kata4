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
        //Input
        String filename = "email.txt";
        //Process
        List<Mail> mailList = MailListReader.read(filename);
        //Output
        Histogram histograma = MailHistogramBuilder.build(mailList);
        //Execute
        HistogramDisplay histogramDisplay = new HistogramDisplay(histograma);
        histogramDisplay.execute();
    }

}
