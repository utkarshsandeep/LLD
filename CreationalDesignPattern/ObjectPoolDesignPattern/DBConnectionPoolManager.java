package SystemDesign.LLD.DesignPatterns.CreationalDesignPattern.ObjectPoolDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class DBConnectionPoolManager {
    //A class used for managing the pool of DB connections
    List<DBConnection> freeConnectionsPool = new ArrayList<>();
    List<DBConnection> usedConnectionsPool = new ArrayList<>();
    int INITIAL_POOL_SIZE = 1;
    int MAX_POOL_SIZE = 3;
    private static DBConnectionPoolManager dbConnectionPoolManagerInstance = null;

    private DBConnectionPoolManager() {
        for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
            freeConnectionsPool.add(new DBConnection());
        }
    }

    public static DBConnectionPoolManager getInstance() {
        if (dbConnectionPoolManagerInstance == null) {
            synchronized (DBConnectionPoolManager.class) {
                if (dbConnectionPoolManagerInstance == null) {
                    dbConnectionPoolManagerInstance = new DBConnectionPoolManager();
                }
            }
        }
        return dbConnectionPoolManagerInstance;
    }

    public synchronized DBConnection getDBConnections() {
        if (freeConnectionsPool.isEmpty() && usedConnectionsPool.size() < MAX_POOL_SIZE) {
            freeConnectionsPool.add(new DBConnection());
        } else if (freeConnectionsPool.isEmpty() && usedConnectionsPool.size() >= MAX_POOL_SIZE) {
            System.out.println("Pool limit exhausted!!!");
            return null;
        }
        DBConnection dbConnection = freeConnectionsPool.remove(freeConnectionsPool.size() - 1);
        usedConnectionsPool.add(dbConnection);
        return dbConnection;
    }

    public synchronized void removeDBConnection(DBConnection dbConnection) {
        if (dbConnection != null) {
            usedConnectionsPool.remove(dbConnection);
            freeConnectionsPool.add(dbConnection);
        }
    }


}
