public class Book {
    private int ID;
    private String name;              //Название
    private String author;            //Автор
    private int yearPublication;      //Год издания
    private boolean isAvailable;            //Статус (доступна/выдана)

    public Book(int ID, String name, String author, int yearPublication,String status){
        this.ID = ID;
        this.name = name;
        this.author = author;
        this.yearPublication = yearPublication;
        this.isAvailable = isAvailable;
    }
    public int getID(){
        return ID;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getYearPublication() {
        return yearPublication;
    }
    public boolean getIsAvailable(){
        return isAvailable;
    }
    public void setAvailable(boolean available){
        isAvailable = available;
    }
    //@Override
    public String isPrint(){
        return "Название книги - " + name + ", Автор - " + author + ", Год издания - "
                + ", Статус - " + (isAvailable ? " Выдана" : " Достпупна");
    }
}
