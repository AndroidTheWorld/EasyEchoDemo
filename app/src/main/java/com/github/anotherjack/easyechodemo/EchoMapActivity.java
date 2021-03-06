package com.github.anotherjack.easyechodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.github.anotherjack.easyechodemo.easyEcho.EasyEcho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EchoMapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_echo_map);


        Map studentMap = new HashMap();
        studentMap.put("name",null);
        studentMap.put("age",15);
        studentMap.put("sex","男");
        studentMap.put("home","北京");
        studentMap.put("hobby","看电影");
        studentMap.put("extra","其他");

        Map gradesMap = new HashMap();
        gradesMap.put("chinese",95);
        gradesMap.put("math",100);
        gradesMap.put("english",90);
        gradesMap.put("level", "优秀");

        studentMap.put("grades", gradesMap);

        ArrayList<Map> friendsList = new ArrayList<>();
        Map friendMap1 = new HashMap();
        friendMap1.put("friendName","小红");
        Map friendMap2 = new HashMap();
        friendMap2.put("friendName","小刚");
        Map friendMap3 = new HashMap();
        friendMap3.put("friendName","小军");
        friendsList.add(friendMap1);
        friendsList.add(friendMap2);
        friendsList.add(friendMap3);

        studentMap.put("friends",friendsList);

        EasyEcho.echoMap(studentMap, this);
    }

}
