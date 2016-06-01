package hu.nemi.pinchandzoomlayout;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GridAdapter extends RecyclerView.Adapter<GridItemViewHolder> {
    @Override
    public GridItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.grid_item, parent, false);
        return new GridItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GridItemViewHolder holder, int position) {
        holder.textView.setText(Integer.toString(position));
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }
}
