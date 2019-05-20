package com.ashun.mapper;

import com.ashun.pojo.User;

import java.util.List;

/**
 * @className: TestMapper
 * @description:
 * @author: caihongshun
 * @create: 2019-02-06 09:23
 **/
public interface TestMapper {

    /**
     * 根据id查询用户
     *
     * @param id
     * @return
     */
    User queryUserById(Long id);

    List<User> queryUserList(User user);

   Integer insert(User user);
}
