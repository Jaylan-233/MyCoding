package org.jaylan.dao;
import java.util.List;

import org.jaylan.pojo.MyUser;
import org.springframework.stereotype.Repository;

@Repository("userDao")
@Mapper
/*ʹ��Spring�Զ�ɨ��MyBatis�Ľӿڲ�װ��
��Spring��ָ���������б�@Mapperע���ע�Ľӿ��Զ�װ��ΪMyBatis��ӳ��ӿ�*/
public interface UserDao {
	/**
	 * �ӿڷ�����ӦSQLӳ���ļ�UserMapper.xml�е�id
	 */
	public MyUser selectUserById(Integer uid);
	public List<MyUser> selectAllUser();
	public int addUser(MyUser user);
	public int updateUser(MyUser user);
	public int deleteUser(Integer uid);
	public  List<MyUser> selectUserByIf(MyUser user);
	public List<MyUser> selectUserByChoose(MyUser user);
	public List<MyUser> selectUserByTrim(MyUser user);
	public List<MyUser> selectUserByWhere(MyUser user);
	public int updateUserBySet(MyUser user);
	public  List<MyUser> selectUserByForeach(List<Integer> listId);
	public  List<MyUser> selectUserByBind(MyUser user);
}
