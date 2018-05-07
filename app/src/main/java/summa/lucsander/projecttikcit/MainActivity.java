package summa.lucsander.projecttikcit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startEmployeeLogin(View view) {
        Intent intent = new Intent(this, LoginEmployee.class);
        startActivity(intent);
    }

    public void startGuestLogin(View view) {
        Intent intent = new Intent(this, LoginGuest.class);
        startActivity(intent);
    }
}
