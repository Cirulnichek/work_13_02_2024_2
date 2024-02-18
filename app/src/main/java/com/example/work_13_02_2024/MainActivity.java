package com.example.work_13_02_2024;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.work_13_02_2024.Domain.Person;
import com.example.work_13_02_2024.Domain.Pet;
import com.example.work_13_02_2024.ViewPerson.PersonViewAdapter;
import com.example.work_13_02_2024.databinding.ActivityMainBinding;
import com.example.work_13_02_2024.recycler.OnClickListener;
import com.example.work_13_02_2024.recycler.PetAdapter;

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
        this.personList = new ArrayList<>();
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
        binding.list.setAdapter(adapter);

        PetAdapter petAdapter = new PetAdapter(new OnClickListener() {
            @Override
            public void onClick(Pet pet) {
                Toast.makeText(MainActivity.this, pet.toString(), Toast.LENGTH_LONG).show();
            }
        });

        binding.rvPet.setAdapter(petAdapter);

        binding.list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final Person person = (Person) parent.getAdapter().getItem(position);
                petAdapter.setPetList(person.getPets());
            }
        });
    }
}