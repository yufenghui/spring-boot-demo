package com.yufenghui.boot.nacos.config.demo.rest;

import com.yufenghui.boot.nacos.config.demo.model.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ConfigController
 * </p>
 *
 * @author yufenghui
 * @date 2023/1/11 11:56
 */
@RestController
@RequestMapping("/config")
public class ConfigController {

    @Autowired
    private UserConfig userConfig;


    @GetMapping("/user_id")
    public Integer getUserId() {
        return userConfig.getId();
    }

}
