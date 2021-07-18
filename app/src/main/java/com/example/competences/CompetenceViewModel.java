package com.example.competences;

import android.app.Application;

import java.util.List;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class CompetenceViewModel extends AndroidViewModel {

    private CompetenceRepository monRepository;
    private LiveData<List<Competence>> mesCompetences;

    public CompetenceViewModel (Application application) {

        super(application);
        monRepository = new CompetenceRepository(application);
        mesCompetences = monRepository.getMesCompetences();
    }

    LiveData<List<Competence>> getMesCompetences() {

        return mesCompetences;
    }

    public void insert (Competence uneCompetence) {

        monRepository.insert(uneCompetence);

    }

}
