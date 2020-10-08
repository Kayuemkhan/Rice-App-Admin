package code.fortomorrow.riceappadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import code.fortomorrow.riceappadmin.Prevalent.Prevalent;
import io.paperdb.Paper;

public class MainActivity extends AppCompatActivity {
    private Button admin_logout_btn_new_rice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        admin_logout_btn_new_rice = findViewById(R.id.admin_logout_btn_new_rice);
        admin_logout_btn_new_rice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                admin_logout_btn_new();
            }
        });
    }

    private void admin_logout_btn_new() {
        Paper.book().write(Prevalent.UserPhoneKey,"");
        Paper.book().write(Prevalent.UserPasswordKey,"");
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TASK | intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

    public void add_blog_admin(View v){
        startActivity(new Intent(getApplicationContext(),NewRiceCategoryAdd.class));
    }
    public void add_medicine_admin(View v){
        startActivity(new Intent(getApplicationContext(),NewRiceCategoryAdd.class));
    }


}