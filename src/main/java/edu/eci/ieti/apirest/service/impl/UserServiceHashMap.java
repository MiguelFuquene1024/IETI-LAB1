package edu.eci.ieti.apirest.service.impl;

import edu.eci.ieti.apirest.data.User;
import edu.eci.ieti.apirest.service.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceHashMap implements UserService {

    private final HashMap<String,User> userhashmap= new HashMap<>();
    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User findById(String id) {
        return null;
    }

    @Override
    public List<User> all() {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public User update(User user, String userId) {
        return null;
    }
}
