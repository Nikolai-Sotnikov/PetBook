public class Book {
    private String Id;
    private String title;             //Название
    private String author;            //Автор
    private int year;                 //Год издания
    private boolean isAvailable;      //Статус (доступна/выдана)

    public Book(String Id, String title, String author, int year){
        this.Id = Id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
    }
    public String getId(){
        return Id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getYear() {
        return year;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void setAvailable(boolean available){
        isAvailable = available;
    }
    public String isString(){
        return "Название книги - " + title + ", Автор - " + author + ", Год издания - "
                + ", Статус - " + (isAvailable ? " Выдана" : " Достпупна");
    }
}
