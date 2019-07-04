/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.serviceImpl;

import com.dao.UserLoginDao;
import com.model.UserLogin;
import com.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *
 * @author waseem.mubasher
 */
@Component
public class UserLoginServiceImpl implements UserLoginService {

    private UserLoginDao userLoginDao;
    
    private List<UserLogin> userLoginUserList;

    @Autowired
    public void setUserLoginDao(UserLoginDao userLoginDao) {
        this.userLoginDao = userLoginDao;
    }
   
    @Override
    public void init() {
        refresh();
    }

    @Override
    public void refresh() {
       userLoginUserList = userLoginDao.loadAllUserLogins();
    }

    @Override
    public List<UserLogin> getAllUserLogins() {
       return userLoginUserList;
    }

    @Override
    public int insertUserLogin(UserLogin userLogin) {
        return userLoginDao.insertUserLogin(userLogin);
    }

}
