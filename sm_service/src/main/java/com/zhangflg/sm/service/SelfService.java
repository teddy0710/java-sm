package com.zhangflg.sm.service;

import com.zhangflg.sm.entity.Staff;

public interface SelfService {
    Staff login(String account, String password);

    void changePassword(Integer id, String password);
}
