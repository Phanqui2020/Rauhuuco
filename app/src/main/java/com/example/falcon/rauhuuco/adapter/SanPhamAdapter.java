package com.example.falcon.rauhuuco.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.falcon.rauhuuco.model.SanPham;

/**
 * Created by falcon on 23/10/2017.
 */

/*public class SanPhamAdapter extends RecyclerView.Adapter<SanPham.DataViewHolder> {
    private List<Person> people;
    private Context context;

    public RecyclerDataAdapter(Context context, List<Person> people) {
        this.context = context;
        this.people = people;
    }

    @Override
    public int getItemCount() {
        return people == null ? 0 : people.size();
    }

    @Override
    public RecyclerDataAdapter.DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;

        // Kiểm tra item view type, nếu là 1 thì inflate layout item_names.xml, 2 thì sử dụng item_names_female.
        switch (viewType) {
            case 1:
                itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_names, parent, false);
                break;
            case 2:
                itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_names_female, parent, false);
                break;
            default:
                itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_names, parent, false);
                break;
        }


        return new DataViewHolder(itemView);
    }

    @Override
    public int getItemViewType(int position) {
        // Cài đặt kiểu item view type cho từng phần tử, nếu có giới tính là nam thì trả về 1, nữ thì trả về 2.
        if (people.get(position).isMale()) {
            return 1;
        } else {
            return 2;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerDataAdapter.DataViewHolder holder, int position) {
        String name = people.get(position).getName();
        holder.tvName.setText(name);
    }

    /**
     * Data ViewHolder class.

    public static class DataViewHolder extends RecyclerView.ViewHolder {

        private TextView tvName;

        public DataViewHolder(View itemView) {
            super(itemView);

            tvName = (TextView) itemView.findViewById(R.id.tv_name);
        }
    }
}*/
