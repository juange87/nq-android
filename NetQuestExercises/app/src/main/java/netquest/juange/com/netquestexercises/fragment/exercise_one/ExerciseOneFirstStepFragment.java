package netquest.juange.com.netquestexercises.fragment.exercise_one;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import netquest.juange.com.netquestexercises.R;
import netquest.juange.com.netquestexercises.base.BaseFragment;

/**
 * Created by juange on 18/7/15.
 */
public class ExerciseOneFirstStepFragment extends BaseFragment {

    @Bind(R.id.edtxt_name)
    EditText edTxtName;

    public ExerciseOneFirstStepFragment() {}

    public static ExerciseOneFirstStepFragment newInstance() {
        return new ExerciseOneFirstStepFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View containerView = inflater.inflate(R.layout.fragment_exercise_one_step_one, container, false);
        ButterKnife.bind(this, containerView);
        return containerView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnClick(R.id.btn_submit)
    public void onSubmitClick() {
        final String enteredText = edTxtName.getText().toString().trim();
        if ("".equalsIgnoreCase(enteredText)) {
            Toast.makeText(getActivity(), R.string.alert_message, Toast.LENGTH_LONG).show();
        } else {
            getMainActivity().replaceFragment(ExerciseOneSecondStepFragment.newInstance(enteredText));
        }
    }
}
