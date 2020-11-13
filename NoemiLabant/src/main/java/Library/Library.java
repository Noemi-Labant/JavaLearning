package Library;

public class Library {

    private Book[] books;

    public Library(int size) {
        this.books = new Book[size];
    }

    public void Add(Book bookToAdd) {
        int firstEmptyPosition = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                firstEmptyPosition = i;
                break;
            }
        }
        if (firstEmptyPosition != -1) {
            books[firstEmptyPosition] = bookToAdd;
        } else {
            System.out.println("Library is already full!");
        }

    }

    public void Delete(Book bookToBeRemoved) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getName() == bookToBeRemoved.getName()) {
                books[i] = null;
            }
        }
    }

    public void List() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println("Book name: " + books[i].getName() + ", number of pages : " + books[i].getNumberOfPages());
            }
        }
    }


}
