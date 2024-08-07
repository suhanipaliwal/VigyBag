// Generated by view binder compiler. Do not edit!
package com.example.vigybag.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.vigybag.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ProgressDialogBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView tvMessage;

  private ProgressDialogBinding(@NonNull CardView rootView, @NonNull ProgressBar progressBar,
      @NonNull TextView tvMessage) {
    this.rootView = rootView;
    this.progressBar = progressBar;
    this.tvMessage = tvMessage;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ProgressDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ProgressDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.progress_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ProgressDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.tvMessage;
      TextView tvMessage = ViewBindings.findChildViewById(rootView, id);
      if (tvMessage == null) {
        break missingId;
      }

      return new ProgressDialogBinding((CardView) rootView, progressBar, tvMessage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
