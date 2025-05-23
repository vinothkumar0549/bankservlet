package com.example.database;

import java.util.List;

import com.example.pojo.*;

public interface Storage {

    public boolean writeUser(User user);

    public boolean writeActivity(Activity activity);

    public User getUser(int userid);

    public boolean updateUser(User user);

    public List<Activity> getActivity(User user);

    public List<User> TopNBalance(int n);
    
}
