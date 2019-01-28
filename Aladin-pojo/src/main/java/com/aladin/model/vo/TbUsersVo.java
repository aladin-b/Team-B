package com.aladin.model.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author:GaoPan
 * @Date:2018/12/29 8:18
 * @Version 1.0
 **/
@Data
public class TbUsersVo implements Serializable {
    private String accountNumber;
    private int permission;
    private String tel;
    private String userPhoto;
    private String birthDay;
    private String education;
    private int sex;
    private String email;
    private String name;
}
