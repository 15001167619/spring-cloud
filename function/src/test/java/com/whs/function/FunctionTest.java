package com.whs.function;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.function.Function;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-06-21 9:36
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class FunctionTest {

    @Autowired
    private Function<String, Integer> charCounter111;

    @Test
    public void testCharCounter() {
        Integer length = this.charCounter111.apply("慕小谦");
        log.info("字符长度："+length);
    }

}
