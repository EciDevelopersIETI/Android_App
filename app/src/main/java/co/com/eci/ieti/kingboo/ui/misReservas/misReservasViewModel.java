package co.com.eci.ieti.kingboo.ui.misReservas;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class misReservasViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public misReservasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("MIS RESERVAS");
    }

    public LiveData<String> getText() {
        return mText;
    }
}