public class Book
{
    private String title;
    private String author;
    private int year;
    private String publisher;
    private String genre;
    private int pages;
    public Book()
    {
        this.title = "";
        this.author = "";
        this.year = 0;
        this.publisher = "";
        this.genre = "";
        this.pages = 0;
    }
    public Book(String title, String author, int year, String publisher, String genre, int pages)
    {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.pages = pages;
    }
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
        this.year = 0;
        this.publisher = "";
        this.genre = "";
        this.pages = 0;
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public int getYear()
    {
        return year;
    }
    public String getPublisher()
    {
        return publisher;
    }
    public String getGenre()
    {
        return genre;
    }
    public int getPages()
    {
        return pages;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }
    public void setGenre(String genre)
    {
        this.genre = genre;
    }
    public void setPages(int pages)
    {
        this.pages = pages;
    }
    public void setBookDetails(String title, String author, int year)
    {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public void setBookDetails(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
    public void displayInfo()
    {
        System.out.println("Назва книги: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Рік випуску: " + year);
        System.out.println("Видавництво: " + publisher);
        System.out.println("Жанр: " + genre);
        System.out.println("Кількість сторінок: " + pages);
    }
    public static void main(String[] args)
    {
        Book book1 = new Book("Маніфест Унабомбера", "Качинський Теодор", 2020, "Центр учбової літератури", "Художня література", 100);
        book1.displayInfo();
        book1.setBookDetails("Маніфест Унабомбера", "Качинський Теодор", 2020);
        book1.displayInfo();
    }
}
