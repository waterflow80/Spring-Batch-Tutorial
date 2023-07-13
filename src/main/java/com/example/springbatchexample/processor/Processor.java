package com.example.springbatchexample.processor;

import com.example.springbatchexample.model.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Processor implements ItemProcessor<User, User> {

    @Override
    public User process(User user) throws Exception {
         user.setTimestamp(new Date());
         return user;
    }
}
