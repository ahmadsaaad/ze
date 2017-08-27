/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaagelexpress.utils;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseCredentials;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahmad
 */
public class FireBaseConnection {

    private static FirebaseAuth zaagelXAuthApp = null;

    private static Object mutex = new Object();

    private FireBaseConnection() {
    }

    public static FirebaseAuth getFirebaseAppInstance() {

        if (zaagelXAuthApp == null) {
            synchronized (mutex) {

                try {
                    FileInputStream serviceAccount = new FileInputStream(Thread.currentThread().getContextClassLoader().getResource("zaagelexpress-firebase-adminsdk-mcd1i-33c66189d0.json").getPath());
                    FirebaseOptions options;

                    options = new FirebaseOptions.Builder()
                            .setCredential(FirebaseCredentials.fromCertificate(serviceAccount))
                            .setDatabaseUrl("https://zaagelexpress.firebaseio.com")
                            .build();
                    FirebaseApp zaagelXApp = FirebaseApp.initializeApp(options);
                    zaagelXAuthApp=FirebaseAuth.getInstance(zaagelXApp);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FireBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FireBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

        return zaagelXAuthApp;
    }

}
