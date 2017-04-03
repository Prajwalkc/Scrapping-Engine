/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.leapfrog;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Prajwal
 */
public class TMBLRScrapper extends Scrapper {


    @Override
    public void scrap() throws IOException {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Enter the name you want to search");
        name = input.nextLine();
        String regEx = "https://(.*?).jpg";


     
     Document doc = Jsoup.connect("http://www.tumblr.com/search/"+name).get();
            Elements elements = doc.select("img.photo");
            
            System.out.println("Searching..."+name);
 
     for (Element e : elements) {
                String imgpath = e.attr("data-src");
           String path=(imgpath);
           
               
                Pattern pattern = Pattern.compile(regEx);
                Matcher matcher = pattern.matcher(e.toString());
               while (matcher.find()) {
                  String img = matcher.group(0);
                  
                   String[] tokens = img.split("/");
                    File file = new File("e://tumblrpics");
                    if(!file.isDirectory()){
                        file.mkdir();
                    }
                    File file1 = new File("e://tumblrpics/"+name);
                    if(!file1.isDirectory()){
                        file1.mkdir();
                    }
                    System.out.println("Downloadingg"+img);
                     download(img, "e://tumblrpics/"+name+"/"+tokens[tokens.length-1]);
             
              
                }
            }
     
        }
    }      