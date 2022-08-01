package strategypattern3_6.domain.userinfo.dao;

public interface UserInfoDao {
    void create(String userId);
    void read(String userId);
    void update(String userId);
    void delete(String userId);
}
