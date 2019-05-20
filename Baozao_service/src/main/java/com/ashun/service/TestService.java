package com.ashun.service;

import com.ashun.mapper.TestMapper;
import com.ashun.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @className: TestServiceImpl
 * @description: 测试
 * @author: caihongshun
 * @create: 2019-02-05 19:32
 **/

@Service("testService")
@Transactional
public class TestService{

    @Autowired
    private TestMapper testMapper;


    public User queryUserById(Long id) {
        User user = testMapper.queryUserById(id);
        user.setId(5L);
        return user;
    }
    /**
     * @Author: caihongshun
     * @Date: 15:52 2019/4/26
     * @Param:
     * @return:
     * @Description: 查询数据
     **/
    public  List<User> queryUserList(User user){


        return testMapper.queryUserList(user);
    }

    /**
     * 插入数据
     * @param user
     * @return
     */
    public  Integer insert(User user){


        return testMapper.insert(user);
    }
}
