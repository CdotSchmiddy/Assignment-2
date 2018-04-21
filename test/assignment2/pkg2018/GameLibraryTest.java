/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.pkg2018;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Calum
 */
public class GameLibraryTest {
    
    GameLibrary GameLibrary;
    
    public GameLibraryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        GameLibrary = new GameLibrary("DragonAge", "Action", "Teen [T]", 1);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class GameLibrary.
     */
    @Test
    public void testGetName() {
        String expResult = "DragonAge";
        String result = GameLibrary.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class GameLibrary.
     */
    @Test
    public void testSetName() {
        GameLibrary.setName("Amnesia");
        assertEquals("Amnesia", GameLibrary.getName());
    }
    
    /**
     * Test of setName method, of class GameLibrary.
     */
    @Test
    public void testSetNameInvalid() {
        try{
            GameLibrary.setName("");
            fail("Name cann`ot be blank and should have triggered an exception");
        }
        catch( IllegalArgumentException e)
        {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Test of getGenre method, of class GameLibrary.
     */
    @Test
    public void testGetGenre() {
        String expResult = "Action";
        String result = GameLibrary.getGenre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGenre method, of class GameLibrary.
     */
    @Test
    public void testSetGenre() {
        GameLibrary.setGenre("Horror");
        assertEquals("Horror", GameLibrary.getGenre());
    }

    /**
     * Test of setGenre method, of class GameLibrary.
     */
    @Test
    public void testSetGenreInvalid() {
        try{
            GameLibrary.setGenre("");
            fail("Genre cannot be blank and should have triggered an exception");
        }
        catch( IllegalArgumentException e)
        {
            System.err.println(e.getMessage());
        }
    }
    
    /**
     * Test of getAgeRating method, of class GameLibrary.
     */
    @Test
    public void testGetAgeRating() {
        String expResult = "Teen [T]";
        String result = GameLibrary.getAgeRating();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAgeRating method, of class GameLibrary.
     */
    @Test
    public void testSetAgeRating() {
        GameLibrary.setAgeRating("Mature [M]");
        assertEquals("Mature [M]", GameLibrary.getAgeRating());
    }
    
    /**
     * Test of setAgeRating method, of class GameLibrary.
     */
    @Test
    public void testSetAgeRatingInvalid() {
        try{
            GameLibrary.setAgeRating("");
            fail("Age Rating cannot be blank and should have triggered an exception");
        }
        catch( IllegalArgumentException e)
        {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Test of getStarRating method, of class GameLibrary.
     */
    @Test
    public void testGetStarRating() {
        int expResult = 1;
        int result = GameLibrary.getStarRating();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStarRating method, of class GameLibrary.
     */
    @Test
    public void testSetStarRating() {
        GameLibrary.setStarRating(1);
        assertEquals(1, GameLibrary.getStarRating());
    }
    
    /**
     * Test of setStarRating method, of class GameLibrary.
     */
    @Test
    public void testSetStarRatingInvalid() {
        try{
            GameLibrary.setStarRating(0);
            fail("Star Rating cannot be less than 1 or over 10 and should have triggered an exception");
        }
        catch( IllegalArgumentException e)
        {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Test of toString method, of class GameLibrary.
     */
    @Test
    public void testToString() {
        String expResult = "DragonAge is of the Action genre and is rated Teen [T] "
                + "with a star rating of 1 out of 10. ";
        String result = GameLibrary.toString();
        assertEquals(expResult, result);
    }
    
}
