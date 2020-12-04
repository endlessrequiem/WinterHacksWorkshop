package csclub.winterhacksworkshop.ui.firstfrag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import csclub.winterhacksworkshop.R;

public class FirstFragment extends Fragment {

    private FirstFragmentViewModel firstFragmentViewModel;
    Button testButton;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        firstFragmentViewModel =
                new ViewModelProvider(this).get(FirstFragmentViewModel.class);
        View root = inflater.inflate(R.layout.fragment_first, container, false);
        final TextView textView = root.findViewById(R.id.text_firstfragment);



        return root;
    }
}