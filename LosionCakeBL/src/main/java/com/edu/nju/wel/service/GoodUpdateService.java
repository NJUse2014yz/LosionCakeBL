package com.edu.nju.wel.service;

import com.edu.nju.wel.domain.Good;

/**
 * Created by zs on 2017/3/12.
 */
public interface GoodUpdateService {
    /**
     * 新增商品信息
     * @param good
     */
    public int insertGood(Good good);

    /**
     * 删除商品
     * @param goodId
     */
    public int deleteGood(int goodId);

    /**
     * 更新商品
     * @param good
     */
    public int updateGood(Good good);
}
