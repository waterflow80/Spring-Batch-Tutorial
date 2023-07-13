package com.example.springbatchexample.writer;

import com.example.springbatchexample.model.User;
import com.example.springbatchexample.repository.UserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * This item writer will write the data to the database*/
@Component
public class DBWriter implements ItemWriter<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void write(List<? extends User> users) throws Exception {
        userRepository.saveAll(users);
    }
}
