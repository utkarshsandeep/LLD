package SystemDesign.LLD.DesignPatterns.CreationalDesignPattern.ObjectPoolDesignPattern;

public class Main {
    public static void main(String[] args) {
        DBConnectionPoolManager dbConnectionPoolManager = DBConnectionPoolManager.getInstance();
        DBConnection connection1 = dbConnectionPoolManager.getDBConnections();
        DBConnection connection2 = dbConnectionPoolManager.getDBConnections();
        DBConnection connection3 = dbConnectionPoolManager.getDBConnections();
        dbConnectionPoolManager.removeDBConnection(connection3);
        DBConnection connection4 = dbConnectionPoolManager.getDBConnections();

    }
}
