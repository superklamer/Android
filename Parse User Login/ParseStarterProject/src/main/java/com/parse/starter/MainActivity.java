/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.parse.starter;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.LogInCallback;
import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseAnonymousUtils;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;
import com.parse.SignUpCallback;

import java.util.List;
import java.util.Random;

// https://docs.bitnami.com/aws/faq/get-started/find-credentials/#option-2-find-password-by-connecting-to-your-application-through-ssh

public class MainActivity extends AppCompatActivity {


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

//      ParseUser.logOut();
//
//      if (ParseUser.getCurrentUser() != null) {
//        Log.i("currentUser", "User logged in " + ParseUser.getCurrentUser().getUsername());
//    } else {
//        Log.i("currentUser", "User not logged in");
//    }



    // Log in user
    /*  ParseUser.logInInBackground("rado", "rado", new LogInCallback() {
          @Override
          public void done(ParseUser user, ParseException e) {
              if (user != null) {
                  Log.i("Login", "Successfull");
              } else {
                  Log.i("Login", "Failed\n" + e.toString());
              }

          }
      });
    */


    //Creating new user
    ParseUser user = new ParseUser();
    user.setUsername("rado");
    user.setPassword("rado");

    user.signUpInBackground(new SignUpCallback() {
        @Override
        public void done(ParseException e) {
            if (e == null) {
                Log.i("Sign up", "Successful");
            } else {
                Log.i("Sing up", "Failed");
            }
        }
    });


    ParseAnalytics.trackAppOpenedInBackground(getIntent());
  }


}