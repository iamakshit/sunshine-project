package com.example.wearapplication.Utils;

import com.example.wearapplication.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by akshitgupta on 30/08/16.
 */

public class Utils {
    public static String getCurrentDay() {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        Date d = new Date();
        String dayOfTheWeek = sdf.format(d);
        return dayOfTheWeek.substring(0, 3) + ", ";
    }

    public static String getCurrentDate() {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
        String formattedDate = df.format(c.getTime());
        return formattedDate;
    }

    public static int getArtResourceForWeatherCondition(int weatherId) {
        // Based on weather code data found at:
        // http://bugs.openweathermap.org/projects/api/wiki/Weather_Condition_Codes
        if (weatherId >= 200 && weatherId <= 232) {
            return R.drawable.art_storm;
        } else if (weatherId >= 300 && weatherId <= 321) {
            return R.drawable.art_light_rain;
        } else if (weatherId >= 500 && weatherId <= 504) {
            return R.drawable.art_rain;
        } else if (weatherId == 511) {
            return R.drawable.art_snow;
        } else if (weatherId >= 520 && weatherId <= 531) {
            return R.drawable.art_rain;
        } else if (weatherId >= 600 && weatherId <= 622) {
            return R.drawable.art_snow;
        } else if (weatherId >= 701 && weatherId <= 761) {
            return R.drawable.art_fog;
        } else if (weatherId == 761 || weatherId == 781) {
            return R.drawable.art_storm;
        } else if (weatherId == 800) {
            return R.drawable.art_clear;
        } else if (weatherId == 801) {
            return R.drawable.art_light_clouds;
        } else if (weatherId >= 802 && weatherId <= 804) {
            return R.drawable.art_clouds;
        }
        return -1;
    }
}
