package com.example.myfirstmvcapp.datastore;

import com.example.myfirstmvcapp.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("7b2943ef-7cf0-472e-b69d-1b70de91a74f"),
                "Mohammed Omar", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("090e7408-95a6-4866-a8dd-32b8259eeea8")
                , "Layale Muneera", null));
    }
    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }

}
