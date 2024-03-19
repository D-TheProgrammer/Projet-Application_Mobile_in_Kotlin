# Project-Mobile_Application_in_Kotlin
[French] Projet d'une Application Mobile nommé MemoRise (le fichier Readme en français se trouve dans le fichier appelé `README`)  
[English] Mobile Application Project called MemoRise (the French Readme is in the file called `README`)  

<div align="center">
   <img width="223" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/7f9cae5d-be46-4496-9621-daedca19b6b4">
</div>

#### SOMMAIRE / SUMMARY
- [Presentation in English / Présentation en anglais](#english-presentation)
- [Preparing to use the application / Préparation à l'utilisation de l'application](#preparing-to-use-the-application)
- [Using the app - Tutorial / Utilisation de l'application - Tutoriel](#using-the-application---tutorial)

## [ENGLISH PRESENTATION]
This file constitutes a final project in Mobile Development done by D-TheProgrammer

For this project is an application promoting memorization through the use of cards called “MemoRise”.

### 1. <ins>What is “MemoRise”?</ins>
MemoRise is an application inspired by AnkiApp, a flashcard application allowing the user to review their knowledge interactively. With MemoRise, the user creates learning cards, called "MemoCards", in the form of blank text, for example. In addition, statistics are available to track your progress.

Unlike AnkiApp, MemoRise is free on mobile and offers a more ergonomic and aesthetic interface. It was to fill these gaps and offer a more mobile-friendly experience that we decided to create MemoRise.

### 2. <ins>What is "Kotlin"?</ins>
Kotlin was a major part of this project, providing a smooth and dynamic development experience for Android apps. Using Kotlin, we were able to implement various mechanisms, such as page switching and function calling, while customizing elements in the XML files.

XML, or Extensible Markup Language, files are used to structure data in a human- and machine-readable manner, particularly to define the user interface of Android applications. With Android Studio, developers can create XML layouts interactively, by dragging and dropping graphical components and setting visual properties. This approach makes it easy to design the user interface quickly and efficiently, without having to manually write all the XML code. It is with all this flexibility that we were able to develop our Memorise application.


### 3. <ins>What does the folder contain </ins>
This folder contains:
- The Readme folder you are reading
- The project file
- the APK of the project (in the Release folder of the .zip)


## [Preparing to use the application]
#### STEP 1: Open the app in Android Studio

<div align="center">
   <img width="235" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/e8a6fd8d-6fda-4ead-9861-bcc6041dbb4a">
</div>

#### STEP 2: Once imported, accept the new SDK path or add it manually in the `local.properties` file.
<div align="center">
   <img width="487" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/b35eb59b-bc00-451a-87a5-8647131ec012">
</div>

#### STEP 3: Let the build happen or Gradle prepare
At the bottom of the screen, the loading bar is displayed.

<div align="center">
   <img width="591" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/656b7c48-78a3-4b03-80b6-34f50638c1cd">
</div>

#### STEP 4: Choose the Device to launch the application
<div align="center">
   <img width="189" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/b63725d3-9159-4239-ab55-107c69db484a">
</div>

#### STEP 5: Open the device explorer
<div align="center">
   <img width="190" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/2cbc3879-a73b-4967-89ed-f5086356977d">
</div>

#### STEP 6: Launch the app on Android Studio by tapping the green arrow (this may take a while)
<div align="center">
  <img width="333" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/b9cac469-bb85-48a6-a51f-6b49a526d2dd">
</div>


## [Using the application - Tutorial]
#### STEP 1: The _"Accueil"_ page (Home page)
The home page of our application is the first interface that the user encounters. It provides easy access to different sections of the application, including create, learning, collection and options, through clear buttons. This central page is essential as it serves as a starting point to access all the other features of the application.

<div align="center">
   <img width="171" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/51384122-e927-46ee-9c9f-2204b88e023f">
</div>

#### STEP 2: The _"Creation"_ Page of the application
The app allows the user to create and review flashcards to check their knowledge. By writing in the boxes, he can create “MemoCards” with personalized questions, called “MemoQuestions”, accompanied by descriptions and themes. These MemoCards are displayed in a horizontal carousel on the Collection page. The page also offers three buttons: one to return to the home page, one to validate the creation of the MemoCard, and a third button hidden in the application logo, which also takes you back to the main page.

<div align="center">
   <img width="146" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/f3c73dcf-8dbc-4b5a-a5fa-7d478ef16604">
   <img width="167" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/5637a7f3-7e75-4f91-b2c4-3853a175be1a">
</div>

#### STEP 3: The _"Collection"_ page
This page presents all the MemoCards created, organized by theme and titled. Each card comes with a checkbox to indicate if it has been learned. In case of several cards, it is possible to scroll horizontally to view them. A button allows you to return to the main menu.

<div align="center">
   <img width="277" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/d9b7fad2-ee20-4825-8e0c-528c1d0c574d">
</div>

#### STEP 4: _"MemoCard Unique"_ page of the application
This page allows the user to access their MemoCards to review them before a test. By clicking on a MemoCard in the list, a dynamic page opens because each MemoCard is unique. The user can perform several actions:

- Delete the MemoCard by tapping the trash can icon.
- Indicate that he has learned it by checking the corresponding box and validating.
- Modify the MemoCard by changing its content and pressing "Validate".
- He can also do nothing and press "Validate" to keep the card as is.

Once the changes are made, they are applied to the dynamic list on the Collection page.

<div align="center">
   <img width="647" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/57eebc6d-f219-467a-bc72-5f5b53bc1c39">
</div>



#### STEP 5: _"Révision"_ page (learning page)
On this page, the user answers the MemoCard questions. The question is displayed at the top, and the user can answer by writing in the space provided at the bottom. To save the answers, the user must press the validation button.

<div align="center">
   <img width="216" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/de4d6273-c23c-4164-8bd8-cc14be8c4497">
</div>

#### STEP 6: _"Options"_ page
The options page offers three settings:

- The _"mémorisation journalière"_ (daily memorization): the user can directly enter the number of cards to review per series.
- The _"intervalle de mémorisation"_ (memorization interval): a drop-down menu allows you to choose the frequency of reappearance of the cards.
- The  _modification de l'heure d'envoi des notifications_ (modification of the sending time of notifications)

<div align="center">
   <img width="149" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/e00e58ca-bbac-4b0b-b5c2-a2fe79065e6d">
</div>

User can set notification time by tapping "Sélection heure notification" (Notification time selection). An interactive box then appears, allowing the user to choose the desired time, optionally using a clock.

<div align="center">
   <img width="588" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/17d50956-7095-46e1-a729-e1442bd91588">
</div>

Once the time is selected, it is displayed in the center of the screen. To activate the notification, the user must press “Validate”. To cancel or delete the notification, simply click on the "trash" icon.

<div align="center">
   <img width="193" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/a9c06fb5-a1d6-4ad0-b1d9-d5c41053348d">
</div>
