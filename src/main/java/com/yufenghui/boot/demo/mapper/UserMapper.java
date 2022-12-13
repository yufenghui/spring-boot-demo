package com.yufenghui.boot.demo.mapper;

import com.yufenghui.boot.demo.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * UserMapper
 * <p/>
 *
 * @author yufenghui
 * @date 2022/11/23 10:29
 */
@Mapper
public interface UserMapper {

    UserEntity getUserById(Map<String, Object> param);

    void updateUserName(Map<String, Object> param);

    void deleteUser(Map<String, Object> param);

}
