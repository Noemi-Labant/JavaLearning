package Library;

public class LibraryCatalogApp {

    public static void main(String[] args) {
        Library catalog = new Library(5);
        Book littlePrince = new Novel("Little Prince", 150, "Kids");
        Book frenchArt = new ArtAlbum("French Art", 300, "Good");
        catalog.Add(littlePrince);
        catalog.Add(frenchArt);
        catalog.List();
        catalog.Delete(littlePrince);
        catalog.List();

    }
}
