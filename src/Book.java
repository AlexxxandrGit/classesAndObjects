public class Book {

    private String nameOfTheBook;
    private int yearOfPublicationOfTheBook;


    public Book(String nameOfBook, int yearOfPublicationOfTheBook) {
        this.nameOfTheBook = nameOfBook;
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;

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

