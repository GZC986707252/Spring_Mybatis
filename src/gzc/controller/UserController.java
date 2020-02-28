package gzc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import gzc.dao.MyUserDao;
import gzc.model.MyUser;

@Controller
public class UserController {

	@Autowired
	private MyUserDao myUserDao;

	public void test() {

		// 查询一个用户
		MyUser mu = myUserDao.selectUserById(1);
		System.out.println(mu);
		// 添加一个用户
		MyUser newUser = new MyUser(7, "小g蘭", "女");
		myUserDao.addUser(newUser);

		// 修改一个用户
		MyUser updatemu = new MyUser(3, "小lk", "女");
		myUserDao.updateUser(updatemu);

		// 删除一个用户
		myUserDao.deleteUser(6);

		// 查找所有用户
		List<MyUser> myUsers = myUserDao.selectAllUser();
		for (MyUser myUser : myUsers) {
			System.out.println(myUser);
		}

	}
}
