package strategypattern3_6.domain.userinfo.dao.oracle;

import strategypattern3_6.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
    public void create(String userId) {
        System.out.println("insert into ORACLE DB userId = " + userId);
    }
    public void read(String userId) {
        System.out.println("select into ORACLE DB userId = " + userId);
    }
    public void update(String userId) {
        System.out.println("update into ORACLE DB userId = " + userId);
    }
    public void delete(String userId) {
        System.out.println("delete into ORACLE DB userId = " + userId);
    }
}
