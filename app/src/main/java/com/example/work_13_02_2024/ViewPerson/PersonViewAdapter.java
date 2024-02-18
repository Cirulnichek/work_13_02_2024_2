package com.example.work_13_02_2024.ViewPerson;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.work_13_02_2024.Domain.Person;
import com.example.work_13_02_2024.MainActivity;
import com.example.work_13_02_2024.R;
import com.example.work_13_02_2024.databinding.ActivityMainBinding;

import java.util.List;

public class PersonViewAdapter extends ArrayAdapter<Person> {
    private ActivityMainBinding binding;

    public PersonViewAdapter(@NonNull Context context, List<Person> people) {
        super(context, R.layout.item_person, people);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Person person = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_person, null);
        }

        ((TextView) convertView.findViewById(R.id.tv_id)).setText(String.valueOf(person.getId()));
        ((TextView) convertView.findViewById(R.id.tv_name)).setText(String.valueOf(person.getName()));
        ((TextView) convertView.findViewById(R.id.tv_phone)).setText(String.valueOf(person.getPhone()));

        return convertView;
    }


}
