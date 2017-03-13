package com.edu.nju.wel.service.impl;

import com.edu.nju.wel.service.UserAuthorizeService;
import org.springframework.stereotype.Service;

/**
 * Created by YU Fan on 2017/3/11.
 */
@Service
public class UserAuthorizeImpl implements UserAuthorizeService{
    public boolean authorize(String id,String password)
    {
        return true;
    }

    public boolean signup(String id)
    {
        return true;
    }
}
