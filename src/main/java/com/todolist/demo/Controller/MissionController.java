package com.todolist.demo.Controller;

import com.todolist.demo.Domain.Mission;
import com.todolist.demo.Repository.MissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/missions")
public class MissionController {

    @Autowired
    MissionRepository missionRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Mission> getAll(){
        return missionRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Mission showById (@PathVariable Long id){
        return missionRepository.findOne(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById (@PathVariable Long id) {
        missionRepository.delete(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void createNewItem (@RequestBody Mission mission){
        missionRepository.save(mission);
    }

}
