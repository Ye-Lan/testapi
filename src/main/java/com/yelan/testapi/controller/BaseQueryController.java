package com.yelan.testapi.controller;

import com.google.gson.Gson;
import com.yelan.testapi.vo.Person;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@EnableAutoConfiguration
public class BaseQueryController {

    @GetMapping("/testReceiveParameter")
    public String test(String param){
        Gson gson = new Gson();
        Map map = new HashMap<String,String>();
        if(param.equals("testReceiveParameter")){
            map.put("data","success");
        }else {
            map.put("data","false");
        }
        return gson.toJson(map);
    }

    @GetMapping("/getPersons")
    public String downloadPersons(){
        Gson gson = new Gson();
        Person person1 = new Person("id1", "name1", "https://img.pconline.com.cn/images/upload/upc/tx/pc_best/1802/08/c17/74665210_1518062811541_width600.jpg");
        Person person2 = new Person("id2", "name2", "https://img.pconline.com.cn/images/upload/upc/tx/pc_best/1802/08/c17/74665210_1518062811541_width600.jpg");

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);

        return gson.toJson(personList);
    }

    @GetMapping("/testPathParameter/{userId}")
    public String test2(@PathVariable String userId){
        Gson gson = new Gson();
        Map map = new HashMap<String,String>();
        if(userId.equals("testUserID")){
            map.put("data","success");
        }else {
            map.put("data","success");
        }
        return gson.toJson(map);
    }

    @PostMapping("/getUserByJSON")
    public String testJsonSerilization(@RequestBody Person person){
        Gson gson = new Gson();
        System.out.println("personID"+person.getId());
        return gson.toJson(person);
    }

    @PostMapping("/getUserByForm")
    public String testFormData(@RequestHeader HttpHeaders httpHeaders, Person person){
        Gson gson = new Gson();
        System.out.println("personID"+person.getId());
        return gson.toJson(person);
    }
}
