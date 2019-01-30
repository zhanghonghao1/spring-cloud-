package com.anjubao.ceshiparentserver.mapper;

import com.anjubao.ceshiparentserver.entity.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Description
 * @Author honghao <bruceza@qq.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/1/25
 */
public interface UserMapper {
    @Select("SELECT * FROM users")
    @Results({
            @Result(property = "userSex",  column = "user_sex"),
            @Result(property = "nickName", column = "nick_name")
    })
    List<UserEntity> getAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    @Results({
            @Result(property = "userSex",  column = "user_sex"),
            @Result(property = "nickName", column = "nick_name")
    })
    UserEntity getOne(Long id);

    @Insert("INSERT INTO users(userName,passWord,user_sex) VALUES(#{userName}, #{passWord}, #{userSex})")
    void insert(UserEntity user);

    @Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
    void update(UserEntity user);

    @Delete("DELETE FROM users WHERE id =#{id}")
    void delete(Long id);
}
