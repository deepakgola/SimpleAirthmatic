package deepak.gola.demo.ui.add;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import deepak.gola.demo.R;

public class AdditionFragment extends Fragment {

    private AdditionViewModel mViewModel;

    public static AdditionFragment newInstance() {
        return new AdditionFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        mViewModel = ViewModelProviders.of(this).get(AdditionViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_addition, container, false);
        final Button mAddButton = root.findViewById(R.id.btnAdd);
        final TextView mText = root.findViewById(R.id.tvAddition);

        mAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String x = ((EditText) root.findViewById(R.id.etFirstNum_fragAdd)).getText().toString();
                final String y = ((EditText) root.findViewById(R.id.etSecondNum_fragAdd)).getText().toString();
                Log.println(Log.DEBUG, "X::", x);
                Log.println(Log.DEBUG, "Y::", y);
                Log.println(Log.DEBUG, "Addition :: ", "In Addition");
                if (mViewModel.validate(x, y)) {
                    mText.setText(mViewModel.add(x, y));
                }
            }
        });
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

}