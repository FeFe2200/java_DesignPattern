package abstractFactory;

public abstract class UserInfoDao {
    abstract void insertUserInfo(UserInfo temp);

    abstract void updateUserInfo(UserInfo temp);

    abstract void deleteUserInf(UserInfo temp);
}
