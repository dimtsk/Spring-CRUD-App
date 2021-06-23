package com.project.springdata.validator;

import com.project.springdata.model.Trainer;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class TrainerValidator implements Validator {

     @Override
    public boolean supports(Class<?> type) {
        return Trainer.class.equals(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Trainer trainer = (Trainer) o;
        String firstname = trainer.getFirstname();
        String lastname = trainer.getLastname();
        String course = trainer.getCourse();
        if (firstname.equals("")
                || firstname == null
                || !firstname.matches("^[a-zA-Z]*$")) {

            errors.rejectValue("firstname", "firstname.err");
        }
        if (lastname.equals("")
                || lastname == null
                || !lastname.matches("^[a-zA-Z]*$")) {

            errors.rejectValue("lastname", "firstname.err");
        }
        if (course.equals("")
                || course == null
                || !course.matches("^[a-zA-Z]*$")) {

            errors.rejectValue("course", "firstname.err");
        }
    }
}
