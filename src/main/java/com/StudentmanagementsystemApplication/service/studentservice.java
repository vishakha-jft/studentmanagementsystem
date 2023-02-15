package com.StudentmanagementsystemApplication.service;
import com.StudentmanagementsystemApplication.entity.student;

import java.util.List;

public interface studentservice {
     List<student> getAllStudents();

     student savestudent( student s1);
}
