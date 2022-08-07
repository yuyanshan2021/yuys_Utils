package com.yuys;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ToStringUtilsTest {
    public static void main(String[] args) throws ParseException {
        Map<String,Object> stringObjectMap = Maps.newHashMap();
        List<Object> stringList = new ArrayList<>();
        stringList.add("aaaaaaaaaaaaaaaa");
        stringList.add("bbbbbbbbbbbbbbbb");
        stringList.add("cccccccccccccccc");
        Map<String,Object> twoMap = Maps.newHashMap();
        twoMap.put("twoMap-a","twoaaaaaaaaaaaaaaaaa"    );
        stringList.add(twoMap);
        stringObjectMap.put("1","11111111111111111");
        stringObjectMap.put("2","22222222222222222");
        stringObjectMap.put("list",stringList);
        System.out.println("map:"+stringObjectMap);
        System.out.println("mapJson:"+ JSON.toJSONString(stringObjectMap));
        Object a = ObjectAndStringUtils.objectStrToObject(stringObjectMap.toString());
        System.out.println("a:"+a);

    }
}
