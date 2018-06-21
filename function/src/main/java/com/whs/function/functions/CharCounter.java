package com.whs.function.functions;
import java.util.function.Function;


/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-06-20 16:17
 */
public class CharCounter implements Function<String, Integer> {

    @Override
    public Integer apply(String s) {
        return s.length();
    }

}
