package com.wandou.bull.test.demo;

import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * @author liming
 * @date 2021/12/9 下午9:57
 */
public class UrlEncodeDemo {

    @Test
    public void m1() throws UnsupportedEncodingException {
        String json = "{\"depCityCode\":\"PEK\"}";
        String encode = URLEncoder.encode(json, StandardCharsets.UTF_8.name());
        System.out.println(encode);

        encode = URLEncoder.encode(encode, StandardCharsets.UTF_8.name());
        System.out.println(encode);

        encode = URLEncoder.encode(encode, StandardCharsets.UTF_8.name());
        System.out.println(encode);

    }

    @Test
    public void decode() throws UnsupportedEncodingException {
        String json = "{\"depCityCode\":\"PEK\"}";
        String encode = URLEncoder.encode(json, StandardCharsets.UTF_8.name());
        System.out.println(encode);

        encode = URLDecoder.decode(encode, StandardCharsets.UTF_8.name());
        System.out.println(encode);

        encode = URLDecoder.decode(encode, StandardCharsets.UTF_8.name());
        System.out.println(encode);

        encode = URLDecoder.decode(encode, StandardCharsets.UTF_8.name());
        System.out.println(encode);
    }
}
