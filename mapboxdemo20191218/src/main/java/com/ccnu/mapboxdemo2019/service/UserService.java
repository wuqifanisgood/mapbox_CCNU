package com.ccnu.mapboxdemo2019.service;

import com.ccnu.mapboxdemo2019.domain.User;

import java.util.List;

public interface UserService {
    void save(User user);
    List<User> findAll();
}