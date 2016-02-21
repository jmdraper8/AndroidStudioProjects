package com.example.jmdra.mynewapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.TextView;


/**
 * Created by jmdra on 1/23/2016.
 */

public class TopSectionFragment extends Fragment {

    private static TextView notePadText;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.top_note_pad_fragment, container, false);

        notePadText = (TextView) view.findViewById(R.id.notePadText);

        return view;
    }

    public void updateNotePad(String button) {

        String noteText = "";

        switch (button) {

            case "Clear":
                notePadText.setText("");
                break;
            case "Return":
                noteText = notePadText.getText().toString();
                notePadText.setText(noteText + "\n");
                break;
            default:
                noteText = notePadText.getText().toString();;
                notePadText.setText(noteText + button);
                break;
        }

    }
}
