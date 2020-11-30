package com.hhy.jpademo.dao;

import com.hhy.jpademo.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: huanghaiyun-002
 * @create: 2020-11-30
 **/
public interface TestEntityDao extends JpaRepository<TestEntity, Long> {
    TestEntity findByIdIs(Long id);
}
