package co.com.eci.ieti.kingboo.ui.misReservas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;

import co.com.eci.ieti.kingboo.R;

public class misReservasFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ;
        View root = inflater.inflate(R.layout.fragment_misreservas, container, false);
        return root;
    }
}