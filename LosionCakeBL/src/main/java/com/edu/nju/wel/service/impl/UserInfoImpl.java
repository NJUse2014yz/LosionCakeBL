package com.edu.nju.wel.service.impl;

import com.edu.nju.wel.domain.User;
import com.edu.nju.wel.service.UserInfoService;
import org.springframework.stereotype.Service;

/**
 * Created by YU Fan on 2017/3/11.
 */
@Service
public class UserInfoImpl implements UserInfoService {
    public User findById(String id) {
        return new User(id);
    }
}
