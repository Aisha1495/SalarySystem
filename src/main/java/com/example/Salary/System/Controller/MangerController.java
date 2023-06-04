package com.example.Salary.System.Controller;

import com.example.Salary.System.Models.Manager;
import com.example.Salary.System.RequestObjects.GetManagerRequestObject;
import com.example.Salary.System.ResponseOpjects.GetManagerResponse;
import com.example.Salary.System.Service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

;
import java.util.Date;
import java.util.List;

@Controller
@RestController
@RequestMapping(value = "manager")
public class MangerController {
    @Autowired
    ManagerService managerService;

    @RequestMapping("create")
    public void saveManager (@RequestBody GetManagerRequestObject managerRequestObject) {
        createManager(managerRequestObject);
    }

    @RequestMapping("get")
    public List<Manager> getManager () {
        return managerService.getManager();
    }

    //Path Variable
    @RequestMapping("get/{managerId}")
    public GetManagerResponse createManager (@PathVariable Long managerId) {
        return managerService.getManagerById(managerId);
    }

    public void createManager(GetManagerRequestObject managerRequestObject) {

        Manager manager = new Manager();
        manager.setDepartment(managerRequestObject.getDepartment());
        manager.setTeamName("Badr");
        manager.setCreatedDate(new Date());
        manager.setIsActive(true);
        managerService.saveManager(manager);
    }

    @RequestMapping(value = "findManagerByTeamName", method = RequestMethod.GET)
    public Manager getManagerByTeamName(@RequestParam String teamName){
        return managerService.getManagerByTeamName(teamName);
    }
}