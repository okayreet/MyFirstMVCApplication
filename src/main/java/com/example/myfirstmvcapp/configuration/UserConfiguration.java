//package com.example.myfirstmvcapplication.configuration;
//
//import com.example.myfirstmvcapplication.model.User;
//import com.example.myfirstmvcapplication.repository.UserRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Configuration
//public class UserConfiguration {
//
//    @Bean
//    CommandLineRunner commandLineRunner(UserRepository userRepository) {
//        List<User> users = new ArrayList<User>();
//        return args -> {
//            User user = new User("mo", "omar",
//                    "darkerror@hotmail.co.uk", "cod");
//            users.add(user);
//            user = new User("ali", "ali",
//                    "darkerror@hotmail.co.uk", "cod");
//            users.add(user);
//            userRepository.saveAll(users);
//        };
//    }
//}
