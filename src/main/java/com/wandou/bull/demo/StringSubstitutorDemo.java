package com.wandou.bull.demo;

import org.apache.commons.lang3.text.StrSubstitutor;
import org.apache.commons.text.StringSubstitutor;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liming
 * @date 2021/11/17 下午8:01
 */
public class StringSubstitutorDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(8);
        map.put("a", "锄禾日当午");
        map.put("b", "汗滴禾下土");
        String string = StrSubstitutor.replace("${a},${b}", map);
        System.out.println("string = " + string);

        /* ******* text **********/
        Map<String, String> manjianghongMap = new HashMap<>();
        manjianghongMap.put("baqianlilu", "八千里路云和月。");
        manjianghongMap.put("xiongnuxie", "笑谈渴饮匈奴血。");
        String mjh = StringSubstitutor.replace("怒发冲冠，凭栏处潇潇雨歇。\n" +
                        "抬望眼，仰天长啸，壮怀激烈。\n" +
                        "三十功名尘与土，\n" +
                        "${baqianlilu}\n" +
                        "莫等闲白了少年头，空悲切。\n" +
                        "靖康耻，犹未雪；\n" +
                        "臣子恨，何时灭！\n " +
                        "驾长车踏破贺兰山缺。\n" +
                        "壮志饥餐胡虏肉，\n" +
                        "${xiongnuxie}\n" +
                        "待从头收拾旧山河，朝天阙。",
                manjianghongMap);
        System.out.println("mjh = " + mjh);

    }
}
