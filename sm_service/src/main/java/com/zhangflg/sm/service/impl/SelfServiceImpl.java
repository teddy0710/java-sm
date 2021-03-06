package com.zhangflg.sm.service.impl;

import com.zhangflg.sm.dao.SelfDao;
import com.zhangflg.sm.dao.StaffDao;
import com.zhangflg.sm.entity.Staff;
import com.zhangflg.sm.service.SelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("selfService")
public class SelfServiceImpl implements SelfService {

    @Autowired
    private SelfDao selfDao;

    @Autowired
    private StaffDao staffDao;

    public Staff login(String account, String password) {
        Staff staff = selfDao.selectByAccount(account);
        if (staff == null) {
            return null;
        } else {
            if (staff.getPassword().equals(password)) {
                return staff;
            } else {
                return null;
            }
        }
    }

    public void changePassword(Integer id, String password) {
        Staff staff = staffDao.selectById(id);
        staff.setPassword(password);
        staffDao.update(staff);
    }
}
