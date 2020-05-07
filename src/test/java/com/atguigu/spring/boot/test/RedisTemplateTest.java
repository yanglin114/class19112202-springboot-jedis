package com.atguigu.spring.boot.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTemplateTest {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Test
    public void testRedisTemplate(){

        //1.根据要操作的类型获取Operations对象
        ValueOperations<String, String> operations = redisTemplate.opsForValue();

        //2.执行操作
        operations.set("cat", "bosi");

    }

    @Test
    public void testRedisTemplateGet(){

        //1.根据要操作的类型获取Operations对象
        ValueOperations<String, String> operations = redisTemplate.opsForValue();

        //2.执行操作
        Object cat = operations.get("cat");

        System.out.println(cat);

    }
}
