package com.atguigu.mybatisx.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.atguigu.mybatisx.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author Stephen30
* @description 针对表【t_user】的数据库操作Mapper
* @createDate 2022-08-05 21:32:39
* @Entity com.atguigu.mybatisx.pojo.User
*/
public interface UserMapper extends BaseMapper<User> {


    int insertSelective(User user);


    int deleteByUidAndUserName(@Param("uid") Long uid, @Param("userName") String userName);


    int updateAgeAndSexByUid(@Param("age") Integer age, @Param("sex") Integer sex, @Param("uid") Long uid);

    List<User> selectAgeAndSexByAgeBetween(@Param("beginAge") Integer beginAge, @Param("endAge") Integer endAge);

    List<User> selectAllOrderByAgeDesc();


    int updateUserNameAndSexByUid(@Param("userName") String userName, @Param("sex") Integer sex, @Param("uid") Long uid);


    int updateSelective(User user);






}




