package com.example.android.effectivenavigation;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;


//Fragmento de la sección OFERTAS
public class SalesFragment extends Fragment {

	public void onActivityCreated(Bundle savedInstanceState){
		   super.onActivityCreated(savedInstanceState);
		   
		   List<String> deals = new ArrayList<String>();
		   deals.add("Oferta 1");
		   deals.add("Oferta 2");
		   deals.add("Oferta 3");
		   deals.add("Oferta 4");
		   
		   OptionsAdapter adapter = new OptionsAdapter(getActivity(),R.layout.list_item,deals,SectionType.DEAL);
		   
		   View aux = getActivity().findViewById(R.id.listSales);
		   
		   ListView view = (ListView)aux;
		   
		  
		  view.setAdapter(adapter);
		  
		  view.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				
			}
			  
		  });
	}
	
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sales, container, false);

        return rootView;
    }
}