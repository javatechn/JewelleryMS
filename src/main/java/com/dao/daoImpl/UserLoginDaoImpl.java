/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.daoImpl;

import com.Extractor.UserLoginExtractor;
import com.dao.UserLoginDao;
import com.model.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 *
 * @author waseem.mubasher
 */
public class UserLoginDaoImpl implements UserLoginDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<UserLogin> loadAllUserLogins() {
        String query = "SELECT username, password FROM login";
        return (List<UserLogin>)jdbcTemplate.query(query, new UserLoginExtractor());
    }

    @Override
    public int insertUserLogin(UserLogin userLogin) {
        String query = "INSERT INTO login(username,password) VALUES (?,?)";
        return jdbcTemplate.update(query,userLogin.getUsername(),userLogin.getPassword());
    }

}
