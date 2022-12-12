package com.yufenghui.boot.demo;

import cn.hutool.jwt.JWTUtil;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * JWT
 * <p/>
 *
 * @author yufenghui
 * @date 2022/12/5 16:49
 */
public class JwtTest {


    @Test
    public void genToken() {

        Map<String, Object> map = new HashMap<String, Object>() {
            private static final long serialVersionUID = 1L;
            {
                put("uid", Integer.parseInt("123"));
                put("expire_time", System.currentTimeMillis() + 1000 * 60 * 60 * 24 * 15);
            }
        };

        String token = JWTUtil.createToken(map, "1234".getBytes());
        System.out.println(token);

    }

}
