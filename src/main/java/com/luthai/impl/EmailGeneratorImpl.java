package com.luthai.impl;

import com.luthai.IEmailGenerator;
import org.springframework.stereotype.Component;

@Component
public class EmailGeneratorImpl implements IEmailGenerator {

    @Override
    public String generator() {
        return "lpdu@qq.com";
    }
}

