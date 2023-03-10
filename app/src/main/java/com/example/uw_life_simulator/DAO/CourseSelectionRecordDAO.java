package com.example.uw_life_simulator.DAO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.uw_life_simulator.data.CourseSelectionRecord;

import java.util.List;

@Dao
public interface CourseSelectionRecordDAO {
    @Insert
    void insertAll(CourseSelectionRecord courseSelectionRecord);

    @Query("DELETE FROM CourseSelectionRecord")
    void deleteAll();

    @Query("SELECT * FROM CourseSelectionRecord")
    List<CourseSelectionRecord> selectAll();

    @Query("SELECT completionGrade FROM CourseSelectionRecord WHERE courseCode = :code")
    Integer getGradeByCode(String code);

    @Query("SELECT * FROM CourseSelectionRecord WHERE completionGrade = -1")
    List<CourseSelectionRecord> selectCurrent();

    @Query("UPDATE CourseSelectionRecord SET completionGrade = :grade WHERE courseCode = :code")
    void updateGradeByCourseCode(String code, Integer grade);
}
