/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blibli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ifnu.b.fatkhan
 */
@Controller
public class HelloController {
    
    @RequestMapping("/hello")
    public ModelAndView hello() {
        ModelAndView modelAndView = new ModelAndView("hello");
        return modelAndView;
    }
    
}
