package dev.nnhao.barberproduct;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HistoriesRecViewAdapter extends RecyclerView.Adapter<HistoriesRecViewAdapter.ViewHolder> {
    private ArrayList<HistoryItem> histories = new ArrayList<>();
    private Context context;

    public HistoriesRecViewAdapter(HomeFragment homeFragment){
        context = homeFragment.getContext();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.histories_list_item, parent, false);
        HistoriesRecViewAdapter.ViewHolder holder = new HistoriesRecViewAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder( HistoriesRecViewAdapter.ViewHolder holder, int position) {
        holder.txtDateBooking.setText(histories.get(position).getDateBooking());
        holder.txtSalonName.setText(histories.get(position).getSalonName());
        holder.txtAddress.setText(histories.get(position).getAddress());
        holder.txtAppointmentDate.setText(histories.get(position).getAppointmentDate());
        holder.txtBookingStylistName.setText(histories.get(position).getBookingStylistName());
        holder.historyItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Selected History", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return histories.size();
    }

    public void setHistories(ArrayList<HistoryItem> histories) {
        this.histories = histories;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtDateBooking, txtSalonName, txtAddress, txtAppointmentDate, txtBookingStylistName;
        private CardView historyItem;

        public ViewHolder(View itemView) {
            super(itemView);
            txtDateBooking = itemView.findViewById(R.id.txtDateBooking);
            txtSalonName = itemView.findViewById(R.id.txtSalonName);
            txtAddress = itemView.findViewById(R.id.txtAddress);
            txtAppointmentDate = itemView.findViewById(R.id.txtAppointmentDate);
            txtBookingStylistName = itemView.findViewById(R.id.txtBookingStylistName);
            historyItem = itemView.findViewById(R.id.historyItem);
        }
    }
}
