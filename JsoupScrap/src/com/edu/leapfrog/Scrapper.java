/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.leapfrog;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Prajwal
 */
public abstract class Scrapper {
   public void download(String link, String fileName)throws IOException{
        URL url = new URL(link);
        URLConnection conn = url.openConnection();
        InputStream is = conn.getInputStream();
        FileOutputStream os = new FileOutputStream(fileName);
        byte[] data = new byte[1024*5];
        int i=0;
        while((i=is.read(data))!= -1){
            os.write(data, 0, i);
        }
    is.close();
    os.close();
    }

    /**
     *
     * @throws IOException
     */
    public abstract void scrap() throws IOException;
    
   
    
}
