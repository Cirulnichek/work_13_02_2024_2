package com.example.work_13_02_2024.recycler;

import android.view.View;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.work_13_02_2024.Domain.Person;
import com.example.work_13_02_2024.databinding.ItemPersonBinding;

public class PersonViewHolder extends RecyclerView.ViewHolder {
    private ItemPersonBinding binding;
    public PersonViewHolder(ItemPersonBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Person person) {
        binding.tvName.setText(person.getName());
        binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}