package com.saransh.apicallgs.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jakewharton.picasso.OkHttp3Downloader;
import com.saransh.apicallgs.MainActivity;
import com.saransh.apicallgs.R;
import com.saransh.apicallgs.model.RetroPhoto;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder>
{
    private List<RetroPhoto> datalist;
    private Context context;

    public CustomAdapter(List<RetroPhoto> datalist, Context context) {
        this.datalist = datalist;
        this.context = context;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context;
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.custom_row, parent, false);

        return new CustomAdapter.CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position)
    {
        holder.txtTitle.setText(datalist.get(position).getTitle());
        Picasso.Builder builder = new Picasso.Builder(context);
        builder.downloader(new OkHttp3Downloader(context));
        builder.build().load(datalist.get(position).getThumbnailUrl())
                .placeholder((R.drawable.ic_launcher_background))
                .error(R.drawable.ic_launcher_background)
                .into(holder.coverImage);

    }

    @Override
    public int getItemCount() {
        if (datalist==null)
        {
            return 0;
        }
        else
        {
            return datalist.size();
        }
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle;
        private ImageView coverImage;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.title);
            coverImage = itemView.findViewById(R.id.coverImage);
        }
    }
}
