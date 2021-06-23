package com.project.springdata.controller;

import com.project.springdata.model.Trainer;
import com.project.springdata.service.TrainerServiceInterface;
import com.project.springdata.validator.TrainerValidator;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TrainerController {

    @Autowired
    TrainerValidator trainerValidator;
    
    @InitBinder("trainer")
    private void initBinder(WebDataBinder binder){
        binder.addValidators(trainerValidator);
    }

    @Autowired
    TrainerServiceInterface trainerServiceInterface;

    @GetMapping("/")
    public String showTrainerForm(ModelMap mm) {
        Trainer trainer = new Trainer();
        mm.addAttribute("trainer", trainer);
        return "trainerForm";
    }

    @PostMapping("/inserttrainer")
    public String insertTrainer(@Valid@ModelAttribute(name = "trainer") Trainer trainer,
            BindingResult result,ModelMap mm) {
        if (result.hasErrors()) {
            return "trainerForm";
        } 
            trainerServiceInterface.insertTrainer(trainer);
            mm.addAttribute("messageoutput", "Successfully added!");
            trainer = new Trainer();
            mm.addAttribute("trainer", trainer);
        return "trainerForm";
    }

    @GetMapping("/trainerlist")
    public String trainerList(ModelMap mm) {
        mm.put("trainers", trainerServiceInterface.findAllTrainers());//"trainers" MUST have saem name with the JSP field "items"
        return "trainerTable";
    }

    @GetMapping("/deletetrainer/{id}")
    public String deleteTrainer(@PathVariable("id") int id) {
        trainerServiceInterface.deleteTrainer(id);
        return "redirect:/trainerlist";
    }

    @GetMapping("/update/{id}")
    public String getTrainerById(@PathVariable("id") int id, ModelMap mm) {
        mm.put("utrainer", trainerServiceInterface.findById(id));
        System.out.println(trainerServiceInterface.findById(id));
        return "updateForm";
    }

    @PostMapping("/updatetrainer/{id}")
    public String updateTrainer(@PathVariable("id") int id,@Valid@ModelAttribute(name = "utrainer") Trainer trainer,
            BindingResult result,ModelMap mm) {
            trainerServiceInterface.insertTrainer(trainer);
            mm.put("trainers", trainerServiceInterface.findAllTrainers());
        return "trainerTable";
    }
}
