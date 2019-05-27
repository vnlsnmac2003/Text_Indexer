/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vnelson.text_indexer;

import java.util.ArrayList;

/**
 *
 * @author Personal
 */
public class App {
    
    
    public static void main (String[] args)
    {
        String[] inputs = UserPrompt.getUserValues();
        
        ArrayList<Integer> positions = TextIndexFinder.getTextIndexes(inputs[0], inputs[1]);
        
        System.out.println("Subtext: " +inputs[1]+ "\t Positions: " +positions.toString());
    }
}
