// Generated by view binder compiler. Do not edit!
package org.satochip.satodimeapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.satochip.satodimeapp.R;

public final class DialogUninitializedBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView cancelBtn;

  @NonNull
  public final CheckBox checkboxUseTestnet;

  @NonNull
  public final EditText edittextContract;

  @NonNull
  public final EditText edittextEntropyInput;

  @NonNull
  public final EditText edittextTokenid;

  @NonNull
  public final LinearLayout groupContract;

  @NonNull
  public final LinearLayout groupTokenid;

  @NonNull
  public final CardView header;

  @NonNull
  public final Spinner spinnerAssetType;

  @NonNull
  public final Spinner spinnerCoinType;

  @NonNull
  public final TextView textCoinType;

  @NonNull
  public final TextView textContractAddress;

  @NonNull
  public final TextView textEntropyInput;

  @NonNull
  public final TextView textEntropyOutput;

  @NonNull
  public final TextView textNotification;

  @NonNull
  public final TextView textTokenid;

  @NonNull
  public final TextView textUseTestnet;

  @NonNull
  public final TextView transferBtn;

  @NonNull
  public final TextView valueEntropyOutput;

  private DialogUninitializedBinding(@NonNull RelativeLayout rootView, @NonNull TextView cancelBtn,
      @NonNull CheckBox checkboxUseTestnet, @NonNull EditText edittextContract,
      @NonNull EditText edittextEntropyInput, @NonNull EditText edittextTokenid,
      @NonNull LinearLayout groupContract, @NonNull LinearLayout groupTokenid,
      @NonNull CardView header, @NonNull Spinner spinnerAssetType, @NonNull Spinner spinnerCoinType,
      @NonNull TextView textCoinType, @NonNull TextView textContractAddress,
      @NonNull TextView textEntropyInput, @NonNull TextView textEntropyOutput,
      @NonNull TextView textNotification, @NonNull TextView textTokenid,
      @NonNull TextView textUseTestnet, @NonNull TextView transferBtn,
      @NonNull TextView valueEntropyOutput) {
    this.rootView = rootView;
    this.cancelBtn = cancelBtn;
    this.checkboxUseTestnet = checkboxUseTestnet;
    this.edittextContract = edittextContract;
    this.edittextEntropyInput = edittextEntropyInput;
    this.edittextTokenid = edittextTokenid;
    this.groupContract = groupContract;
    this.groupTokenid = groupTokenid;
    this.header = header;
    this.spinnerAssetType = spinnerAssetType;
    this.spinnerCoinType = spinnerCoinType;
    this.textCoinType = textCoinType;
    this.textContractAddress = textContractAddress;
    this.textEntropyInput = textEntropyInput;
    this.textEntropyOutput = textEntropyOutput;
    this.textNotification = textNotification;
    this.textTokenid = textTokenid;
    this.textUseTestnet = textUseTestnet;
    this.transferBtn = transferBtn;
    this.valueEntropyOutput = valueEntropyOutput;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogUninitializedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogUninitializedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_uninitialized, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogUninitializedBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cancel_btn;
      TextView cancelBtn = rootView.findViewById(id);
      if (cancelBtn == null) {
        break missingId;
      }

      id = R.id.checkbox_use_testnet;
      CheckBox checkboxUseTestnet = rootView.findViewById(id);
      if (checkboxUseTestnet == null) {
        break missingId;
      }

      id = R.id.edittext_contract;
      EditText edittextContract = rootView.findViewById(id);
      if (edittextContract == null) {
        break missingId;
      }

      id = R.id.edittext_entropy_input;
      EditText edittextEntropyInput = rootView.findViewById(id);
      if (edittextEntropyInput == null) {
        break missingId;
      }

      id = R.id.edittext_tokenid;
      EditText edittextTokenid = rootView.findViewById(id);
      if (edittextTokenid == null) {
        break missingId;
      }

      id = R.id.group_contract;
      LinearLayout groupContract = rootView.findViewById(id);
      if (groupContract == null) {
        break missingId;
      }

      id = R.id.group_tokenid;
      LinearLayout groupTokenid = rootView.findViewById(id);
      if (groupTokenid == null) {
        break missingId;
      }

      id = R.id.header;
      CardView header = rootView.findViewById(id);
      if (header == null) {
        break missingId;
      }

      id = R.id.spinner_asset_type;
      Spinner spinnerAssetType = rootView.findViewById(id);
      if (spinnerAssetType == null) {
        break missingId;
      }

      id = R.id.spinner_coin_type;
      Spinner spinnerCoinType = rootView.findViewById(id);
      if (spinnerCoinType == null) {
        break missingId;
      }

      id = R.id.text_coin_type;
      TextView textCoinType = rootView.findViewById(id);
      if (textCoinType == null) {
        break missingId;
      }

      id = R.id.text_contract_address;
      TextView textContractAddress = rootView.findViewById(id);
      if (textContractAddress == null) {
        break missingId;
      }

      id = R.id.text_entropy_input;
      TextView textEntropyInput = rootView.findViewById(id);
      if (textEntropyInput == null) {
        break missingId;
      }

      id = R.id.text_entropy_output;
      TextView textEntropyOutput = rootView.findViewById(id);
      if (textEntropyOutput == null) {
        break missingId;
      }

      id = R.id.text_notification;
      TextView textNotification = rootView.findViewById(id);
      if (textNotification == null) {
        break missingId;
      }

      id = R.id.text_tokenid;
      TextView textTokenid = rootView.findViewById(id);
      if (textTokenid == null) {
        break missingId;
      }

      id = R.id.text_use_testnet;
      TextView textUseTestnet = rootView.findViewById(id);
      if (textUseTestnet == null) {
        break missingId;
      }

      id = R.id.transfer_btn;
      TextView transferBtn = rootView.findViewById(id);
      if (transferBtn == null) {
        break missingId;
      }

      id = R.id.value_entropy_output;
      TextView valueEntropyOutput = rootView.findViewById(id);
      if (valueEntropyOutput == null) {
        break missingId;
      }

      return new DialogUninitializedBinding((RelativeLayout) rootView, cancelBtn,
          checkboxUseTestnet, edittextContract, edittextEntropyInput, edittextTokenid,
          groupContract, groupTokenid, header, spinnerAssetType, spinnerCoinType, textCoinType,
          textContractAddress, textEntropyInput, textEntropyOutput, textNotification, textTokenid,
          textUseTestnet, transferBtn, valueEntropyOutput);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
