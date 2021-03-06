package com.example.codemail.ui.buy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.codemail.R;

public class BuyFragment extends Fragment {

    private BuyViewModel buyViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        buyViewModel =
                ViewModelProviders.of(this).get(BuyViewModel.class);
        View root = inflater.inflate(R.layout.fragment_buy, container, false);
        return root;
    }
}