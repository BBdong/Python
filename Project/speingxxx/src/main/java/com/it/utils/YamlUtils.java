package com.it.utils;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.config.YamlMapFactoryBean;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.io.ClassPathResource;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Pattern;

public class YamlUtils {
    public static Map ymlMap = new HashMap();

    public static void main(String[] args) {
        String s = "{port:9100, servlet:{context-path=/repairApi, aa:112, bb:113}}";
        System.out.println(isJsonObject(s));
        Map<String, Object> yamlValue =  yamlToMap("application.yml");
        try{
            ObjectToMap(yamlValue);
        }catch (Exception e){

        }
        System.out.println(ymlMap.get("systemLibraryId"));
        System.out.println(ymlMap.get("context-pat"));
        System.out.println(ymlMap.get("aa"));
        System.out.println(ymlMap.get("port"));
    }
    private static Map<String, Object> yamlToMap(String yamlSource) {
        try {
            YamlMapFactoryBean yaml = new YamlMapFactoryBean();
            yaml.setResources(new ClassPathResource(yamlSource));
            return yaml.getObject();
        } catch (Exception e) {

            return null;
        }
    }

     private static void ObjectToMap(Map<String, Object> map) {
        // Map<String, Object> map = yamlToMap("application.yml");
         if(map!=null || map.size()>0) {
             for (String key : map.keySet()) {
                 String value = map.get(key).toString();
                 //判断获取的值是否是可以转成json对象
                 boolean flag = isJsonObject(value);
                //如果不能装json，就说明是最后的需要获取的value
                 if(!flag) {
                     ymlMap.put(key,value);
                 }else {
                     //将字符串value 装 map ,然后递归
                     ObjectToMap(strToMap(value));
                 }
                 }
              }
         }

    /**
     * 判断字符串是否可以转化为json对象
     * @param content
     * @return
     */
    private static boolean isJsonObject(String content) {
        if(StringUtils.isBlank(content))
            return false;
        try {
            JSONObject jsonObj = JSONObject.parseObject(content);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 字符串转map
     * @param value
     * @return
     */
    public static Map<String, Object> strToMap(String value) {
        JSONObject jb = JSONObject.parseObject(value);
        Map<String, Object> map = (Map<String, Object>)jb;
        return map;
    }

}
