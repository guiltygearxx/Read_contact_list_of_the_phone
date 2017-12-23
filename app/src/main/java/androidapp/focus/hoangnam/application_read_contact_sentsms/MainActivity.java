package androidapp.focus.hoangnam.application_read_contact_sentsms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private int[] arrayColor = {
            R.color.red, R.color.pink, R.color.purple, R.color.black, R.color.blue, R.color.green,
            R.color.yellow, R.color.orange, R.color.brown, R.color.grey, R.color.white};

    private String[] arrayNameColorVN = {
            "Nam", "Hồng", "Hoàng", "Ngọc", "Dương", "Nhung", "Hà", "Cam",
            "Phương", "Thảo", "Thiện"
    };

    ListView lv_contact;

    ContactAdapter contactAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactAdapter = new ContactAdapter(this,arrayNameColorVN,arrayColor);
        lv_contact = findViewById(R.id.lv_contact);

        lv_contact.setAdapter(contactAdapter);


    }


}
