package org.jake.write.time.wheel;

import cn.hutool.json.JSONString;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.PropertyFilter;
import jdk.nashorn.internal.scripts.JS;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {

        String s = JSON.toJSONString(new ConvertTo3DtilesSetting());

        HashMap treeMap = JSON.parseObject(s, HashMap.class);
        System.out.println(treeMap);


//        JSONObject.toJSONString(treeMap, new PropertyFilter() {
//            public boolean apply(Object o, String s, Object o1) {
//                return false;
//            }
//        });
        //        System.out.println(treeMap);
//        TreeMap<String,String> aa = new TreeMap<String, String>();
//        aa.put("1","1");
//        aa.put("2","2");
//        aa.put("3",null);
//        aa.put("4",null);
//        System.out.println(aa);

//        String B = "𝄞"; // 这个就是那个音符字符，只不过由于当前的网页没支持这种编码，所以没显示。
//        String C = "\uD834\uDD1E";// 这个就是音符字符的UTF-16编码
//        System.out.println(C);
//        System.out.println(C.length());
//        System.out.println(B.length());
    }
}
