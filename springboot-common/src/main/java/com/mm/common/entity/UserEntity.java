package com.mm.common.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserEntity implements Serializable {

    private Long id;
    private String name;
    private Date dt;
}
