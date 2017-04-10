package chilijie.baway.com.chilijie1502l20170410;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CustomCircle mRoundProgressBa2;
    private Button button1,button2;
    private int progress = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            // CustomView cv= (CustomView) findViewById(R.id.cv);
            mRoundProgressBa2 = (CustomCircle) findViewById(R.id.cc);
            button1= (Button) findViewById(R.id.button1);
            button2= (Button) findViewById(R.id.button2);
            button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while(progress <= 100){
                            progress += 3;
                            mRoundProgressBa2.setProgress(progress);
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();
                break;
            case R.id.button2:
                progress=0;
                mRoundProgressBa2.setProgress(progress);
                break;
        }
    }
}
