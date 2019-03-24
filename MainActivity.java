package oshin.tasnuva.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseReference = FirebaseDatabase.getInstance().getReference().child("Users");


     UserData userData = new UserData("Mr Kabir","32");

     databaseReference.setValue(userData);


        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("like","Facebook");
        hashMap.put("hoby","Programming");

        databaseReference.setValue(hashMap);
    }
}
