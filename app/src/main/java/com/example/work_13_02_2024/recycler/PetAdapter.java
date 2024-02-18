package com.example.work_13_02_2024.recycler;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.work_13_02_2024.Domain.Pet;
import com.example.work_13_02_2024.databinding.ItemPetBinding;

import java.util.ArrayList;
import java.util.List;

public class PetAdapter extends RecyclerView.Adapter<PetViewHolder> {
    private List<Pet> petList;
    private OnClickListener clickListener;

    public PetAdapter(OnClickListener clickListener) {
        this.petList = new ArrayList<>();
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public PetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemPetBinding binding = ItemPetBinding.inflate(
                LayoutInflater.from(
                        parent.getContext()
                )
        );
        return new PetViewHolder(binding, clickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull PetViewHolder holder, int position) {
        holder.bind(petList.get(position));
    }

    @Override
    public int getItemCount() {
        return petList.size();
    }

    public void setPetList(List<Pet> petList) {
        this.petList = new ArrayList<>(petList);
        notifyDataSetChanged();
    }
}
