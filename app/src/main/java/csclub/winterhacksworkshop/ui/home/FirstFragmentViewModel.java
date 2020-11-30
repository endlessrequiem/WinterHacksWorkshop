package csclub.winterhacksworkshop.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FirstFragmentViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FirstFragmentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Hello World");
    }

    public LiveData<String> getText() {
        return mText;
    }
}