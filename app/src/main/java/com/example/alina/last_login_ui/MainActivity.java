package com.example.alina.last_login_ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

//import android.widget.ListView;

//import android.widget.ListView;


public class MainActivity extends AppCompatActivity {
    Button you_do_not;
    Button forgot_password;
    Button sign_up;
    Button log_in;
    FrameLayout frame_Layout3;
    ListView list_of_suppliers;
    String[] names_of_suppliers;
    RecyclerView recycler;
    ImageButton search_button;
    DataAdapter adapter;


    List<Point> points = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.list );

      /*  recycler = (RecyclerView) findViewById(R.id.recycler1);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        recycler.setLayoutManager(llm); */

        setInitialData();
        RecyclerView recyclerView = (RecyclerView) findViewById( R.id.list1 );
        // создаем адаптер
        DataAdapter adapter = new DataAdapter( this, points );
        // устанавливаем для списка адаптер
        recyclerView.setAdapter( adapter );


    }




        /*
        list_of_suppliers =  (ListView) findViewById(R.id.List_of_suppliers);
// Создаем адаптер
        ArrayAdapter<CharSequence> adapter_for_list = ArrayAdapter.createFromResource(
                this, R.array.names_of_suppliers, R.layout.my_list_item);
       // ArrayAdapter <String> adapter_for_list = new ArrayAdapter<String>(this, R.layout.my_list_item, R.array.names_of_suppliers);
// Присваиваем адаптер списку
        list_of_suppliers.setAdapter(adapter_for_list);
//обработка состояний прокрутки
        list_of_suppliers.setOnScrollListener(new AbsListView.OnScrollListener() {
            public void onScrollStateChanged(AbsListView view, int scrollState) {

            }
//обработка прокрутки
            public void onScroll(AbsListView view, int firstVisibleItem,
                                 int visibleItemCount, int totalItemCount) {

            }
        });
*/



/*
        // list_layout
        search_button = (ImageButton) findViewById( R.id.imageButton_button_search );

        final Animation animAlpha1 = AnimationUtils.loadAnimation(this, R.anim. translate);
        View.OnClickListener push_you_do_not1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                search_button.startAnimation(animAlpha1);


            }
        };
        search_button.setOnClickListener(push_you_do_not1); // присваиваем  обработчик кнопке
        /*








        you_do_not = (Button) findViewById(R.id.button_You_do_not);
        forgot_password = (Button) findViewById(R.id.button_forgot_password);
        sign_up = (Button) findViewById(R.id.button_SIGN_UP);
        log_in = (Button) findViewById(R.id.button_log_in);
        frame_Layout3 = (FrameLayout) findViewById(R.id.frameLayout3);


      final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.alpha);
        View.OnClickListener push_you_do_not = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                you_do_not.startAnimation(animAlpha);
                sign_up.startAnimation(animAlpha);

            }
        };

        final Animation animRotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
        View.OnClickListener push_forgot_password = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forgot_password.startAnimation(animRotate);

            }
        };

      final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.alpha);
        View.OnClickListener push_sign_up = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_up.startAnimation(animScale);
                you_do_not.startAnimation(animAlpha);

            }
        };

        final Animation animAlpha2 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        View.OnClickListener push_frame_Layout3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frame_Layout3.startAnimation(animAlpha2);

            }
        };

        final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.translate);
        View.OnClickListener push_log_in = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                log_in.startAnimation(animTranslate);

            }
        };

        you_do_not.setOnClickListener(push_you_do_not); // присваиваем  обработчик кнопке
        forgot_password.setOnClickListener(push_forgot_password); // присваиваем  обработчик кнопке
        sign_up.setOnClickListener(push_sign_up); // присваиваем  обработчик кнопке
        log_in.setOnClickListener(push_log_in); // присваиваем  обработчик кнопке
        frame_Layout3.setOnClickListener(push_frame_Layout3); // присваиваем  обработчик кнопке



*/

    private void setInitialData() {

        points.add( new Point( "Very_long_point_name_892783624545454634343423424234234234", "3,18 km.", true ) );
        points.add( new Point( "Very_long_point_name_892783624545454634343423424234234234", "3,18 km.", true ) );
        points.add( new Point( "Very_long_point_name_892783624545454634343423424234234234", "3,18 km.", false ) );
        points.add( new Point( "Very_long_point_name_892783624545454634343423424234234234", "3,18 km.", true ) );
        points.add( new Point( "Very_long_point_name_892783624545454634343423424234234234", "3,18 km.", true ) );
        points.add( new Point( "Very_long_point_name_892783624545454634343423424234234234", "3,18 km.", false ) );
        points.add( new Point( "Very_long_point_name_892783624545454634343423424234234234", "3,18 km.", false ) );
        points.add( new Point( "Very_long_point_name_892783624545454634343423424234234234", "3,18 km.", true ) );
        points.add( new Point( "Very_long_point_name_892783624545454634343423424234234234", "3,18 km.", true ) );
    }

}