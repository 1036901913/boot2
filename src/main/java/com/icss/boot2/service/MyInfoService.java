package com.icss.boot2.service;

import com.icss.boot2.domain.MyInfo;

import java.util.List;

public interface MyInfoService {
    List<MyInfo> getAllInfo();

    int insertInfo(MyInfo info);
}
