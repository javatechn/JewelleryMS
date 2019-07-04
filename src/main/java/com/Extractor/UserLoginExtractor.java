package com.Extractor;

import com.model.UserLogin;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by waseem.mubasher on 2019-07-02.
 */
public class UserLoginExtractor implements ResultSetExtractor{

    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";


    @Override
    public Object extractData(ResultSet resultSet) throws SQLException, DataAccessException {
        List<UserLogin> userUserLoginList = new ArrayList();
        while(resultSet.next()){
            userUserLoginList.add(new UserLogin(resultSet.getString(USERNAME),resultSet.getString(PASSWORD)));
        }
        return userUserLoginList;
    }
}
