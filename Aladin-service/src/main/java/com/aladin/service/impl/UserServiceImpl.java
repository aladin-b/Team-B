package com.aladin.service.impl;

import com.aladin.dao.TbUsersDao;
import com.aladin.model.mo.TbUsers;
import com.aladin.model.po.TbUsersPo;
import com.aladin.model.vo.TbUsersVo;
import com.aladin.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * @Author:GaoPan
 * @Date:2018/12/19 22:11
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    TbUsersDao tbUsersDao;

    @Override
    public TbUsersVo select() {
        return getTbUsersVo(tbUsersDao.selectUserInfo("panpan"));
    }

    private TbUsersVo getTbUsersVo(TbUsers tbUsers) {
        TbUsersVo tbUsersVo = new TbUsersVo();
        tbUsersVo.setAccountNumber(tbUsers.getAccountNumber());
        tbUsersVo.setBirthDay(tbUsers.getBirthDay());
        tbUsersVo.setEducation(tbUsers.getEducation());
        tbUsersVo.setEmail(tbUsers.getEmail());
        tbUsersVo.setName(tbUsers.getName());
        tbUsersVo.setUserPhoto(tbUsers.getUserPhoto());
        tbUsersVo.setSex(tbUsers.getSex());
        tbUsersVo.setTel(tbUsers.getTel());
        tbUsersVo.setPermission(tbUsers.getPermission());
        return tbUsersVo;
    }
}
