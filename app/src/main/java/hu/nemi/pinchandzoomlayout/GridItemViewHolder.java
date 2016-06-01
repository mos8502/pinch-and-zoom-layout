package hu.nemi.pinchandzoomlayout;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class GridItemViewHolder extends RecyclerView.ViewHolder {
    public TextView textView;

    public GridItemViewHolder(View itemView) {
        super(itemView);
        this.textView = (TextView) itemView.findViewById(R.id.item_text);
    }
}
