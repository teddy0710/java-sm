package com.zhangflg.sm.dao;

import com.zhangflg.sm.entity.Department;

import java.util.List;

public interface DepartmentDao {
    void insert(Department department);

    void delete(Integer id);

    void update(Department department);

    Department selectById(Integer id);

    List<Department> selectAll();
}
