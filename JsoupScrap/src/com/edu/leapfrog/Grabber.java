/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.leapfrog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Prajwal
 */
public class Grabber {
      public URLConnection connect(String link) throws IOException {
          URL url = new URL(link);
        return url.openConnection();
    }

    public String getBody(String link) throws IOException {

        URLConnection conn = connect(link);

        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line = "";
        StringBuilder content = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            content.append(line);
           
        }  
           reader.close();     
                  return content.toString();

   
    }
}
