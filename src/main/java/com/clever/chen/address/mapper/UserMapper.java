package com.clever.chen.address.mapper;

import com.clever.chen.address.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ChenWang
 * @interfaceName UserMapper
 * @date 2020/10/27 18:44
 * @since JDK 1.8
 */
public interface UserMapper {
    /**
     *  插入指定的用户
     * @param user  指定的用户
     * @return      影响的行数
     * @author ChenWang
     * @date 2020/10/27 19:34
     */
    int insert(@Param("user") User user);
    /**
     * 查询所有的用户信息
     * @return  所有的用户信息的集合
     * @author ChenWang
     * @date 2020/10/27 19:34
     */
    List<User> selectAll();
    /**
     * 更新指定的用户信息
     * @param user  指定的用户
     * @return  影响的行数
     * @author ChenWang
     * @date 2020/10/27 19:35
     */
    int update(@Param("user")User user);
    /**
     * 删除指定的用户
     * @param user  指定的用户
     * @return  影响的行数
     * @author ChenWang
     * @date 2020/10/27 19:48
     */
    int delete(@Param("user")User user);
}
