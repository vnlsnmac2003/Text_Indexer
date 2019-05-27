/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vnelson.text_indexer;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class UserPrompt {
    
    private static Scanner scanner;
    private static String text;
    private static String subtext;
    
    public static String[] getUserValues(){
        
        String[] inputs = new String[2];
        scanner = new Scanner(System.in);
        
        System.out.println("Enter your TEXT here followed by Enter:");
        text = scanner.nextLine();
        
        System.out.println("Enter your SUBTEXT here followed by Enter:");
        subtext = scanner.nextLine();
        
        inputs[0] = text;
        inputs[1] = subtext;
        
        scanner.close();
        return inputs;
    }
    
}
