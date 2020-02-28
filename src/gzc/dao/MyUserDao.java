package gzc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import gzc.model.MyUser;

@Repository
@Mapper
public interface MyUserDao {

	/*
	 * 
	 * Spring 将指定的包中所有被@Mapper注解标注的接口自动装配为Mybatis的映射接口
	 * 接口方法对应SQL映射文件MyUserMapper.xml中的id
	 * 
	 */

	public MyUser selectUserById(Integer uid);

	public List<MyUser> selectAllUser();

	public int addUser(MyUser user);

	public int updateUser(MyUser user);

	public int deleteUser(Integer uid);

}
