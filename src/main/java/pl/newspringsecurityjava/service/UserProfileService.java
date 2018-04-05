package pl.newspringsecurityjava.service;

import pl.newspringsecurityjava.entity.UserProfile;

import java.util.List;

public interface UserProfileService {

    UserProfile findById(int id);

    UserProfile findByType(String type);

    List<UserProfile> findAll();
}
