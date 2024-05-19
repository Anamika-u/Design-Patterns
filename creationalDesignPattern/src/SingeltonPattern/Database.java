package SingeltonPattern;

public class Database {

    private static Database instance = null;

    private Database() {}

    //Implement it with thread safety in case of concurrent implementation
    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void query(String query) {
        System.out.println("Executing :" + query + " query");
        //execute query
    }
}
