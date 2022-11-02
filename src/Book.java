public class Book {

    private final String nameOfTheBook;
    private final Author author;
    private int yearOfPublicationOfTheBook;


    public Book(String nameOfBook, Author author, int yearOfPublicationOfTheBook) {
        this.nameOfTheBook = nameOfBook;
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
        this.author = author;
    }

    public String getNameOfTheBook() {

        return nameOfTheBook;
    }

    public int getYearOfPublicationOfTheBook() {

        return yearOfPublicationOfTheBook;
    }

    public void setYearOfPublicationOfTheBook(int yearOfPublicationOfTheBook) {
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;

    }


}

