package org.guru._23csa29.vechile.scheduler.be;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
@RequestMapping("/api/scheduler")
public class ShedulerController {

    @Autowired
    private SchedulerService schedulerService;
    private RestTemplate restTemplate;

    public List<Task> getSchedule(@RequestParam String depotId){

        String Task_id = "http://4.224.186.213/evaluation-service/";

        Task[] tasks = restTemplate.getForObject(Task_id + depotId, Task[].class);


        return schedule;
    }

}
