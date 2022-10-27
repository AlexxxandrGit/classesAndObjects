public class Author {
    private String authorName;
    private String authorSurname;


    public Author(String authorName, String authorSurname) {
        if (authorName.isEmpty()) {
            System.out.println("Необходимо ввести имя!");
        }
        if (authorSurname.isEmpty()) {
            System.out.println("Необходимо ввести фамилию!");
        }
        this.authorName = authorName;
        this.authorSurname = authorSurname;

    }

    public String getAuthorName() {

        return authorName;
    }


    public String getAuthorSurname() {

        return authorSurname;
    }


}