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
public class TextIndexFinder {
    
    public static ArrayList<Integer> getTextIndexes(String text, String subtext)
    {
        ArrayList<Integer> indexPositions = new ArrayList<>();
        char[] textChars = text.toLowerCase().toCharArray();
        char[] subtextChars = subtext.toLowerCase().toCharArray();
        int subTextCharPointer = 0;
        
        for(int i=0; i< textChars.length; i++)
        {
            if(textChars[i] == subtextChars[subTextCharPointer])
            {
                int j = i;
                int indexMatchPosition = j;
                
                while(true)
                { //check other subtext values against text
                    if(textChars[j] == subtextChars[subTextCharPointer])
                        subTextCharPointer++;
                    else
                    {
                        subTextCharPointer = 0;
                        break;
                    }
                    if(subTextCharPointer == subtextChars.length)
                    {
                        indexPositions.add(indexMatchPosition+1); //add 1 as first position starts at 1
                        subTextCharPointer = 0;
                        i = j; //update i increment to stop re-checking
                        break;
                    }
                    else
                        j++; //increment pointer if there are more chars left
                }
            }
        }
        return indexPositions;
    }
}
