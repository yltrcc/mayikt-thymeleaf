package com.mayikt.service;


import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName MemberService
 * @Author 蚂蚁课堂余胜军 QQ644064779 www.mayikt.com
 * @Version V1.0
 **/
@RestController
@Slf4j
public class MemberService {


    @RequestMapping("/")
    public String myIndex(){
        return "...我是会员服务..";
    }

}
