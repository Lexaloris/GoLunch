package golunch.mail.ru.golunch.screens.dishes_list;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import golunch.mail.ru.golunch.R;

public class DishesListAdapter extends RecyclerView.Adapter<DishesListAdapter.DishViewHolder> {

    private ArrayList<Dish> dishes;
    private Context mContext;

    public DishesListAdapter(ArrayList<Dish> dishes, Context context){
        this.dishes = dishes;
        mContext = context;
    }

    public void addItem(Dish item) {
        dishes.add(item);
    }

    @Override
    public DishViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.dish_item, viewGroup, false);
        return new DishViewHolder(v);

    }

    @Override
    public void onBindViewHolder(DishViewHolder holder, int position) {
        holder.name.setText(dishes.get(position).name);
        holder.weight.setText(dishes.get(position).weight);
        holder.price.setText(dishes.get(position).price);

        // TODO - отображать иконку;
    }

    @Override
    public int getItemCount() {
        return dishes.size();
    }

    public static class DishViewHolder extends RecyclerView.ViewHolder {
        RecyclerView rv;
        ImageView icon;
        TextView name;
        TextView weight;
        TextView price;

        DishViewHolder(View itemView) {
            super(itemView);
            rv = (RecyclerView) itemView.findViewById(R.id.rv);
            icon = (ImageView) itemView.findViewById(R.id.icon);
            name = (TextView) itemView.findViewById(R.id.name);
            weight = (TextView) itemView.findViewById(R.id.weight);
            price = (TextView) itemView.findViewById(R.id.price);
        }
    }
}
