package src.main.java.mysql.pkg;

public class Main {
    public static void main(String[] args) throws Exception {
        MySQLAccess dao = new MySQLAccess();
        dao.readDataBase();
    }
}
    