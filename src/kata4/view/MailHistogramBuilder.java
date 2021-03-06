/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kata4.view;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;

/**
 * @author Antonio Miguel Martel
 */
public class MailHistogramBuilder {
    
    public static Histogram<String> build(List<Mail> listaEmails) {
        Histogram<String> histogram = new Histogram<>();
        for (Mail email : listaEmails) {
            histogram.increment(email.getDomain());
        }
        
        return histogram;
    }
    
}
