package com.icss.boot2.service.impl;

import com.icss.boot2.dao.MyInfoMapper;
import com.icss.boot2.domain.MyInfo;
import com.icss.boot2.service.MyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyInfoServiceImpl implements MyInfoService {

    @Autowired
    private MyInfoMapper infoMapper;

    @Override
    public List<MyInfo> getAllInfo() {
        return infoMapper.getAllInfo();
    }

    @Override
    public int insertInfo(MyInfo info) {
        return infoMapper.insertInfo(info);
    }
}
