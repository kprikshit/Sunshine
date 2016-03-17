package android.prikshit.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by shephard on 18/03/16.
 */
public class ForecastFragment extends Fragment {
    private ArrayList<String> forecastData;
    private ArrayAdapter<String> forecastAdapter;
    private String zipCode;

    public ForecastFragment(){
        forecastData = new ArrayList<>();
        forecastData.add("Today - Sunny - 36/12");
        forecastData.add("Tomorrow - Cloudy - 36/12");
        forecastData.add("19/3 - Rainy - 36/12");
        forecastData.add("20/3 - Sunny - 36/12");
    }


    public void setZipCode(final String zipCode){
        this.zipCode = zipCode;
    }

    /**
     * Get the forecast data for given location
     */
    public void getForecast(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        forecastAdapter = new ArrayAdapter<>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forcast_textview,
                forecastData);

        ListView forecastView = (ListView) rootView.findViewById(R.id.listview_forecast);
        forecastView.setAdapter(forecastAdapter);

        return rootView;
    }
}
