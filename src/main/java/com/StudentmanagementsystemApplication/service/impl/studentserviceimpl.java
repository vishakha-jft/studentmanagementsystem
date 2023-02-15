package com.StudentmanagementsystemApplication.service.impl;
import com.StudentmanagementsystemApplication.entity.student;
import org.springframework.stereotype.Service;
import com.StudentmanagementsystemApplication.repository.studentrepository;
import com.StudentmanagementsystemApplication.service.studentservice;

import java.util.List;
@Service
public class studentserviceimpl implements studentservice{
    private studentrepository studentrepo;
    public studentserviceimpl(studentrepository studentrepository) {
        super();
        this.studentrepo = studentrepository;
    }
    @Override
    public List<student> getAllStudents(){
        return studentrepo.findAll();
    }

    @Override
    public student savestudent(student s1) {
        return studentrepo.save(s1);
    }
}

