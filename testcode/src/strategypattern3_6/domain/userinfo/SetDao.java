package strategypattern3_6.domain.userinfo;

import strategypattern3_6.domain.userinfo.dao.UserInfoDao;
import strategypattern3_6.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import strategypattern3_6.domain.userinfo.dao.oracle.UserInfoOracleDao;
import java.io.BufferedReader;
import java.io.FileReader;

public class SetDao {
    private static SetDao setDao = new SetDao();
    private static UserInfoDao dao;

    private  SetDao() {
        String dbtype = null;

        try {
        BufferedReader reader = new BufferedReader(new FileReader("/Users/icheol/java_DesignPattern/testcode/src/strategypattern3_6/userinfo/web/db.properties"));
        dbtype = reader.readLine();
        reader.close();
        }catch (Exception e){
            System.out.println("file error");
        }

        dbtype = dbtype.substring(7, dbtype.length());

        if (dbtype.equals("MYSQL")) {
            dao = new UserInfoMySqlDao();
        }
        else if (dbtype.equals("ORACLE"))
            dao = new UserInfoOracleDao();
    }

    public static UserInfoDao getDao() {
        return dao;
    }
}
