package com.example.competences;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.Query;

public interface CompetenceDao {
    @Insert
    void insert(Competence competence);

    @Query("DELETE FROM competence_table")
    void deleteAll();

    @Query("SELECT * from competence_table ORDER BY nomCompetence ASC")
    LiveData<List<Competence>> getToutesCompetences();

}
