package com.example.work_13_02_2024.recycler;

import android.view.View;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.work_13_02_2024.Domain.Pet;
import com.example.work_13_02_2024.databinding.ItemPetBinding;

public class PetViewHolder extends RecyclerView.ViewHolder {
    private ItemPetBinding binding;
    private OnClickListener clickListener;

    public PetViewHolder(ItemPetBinding binding, OnClickListener clickListener) {
        super(binding.getRoot());
        this.binding = binding;
        this.clickListener = clickListener;
    }

    public void bind(Pet item) {
        binding.tvPetSpecie.setText(item.getSpecie());
        binding.tvPetName.setText(item.getName());
        binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), item.toString(), Toast.LENGTH_SHORT);
            }
        });
    }
}
