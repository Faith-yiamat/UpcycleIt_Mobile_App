package com.example.ourupcycleitapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ourupcycleitapp.databinding.LevelListAllBinding






class AllLevels (var levelsList: List<all_levels_data>):RecyclerView.Adapter<LevelHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LevelHolder {
        val binding = LevelListAllBinding.inflate(LayoutInflater.from(parent.context),parent,false)
            return LevelHolder(binding)
        }



    override fun onBindViewHolder(holder: LevelHolder, position: Int) {
        val level = levelsList[position]
        holder.binding.tvLevel.text = level.level
    }

    override fun getItemCount(): Int {
        return levelsList.size
    }
}
class LevelHolder(var binding:LevelListAllBinding):RecyclerView.ViewHolder(binding.root){

}