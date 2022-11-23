package com.yufenghui.boot.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * UserEntity
 * <p/>
 *
 * @author yufenghui
 * @date 2022/11/23 11:36
 */
@TableName("user")
public class UserEntity {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;

}
