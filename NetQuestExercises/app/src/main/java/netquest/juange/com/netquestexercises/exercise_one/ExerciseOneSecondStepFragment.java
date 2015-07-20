package netquest.juange.com.netquestexercises.exercise_one;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;
import java.text.SimpleDateFormat;
import java.util.Date;
import netquest.juange.com.netquestexercises.R;
import netquest.juange.com.netquestexercises.base.BaseFragment;

/**
 * Created by juange on 18/7/15.
 */
public class ExerciseOneSecondStepFragment extends BaseFragment {

    public static final String ARG_NAME = "arg.name";

    @Bind(R.id.txt_welcome)
    TextView txtWelcome;

    @Bind(R.id.txt_time)
    TextView txtTime;

    private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
    private Handler handler = new Handler();

    public ExerciseOneSecondStepFragment() {}

    public static ExerciseOneSecondStepFragment newInstance(String name) {
        ExerciseOneSecondStepFragment fragment = new ExerciseOneSecondStepFragment();
        Bundle arguments = new Bundle();
        arguments.putString(ARG_NAME, name);
        fragment.setArguments(arguments);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View containerView = inflater.inflate(R.layout.fragment_exercise_one_step_two, container, false);
        ButterKnife.bind(this, containerView);
        return containerView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (getArguments() == null) {
            throw new IllegalStateException("You should have used Fragment.newInstance()");
        } else {
            String name = getArguments().getString(ARG_NAME);
            txtWelcome.setText(getActivity().getResources().getString(R.string.welcome_name_text, name));
        }

        updateTime();

        handler.postDelayed(runnable, 200);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        handler.removeCallbacksAndMessages(null);
        ButterKnife.unbind(this);
    }

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            updateTime();
            handler.postDelayed(this, 200);
        }
    };

    private void updateTime() {
        final String dateString = format.format(new Date());
        txtTime.setText(getActivity().getResources().getString(R.string.welcome_time_text, dateString));
    }
}
