package test;
import org.junit.Test;

import chapter04.entity.Movie;
public class MovieTest {
    @Test
    public void test1() {
        Movie movie = new Movie();
        movie.setId("1");
        System.out.println(movie.getId());
    }
}
