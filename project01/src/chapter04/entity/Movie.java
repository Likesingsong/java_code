package chapter04.entity;

/**
 * Movie
 */
public class Movie {

    /**
     * 电影id
     */
    private String id;

    /**
     * 电影名字
     */
    private String name;

    /**
     * 电影得分
     */
    private double score;

    /**
     * 电影导演
     */
    private String director;

    /**
     * 无参构造
     */
    public Movie() {

    }

    /**
     * 全参构造
     */
    public Movie(String name, double score, String director) {
        this.name = name;
        this.score = score;
        this.director = director;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}