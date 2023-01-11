package com.yufenghui.boot.nacos.config.demo.model;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

/**
 * UserData
 * </p>
 *
 * @author yufenghui
 * @date 2023/1/11 14:10
 */
@NacosConfigurationProperties(prefix = "user", dataId = "spring.boot.demo", type = ConfigType.YAML, autoRefreshed = true)
@Configuration
public class UserConfig implements Serializable {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
