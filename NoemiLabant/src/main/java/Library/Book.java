package Library;

public class Book {

    private String name;
    private int numberOfPages;

    public Book(String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfPages() {
        return this.numberOfPages;
    }

}
