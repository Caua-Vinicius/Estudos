package Facade;
public class Facade {
    private DatabaseAccess database;

    public Facade() {
        this.database = new DatabaseAccess();
    }

    public void loadCompleteData() {
        database.loadTable1();
        database.loadTable2();
    }
}
