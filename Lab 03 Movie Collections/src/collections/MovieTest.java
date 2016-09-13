/**
 * 
 */
package collections;

import student.TestCase;

/**
 * @author  Julian Nguyen (julian18)
 * @version 2018.09.08
 *
 */
public class MovieTest extends TestCase {

    private Movie movie;
    private Movie n;
    private Movie movie2;
    private Movie movie3;

    /**
     * Sets up
     */

    public void setUp() {
        movie = new Movie("Spiderman");
        movie.setGenre("Action");
        movie.setYear(2002);
        movie.setRating(4);

        n = null;

        movie2 = new Movie("Spiderman");
        movie3 = new Movie("Spoderman");
    }

    /**
     * Tests the getGenre() and setGenre() method
     */
    public void testGetGenre()
    {
        assertEquals("Action", movie.getGenre());
        movie.setGenre("Romance");
        assertEquals("Romance", movie.getGenre());
    }

    /**
     * Tests the getTitle() method
     */
    public void testGetTitle()
    {
        assertEquals("Spiderman", movie.getTitle());
    }

    /**
     * Tests the getRating() and setRating() method
     */
    public void testGetRating()
    {
        assertEquals(4, movie.getRating());
        movie.setRating(5);
        assertEquals(5, movie.getRating());
    }

    /**
     * Tests the getYear() and setYear() method
     */
    public void testGetYear()
    {
        assertEquals(2002, movie.getYear());
        movie.setYear(2003);
        assertEquals(2003, movie.getYear());
    }

    /**
     * Tests the overridden equals method
     */
    public void testEquals()
    {
        assertTrue(movie.equals(movie));
        assertFalse(movie.equals(n));
        assertTrue(movie.equals(movie2));
        assertFalse(movie.equals(movie3));
        assertFalse(movie.equals("String"));
    }
}
