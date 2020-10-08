package code.fortomorrow.riceappadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class NewRiceCategoryAdd extends AppCompatActivity {
    private ImageView najirshal, minikate, br28;


    private Button LogoutBtn,CheckOrdersBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_rice_category_add);

        LogoutBtn = findViewById(R.id.admin_logout_btn);
        CheckOrdersBtn = findViewById(R.id.check_orders_btn);

        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TASK | intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });
        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(getApplicationContext(),AdminNewOrdersActivity.class);
                // startActivity(intent);

            }
        });
        najirshal = findViewById(R.id.t_shirts);
        minikate =  findViewById(R.id.sports_t_shirts);
        br28 =  findViewById(R.id.female_dresses);


        najirshal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AdminAddNewProductActivity.class);
                intent.putExtra("category", "Najirshal");
                startActivity(intent);
            }
        });


        minikate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AdminAddNewProductActivity.class);
                intent.putExtra("category", "Minikate");
                startActivity(intent);
            }
        });


        br28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AdminAddNewProductActivity.class);
                intent.putExtra("category", "BR 28");
                startActivity(intent);
            }
        });

    }
}