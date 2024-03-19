# Projet-Application_Mobile_in_Kotlin
[French] Projet d'une Application Mobile nommé MemoRise    
[English] Mobile Application Project called MemoRise   


#### SOMMAIRE / SUMMARY
- [Présentation en francais / Presentation in French](#presentation-en-francais)
- [Présentation en anglais / Presentation in English](#english-presentation)
- [Tutoriel dans les deux langues / Tutorial in both languages](#tutoriel--tutorial)

## [PRESENTATION EN FRANCAIS]
Ce dossier constitue un projet final en Développement Mobile  fait par D-TheProgrammer 

Pour ce projet est une application favorisant  mémorisation via l’utilisation de cartes nommée “MemoRise”. 

### 1. <ins>Qu'est-ce que "MemoRise"?</ins>
MemoRise est une application inspirée d'"AnkiApp", une application de cartes mémoire permettant à l'utilisateur de réviser ses connaissances de manière interactive. Pour ce faire, l'utilisateur crée des cartes d'apprentissage (appelé "MemoCards") sous forme de texte à trous par exemple , des statistiques sont également disponibles pour suivre sa progression.
Contrairement à AnkiApp , MemoRise  est gratuite sur mobile et est bien plus ergonomique et design. 
C'est pour pallier ces lacunes et apporter une interactivité adaptée aux outils mobiles que nous avons décidé de créer "MemoRise".

### 2. <ins>Qu'est-ce que "Kotlin"?</ins>
Kotlin a été essentiel dans ce projet, offrant une expérience de développement fluide et dynamique pour les applications Android. Grâce à Kotlin, nous avons pu mettre en place divers mécanismes, comme le changement de page et l'appel de fonction, tout en personnalisant les éléments dans les fichiers XML.

Les fichiers XML sont utilisés pour structurer les données de manière lisible par les humains et les machines, notamment pour définir l'interface utilisateur des applications Android. Avec Android Studio, les développeurs peuvent créer des mises en page XML de manière interactive, en glissant-déposant des composants graphiques et en définissant des propriétés visuelles. Cette approche facilite la conception rapide et efficace de l'interface utilisateur, sans avoir à écrire manuellement tout le code XML. Cela nous a permis de développer notre application Memorise avec flexibilité et efficacité.


### 3. <ins>Que contient le dossier </ins>
Ce dossier contient :
- Le dossier Readme que vous lisez 
- Le dossier du projet
- l'APK du projet (dans le dossier Release du .zip)




> [!TIP]
> Pour lancer le fichier Python
> ```bash
> python3 clusters.py
> ````


## [ENGLISH PRESENTATION]




## [Préparation à l'utilisation de l'application / Tutorial]
#### ÉTAPE 1 : Ouvrir le programme sur Android Studio / STEP 1: Main Menu

<div align="center">
  <img width="235" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/e8a6fd8d-6fda-4ead-9861-bcc6041dbb4a">
</div>

#### ÉTAPE 2 : Une fois importé accepter le nouveau chemin du SDK ou l'ajouter sois meme dasn le fichier `local.properties`  / STEP 1: Main Menu

<div align="center">
  <img width="487" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/b35eb59b-bc00-451a-87a5-8647131ec012">
</div>

#### ÉTAPE 3 : Laisser le build se faire ou Graddle se prerarer / STEP 1: Main Menu
[FRENCH] En bas de l'écran la barre de chargement est affiché 

<div align="center">
  <img width="591" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/656b7c48-78a3-4b03-80b6-34f50638c1cd">
</div>

#### ÉTAPE 4 : Choisir le Device pouur alncer l'application  / STEP 1: Main Menu

<div align="center">
  <img width="189" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/b63725d3-9159-4239-ab55-107c69db484a">
</div>

#### ÉTAPE 5 : Ouvrir le device explorer / STEP 1: Main Menu

<div align="center">
  <img width="190" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/2cbc3879-a73b-4967-89ed-f5086356977d">
</div>

#### ÉTAPE 6 : Lancer l'application sur Android Studio en appuyant sur la fleche verte / STEP 1: Main Menu

<div align="center">
 <img width="333" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/b9cac469-bb85-48a6-a51f-6b49a526d2dd">
</div>


#### ÉTAPE 6 : Lancer l'application sur Android Studio / STEP 1: Main Menu

<div align="center">
  <img width="235" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/e8a6fd8d-6fda-4ead-9861-bcc6041dbb4a">
</div>




## [Comment Utiliser l'application / Tutorial]
#### ÉTAPE 1 : La page _"d'accueil"_ / STEP 1: Main Menu
[FRENCH] La page d'accueil de notre application est la première vue que l'utilisateur rencontre. Elle offre un accès facile aux différentes sections de l'application, notamment la création, la révision, la collection et les options, via des boutons clairs. Cette page centrale est essentielle car elle sert de point de départ pour naviguer vers toutes les autres fonctionnalités de l'application

<div align="center">
  <img width="171" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/51384122-e927-46ee-9c9f-2204b88e023f">

</div>

#### ÉTAPE 2 : La Page _"Création"_ de l’application / STEP 1: Main Menu
[FRENCH] L'application permet à l'utilisateur de créer et de réviser des cartes mémoires pour vérifier ses connaissances. En  écrivant dans les cases il peut créer des "MemoCards"  avec des questions personnalisées, appelées "MemoQuestions", accompagnées de descriptions et de thèmes. Ces MemoCards sont affichées dans un carrousel horizontal sur la page Collection. La page offre également trois boutons : un pour revenir à la page d'accueil, un pour valider la création de la MemoCard, et un troisième bouton caché dans le logo de l'application, ramenant également à la page principale



<div align="center">
  <img width="146" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/f3c73dcf-8dbc-4b5a-a5fa-7d478ef16604">
  <img width="167" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/5637a7f3-7e75-4f91-b2c4-3853a175be1a">
</div>

#### ÉTAPE 3 : La page _"Collection"_ / STEP 1: Main Menu

[FRENCH] Cette page présente toutes les MemoCards créées, organisées par thème et titrées. Chaque carte est accompagnée d'une case à cocher pour indiquer si elle a été apprise. En cas de plusieurs cartes, il est possible de faire défiler horizontalement pour les visualiser. Un bouton permet de revenir au menu principal

<div align="center">
  <img width="277" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/d9b7fad2-ee20-4825-8e0c-528c1d0c574d">

</div>


#### ÉTAPE 4 : Page _"MemoCard Unique"_ de l’application / STEP 1: Main Menu
Cette page permet à l'utilisateur d'accéder à ses MemoCards pour les réviser avant un test. En cliquant sur une MemoCard de la liste, une page dynamique s'ouvre car chaque MemoCard est unique. L'utilisateur peut effectuer plusieurs actions :
- Supprimer la MemoCard en appuyant sur l'icône de la poubelle.
- Indiquer qu'il l'a apprise en cochant la case correspondante et en validant.
- Modifier la MemoCard en changeant son contenu et en appuyant sur "Valider".
- Il peut également ne rien faire et appuyer sur "Valider" pour conserver la carte telle quelle.
Une fois les modifications effectuées, elles sont appliquées à la liste dynamique de la page Collection.

<div align="center">
  <img width="647" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/57eebc6d-f219-467a-bc72-5f5b53bc1c39">
</div>



#### ÉTAPE 5 : Page Révision / STEP 1: Main Menu
Sur cette page, l'utilisateur répond aux questions de la MemoCard. La question s'affiche en haut, et l'utilisateur peut répondre en écrivant dans l'espace prévu en bas. Pour enregistrer les réponses, l'utilisateur doit appuyer sur le bouton de validation.


<div align="center">
  <img width="216" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/de4d6273-c23c-4164-8bd8-cc14be8c4497">
</div>

#### ÉTAPE 6 : Page Option  / STEP 1: Main Menu
La page des options propose trois paramètres :

- La "mémorisation journalière" : l'utilisateur peut saisir directement le nombre de cartes à réviser par série.
- L'"intervalle de mémorisation" : un menu déroulant permet de choisir la fréquence de réapparition des cartes.
- La modification de l'heure d'envoi des notifications.

<div align="center">
  <img width="149" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/e00e58ca-bbac-4b0b-b5c2-a2fe79065e6d">

</div>

L'utilisateur peut définir l'heure des notifications en appuyant sur "Sélection heure notification". Une boîte interactive apparaît alors, permettant à l'utilisateur de choisir l'heure souhaitée, éventuellement en utilisant une horloge. 

<div align="center">
  <img width="588" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/17d50956-7095-46e1-a729-e1442bd91588">
</div>

Une fois l'heure sélectionnée, elle s'affiche au centre de l'écran. Pour activer la notification, l'utilisateur doit appuyer sur "Valider". Pour annuler ou supprimer la notification, il suffit de cliquer sur l'icône "corbeille".

<div align="center">
  <img width="193" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/a9c06fb5-a1d6-4ad0-b1d9-d5c41053348d">
</div>



#### ÉTAPE 6 : Lancer l'application sur Android Studio / STEP 1: Main Menu

<div align="center">
  <img width="235" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/e8a6fd8d-6fda-4ead-9861-bcc6041dbb4a">
</div>
#### ÉTAPE 6 : Lancer l'application sur Android Studio / STEP 1: Main Menu

<div align="center">
  <img width="235" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/e8a6fd8d-6fda-4ead-9861-bcc6041dbb4a">
</div>
#### ÉTAPE 6 : Lancer l'application sur Android Studio / STEP 1: Main Menu

<div align="center">
  <img width="235" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/e8a6fd8d-6fda-4ead-9861-bcc6041dbb4a">
</div>
#### ÉTAPE 6 : Lancer l'application sur Android Studio / STEP 1: Main Menu

<div align="center">
  <img width="235" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/e8a6fd8d-6fda-4ead-9861-bcc6041dbb4a">
</div>

#### ÉTAPE 6 : Lancer l'application sur Android Studio / STEP 1: Main Menu

<div align="center">
  <img width="235" alt="image" src="https://github.com/D-TheProgrammer/Projet-Application_Mobile_in_Kotlin/assets/151149998/e8a6fd8d-6fda-4ead-9861-bcc6041dbb4a">
</div>
