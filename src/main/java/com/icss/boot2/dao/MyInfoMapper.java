package com.icss.boot2.dao;

import com.icss.boot2.domain.MyInfo;

import java.util.List;

public interface MyInfoMapper {
    List<MyInfo> getAllInfo();

    int insertInfo(MyInfo info);
}
