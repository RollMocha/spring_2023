package com.example.burgerking.controller;

import com.example.burgerking.entity.Login;
import com.example.burgerking.form.BurgerkingForm;
import com.example.burgerking.service.BurgerkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/burgerking")
public class BurgerkingController {
    @Autowired
    BurgerkingService service;

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

    @GetMapping("/javascript_test")
    public String javascriptTest() {
        return "javascript_test";
    }

    @GetMapping("/event/{n1}/{n2}")
    public String menu_sdp_List(@PathVariable Integer n1, @PathVariable Integer n2, Model model) {
        String link = null;

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
                link = "event";
                break;
            case 1:
                switch (n2) {
                    case 0:
                        break;
                }
                link = "new_store";
                break;
        }
        return link;
    }

    @GetMapping("/event_bulletin/{no}")
    public String show_event_bulletin(@PathVariable Integer no, Model model) {
        String db_number = null;

        switch (no){
            case 0:
                model.addAttribute("eb", "0");
                db_number = "event_bulletin";
                break;
            case 1:
                model.addAttribute("eb", "1");
                db_number = "event_bulletin";
                break;
            case 2:
                model.addAttribute("eb", "2");
                db_number = "event_bulletin";
                break;
        }
        return db_number;
    }
}