package com.example.myfirstmvcapp.bucket;

import org.springframework.beans.factory.annotation.Autowired;

public enum BucketName {
    PROFILE_IMAGE("darkerror");

    private final String bucketName;

    @Autowired
    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
