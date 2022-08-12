package strategypattern3_6.domain.userinfo.dao.mysql;

import strategypattern3_6.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {
    public void create(String userId) {
        System.out.println("insert into MYSQL DB userId = " + userId);
    }
    public void read(String userId) {
        System.out.println("select into MYSQL DB userId = " + userId);
    }
    public void update(String userId) {
        System.out.println("update into MYSQL DB userId = " + userId);
    }
    public void delete(String userId) {
        System.out.println("delete into MYSQL DB userId = " + userId);
    }
}
