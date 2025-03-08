Android SQLite Database Management
Android
Kotlin
SQLite

Une application Android simple pour gérer une base de données SQLite. L'application permet d'ajouter, mettre à jour, supprimer et afficher des enregistrements dans une table "Admin". Ce projet est un exemple de base pour comprendre comment implémenter des opérations CRUD avec SQLite sur Android.

Fonctionnalités
Ajouter un enregistrement : Ajouter un nouvel administrateur avec un nom.

Mettre à jour un enregistrement : Modifier le nom d'un administrateur existant en fonction de son ID.

Supprimer un enregistrement : Supprimer un administrateur en fonction de son ID.

Afficher tous les enregistrements : Afficher la liste de tous les administrateurs dans une ListView.

Captures d'écran
Ajouter un enregistrement	Mettre à jour un enregistrement	Supprimer un enregistrement
Ajouter	Mettre à jour	Supprimer
Structure du projet
Copy
Android-SQLite-Database-Management/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/ex1_bd_v1/
│   │   │   │   ├── DBConnexion.kt       # Gestion de la base de données SQLite
│   │   │   │   ├── MainActivity.kt      # Activité principale de l'application
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_main.xml # Interface utilisateur principale
│   │   │   │   ├── values/
│   │   │   │   │   ├── strings.xml       # Fichier de ressources pour les chaînes de texte
├── README.md                             # Fichier README
Prérequis
Android Studio (version récente recommandée)

SDK Android (API 21 ou supérieure)

Un émulateur Android ou un appareil physique pour tester l'application

Installation
Clonez ce dépôt sur votre machine locale :

bash
Copy
git clone https://github.com/Labrini-Ouiam/Android-SQLite-Database-Management.git
Ouvrez le projet dans Android Studio.

Synchronisez le projet avec Gradle pour télécharger les dépendances nécessaires.

Exécutez l'application sur un émulateur Android ou un appareil physique.

Utilisation
Ajouter un enregistrement :

Saisissez un nom dans le champ "Nom".

Cliquez sur le bouton "Enregistrer".

Mettre à jour un enregistrement :

Saisissez l'ID de l'enregistrement à mettre à jour.

Saisissez le nouveau nom dans le champ "Nom".

Cliquez sur le bouton "Mettre à jour".

Supprimer un enregistrement :

Saisissez l'ID de l'enregistrement à supprimer.

Cliquez sur le bouton "Supprimer".

Afficher les enregistrements :

La liste des enregistrements est automatiquement mise à jour et affichée dans la ListView en bas de l'écran.

Contribution
Les contributions sont les bienvenues ! Si vous souhaitez améliorer ce projet, veuillez suivre les étapes suivantes :

Forkez le projet.

Créez une branche pour votre fonctionnalité (git checkout -b feature/NouvelleFonctionnalité).

Committez vos changements (git commit -m 'Ajout d'une nouvelle fonctionnalité').

Poussez vers la branche (git push origin feature/NouvelleFonctionnalité).

Ouvrez une Pull Request.
