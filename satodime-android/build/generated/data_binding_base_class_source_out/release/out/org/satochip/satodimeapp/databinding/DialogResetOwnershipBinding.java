// Generated by view binder compiler. Do not edit!
package org.satochip.satodimeapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.satochip.satodimeapp.R;

public final class DialogResetOwnershipBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView cancelBtn;

  @NonNull
  public final CardView header;

  @NonNull
  public final TextView resetBtn;

  private DialogResetOwnershipBinding(@NonNull RelativeLayout rootView, @NonNull TextView cancelBtn,
      @NonNull CardView header, @NonNull TextView resetBtn) {
    this.rootView = rootView;
    this.cancelBtn = cancelBtn;
    this.header = header;
    this.resetBtn = resetBtn;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogResetOwnershipBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogResetOwnershipBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_reset_ownership, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogResetOwnershipBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cancel_btn;
      TextView cancelBtn = rootView.findViewById(id);
      if (cancelBtn == null) {
        break missingId;
      }

      id = R.id.header;
      CardView header = rootView.findViewById(id);
      if (header == null) {
        break missingId;
      }

      id = R.id.reset_btn;
      TextView resetBtn = rootView.findViewById(id);
      if (resetBtn == null) {
        break missingId;
      }

      return new DialogResetOwnershipBinding((RelativeLayout) rootView, cancelBtn, header,
          resetBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
