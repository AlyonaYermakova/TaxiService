package com.epam.ae.util;

import com.epam.ae.entity.*;

import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Runner {
    private static final Logger logger = LoggerFactory.getLogger(Runner.class);
    public static void main(String[] args) {

//       Address someAddress = new Address(new Address.AddressBuilder()
//                .street()
//                .house()
//                .flat()
//                .phoneNumber());
//
//        System.out.println(someAddress);
        User someUser = new User(new User.UserBuilder()
        .uuid(UUID.randomUUID())
        .login("LOGIN")
        .password("PASSWORD")
        .name("NAME")
        .surname("SURNAME")
        .email("EMAIL")
        .role(User.Role.ADMIN)
        .gender(User.Gender.MALE)
        .address("S","H","F","P"));

        logger.info("User: " + someUser + "has been created");
 }


}