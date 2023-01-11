package com.yufenghui.boot.nacos.config.cloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ConfigController
 * </p>
 *
 * @author yufenghui
 * @date 2023/1/11 14:49
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${user.id}")
    private Integer userId;


    @GetMapping("/user_id")
    public Integer getUserId() {
        return userId;
    }

}
