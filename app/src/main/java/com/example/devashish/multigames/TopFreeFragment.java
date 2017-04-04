package com.example.devashish.multigames;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.view.View.OnClickListener;
import android.widget.Toast;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public  class TopFreeFragment extends Fragment {

    Button b_rock, b_paper, b_scissors;
    ImageView iv_cpu, iv_me;

    String myChoise,cpuChoise,result ;

    Random r;


    LinearLayout linearLayout;

@Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_top_free, container, false);
        linearLayout = (LinearLayout) v.findViewById(R.id.my_Free);

        iv_cpu = (ImageView) v.findViewById(R.id.iv_cpu);

        iv_me = (ImageView) v.findViewById(R.id.iv_me);

        b_rock = (Button) v.findViewById(R.id.b_rock);


        b_paper = (Button) v.findViewById(R.id.b_paper);


        b_scissors = (Button) v.findViewById(R.id.b_scissors);

        r=new Random();


        b_rock.setOnClickListener(new View.OnClickListener(){
        @Override
                public void onClick(View v){
            myChoise="rock";
            iv_me.setImageResource(R.drawable.rock);
            calculate();

        }


        });


        b_paper.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v){

                        myChoise="paper";
                iv_me.setImageResource(R.drawable.paper);
                calculate();
                }

    });

        b_scissors.setOnClickListener(new View.OnClickListener(){
            @Override

        public void onClick(View v){

                     myChoise="scissors";
                iv_me.setImageResource(R.drawable.scissors);
                calculate();
        }

});
        return v;

    }





  /*  public TopFreeFragment() {
        // Required empty public constructor
    }*/

    public void calculate(){
        int cpu =r.nextInt(3);
        if (cpu == 0) {
            cpuChoise = "rock";
            iv_cpu.setImageResource(R.drawable.rock);
        }else if (cpu==1) {
            cpuChoise = "paper";
            iv_cpu.setImageResource(R.drawable.paper);
        }else  if (cpu==2){
            cpuChoise = "scissors";
            iv_cpu.setImageResource(R.drawable.scissors);
        }
        if (myChoise.equals("rock") && cpuChoise.equals("paper")){

            result ="lost the game";
        }else

        if (myChoise.equals("rock") && cpuChoise.equals("scissors")){

            result ="won the game";
        }else
        if (myChoise.equals("paper") && cpuChoise.equals("rock")){

            result ="won the game";
        }else

        if (myChoise.equals("paper") && cpuChoise.equals("scissor")){
            result ="lost the game";
        }else
        if (myChoise.equals("scissors") && cpuChoise.equals("paper")){

            result ="won the game";
        }else

        if (myChoise.equals("scissors") && cpuChoise.equals("rock")){

            result ="lost the game";
        }else
        if (myChoise.equals("scissors") && cpuChoise.equals("scissors")){

            result ="Draw";
        }else
        if (myChoise.equals("rock") && cpuChoise.equals("rock")){

            result ="Draw";
        }else
        if (myChoise.equals("paper") && cpuChoise.equals("paper")){

            result ="Draw";
        }
        Toast.makeText(TopFreeFragment.this.getActivity(),result,Toast.LENGTH_LONG).show();
    }


    public TopFreeFragment() {
        // Required empty public constructor
    }

}




