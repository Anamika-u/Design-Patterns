package SingeltonPattern;

public class Main {
    public static void main(String[] args) {
        Database db = Database.getInstance();
        db.query("insert");

        Database db2 = Database.getInstance();
        db2.query("Select");

        //db and db2 will create only  1 instance
    }
}
