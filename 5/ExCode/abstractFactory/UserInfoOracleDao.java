package abstractFactory;

public class UserInfoOracleDao extends UserInfoDao{
    UserInfo userInfo;

    public void insertUserInfo(UserInfo temp) {
        userInfo = temp;
    }

    public void updateUserInfo(UserInfo temp){
        userInfo = temp;
    }

    public void deleteUserInf(UserInfo temp) {
        userInfo = null;
    }
}
