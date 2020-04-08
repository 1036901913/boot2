package com.icss.boot2.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class MyInfo implements Serializable {
    private Integer mid;

    private String mname;

    private String mphone;

    private String mimg;

}