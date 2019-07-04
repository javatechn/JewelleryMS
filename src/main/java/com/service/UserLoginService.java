/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.model.UserLogin;

import java.util.List;

/**
 *
 * @author waseem.mubasher
 */
public interface UserLoginService {
    
    void init();
    void refresh();
    List<UserLogin> getAllUserLogins();
    int insertUserLogin(UserLogin userLogin);
    
}
