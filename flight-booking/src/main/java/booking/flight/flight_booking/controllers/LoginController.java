package booking.flight.flight_booking.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/users")
@Controller
public class LoginController {

   @RequestMapping({"", "/", "/login", "/login.html"})
   public String login(){

    return "users/index";
   }
}
