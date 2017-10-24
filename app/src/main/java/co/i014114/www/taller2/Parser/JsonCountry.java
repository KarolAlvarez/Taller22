package co.i014114.www.taller2.Parser;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import co.i014114.www.taller2.Models.Country;

/**
 * Created by root on 26/09/17.
 */

public class JsonCountry {

    public static List<Country> getData(String content) throws JSONException {
        JSONArray jsonArray = new JSONArray(content);
        List<Country> countryList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++){
            JSONObject item = jsonArray.getJSONObject(i);
            Country country = new Country();
            country.setName(item.getString("name"));
            country.setCapital(item.getString("capital"));
            country.setAlphacode(item.getString("alpha3Code"));
            countryList.add(country);
        }
        return countryList;
    }
}
