/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.leapfrog;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Prajwal
 */
public class LyricsScrapper extends Scrapper {

    @Override
    public void scrap() throws IOException {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the name of the song ");
//        String name = input.nextLine();
//        System.out.println("Enter the name of artist");
//        String artist = input.nextLine();
        Document doc = Jsoup.connect("http://search.azlyrics.com/search.php?q=").get();
        Elements elements = doc.getAllElements();
for (Element e : elements){
    System.out.println(e);    

}    
    }
    
}
