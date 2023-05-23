package com.example.mydocker.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 实验类
 *
 * @author banzhili
 * @date 2023/5/23 23:39
 */
@RestController
@RequestMapping("/customer")
@Controller
@Slf4j
public class domeController {
    @GetMapping("/dome")
    public String dome(){
        log.info("进入了");
        return "哈哈";
    }
}
