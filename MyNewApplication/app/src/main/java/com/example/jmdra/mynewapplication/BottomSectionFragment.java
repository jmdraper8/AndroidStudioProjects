package com.example.jmdra.mynewapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;


public class BottomSectionFragment extends Fragment implements View.OnClickListener {

    BottomSectionListener activityCommander;
    private int shiftCommand = 0;

    public interface BottomSectionListener {

        public void keyCommand(String button);

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        try {
            activityCommander = (BottomSectionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.bottom_keys_fragment, container, false);


        /* Set Alphabeth buttons and onClick Listener for buttons */
        Button aButton = (Button) view.findViewById(R.id.aButton);
        aButton.setOnClickListener(this); // calling onClick() method
        Button bButton = (Button) view.findViewById(R.id.bButton);
        bButton.setOnClickListener(this); // calling onClick() method
        Button cButton = (Button) view.findViewById(R.id.cButton);
        cButton.setOnClickListener(this); // calling onClick() method
        Button dButton = (Button) view.findViewById(R.id.dButton);
        dButton.setOnClickListener(this); // calling onClick() method
        Button eButton = (Button) view.findViewById(R.id.eButton);
        eButton.setOnClickListener(this); // calling onClick() method
        Button fButton = (Button) view.findViewById(R.id.fButton);
        fButton.setOnClickListener(this); // calling onClick() method
        Button gButton = (Button) view.findViewById(R.id.gButton);
        gButton.setOnClickListener(this); // calling onClick() method
        Button hButton = (Button) view.findViewById(R.id.hButton);
        hButton.setOnClickListener(this); // calling onClick() method
        Button iButton = (Button) view.findViewById(R.id.iButton);
        iButton.setOnClickListener(this); // calling onClick() method
        Button jButton = (Button) view.findViewById(R.id.jButton);
        jButton.setOnClickListener(this); // calling onClick() method
        Button kButton = (Button) view.findViewById(R.id.kButton);
        kButton.setOnClickListener(this); // calling onClick() method
        Button lButton = (Button) view.findViewById(R.id.lButton);
        lButton.setOnClickListener(this); // calling onClick() method
        Button mButton = (Button) view.findViewById(R.id.mButton);
        mButton.setOnClickListener(this); // calling onClick() method
        Button nButton = (Button) view.findViewById(R.id.nButton);
        nButton.setOnClickListener(this); // calling onClick() method
        Button oButton = (Button) view.findViewById(R.id.oButton);
        oButton.setOnClickListener(this); // calling onClick() method
        Button pButton = (Button) view.findViewById(R.id.pButton);
        pButton.setOnClickListener(this); // calling onClick() method
        Button qButton = (Button) view.findViewById(R.id.qButton);
        qButton.setOnClickListener(this); // calling onClick() method
        Button rButton = (Button) view.findViewById(R.id.rButton);
        rButton.setOnClickListener(this); // calling onClick() method
        Button sButton = (Button) view.findViewById(R.id.sButton);
        sButton.setOnClickListener(this); // calling onClick() method
        Button tButton = (Button) view.findViewById(R.id.tButton);
        tButton.setOnClickListener(this); // calling onClick() method
        Button uButton = (Button) view.findViewById(R.id.uButton);
        uButton.setOnClickListener(this); // calling onClick() method
        Button vButton = (Button) view.findViewById(R.id.vButton);
        vButton.setOnClickListener(this); // calling onClick() method
        Button wButton = (Button) view.findViewById(R.id.wButton);
        wButton.setOnClickListener(this); // calling onClick() method
        Button xButton = (Button) view.findViewById(R.id.xButton);
        xButton.setOnClickListener(this); // calling onClick() method
        Button yButton = (Button) view.findViewById(R.id.yButton);
        yButton.setOnClickListener(this); // calling onClick() method
        Button zButton = (Button) view.findViewById(R.id.zButton);
        zButton.setOnClickListener(this); // calling onClick() method

        /* Set the commands buttons and onClick Listener */
        Button clearButton = (Button) view.findViewById(R.id.clearButton);
        clearButton.setOnClickListener(this); // calling onClick() method
        Button returnButton = (Button) view.findViewById(R.id.returnButton);
        returnButton.setOnClickListener(this); // calling onClick() method
        Button shiftButton = (Button) view.findViewById(R.id.shiftButton);
        shiftButton.setOnClickListener(this); // calling onClick() method

        return view;
    }



    @Override
    public void onClick(View v) {



        switch (v.getId()) {

            case R.id.aButton:
                if (shiftCommand == 1) {
                    activityCommander.keyCommand("A");
                } else {
                    activityCommander.keyCommand("a");
                }
                break;

            case R.id.bButton:
                if (shiftCommand == 1) {
                    activityCommander.keyCommand("B");
                } else {
                    activityCommander.keyCommand("b");
                }
                break;

            case R.id.cButton:
                if (shiftCommand == 1) {
                    activityCommander.keyCommand("C");
                } else {
                    activityCommander.keyCommand("c");
                }
                break;

            case R.id.dButton:
                if (shiftCommand == 1) {
                    activityCommander.keyCommand("D");
                } else {
                    activityCommander.keyCommand("d");
                }
                break;

            case R.id.clearButton:
                activityCommander.keyCommand("Clear");
                break;

            case R.id.returnButton:
                activityCommander.keyCommand("Return");
                break;

            case R.id.shiftButton:
                if (shiftCommand == 0) {
                    shiftCommand = 1;
                } else {
                    shiftCommand = 0;
                }
                break;

            default:
                break;
        }

    }
}
