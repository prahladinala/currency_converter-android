package com.prahladinala.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Spinner sp1, sp2;
    EditText ed1;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        ed1 = findViewById(R.id.txt_amount);
        sp1 = findViewById(R.id.spfrom);
        sp2 = findViewById(R.id.spto);
        btn1 = findViewById(R.id.btn_convert);

        // FROM CURRENCY
        String[] from = {"USD - US Dollar", "INR - India", "EUR - Euro", "GBP - British", "AUD - Australia", "CAD - Canada", "SGD - Singapore", "LKR - Srilanka"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, from);
        sp1.setAdapter(ad);

        // TO CURRENCY
        String[] to = {"INR - India", "USD - US Dollar", "EUR - Euro", "GBP - British", "AUD - Australia", "CAD - Canada", "SGD - Singapore", "LKR - Srilanka"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, to);
        sp2.setAdapter(ad1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double tot;
                Double amount = Double.parseDouble(ed1.getText().toString());
                    //USD
                    if (sp1.getSelectedItem().toString() == "USD - US Dollar" &&
                            sp2.getSelectedItem().toString() == "INR - India") {
                        tot = amount * 74.14;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "USD - US Dollar" &&
                            sp2.getSelectedItem().toString() == "LKR - Srilanka") {
                        tot = amount * 198.97;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "USD - US Dollar" &&
                            sp2.getSelectedItem().toString() == "EUR - Euro") {
                        tot = amount * 0.84;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "USD - US Dollar" &&
                            sp2.getSelectedItem().toString() == "GBP - British") {
                        tot = amount * 0.72;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "USD - US Dollar" &&
                            sp2.getSelectedItem().toString() == "AUD - Australia") {
                        tot = amount * 1.36;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "USD - US Dollar" &&
                            sp2.getSelectedItem().toString() == "CAD - Canada") {
                        tot = amount * 1.25;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "USD - US Dollar" &&
                            sp2.getSelectedItem().toString() == "SGD - Singapore") {
                        tot = amount * 1.35;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    //INR
                    else if (sp1.getSelectedItem().toString() == "INR - India" &&
                            sp2.getSelectedItem().toString() == "LKR - Srilanka") {
                        tot = amount * 2.68;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "INR - India" &&
                            sp2.getSelectedItem().toString() == "USD - US Dollar") {
                        tot = amount * 0.0134;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "INR - India" &&
                            sp2.getSelectedItem().toString() == "EUR - Euro") {
                        tot = amount * 0.0114;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "INR - India" &&
                            sp2.getSelectedItem().toString() == "GBP - British") {
                        tot = amount * 0.0097;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "INR - India" &&
                            sp2.getSelectedItem().toString() == "AUD - Australia") {
                        tot = amount * 0.0097;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "INR - India" &&
                            sp2.getSelectedItem().toString() == "CAD - Canada") {
                        tot = amount * 0.0097;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "INR - India" &&
                            sp2.getSelectedItem().toString() == "SGD - Singapore") {
                        tot = amount * 0.0182;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }


                    // EUR
                    else if (sp1.getSelectedItem().toString() == "EUR - Euro" &&
                            sp2.getSelectedItem().toString() == "LKR - Srilanka") {
                        tot = amount * 235.0318;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "EUR - Euro" &&
                            sp2.getSelectedItem().toString() == "USD - US Dollar") {
                        tot = amount * 1.1781;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "EUR - Euro" &&
                            sp2.getSelectedItem().toString() == "INR - India") {
                        tot = amount * 87.3780;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "EUR - Euro" &&
                            sp2.getSelectedItem().toString() == "GBP - British") {
                        tot = amount * 0.8498;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "EUR - Euro" &&
                            sp2.getSelectedItem().toString() == "AUD - Australia") {
                        tot = amount * 1.6051;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "EUR - Euro" &&
                            sp2.getSelectedItem().toString() == "CAD - Canada") {
                        tot = amount * 1.4783;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "EUR - Euro" &&
                            sp2.getSelectedItem().toString() == "SGD - Singapore") {
                        tot = amount * 1.5972;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    // CAD
                    else if (sp1.getSelectedItem().toString() == "CAD - Canada" &&
                            sp2.getSelectedItem().toString() == "LKR - Srilanka") {
                        tot = amount * 158.9786;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "CAD - Canada" &&
                            sp2.getSelectedItem().toString() == "USD - US Dollar") {
                        tot = amount * 0.7968;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "CAD - Canada" &&
                            sp2.getSelectedItem().toString() == "INR - India") {
                        tot = amount * 59.0985;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "CAD - Canada" &&
                            sp2.getSelectedItem().toString() == "GBP - British") {
                        tot = amount * 0.5747;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "CAD - Canada" &&
                            sp2.getSelectedItem().toString() == "AUD - Australia") {
                        tot = amount * 1.0857;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "CAD - Canada" &&
                            sp2.getSelectedItem().toString() == "EUR - Euro") {
                        tot = amount * 0.6764;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "CAD - Canada" &&
                            sp2.getSelectedItem().toString() == "SGD - Singapore") {
                        tot = amount * 1.0802;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }


                    // AUD
                    else if (sp1.getSelectedItem().toString() == "AUD - Australia" &&
                            sp2.getSelectedItem().toString() == "LKR - Srilanka") {
                        tot = amount * 146.4129;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "AUD - Australia" &&
                            sp2.getSelectedItem().toString() == "USD - US Dollar") {
                        tot = amount * 0.7339;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "AUD - Australia" &&
                            sp2.getSelectedItem().toString() == "INR - India") {
                        tot = amount * 54.4456;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "AUD - Australia" &&
                            sp2.getSelectedItem().toString() == "GBP - British") {
                        tot = amount * 0.5295;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "AUD - Australia" &&
                            sp2.getSelectedItem().toString() == "CAD - Canada") {
                        tot = amount * 0.9210;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "AUD - Australia" &&
                            sp2.getSelectedItem().toString() == "EUR - Euro") {
                        tot = amount * 0.6229;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "AUD - Australia" &&
                            sp2.getSelectedItem().toString() == "SGD - Singapore") {
                        tot = amount * 0.9950;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }


                    // SGD
                    else if (sp1.getSelectedItem().toString() == "SGD - Singapore" &&
                            sp2.getSelectedItem().toString() == "LKR - Srilanka") {
                        tot = amount * 147.1571;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "SGD - Singapore" &&
                            sp2.getSelectedItem().toString() == "USD - US Dollar") {
                        tot = amount * 0.7376;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "SGD - Singapore" &&
                            sp2.getSelectedItem().toString() == "INR - India") {
                        tot = amount * 54.7105;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "SGD - Singapore" &&
                            sp2.getSelectedItem().toString() == "GBP - British") {
                        tot = amount * 0.5322;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "SGD - Singapore" &&
                            sp2.getSelectedItem().toString() == "CAD - Canada") {
                        tot = amount * 0.9257;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "SGD - Singapore" &&
                            sp2.getSelectedItem().toString() == "EUR - Euro") {
                        tot = amount * 0.6261;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "SGD - Singapore" &&
                            sp2.getSelectedItem().toString() == "AUD - Australia") {
                        tot = amount * 1.0050;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }


                    // GBP
                    else if (sp1.getSelectedItem().toString() == "GBP - British" &&
                            sp2.getSelectedItem().toString() == "LKR - Srilanka") {
                        tot = amount * 276.4760;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "GBP - British" &&
                            sp2.getSelectedItem().toString() == "USD - US Dollar") {
                        tot = amount * 1.3858;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "GBP - British" &&
                            sp2.getSelectedItem().toString() == "INR - India") {
                        tot = amount * 102.7939;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "GBP - British" &&
                            sp2.getSelectedItem().toString() == "SGD - Singapore") {
                        tot = amount * 1.8789;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "GBP - British" &&
                            sp2.getSelectedItem().toString() == "CAD - Canada") {
                        tot = amount * 1.7393;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "GBP - British" &&
                            sp2.getSelectedItem().toString() == "EUR - Euro") {
                        tot = amount * 1.1764;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "GBP - British" &&
                            sp2.getSelectedItem().toString() == "AUD - Australia") {
                        tot = amount * 1.8884;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }


                    // LKR
                    else if (sp1.getSelectedItem().toString() == "LKR - Srilanka" &&
                            sp2.getSelectedItem().toString() == "GBP - British") {
                        tot = amount * 0.0036;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "LKR - Srilanka" &&
                            sp2.getSelectedItem().toString() == "USD - US Dollar") {
                        tot = amount * 0.0050;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "LKR - Srilanka" &&
                            sp2.getSelectedItem().toString() == "INR - India") {
                        tot = amount * 0.3717;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "LKR - Srilanka" &&
                            sp2.getSelectedItem().toString() == "SGD - Singapore") {
                        tot = amount * 0.0067;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "LKR - Srilanka" &&
                            sp2.getSelectedItem().toString() == "CAD - Canada") {
                        tot = amount * 0.0062;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "LKR - Srilanka" &&
                            sp2.getSelectedItem().toString() == "EUR - Euro") {
                        tot = amount * 0.0042;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    } else if (sp1.getSelectedItem().toString() == "LKR - Srilanka" &&
                            sp2.getSelectedItem().toString() == "AUD - Australia") {
                        tot = amount * 0.0068;
                        Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                    }

                    // ELSE CONDITION
                    else if (sp1.getSelectedItem().toString() == sp2.getSelectedItem().toString()) {
                        Toast.makeText(getApplicationContext(), amount.toString(), Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Oops!! Something went wrong", Toast.LENGTH_LONG).show();
                    }
                }
        });
    }
}