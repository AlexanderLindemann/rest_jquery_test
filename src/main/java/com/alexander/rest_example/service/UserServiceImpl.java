package com.alexander.rest_example.service;

import com.alexander.rest_example.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserServiceImpl implements UserService {

    private static final Map<Long, User> USER_REPOSITORY_MAP = new HashMap<>();
    private static final AtomicLong ATOMIC_LONG_INCREMENT_ID = new AtomicLong();

    @Override
    public void add(User user) {
        final long CLIENT_ID = ATOMIC_LONG_INCREMENT_ID.incrementAndGet();
        user.setId(CLIENT_ID);
        USER_REPOSITORY_MAP.put(CLIENT_ID, user);
    }

    @Override
    public List<User> listOfUser() {
        return new ArrayList<>(USER_REPOSITORY_MAP.values());
    }

    @Override
    public User findOnID(long id) {
        return USER_REPOSITORY_MAP.get(id);
    }

    @Override
    public boolean update(User user) {
        if (USER_REPOSITORY_MAP.containsKey(user.getId())) {
            USER_REPOSITORY_MAP.put(user.getId(), user);
            return true;
        }
        return false;
    }


    @Override
    public boolean delete(Long id) {
        return USER_REPOSITORY_MAP.remove(id) != null;
    }
}
