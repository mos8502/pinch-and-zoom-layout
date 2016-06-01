package hu.nemi.pinchandzoomlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;

public class MainActivity extends AppCompatActivity {
    private ZoomingRecyclerView recyclerView;
    private GridLayoutManager layoutManager;
    private GridAdapter adapter;
    private ZoomItemAnimator itemAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (ZoomingRecyclerView) findViewById(R.id.recycler_view);
        layoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new GridAdapter();
        adapter.setHasStableIds(true);
        recyclerView.setAdapter(adapter);

        itemAnimator = new ZoomItemAnimator();
        itemAnimator.setup(recyclerView);
    }
}
