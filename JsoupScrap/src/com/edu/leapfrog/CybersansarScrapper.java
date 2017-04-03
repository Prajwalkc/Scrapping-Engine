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


/**
 *
 * @author Prajwal
 */
public class InstaScrapper extends Scrapper {

    @Override
    public void scrap() throws IOException {

        String baseUrl = "http://www.cybersansar.com/thumbnail_view.php?gal_id=2213&image_id=50490";
       // System.out.println("Enter the name you want to search");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Grabber grab = new Grabber();
        System.out.println(grab.getBody(baseUrl));
        
               
       
            String regEx = "graphics/model/(.*?).jpg";
            Pattern pattern = Pattern.compile(regEx);
            Matcher matcher = pattern.matcher(grab.getBody(baseUrl));
            while (matcher.find()) {
                String imgpath = matcher.group(0);
                String path = ("http://"+imgpath);
                String[] tokens = path.split("/");
                File file = new File("e://instapics");
                if (!file.isDirectory()) {
                    file.mkdir();
                }

                File file1 = new File("e://instapics/" + name);
                if (!file1.isDirectory()) {
                    file1.mkdir();
                }
                System.out.println("Downloadinggg............." + name);
                download(path, "e://instapics" + name + "/" + tokens[tokens.length - 1]);
            }

        }
    }
