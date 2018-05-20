package salma.example.com.trainnavigationdrawer;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by saloom on 15/05/2018.
 */

public class RestuarantAdapter extends RecyclerView.Adapter<RestuarantAdapter.MyViewHolder>{

    private List<Restaurant_info>rest_info;




    public  class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView rest_name ,rest_menu, delivery_time;

        public MyViewHolder(View itemView) {
            super(itemView);

            img=(ImageView) itemView.findViewById(R.id.img);
            rest_menu=(TextView)itemView.findViewById(R.id.restaurant_menu);
            rest_name = (TextView)itemView.findViewById(R.id.restaurant_name);
            delivery_time = (TextView)itemView.findViewById(R.id.delivery_txt);


        }
    }

    public RestuarantAdapter(List<Restaurant_info>rest_info){
        this.rest_info = rest_info;

    }



    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_layout, parent, false);

        return new MyViewHolder(itemView);
    }



    @Override
    public int getItemCount() {
        return rest_info.size();
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Restaurant_info info = rest_info.get(position);
        holder.rest_name.setText(info.getRest_name());
        holder.rest_menu.setText(info.getRest_menu());
        holder.delivery_time.setText(info.getDelivery_time());
        holder.img.setImageResource(info.getRest_image());

    }
}
