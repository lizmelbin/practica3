/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

import java.util.Iterator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.select.Elements;

/**
 *
 * @author Liz Tejada
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Document doc = Jsoup.connect("http://en.wikipedia.org/").get();
            Elements brs = doc.select("br");
            Elements ps = doc.select("p");
            Elements imgs = doc.select("img");
            Elements forms = doc.select("form");
             Elements inputs = doc.select("input");
            
          /*  for (Iterator<Element> iterator = newsHeadlines.iterator(); iterator.hasNext();) {
                Element next = iterator.next();
                System.out.println(next);
            }*/
          
            System.out.println("Total de cambio de lineas: "+brs.size());
            System.out.println("Total de parrafos: "+ps.size());  
            System.out.println("Total de imagenes: "+imgs.size());  
            System.out.println("Total de formularios: "+forms.size());  
            
            System.out.println("Estos son los Ids de los inputs");
            for (Iterator<Element> iterator = inputs.iterator(); iterator.hasNext();) {
                Element next = iterator.next();
                System.out.println(next.id());
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
}

  