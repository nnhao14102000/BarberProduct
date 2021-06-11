package dev.nnhao.barberproduct;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    private RecyclerView historyRecView;
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        historyRecView = view.findViewById(R.id.listHistory);

        ArrayList<HistoryItem> histories = new ArrayList<>();
        histories.add(new HistoryItem("01/01/2019", "30Shine", "District 2, HoChiMinh City", "02/02/2019","John"));
        histories.add(new HistoryItem("01/02/2019", "30Shine", "District 2, HoChiMinh City", "02/03/2019","Kelly"));
        histories.add(new HistoryItem("01/03/2019", "30Shine", "District 2, HoChiMinh City", "02/04/2019","Max"));
        histories.add(new HistoryItem("01/04/2019", "30Shine", "District 2, HoChiMinh City", "02/05/2019","Robin"));
        histories.add(new HistoryItem("01/05/2019", "30Shine", "District 2, HoChiMinh City", "02/06/2019","Hood"));

        HistoriesRecViewAdapter adapter = new HistoriesRecViewAdapter(HomeFragment.this);
        adapter.setHistories(histories);

        historyRecView.setAdapter(adapter);
        historyRecView.setLayoutManager(new LinearLayoutManager(getContext()));
    }
}