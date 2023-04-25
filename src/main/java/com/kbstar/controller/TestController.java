package com.kbstar.controller;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
//@RequestMapping("/dashboard")
public class TestController {


    @RequestMapping("/chart0301")
    public Object chart0301(){
        JSONArray ja= new JSONArray();

        for(int i=1;i<=5;i++){
            Random r=new Random();
            int cnt =r.nextInt(20)+1;
            JSONArray jaData= new JSONArray();

            jaData.add("data"+cnt);
            jaData.add(cnt);
            ja.add(jaData);
        }

        return ja;
    }


    @RequestMapping("/chart0302")
    public Object chart0302(){
        JSONArray ja= new JSONArray();

        for(int i=0;i<=8;i++){
            JSONArray jaTen= new JSONArray();

            Random r=new Random();
            int cnt =r.nextInt(10);
            jaTen.add(i*10);
            jaTen.add(cnt*10);

            ja.add(jaTen);
        }

        return ja;
    }
    @RequestMapping("/chart0303")
    public Object chart0303(){
        //{'category':[],'data':[]}
        JSONObject jo=new JSONObject();

        JSONArray jaH= new JSONArray();
        JSONArray jaT= new JSONArray();

        for(int i=1;i<=20;i++){
            Random r=new Random();
            int cnt =r.nextInt(100000)+1;
            jaH.add(cnt);
        }
        for(int i=1;i<=20;i++){
            Random r=new Random();
            Double cnt =1.0*(r.nextInt(100000)+1);
            jaT.add(cnt);
        }

        jo.put("hundred",jaH);
        jo.put("ten",jaT);

        return jo;
    }
}
