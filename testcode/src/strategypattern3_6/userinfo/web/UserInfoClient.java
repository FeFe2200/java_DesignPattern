package strategypattern3_6.userinfo.web;

import strategypattern3_6.domain.userinfo.*;
import strategypattern3_6.domain.userinfo.dao.UserInfoDao;

public class UserInfoClient {
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo();
        UserInfoDao userInfoDao = SetDao.getDao();

        userInfo.setUserId("12345");
        userInfo.setPasswd("1234");
        userInfo.setUserName("123");

        userInfoDao.create(userInfo.getUserId());
        userInfoDao.update(userInfo.getUserId());
        userInfoDao.delete(userInfo.getUserId());

    }
}
