package com.project.springdata.service;

import com.project.springdata.model.Trainer;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public interface TrainerServiceInterface {

    /*
    METHODS THAT THE TrainerServiceImpl WILL IMPLEMENT AND EXECUTE
    WHEN ACKED
     */
    public void insertTrainer(Trainer trainer);

    public void deleteTrainer(int id);

    public void updateTrainer(Trainer trainer);

    public List<Trainer> findAllTrainers();

    public Trainer findById(int id);
    
    public void updateTrainer(String firstname, String lastname, String course, int id);

}
