package edu.depaul.cdm.se452.concept.model;

import edu.depaul.cdm.se452.concept.database.mysql.domain.TuitionEntity;

import java.util.List;

public interface ITuitionService {
    public List<TuitionEntity> findAll();

    public TuitionEntity update(TuitionEntity ce);

    public TuitionEntity findById(int id);

    public List findByStudent();

    public void deleteById(int id);
}