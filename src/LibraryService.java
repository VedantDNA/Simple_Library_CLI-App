public class LibraryService {

    private BookStorage storage;

    public LibraryService(BookStorage storage){
        this.storage = storage;
    }

    public void addBook(String title, String author){
        Books book = new Books(title,author);
        boolean added = storage.addBook(book);
        if(added){
            System.out.println(book + " Successfully Added !!!");
        }else {
            System.out.println("Library is Full. Cannot Add more books");
        }
    }

    public void showBooks(){
        int total = storage.size();
        if(total == 0){
            System.out.println("Shelf is Empty !!!");
            return;
        }

        System.out.println("All Books: ");
        for(int i = 0; i < total; i++){
            Books book = storage.getBook(i);
            System.out.println(book);
        }
    }
}
