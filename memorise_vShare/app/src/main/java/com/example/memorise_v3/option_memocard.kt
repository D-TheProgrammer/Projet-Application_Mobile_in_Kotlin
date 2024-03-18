package com.example.memorise_v3

import android.app.AlarmManager
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.icu.util.Calendar
import android.os.Build
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.Toast
import androidx.core.content.getSystemService
import com.example.memorise_v3.databinding.ActivityOptionMemocardBinding
import com.google.android.material.textfield.MaterialAutoCompleteTextView
import com.google.android.material.textfield.TextInputLayout
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat

class OptionMemocard : AppCompatActivity() {

    private lateinit var binding: ActivityOptionMemocardBinding
    private lateinit var picker: MaterialTimePicker
    private lateinit var calendar: Calendar
    private lateinit var alarmManager: AlarmManager
    private lateinit var pendingIntent: PendingIntent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOptionMemocardBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val items_intervalle = listOf("1 jour","2 jours","3 jours" ,"7 jours","21 jours","30 jours" )

        val autoCompleteTextView_intervalle = findViewById<AutoCompleteTextView>(R.id.interv_AutoCompleteText)
        val adapter_intervalle = ArrayAdapter(this,R.layout.intervalle_list_item,items_intervalle)

        autoCompleteTextView_intervalle.setAdapter(adapter_intervalle)
        autoCompleteTextView_intervalle.onItemClickListener= AdapterView.OnItemClickListener {
                adapterView, view, position, id ->
            val item_selectionnee = adapterView.getItemAtPosition(position)
            Toast.makeText(this,"Intervalle selectionnée : $item_selectionnee", Toast.LENGTH_SHORT).show()
        }


        binding.selectionTempsButton.setOnClickListener {
            montrerTimePicker()
        }

        binding.enclencherAlarmButton.setOnClickListener {
            enclencherAlarme()
        }

        binding.annulerAlarmButton.setOnClickListener {
            annulerAlarme()
        }

        creerNotificationChannel()

        val buttonPageMain_option = findViewById<Button>(R.id.buttonRevenirHome_Option)
        buttonPageMain_option.setOnClickListener {
            (applicationContext as Main_DEBUT_APP).goToMain_debut_appActivity()
        }
        val buttonLogo_option = findViewById<Button>(R.id.buttonLogoMemorise_option)
        buttonLogo_option.setOnClickListener {

            (applicationContext as Main_DEBUT_APP).goToMain_debut_appActivity()
        }
    }

    private fun annulerAlarme() {

        alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
        val intent = Intent(this, AlarmeReceiver::class.java)
        pendingIntent = PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_IMMUTABLE)
        alarmManager.cancel(pendingIntent)
        Toast.makeText(this, "Alarme Supprimer !!", Toast.LENGTH_SHORT).show()
    }

    private fun enclencherAlarme() {

        alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
        val intent = Intent(this, AlarmeReceiver::class.java)
        pendingIntent = PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_IMMUTABLE)
        alarmManager.setRepeating(
            AlarmManager.RTC_WAKEUP, calendar.timeInMillis,
            AlarmManager.INTERVAL_DAY, pendingIntent
        )
        Toast.makeText(this, "Alarme Regler !!", Toast.LENGTH_SHORT).show()
    }

    private fun montrerTimePicker() {

        picker = MaterialTimePicker.Builder()
            .setTimeFormat(TimeFormat.CLOCK_24H)
            .setHour(23)
            .setMinute(0)
            .setTitleText("Choisissez Une Heure pour la Notification")
            .build()

        picker.show(supportFragmentManager, "alarme")
        picker.addOnPositiveButtonClickListener {

            binding.tempsSelectionne.text =
                String.format("%02d", picker.hour) + " : " + String.format(
                    "%02d",
                    picker.minute
                )

            calendar = Calendar.getInstance()
            calendar[Calendar.HOUR_OF_DAY] = picker.hour
            calendar[Calendar.MINUTE] = picker.minute
            calendar[Calendar.SECOND] = 0
            calendar[Calendar.MILLISECOND] = 0
        }
    }

    private fun creerNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name: CharSequence = "alarmeReminderChannel"
            val description = "Channel pour les notification"
            val importance = NotificationManager.IMPORTANCE_HIGH
            val channel = NotificationChannel("alarme", name, importance)
            channel.description = description
            val notificationManager =
                getSystemService(NotificationManager::class.java)
            notificationManager.createNotificationChannel(channel)
        }
    }
}
