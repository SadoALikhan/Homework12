public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Alexander", "Pushkin");
        Author secondAuthor = new Author("Jo", "Nesbø");
        Book firstBook = new Book("Eugene Onegin", firstAuthor, 1964);
        Book secondBook = new Book("Son", secondAuthor, 2014);
        System.out.println("1)Название книги: " + firstBook.getTitle() + ". Автор книги: " +
                firstBook.getAuthor().getFirstName() + " " + firstBook.getAuthor().getLastName()
                + ". Год выпуска: " + firstBook.getPublicationYear());
        System.out.println("2)Название книги: " + secondBook.getTitle() + ". Автор книги: " +
                secondBook.getAuthor().getFirstName() + " " + secondBook.getAuthor().getLastName()
                + ". Год выпуска: " + secondBook.getPublicationYear());
        secondBook.setPublicationYear(2018);
        System.out.println("3)Название книги: " + secondBook.getTitle() + ". Автор книги: " +
                secondBook.getAuthor().getFirstName() + " " + secondBook.getAuthor().getLastName()
                + ". Год выпуска: " + secondBook.getPublicationYear());
    }
}