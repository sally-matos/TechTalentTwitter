package com.tts.TechTalentTwitter.controller;

import com.tts.TechTalentTwitter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

public class FlowController {
    @Controller
    public class FollowController {
        @Autowired
        private UserService userService;
}
