package com.example.burgerking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/burgerking")
public class BurgerkingController {
    @GetMapping("home")
    public String showList() {
        return "home";
    }

    @GetMapping("/howtomenu/{no}")
    public String menu_sdp_List(@PathVariable Integer no, Model model) {
        String view = null;
        model.addAttribute("black_line", "howtomenu");
        switch (no) {
            case 1:
                view = "howtomenu/sdp";
                break;
            case 2:
                view = "howtomenu/new_product";
                break;
            case 3:
                view = "howtomenu/premium";
                break;
            case 4:
                view = "howtomenu/whopper_junior";
                break;
            case 5:
                view = "howtomenu/chicken_shrimp";
                break;
            case 6:
                view = "howtomenu/all_day_king_morning";
                break;
            case 7:
                view = "howtomenu/side";
                break;
            case 8:
                view = "howtomenu/juic_dessert";
                break;
        }
        return view;
    }

    @GetMapping("/")
    public String javascriptTest() {
        return "javascript_test";
    }

    @GetMapping("find_store")
    public String show_new_product(Model model) {
        return "find_store";
    }

    @GetMapping("/event/{n1}/{n2}")
    public String menu_sdp_List(@PathVariable Integer n1, @PathVariable Integer n2, Model model) {
        model.addAttribute("black_line", "event");
        switch (n1) {
            case 0:
                switch (n2) {
                    case 0:
                        model.addAttribute("th_event", "all");
                        break;
                    case 1:
                        model.addAttribute("th_event", "event");
                        break;
                    case 2:
                        model.addAttribute("th_event", "end");
                        break;
                }
            case 1:
                switch (n2) {
                    case 0:
                        break;
                }
                break;
        }
        return "event";
    }

    @GetMapping("/event/0/0")
    public String showEvent(){

    }
}
