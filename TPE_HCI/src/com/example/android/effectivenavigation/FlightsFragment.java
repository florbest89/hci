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
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;



public class FlightsFragment extends Fragment {


   public void onActivityCreated(Bundle savedInstanceState){
	   super.onActivityCreated(savedInstanceState);
	   
	   List<String> options = new ArrayList<String>();
	   options.add("A40");
	   options.add("AA242");
	   options.add("LA210");
	   options.add("B200");
	   
	   OptionsAdapter adapter = new OptionsAdapter(getActivity(),R.layout.list_item,options);
	   
	   View aux = getActivity().findViewById(R.id.listview);
	   
	   ListView view = (ListView)aux;
	  
	  view.setAdapter(adapter);
	  
	  view.setOnItemClickListener(new OnItemClickListener(){

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			Intent details = new Intent(getActivity(),FlightDetails.class);
			startActivity(details);
			
		}
		  
	  });
	  
	  
	   
   }
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        	View rootView = inflater.inflate(R.layout.flights, container, false);
       
        
        return rootView;
    }
	

    
}