package com.springjdbc.dao;

import com.springjdbc.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Student getStudentById(int id) {
        String query = "SELECT * FROM Student WHERE id=?";
        RowMapper<Student> rowMapper = new StudentRowMapper();
        return jdbcTemplate.queryForObject(query, rowMapper, id);
    }

    @Override
    public List<Student> getAllStudents() {
        String query = "SELECT * FROM Student";
        RowMapper<Student> rowMapper = new StudentRowMapper();
        return jdbcTemplate.query(query, rowMapper);
    }
}
