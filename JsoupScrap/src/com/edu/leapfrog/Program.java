/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.leapfrog;

import java.io.IOException;

/**
 *
 * @author Prajwal
 */
public class Program {

    public static void main(String[] args) {

        try {
            TMBLRScrapper scrapper = new TMBLRScrapper();
            scrapper.scrap();
            
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
