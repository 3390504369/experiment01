package com.example.experiment01;

import com.example.experiment01.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//指定测试运行器，所有测试方法由运行器
// 执行，集成，参数化等测试需求时指定
@SpringBootTest
//声明为springboot测试类，可启动测试用Springboot
public class Experiment01ApplicationTests {

    @Autowired
    private UserRepository userRepository;
    @Test
    public void contextLoads() {
        userRepository.addUserAddress();
    }

}
