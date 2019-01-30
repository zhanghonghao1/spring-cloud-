package com.anjubao.ceshiparentserver.web;

import com.anjubao.ceshiparentserver.entity.UserEntity;
import com.anjubao.ceshiparentserver.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @Author honghao <bruceza@qq.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/1/25
 */
@RestController
public class UserController {

    private static final String SECKILL_ORDERS = "SECKILL_ORDERS";

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/getUsers")
    public List<UserEntity> getUsers() {
        List<UserEntity> users=userMapper.getAll();
        return users;
    }

    @RequestMapping("/getUser")
    public UserEntity getUser(Long id) {
        UserEntity user=userMapper.getOne(id);
        //存储复杂对象
        redisTemplate.boundHashOps(SECKILL_ORDERS).put(id,user);
        UserEntity ue = (UserEntity) redisTemplate.boundHashOps(SECKILL_ORDERS).get(id);
        //存储简单字符串
        /*stringRedisTemplate.boundHashOps(SECKILL_ORDERS).put(String.valueOf(id),user.getUserName());
        Object u = stringRedisTemplate.boundHashOps(SECKILL_ORDERS).get(String.valueOf(id));
        System.out.println(u);*/
        System.out.println(ue);
        return ue;
    }

    @RequestMapping("/add")
    public void save(UserEntity user) {
        userMapper.insert(user);
    }

    @RequestMapping(value="update")
    public void update(UserEntity user) {
        userMapper.update(user);
    }

    @RequestMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        userMapper.delete(id);
    }
}
