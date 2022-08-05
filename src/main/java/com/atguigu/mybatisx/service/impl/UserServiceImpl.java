package com.atguigu.mybatisx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.mybatisx.pojo.User;
import com.atguigu.mybatisx.service.UserService;
import com.atguigu.mybatisx.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author Stephen30
* @description 针对表【t_user】的数据库操作Service实现
* @createDate 2022-08-05 21:32:39
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




