package garymizner.vet2vet;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    Button bLogout, bMap;
    EditText etName, etBranchofservice, etUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText) findViewById(R.id.etName);
        etBranchofservice = (EditText) findViewById(R.id.etBranchofservice);
        etUsername = (EditText) findViewById(R.id.etUsername);
        bLogout = (Button) findViewById(R.id.bLogout);
        bMap = (Button) findViewById(R.id.bMap);

        bLogout.setOnClickListener(this);
        bMap.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.bLogout:

                startActivity(new Intent(this, Login.class));

                break;
            case R.id.bMap:

                break;
        }
    }
}
