package com.ruoyi;

import com.ruoyi.common.utils.DateUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
public class RuoYiApplicationTests {



    @Test
    void contextLoads() {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(now);

        System.out.println(time);
        System.out.println(sdf);
        System.out.println("hello world");
        String dateTime = DateUtils.getTime();
        System.out.println(dateTime);
    }
}


