// Generated by view binder compiler. Do not edit!
package com.cs2340.towerjackets.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cs2340.towerjackets.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class InitialConfigBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button continueButton;

  @NonNull
  public final Spinner difficultySpinner;

  @NonNull
  public final EditText promptForName;

  @NonNull
  public final TextView selectDifficulty;

  @NonNull
  public final TextView welcomeMessage;

  private InitialConfigBinding(@NonNull ConstraintLayout rootView, @NonNull Button continueButton,
      @NonNull Spinner difficultySpinner, @NonNull EditText promptForName,
      @NonNull TextView selectDifficulty, @NonNull TextView welcomeMessage) {
    this.rootView = rootView;
    this.continueButton = continueButton;
    this.difficultySpinner = difficultySpinner;
    this.promptForName = promptForName;
    this.selectDifficulty = selectDifficulty;
    this.welcomeMessage = welcomeMessage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static InitialConfigBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static InitialConfigBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.initial_config, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static InitialConfigBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.continueButton;
      Button continueButton = ViewBindings.findChildViewById(rootView, id);
      if (continueButton == null) {
        break missingId;
      }

      id = R.id.difficultySpinner;
      Spinner difficultySpinner = ViewBindings.findChildViewById(rootView, id);
      if (difficultySpinner == null) {
        break missingId;
      }

      id = R.id.promptForName;
      EditText promptForName = ViewBindings.findChildViewById(rootView, id);
      if (promptForName == null) {
        break missingId;
      }

      id = R.id.selectDifficulty;
      TextView selectDifficulty = ViewBindings.findChildViewById(rootView, id);
      if (selectDifficulty == null) {
        break missingId;
      }

      id = R.id.welcomeMessage;
      TextView welcomeMessage = ViewBindings.findChildViewById(rootView, id);
      if (welcomeMessage == null) {
        break missingId;
      }

      return new InitialConfigBinding((ConstraintLayout) rootView, continueButton,
          difficultySpinner, promptForName, selectDifficulty, welcomeMessage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
