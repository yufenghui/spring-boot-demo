package com.yufenghui.boot.demo.service.impl;

import com.yufenghui.boot.demo.mapper.UserMapper;
import com.yufenghui.boot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserServiceImpl
 * <p/>
 *
 * @author yufenghui
 * @date 2022/11/23 18:32
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper UserMapper;
    
    @Override
    public void getUser() {

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.println("xxxxxxxxxxx");
            }

        }
        
    }
    
}
