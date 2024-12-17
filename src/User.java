public class User {
    private int ID;
    private String name;

    public User (int ID, String name){
        this.ID = ID;
        this.name = name;
    }
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    //@Override
    public String isPrint(){
        return "Имя пользователя - " + name + ", ID - " + ID;
    }
}
