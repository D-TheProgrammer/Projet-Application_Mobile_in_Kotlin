package com.example.memorise_v3

import android.Manifest
import android.annotation.SuppressLint
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat

// On va utiliser cette classe pour envoyer des notifications lorsque l'application est fermée
class AlarmeReceiver : BroadcastReceiver() {

    //@SuppressLint("MissingPermission")
    override fun onReceive(context: Context?, intent: Intent?) {
        val i = Intent(context, Main_DEBUT_APP::class.java)
        intent!!.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        val pendingIntent = PendingIntent.getActivity(context, 0, i,PendingIntent.FLAG_IMMUTABLE)

        val builder = NotificationCompat.Builder(context!!, "alarme")
            .setSmallIcon(R.drawable.ic_launcher_background)
            .setContentTitle("MemoRise")
            .setContentText("Il est temps de reprendre la révision !!!")
            .setAutoCancel(true)
            .setDefaults(NotificationCompat.DEFAULT_ALL)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setContentIntent(pendingIntent)


        val notificationManager = NotificationManagerCompat.from(context)
        if (ActivityCompat.checkSelfPermission(
                context,
                Manifest.permission.POST_NOTIFICATIONS
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.

            if (context is AppCompatActivity) {
                ActivityCompat.requestPermissions(
                    context,
                    arrayOf(Manifest.permission.POST_NOTIFICATIONS),
                    123 //
                )
            }
            return
        }
        notificationManager.notify(123, builder.build())
    }
}
