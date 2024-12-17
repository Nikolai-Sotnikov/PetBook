public class Book {
    private int ID;
    private String name;              //Название
    private String author;            //Автор
    private int yearPublication;   //Год издания
    private String status;            //Статус (доступна/выдана)

    public Book(int ID, String name, String author,
                int yearPublication,String status){
        this.ID = ID;
        this.name = name;
        this.author = author;
        this.yearPublication = yearPublication;
        this.status = status;
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
    public String getStatus(){
        return status;
    }
    @Override
    public String isPrint(){
        return 
    }
}
