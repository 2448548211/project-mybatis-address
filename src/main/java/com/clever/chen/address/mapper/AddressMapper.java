package com.clever.chen.address.mapper;

import com.clever.chen.address.entity.Address;
import com.clever.chen.address.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ChenWang
 * @interfaceName AddressMapper
 * @date 2020/10/27 18:45
 * @since JDK 1.8
 */
public interface AddressMapper {
    /**
     * 根据用户ID查询所有的地址
     * @param userId    指定的用户ID
     * @return      该用户所有的地址
     * @author ChenWang
     * @date 2020/10/27 19:32
     */
    List<Address> selectAddrByUserId(@Param("userId")int userId);
    /**
     * 插入指定的地址
     * @param addr  指定的地址
     * @return      影响的行数
     * @author ChenWang
     * @date 2020/10/27 19:32
     */
    int insertAddr(@Param("addr")Address addr);
    /**
     * 将地址集合中的地址一次性插入到数据库中
     * @param addrs     指定的地址集合
     * @return      影响的行数
     * @author ChenWang
     * @date 2020/10/27 19:33
     */
    int insertMultiAddr(@Param("addrs")List<Address> addrs);
    /**
     * 删除指定的地址
     * @param addr  指定的地址
     * @return      影响的行数
     * @author ChenWang
     * @date 2020/10/27 19:52
     */
    int delete(@Param("addr") Address addr);
    /**
     * 修改指定的地址信息
     * @param addr 指定的地址
     * @return  影响的行数
     * @author ChenWang
     * @date 2020/10/27 20:07
     */
    int update(@Param("addr")Address addr);
}
