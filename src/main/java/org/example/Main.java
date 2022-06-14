package org.example;

import com.alibaba.fastjson.JSONPath;
import com.jayway.jsonpath.JsonPath;

public class Main {
    public static void testFastJson(String[] args) {
        String json = "{\n" +
                "\"result\": [\n" +
                "{\n" +
                "\"puid\": \"21025318\"\n" +
                "},\n" +
                "{\n" +
                "\"puid\": \"21482682\"\n" +
                "},\n" +
                "{\n" +
                "\"puid\": \"21025345\"\n" +
                "}\n" +
                "],\n" +
                "\"state\": 0\n" +
                "}";
        long startTime = System.currentTimeMillis();
        Object list = JSONPath.extract(json, "$.result[0,2].puid");
        System.out.println("time testFastJson : " + (System.currentTimeMillis() - startTime));
        System.out.println(list);
    }
    public static void testJsonPath(String[] args) {
        String json = "{\n" +
                "\"result\": [\n" +
                "{\n" +
                "\"puid\": \"21025318\"\n" +
                "},\n" +
                "{\n" +
                "\"puid\": \"21482682\"\n" +
                "},\n" +
                "{\n" +
                "\"puid\": \"21025345\"\n" +
                "}\n" +
                "],\n" +
                "\"state\": 0\n" +
                "}";
        long startTime = System.currentTimeMillis();
        Object list = JsonPath.read(json, "$.result[0,2].puid");
        System.out.println("time testJsonPath : " + (System.currentTimeMillis() - startTime));
        System.out.println(list);
    }
}