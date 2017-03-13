package com.edu.nju.wel.service;

import com.edu.nju.wel.domain.Good;

import java.util.List;

/**
 * Created by zs on 2017/3/12.
 */
public interface GoodInfoService {
    /**
     * 获得商品信息
     * @param goodId
     * @return
     */
    public Good getGood(int goodId);

    /**
     * 获得全部商品信息
     * @return
     */
    public List<Good> getGoodList();
}
