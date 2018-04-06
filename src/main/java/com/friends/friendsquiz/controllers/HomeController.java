package com.friends.friendsquiz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 * This class handles only the landing page of the app.
 */
@Controller
public class HomeController {
    /**
     * This method will handle the root of the app.
     *
     * @return the view to be rendered
     */
    @RequestMapping (value = "/")
    public final String index() {
        return "index";
    }
}
