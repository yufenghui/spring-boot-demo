package com.yufenghui.boot.demo.service.impl;

import com.yufenghui.boot.demo.service.UserService;
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
    
    @Override
    public void getUser() {

        for (int i = 0; i < 10; i++) {

            System.out.println("xxxxxxxxxxx");

            for (int j = 0; j < 10; j++) {
                System.out.println("xxxxxxxxxxx");
            }

            System.out.println("xxxxxxxxxxx");
        }
        
    }
    
}
