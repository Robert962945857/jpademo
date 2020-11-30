package com.hhy.jpademo.controller;

import com.hhy.jpademo.dao.TestEntityDao;
import com.hhy.jpademo.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: huanghaiyun-002
 * @create: 2020-11-30
 **/
@RestController
public class TestController {
    @Autowired
    private TestEntityDao testEntityDao;

    @RequestMapping("/test")
    public void test(Long id){
        TestEntity entity=testEntityDao.findByIdIs(id);
        System.out.println(entity.getCompanyid());
    }
}
