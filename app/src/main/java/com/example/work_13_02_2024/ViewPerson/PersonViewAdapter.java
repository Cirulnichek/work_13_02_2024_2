package com.example.work_13_02_2024.ViewPerson;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.work_13_02_2024.Domain.Person;
import com.example.work_13_02_2024.R;
import com.example.work_13_02_2024.databinding.ActivityMainBinding;

import java.util.List;

public class PersonViewAdapter extends ArrayAdapter<Person> {

    public PersonViewAdapter(@NonNull Context context, List<Person> people) {
        super(context, R.layout.item_person, people);
    }
}
