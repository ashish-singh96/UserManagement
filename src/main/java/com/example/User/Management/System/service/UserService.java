package com.example.User.Management.System.service;

import com.example.User.Management.System.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public List<User> getAllUser(){
        return userDao.getUserList();
    }

    public String addUser(User user) {
        boolean addedStatus = userDao.add(user);
        if(addedStatus) return "User added successfully";
        return "User addition failed..!!";
    }

    public User userGetById(String userId) {
        List<User> userList = userDao.getUserList();
        for(User user : userList){
            if(user.getUserId().equals(userId))
                return user;
        }
        return null;
    }

    public boolean updateUserById(String userId,String name) {
        List<User> userList = userDao.getUserList();
        for(User user : userList){
            if(user.getUserId().equals(userId)){
                //remove original
                userDao.remove(user);

                user.setName(name);

                userDao.add(user);
                return true;
            }
        }
        return false;
    }

    public String removeUserByUserId(String userId) {
        String status = "";
        boolean dResponse = false;
        if(userId != null){
            List<User> userList = userDao.getUserList();
            for(User user : userList){
                if(user.getUserId().equals(userId)) {
                    dResponse = userDao.remove(user);
                    if (dResponse)
                        status = "UserId " + userId + " delete successfully";
                    else
                        status = "UserId " + userId + " was not found";
                    return status;
                }
            }
        }
        return "UserId "+userId +" was not found";
    }

}
