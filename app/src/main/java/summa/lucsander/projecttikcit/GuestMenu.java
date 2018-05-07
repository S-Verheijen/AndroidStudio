package summa.lucsander.projecttikcit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GuestMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_menu);
    }

    public void showProfile (View view) {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

    public void showMeetingPoints (View view) {
        Intent intent = new Intent(this, MeetingPoints.class);
        startActivity(intent);
    }
}
