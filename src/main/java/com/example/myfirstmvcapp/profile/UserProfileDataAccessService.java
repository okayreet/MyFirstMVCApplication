package com.example.myfirstmvcapp.profile;

import com.example.myfirstmvcapp.datastore.FakeUserProfileStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileDataAccessService {
    private final FakeUserProfileStore fakeUserProfileStore;

    @Autowired
    public UserProfileDataAccessService(FakeUserProfileStore fakeUserProfileStore) {
        this.fakeUserProfileStore = fakeUserProfileStore;
    }
    public List<UserProfile> getUserProfiles(){
        return fakeUserProfileStore.getUserProfiles();
    }
}
