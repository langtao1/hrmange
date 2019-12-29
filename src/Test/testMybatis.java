package Test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.bdqn.dao.userMapper;
import com.bdqn.entity.DY_User;

import tools.MyBatisUtil;



public class testMybatis {
public static void main(String[] args) {
	SqlSession session=MyBatisUtil.openSqlSession();
	userMapper dao=session.getMapper(userMapper.class);
	List<DY_User> user=dao.users();
	for (DY_User u: user) {
		System.out.println(u);
	}
}
}
