package com.example.myjkenins.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 实验类
 *
 * @author banzhili1
 * @date 2023/5/23 23:39
 */
@RestController
@RequestMapping("/customer")
@Controller
@Slf4j
public class domeController {
    @GetMapping("/dome")
    public String dome(){
        log.info("进入了aa");
        return "哈哈1";
    }
}
