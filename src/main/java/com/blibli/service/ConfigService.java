/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blibli.service;

import org.springframework.stereotype.Component;

/**
 *
 * @author ifnu.b.fatkhan
 */
@Component("configService")
public class ConfigService {
    
    
    public String findConfig(String configName) {
        return configName + "-value";
    }
    
    public String getName() {
        return "ConfigService";
    }
}
