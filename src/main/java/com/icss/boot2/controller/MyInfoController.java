package com.icss.boot2.controller;

import com.icss.boot2.domain.MyInfo;
import com.icss.boot2.service.MyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MyInfoController {

    @Autowired
    private MyInfoService infoService;

    @RequestMapping(path = "queryAllInfo.action")
    public Map<String, Object> queryAllInfo() {
        Map<String, Object> resultMap = new HashMap<>();
        List<MyInfo> infoList = infoService.getAllInfo();
        resultMap.put("code", 200);
        resultMap.put("msg", "success");
        resultMap.put("result", infoList);
        return resultMap;
    }

    @RequestMapping("/insertInfo.action")
    public Map<String, Object> insertInfo(MyInfo info) {
        Map<String, Object> resultMap = new HashMap<>();
        int result = infoService.insertInfo(info);
        if (result > 0) {
            resultMap.put("code", 200);
            resultMap.put("msg", "insert success");
        } else {
            resultMap.put("code", 201);
            resultMap.put("msg", "insert fail");
        }
        return resultMap;
    }
}
