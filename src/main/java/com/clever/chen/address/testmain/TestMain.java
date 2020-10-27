package com.clever.chen.address.testmain;

import com.clever.chen.address.entity.Address;
import com.clever.chen.address.entity.User;
import com.clever.chen.address.mapper.AddressMapper;
import com.clever.chen.address.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

/**
 * @author ChenWang
 * @className TestMain
 * @date 2020/10/27 19:55
 * @since JDK 1.8
 */
public class TestMain {
    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(
                TestMain.class.getClassLoader().getResourceAsStream("mybatis-config.xml")
        );
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        AddressMapper addressMapper = sqlSession.getMapper(AddressMapper.class);
        List<User> users = mapper.selectAll();
        System.out.println(users);

        /*User user = new User();
        user.setUsername("鸣人");
        user.setPassword("123456");
        user.setPhone("19876571768");
        int insert = mapper.insert(user);
        System.out.println(insert);*/

        /*List<Address> addresses = addressMapper.selectAddrByUserId(1);
        System.out.println(addresses);

        int delete = addressMapper.delete(addresses.get(0));
        System.out.println(delete);
        System.out.println(addresses);*/

    }
}
