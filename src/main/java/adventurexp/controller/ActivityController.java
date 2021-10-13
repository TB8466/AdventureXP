package adventurexp.controller;


import adventurexp.repositories.ActivityRepository;
import adventurexp.model.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/activity")
public class ActivityController {


    @Autowired
    ActivityRepository activityRepository;


@GetMapping("/new")
    public String displayActivityForm(Model model) {

    Activity anActivity = new Activity();
    model.addAttribute("activity", anActivity);

    return "activities/new-activity";

}

@PostMapping("/save")
    public String createActivity(Activity activity, Model model){
    activityRepository.save(activity);

    return "redirect:/activity/new";
    }





}
