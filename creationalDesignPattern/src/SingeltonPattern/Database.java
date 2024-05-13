package SingeltonPattern;

public class Database {

    private static Database instance = null;

    //Implement it with thread safety in case of concurrent implementation
    private Database() {
        if(instance != null) {
            instance = new Database();
        }
    }

    public static Database getInstance() {
        new Database();
        return instance;
    }

    public void query(String query) {
        //execute query
    }
}
