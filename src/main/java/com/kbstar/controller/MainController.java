package com.kbstar.controller;

import com.kbstar.dto.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class MainController {
    @RequestMapping("/")
    public String main() {
        return "index";
    }

    @RequestMapping("/charts")
    public String charts(Model model){
        model.addAttribute("center", "charts");
        return "index";
    }
    @RequestMapping("/tables")
    public String tables(Model model){
        List<Item> list =new ArrayList<>();
        list.add(new Item("Airi Satou","Accountant","Tokyo",33,"2008/11/28",162700));
        list.add(new Item("Angelica Ramos","Chief Executive Officer (CEO)","London",47,"2009/10/09",1200000));
        list.add(new Item("Ashton Cox","Junior Technical Author","San Francisco",66,"2009/01/12",86000));
        list.add(new Item("Bradley Greer","Software Engineer","London",41,"2012/10/13",132000));
        list.add(new Item("Brenden Wagner","Software Engineer","San Francisco",28,"2011/06/07",206850));
        list.add(new Item("Brielle Williamson","Integration Specialist","New York",61,"2012/12/02",372000));
        list.add(new Item("Bruno Nash","Software Engineer","London",38,"2011/05/03",163500));
        list.add(new Item("Caesar Vance","Pre-Sales Support","New York",21,"2011/12/12",106450));
        list.add(new Item("Cara Stevens","Sales Assistant","New York",46,"2011/12/06",145600));
        list.add(new Item("Cedric Kelly","Senior Javascript Developer","Edinburgh",22,"2012/03/29",433060));
        list.add(new Item("Charde Marshall","Regional Director","San Francisco",36,"2008/10/16",470600));
        list.add(new Item("Colleen Hurst","Javascript Developer","San Francisco",39,"2009/09/15",205500));
        list.add(new Item("Dai Rios","Personnel Lead","Edinburgh",35,"2012/09/26",217500));
        list.add(new Item("Donna Snider","Customer Support","New York",27,"2011/01/25",112000));
        list.add(new Item("Doris Wilder","Sales Assistant","Sidney",23,"2010/09/20",85600));
        list.add(new Item("Finn Camacho","Support Engineer","San Francisco",47,"2009/07/07",87500));
        list.add(new Item("Fiona Green","Chief Operating Officer (COO)","San Francisco",48,"2010/03/11",850000));
        list.add(new Item("Garrett Winters","Accountant","Tokyo",63,"2011/07/25",170750));
        list.add(new Item("Gavin Cortez","Team Leader","San Francisco",22,"2008/10/26",235500));
        list.add(new Item("Gavin Joyce","Developer","Edinburgh",42,"2010/12/22",92575));

        model.addAttribute("list",list);
        model.addAttribute("center", "tables");
        return "index";
    }

    @RequestMapping("/dashboard")
    public String dashboard(Model model){
        model.addAttribute("center", "dashboard");
        return "index";
    }
}
