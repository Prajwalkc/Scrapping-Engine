/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.leapfrog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Prajwal
 */
public class NScrapper  {

   
    public void scrap() throws IOException {
      
    

    
     
       String link="http://www.instagram.com/9gag/";
        URL url = new URL(link);
        URLConnection conn;
        conn = url.openConnection();
        String line="";
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder content = new StringBuilder();
        
               while((line=reader.readLine())!=null){
                   content.append(line );
                   
               
                   System.out.println(content);
    
               }
               reader.close();
   System.out.println(content.toString());  
    }
    
    }

//    String regEx=  "http://(.?*).jpg";
//        Pattern pattern = Pattern.compile(regEx);
//        Matcher matcher = pattern.matcher(content.toString());
//    while(matcher.find()){
//        System.out.println(matcher.group(0));
//             }
//}
//}
    

