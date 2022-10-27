public class Main {
    public static void main(String[] args) {
        Book myBook1 = new Book("Моя книга1 ", 2019);
        System.out.println("Название книги: " + myBook1.getNameOfTheBook());
        System.out.println("Дата публикации книги: " + myBook1.getYearOfPublicationOfTheBook());

        Book myBook2 = new Book("Моя книга 2", 2020);
        myBook2.setYearOfPublicationOfTheBook(2022);

        System.out.println("Название книги: " + myBook2.getNameOfTheBook());
        System.out.println("Дата публикации книги: " + myBook2.getYearOfPublicationOfTheBook());

        Author author1 = new Author("Aleksandr", "Lobanov");
        System.out.println("Автор: " + author1.getAuthorName() + " " + author1.getAuthorSurname());

        Author author2 = new Author("Ivan", "Ivanov");
        System.out.println("Автор: " + author2.getAuthorName() + " " + author2.getAuthorSurname());


    }


}