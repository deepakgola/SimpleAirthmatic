package deepak.gola.demo.ui.add;

import android.util.Log;

import androidx.lifecycle.ViewModel;

public class AdditionViewModel extends ViewModel {
    public String add(String x, String y) {
        Log.d("Addition :: ", "Performing Addition");
        String sum = "0.0";
        try {
            sum = new String(String.valueOf(Double.parseDouble(x) + Double.parseDouble(y)));
        } catch (Exception e) {
            Log.e("Addition :: ", e.getMessage());
        }
        return sum;
    }

    public boolean validate(String x, String y) {
        Log.d("Addition :: ", "Performing Validation");
        return (!x.isEmpty() && !y.isEmpty());
    }
}