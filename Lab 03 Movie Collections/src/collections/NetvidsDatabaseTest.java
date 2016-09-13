/**
 * 
 */
package collections;

import java.util.NoSuchElementException;

import student.TestCase;

/**
 * @author  Julian Nguyen (julian18)
 * @version 2018.09.08
 */
public class NetvidsDatabaseTest extends TestCase {

    private NetvidsDatabase netvids;
    private Movie movie; 
    private Movie movie2;
    private Movie n;
    private Movie[] movies;

    /**
     * Sets up the each of the test methods.
     */
    public void setUp()
    {
        netvids = new NetvidsDatabase();
        movie = new Movie("Spiderman");
        movie2 = new Movie("Spoderman");
        n = null;
        movies = new Movie[15];
        for (int x = 2; x < 13; x++)
        {
            movies[x] = new Movie(Integer.toString(x));
        }
    }


    /**
     * tests addMovie()
     */
    public void testAddMovie()
    {
        assertTrue(netvids.addMovie(movie));
        assertFalse(netvids.addMovie(movie));
        for (int i = 2; i < 13; i++)
        {
            netvids.addMovie(movies[i]);
        }
        assertEquals(20, netvids.capacity());
        assertEquals(12, netvids.size());
    }

    /**
     * Tests remove(Movie movie) for when movie 
     * is present.
     */
    public void testRemove()
    {
        netvids.addMovie(movie);
        assertEquals(1, netvids.size());
        assertTrue(netvids.remove(movie).equals(movie));
        assertEquals(0, netvids.size());
        assertFalse(netvids.contains(movie));
    }

    /**
     * Tests remove(Movie movie) for when movie 
     * is null.
     */
    public void testRemoveNull()
    {
        Exception exception = null;
        try {
            netvids.remove(n);
        }
        catch (IllegalArgumentException e) {
            exception = e; 
        }
        assertNotNull(exception);
    }

    /**
     * Tests remove(Movie movie) for when movie 
     * is not present.
     */
    public void testRemoveNo()
    {
        netvids.addMovie(movie);
        Exception exception = null;
        try {
            netvids.remove(movie2);
        }
        catch (NoSuchElementException e) {
            exception = e; 
        }
        assertNotNull(exception);
    }

    /**
     * Test the contains() method
     */
    public void testContains()
    {
        assertFalse(netvids.contains(movie));
        netvids.addMovie(movie);
        assertTrue(netvids.contains(movie));
        assertFalse(netvids.contains(movie2));
    }

    /**
     * Test the isEmpty() method
     */
    public void testIsEmpty()
    {
        assertTrue(netvids.isEmpty());
        netvids.addMovie(movie);
        assertFalse(netvids.isEmpty());
    }

    /**
     * Test the size() method
     */
    public void testSize()
    {
        assertEquals(0, netvids.size());
        assertEquals(10, netvids.capacity());
        netvids.addMovie(movie);
        netvids.addMovie(movie);
        assertEquals(1, netvids.size());
    }
}
