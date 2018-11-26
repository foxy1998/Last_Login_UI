package com.example.alina.last_login_ui;


import android.content.Context;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

class DataAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int LAYOUT_ONE = 0;
    private static final int LAYOUT_TWO = 1;
    private LayoutInflater inflater;
    private List<Point> points;


    DataAdapter(Context context, List<Point> points) {
        this.points = points;
        this.inflater = LayoutInflater.from( context );
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0)
            return LAYOUT_ONE;
        else
            return LAYOUT_TWO;
    }

    @Override
    public int getItemCount() {
        return (points.size() + 1);

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = null;
        RecyclerView.ViewHolder viewHolder = null;

        if (viewType == LAYOUT_ONE) {
            view = LayoutInflater.from( parent.getContext() ).inflate( R.layout.empty, parent, false );
            viewHolder = new ViewHolderOne( view );
        } else {
            view = LayoutInflater.from( parent.getContext() ).inflate( R.layout.my_list_item, parent, false );
            viewHolder = new ViewHolderTwo( view );
        }

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        if (holder.getItemViewType() == LAYOUT_ONE) {
            ViewHolderOne vaultItemHolder = (ViewHolderOne) holder;

            vaultItemHolder.textEmpty.setText( R.string.Forgot_password );


        } else {
            if (holder.getItemViewType() == LAYOUT_TWO) {

                ViewHolderTwo vaultItemHolder2 = (ViewHolderTwo) holder;
                Point point = points.get( (position) - 1 );
                if (point.isAvailable()) {
                    vaultItemHolder2.imageView.setImageResource( R.drawable.free );
                    vaultItemHolder2.imageView1.setImageResource( R.drawable.free1 );
                } else {
                    vaultItemHolder2.imageView.setImageResource( R.drawable.engaged );
                    vaultItemHolder2.imageView1.setImageResource( R.drawable.engaged1 );

                }
                vaultItemHolder2.namePoint.setText( point.getName() );
                vaultItemHolder2.distanceView.setText( point.getDistance() );
            }
        }
    }


    public class ViewHolderOne extends RecyclerView.ViewHolder {

        public TextView textEmpty;


        public ViewHolderOne(View itemView) {
            super( itemView );
            textEmpty = (TextView) itemView.findViewById( R.id.text1 );

        }
    }


    public class ViewHolderTwo extends RecyclerView.ViewHolder {
        public ImageView imageView, imageView1;
        public TextView namePoint, distanceView;

        public ViewHolderTwo(View itemView) {
            super( itemView );
            imageView1 = (ImageView) itemView.findViewById( R.id.imageView_free11 );
            imageView = (ImageView) itemView.findViewById( R.id.imageView_free12 );
            namePoint = (TextView) itemView.findViewById( R.id.name_of_points );
            distanceView = (TextView) itemView.findViewById( R.id.distance );
            distanceView.setPaintFlags( distanceView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG );
        }
    }
}

