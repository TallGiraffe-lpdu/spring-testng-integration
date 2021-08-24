package com.luthai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.annotation.Resource;

//@ContextConfiguration声明配置文件地址，{}中可定义多个配置文件
@ContextConfiguration(locations = { "classpath:spring-test-config.xml" })
//继承AbstractTestNGSpringContextTests（实现了ApplicationContextAware）以访问spring某些资源
public class TestNgSpring extends AbstractTestNGSpringContextTests {

    //依赖注入，继承AbstractTestnGSpringContextTests后，可使用
    //否则会提示Test类不是一个Spring Bean无法使用依赖注入
    @Autowired
    IEmailGenerator emailGenerator;

    @Test
    public void test01(){
        String email = emailGenerator.generator();
        System.out.println(email);

        Assert.assertNotNull(email);
        Assert.assertEquals(email, "lpdu@qq.com");
    }
}
