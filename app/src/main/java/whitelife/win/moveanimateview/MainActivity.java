package whitelife.win.moveanimateview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import whitelife.win.moveanimator.MoveAnimateView;

public class MainActivity extends AppCompatActivity {


    MoveAnimateView moveAnimateView;

    View animatorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moveAnimateView=new MoveAnimateView(this);

        animatorView=getLayoutInflater().inflate(R.layout.animview, (ViewGroup) moveAnimateView.getContentView(),false);

    }

    public void start(View v){
        moveAnimateView.startAnimate(findViewById(R.id.v1),findViewById(R.id.v2),animatorView,getWindow().getDecorView());
    }
}
