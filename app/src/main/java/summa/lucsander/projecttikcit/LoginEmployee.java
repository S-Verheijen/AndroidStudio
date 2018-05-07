package summa.lucsander.projecttikcit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginEmployee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_employee);
    }

    public void openEmployeeMenu (View view) {
        Intent intent = new Intent(this, EmployeeMenu.class);
        startActivity(intent);
    }
}
