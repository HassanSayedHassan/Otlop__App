package salma.example.com.trainnavigationdrawer;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {

    private List<Restaurant_info> restaurant_infoList = new ArrayList<>();
    private RecyclerView recyclerView ;
    private RestuarantAdapter adapter ;


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_restaurant, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        // do what uo do in   on create() activity
        // use view before uo use findViewById() && use getActivity() in Fragment to get Context .


        recyclerView = (RecyclerView)view.findViewById(R.id.my_recycler_view);

        adapter = new RestuarantAdapter(restaurant_infoList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        // layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        // RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        //   mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        prepareRestarantList();


    }




    private void prepareRestarantList() {

        Restaurant_info restaurant= new Restaurant_info("delivers in 45 min","Salades ,Fish , Italian macarona","Spectra ", R.drawable.spec);
        restaurant_infoList.add(restaurant);

        Restaurant_info restaurant2= new Restaurant_info("delivers in 45 min","Salades ,Fish , Italian macarona","Spectra ", R.drawable.spec);
        restaurant_infoList.add(restaurant2);

        Restaurant_info restaurant3= new Restaurant_info("delivers in 45 min","Salades ,Fish , Italian macarona","Spectra ", R.drawable.spec);
        restaurant_infoList.add(restaurant3);


        adapter.notifyDataSetChanged();


    }



}
