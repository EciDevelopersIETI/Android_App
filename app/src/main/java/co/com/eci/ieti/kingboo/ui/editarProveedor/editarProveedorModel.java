package co.com.eci.ieti.kingboo.ui.editarProveedor;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class editarProveedorModel extends ViewModel {

    private MutableLiveData<String> mText;

    public editarProveedorModel() {
        mText = new MutableLiveData<>();
        mText.setValue("EDITAR PROVEEDOR");
    }

    public LiveData<String> getText() {
        return mText;
    }
}