package com.example.httpClientDemo.test;

import com.example.httpClientDemo.util.HttpClientUtil;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author YZ
 * @Date 2020/4/1 16:00
 * @ClassName HttpClientUtilsTest
 */
public class HttpClientUtilsTest {

    @Test
    public void httpClientUtilTest(){
        String url = "http://localhost:8080/test/post/param";
        Map<String, String> param = new HashMap<>();
        param.put("name", "李四");
        param.put("pwd", "lisi");
        String result = HttpClientUtil.doPost(url,
                param);
        System.out.println(result);
    }

}
