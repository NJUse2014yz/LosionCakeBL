package com.edu.nju.wel.controller;

import com.edu.nju.wel.domain.Good;
import com.edu.nju.wel.domain.Message;
import com.edu.nju.wel.service.GoodInfoService;
import com.edu.nju.wel.service.GoodUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by zs on 2017/3/13.
 */
@Controller
public class GoodController {

    @Autowired
    private GoodInfoService goodInfoService;
    @Autowired
    private GoodUpdateService goodUpdateService;
    @RequestMapping(value="/insert_good" , method= RequestMethod.POST)
    public Message insertGood(HttpServletRequest request, HttpServletResponse response){
        Message message = new Message();
        String name = request.getParameter("name");
        String goodDescription= request.getParameter("goodDescription");
        double price= Double.parseDouble(request.getParameter("price"));
        double discount= Double.parseDouble(request.getParameter("discount"));
        String size= request.getParameter("size");
        Good good = new Good();
        good.setGoodName(name);
        good.setGoodDescription(goodDescription);
        good.setDiscount(discount);
        good.setPrice(price);
        good.setSize(size);

        int result= goodUpdateService.insertGood(good);
        if(result!=-1) {
            message.setMsg("添加成功");
            message.setResult("success");
            message.setData(result);
            return message;
        }
        else
        {
            message.setMsg("添加失败");
            message.setResult("fail");
            return message;
        }
    }

    @RequestMapping(value="/delete_good" , method=RequestMethod.POST)
    public Message deleteGood(@RequestParam("goodId") String goodId){
        Message message = new Message();
        if(StringUtils.isEmpty(goodId)){
            message.setMsg("id不能为空");
            message.setResult("fail");
            return message;
        }
        int result=goodUpdateService.deleteGood(Integer.parseInt(goodId));
        if(result==-1) {
            message.setMsg("商品不存在");
            message.setResult("fail");
            return message;
        }
        else {
            message.setMsg("删除成功");
            message.setResult("success");
            return message;
        }
    }

    @RequestMapping(value="/update_good" , method=RequestMethod.POST)
    public Message updateGood(HttpServletRequest request, HttpServletResponse response){
        Message message = new Message();
        String name = request.getParameter("name");
        String goodDescription= request.getParameter("goodDescription");
        double price= Double.parseDouble(request.getParameter("price"));
        double discount= Double.parseDouble(request.getParameter("discount"));
        String size= request.getParameter("size");
        Good good = new Good();
        good.setGoodName(name);
        good.setGoodDescription(goodDescription);
        good.setDiscount(discount);
        good.setPrice(price);
        good.setSize(size);

        int result=goodUpdateService.updateGood(good);
        if(result==-1) {
            message.setMsg("更新失败");
            message.setResult("fail");
            return message;
        }
        else {
            message.setMsg("更新商品成功");
            message.setResult("success");
            return message;
        }
    }

    @RequestMapping(value="/get_good" , method=RequestMethod.POST)
    public Message getGood(@RequestParam("goodId") String goodId){
        Message message = new Message();
        if(StringUtils.isEmpty(goodId)){
            message.setMsg("id不能为空");
            message.setResult("fail");
            return message;
        }
        Good result=goodInfoService.getGood(Integer.parseInt(goodId));
        if(result==null){
            message.setMsg("商品不存在");
            message.setResult("fail");
            return message;
        }
        else {
            message.setMsg("删除成功");
            message.setResult("success");
            message.setData(result);
            return message;
        }
    }

    @RequestMapping(value="/get_good_list" , method=RequestMethod.POST)
    public Message getGoodList(){
        Message message = new Message();

        List<Good> result=goodInfoService.getGoodList();
        if(result==null) {
            message.setMsg("没有商品");
            message.setResult("fail");
            return message;
        }
        else {
            message.setMsg("删除成功");
            message.setResult("success");
            message.setData(result);
            return message;
        }
    }

}
