package com.edu.nju.wel.service;

/**
 * Created by YU Fan on 2017/3/11.
 */
public interface UserAuthorizeService {

    public boolean authorize(String id,String password);

    public boolean signup(String id);
}
