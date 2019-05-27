/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.vnelson.text_indexer.TextIndexFinder;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Personal
 */
public class Tests {
    
    public Tests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
    @Test
    public void getTextIndexesTest1() {
       String[] inputs = {"Hello", "Bye"};
       ArrayList<Integer> indexes = new ArrayList<>();
       assertEquals(indexes, TextIndexFinder.getTextIndexes(inputs[0],inputs[1]));
    }
    
    @Test
    public void getTextIndexesTest2() {
       ArrayList<Integer> indexes = new ArrayList<>();
       indexes.add(5);
       assertEquals(indexes, TextIndexFinder.getTextIndexes("How much wood","much"));
    }
    
    @Test
    public void getTextIndexesTest3() {
       ArrayList<Integer> indexes = new ArrayList<>();
       indexes.add(5);
       assertEquals(indexes, TextIndexFinder.getTextIndexes("How much wood","Much"));
    }
    
    @Test
    public void getTextIndexesTest4() {
       ArrayList<Integer> indexes = new ArrayList<>();
       indexes.add(10); indexes.add(23); indexes.add(45); indexes.add(67);
       assertEquals(indexes, TextIndexFinder.getTextIndexes("How much wood would a "
           + "Woodchuck chuck, if a Woodchuck could chuck wood?", "wood"));
    }
    
    @Test
    public void getTextIndexesTest5() {
       ArrayList<Integer> indexes = new ArrayList<>();
       indexes.add(11); indexes.add(24); indexes.add(46); indexes.add(68);
       assertEquals(indexes, TextIndexFinder.getTextIndexes("How much wood would a "
           + "Woodchuck chuck, if a Woodchuck could chuck wood?", "oO"));
    }
    
    @Test
    public void getTextIndexesTest6() {
       ArrayList<Integer> indexes = new ArrayList<>();
       indexes.add(71);
       assertEquals(indexes, TextIndexFinder.getTextIndexes("How much wood would a "
           + "Woodchuck chuck, if a Woodchuck could chuck wood?", "?"));
    }
}
