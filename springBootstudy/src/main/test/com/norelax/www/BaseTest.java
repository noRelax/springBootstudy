package com.norelax.www;import com.alibaba.fastjson.JSON;import com.norelax.www.entity.Person;import org.junit.Before;import org.junit.Test;import org.springframework.beans.factory.annotation.Autowired;/** * @author wusong * @create 2017-06-15 下午6:57 **/public class BaseTest extends AbstractBaseTest {    @Autowired    private Person person1;    @Test    public void test(){        System.out.println(">>>>>>>"+person1.toString());    }    @Test    public void sayHello() throws Exception {        setRequestUrl("/sayHello?name=haha");        System.out.println(JSON.toJSONString(person1,true));    }}