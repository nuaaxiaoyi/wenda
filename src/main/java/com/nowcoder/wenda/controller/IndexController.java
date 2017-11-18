package com.nowcoder.wenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiaoyy on 11/17/17.
 */
@Controller
public class IndexController {


    @RequestMapping(path = {"/", "index"})
    @ResponseBody
    public String index() {

        return "Hello wenda";
    }

    @RequestMapping(path = {"/profile/{groupId}/{userId}"})
    @ResponseBody
    public String profile(@PathVariable("userId") int userId,
                          @PathVariable("groupId") int groupId) {

        return String.format("Profile page of group %d and user %d", groupId, userId ) + "2323232";
    }

}
