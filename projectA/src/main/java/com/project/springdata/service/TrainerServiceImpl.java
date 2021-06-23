package com.project.springdata.service;

import com.project.springdata.model.Trainer;
import com.project.springdata.repository.TrainerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainerServiceImpl implements TrainerServiceInterface {

    @Autowired
    TrainerRepository trainerRepository;

    @Override
    public void insertTrainer(Trainer trainer) {
        trainerRepository.save(trainer);
    }

    @Override
    public void deleteTrainer(int id) {
        trainerRepository.deleteById(id);
    }

    @Override
    public void updateTrainer(Trainer trainer) {
         trainerRepository.save(trainer);
    }

    @Override
    public List<Trainer> findAllTrainers() {
        return trainerRepository.findAll();
    }
    
    @Override
    public Trainer findById(int id){
        Trainer trainer =trainerRepository.getById(id);
        return trainer;
    }
    
    @Override
    public void updateTrainer(String firstname, String lastname, String course, int id){
        trainerRepository.updateTrainer(firstname, lastname, course, id);
    }

}
