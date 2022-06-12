package com.wandou.bull.test;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.util.List;
import java.util.UUID;

/**
 * @author liming
 * @date 2022/6/11 17:41
 */

@SpringBootTest
public class FileTest {

    private static final Logger logger = LoggerFactory.getLogger(FileTest.class);

    private RestTemplate restTemplate = new RestTemplate();


    @Test
    public void upload() throws FileNotFoundException {
        String url = "http://localhost:8086/file/upload";
        File file = new File("/Users/liming/Documents/java/java_self/git_site_self/bull/src/main/resources/static/5b06f531a3ae4e31aae4addc0527ee6a.png");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamResource inputStreamResource = new InputStreamResource(fileInputStream);
        FileSystemResource fileSystemResource = new FileSystemResource(file);
        byte[] bytes = getBytes(file);
        if (bytes != null) {
            logger.info("bytes.len: {}", bytes.length);
        }
        File file1 = toFile(bytes);
        if (file1 != null) {
            logger.info("file1.len: {}", file1.length());
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);
        MultiValueMap<String, Object> params = new LinkedMultiValueMap<>();
        params.add("file", fileSystemResource);
        params.add("mainType", "abc");
        params.add("bytes", bytes);
        HttpEntity<MultiValueMap<String, Object>> entity = new HttpEntity<>(params, headers);
        List<Object> list = entity.getBody().get("bytes");
        Object o = list.get(0);
        int length = ((byte[]) o).length;
        logger.info("length: {}", length);
        ResponseEntity<String> resp = restTemplate.postForEntity(url, entity, String.class);
        logger.info("resp: {}", resp);
    }

    private byte[] getBytes(File file) {
        FileInputStream fileInputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            byteArrayOutputStream = new ByteArrayOutputStream(1024);
            byte[] buff = new byte[1024];
            int len;
            while ((len = fileInputStream.read(buff)) != -1) {
                byteArrayOutputStream.write(buff, 0, len);
                byteArrayOutputStream.flush();
            }
            byteArrayOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    private File toFile(byte[] bytes) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        File file = null;
        try {
            file = new File("/Users/liming/Documents/java/java_self/git_site_self/bull/src/main/resources/static/" + UUID.randomUUID().toString());
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] buff = new byte[1024];
            int len;
            while ((len = byteArrayInputStream.read(buff)) != -1) {
                fileOutputStream.write(buff, 0, len);
                fileOutputStream.flush();
            }
            fileOutputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }


}
