package com.example.work_13_02_2024;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.work_13_02_2024.Domain.Person;
import com.example.work_13_02_2024.ViewPerson.PersonViewAdapter;
import com.example.work_13_02_2024.databinding.ActivityMainBinding;
import com.example.work_13_02_2024.recycler.PersonAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private List<Person> personList;
    private String[] names = {"Bob", "Max", "Alex", "Alexandr", "Egor", "Konstantin", "Trofim"};
    private String[] phones = {"8-986-696-78-07", "8-926-608-26-04", "+7-913-078-11-25"};
    private Random generator = new Random();

    private void init() {
        for (int i = 0; i < 20; i++) {
            this.personList.add(new Person(generator.nextInt(100),
                    names[generator.nextInt(names.length)],
                    phones[generator.nextInt(phones.length)]));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        init();
        PersonViewAdapter adapter = new PersonViewAdapter(this, personList);
        ListView lv = (ListView) binding.list;
        lv.setAdapter(adapter);
    }
}