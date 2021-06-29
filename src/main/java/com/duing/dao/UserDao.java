package com.duing.dao;

import com.duing.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {

    List<User> getAllUser();


}
