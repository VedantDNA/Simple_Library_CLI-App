public class BookStorage {

    private Books[] books;
    private int count;

    public BookStorage(){
        books = new Books[10];
        count = 0;
    }

    public boolean addBook(Books book){
        if(count >= books.length){
            return false;
        }else {
            books[count] = book;
            count++;
            return true;
        }
    }

    public Books getBook(int index){
        if(index >= books.length && index > count){
            return null;
        }else {
            return books[index];
        }
    }

    public int size(){
        return count;
    }
}
