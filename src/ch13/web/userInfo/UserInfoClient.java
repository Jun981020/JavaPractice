package ch13.web.userInfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userInfo.UserInfo;
import ch13.domain.userInfo.dao.UserInfoDao;
import ch13.domain.userInfo.dao.mysql.UserInfoMysqlDao;
import ch13.domain.userInfo.dao.oracle.UserInfoOracle;

public class UserInfoClient {

	public static void main(String[]args) throws IOException {
		
		FileInputStream fis = new FileInputStream("db.properties");

		Properties properties = new Properties();
		properties.load(fis);
		
		String dbType = properties.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		
		UserInfoDao userInfoDao = null;
		
		if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracle();
		}
		else if(dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMysqlDao();
		}
		else {
			System.out.println("db error");
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
		
 	}
}
