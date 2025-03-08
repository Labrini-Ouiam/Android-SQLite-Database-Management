# Android SQLite Database Management

![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![SQLite](https://img.shields.io/badge/SQLite-003B57?style=for-the-badge&logo=sqlite&logoColor=white)

Une application Android simple pour gérer une base de données SQLite. Cette application permet d'effectuer des opérations CRUD sur une table **Admin**.

## ✨ Fonctionnalités
- ✅ **Ajouter un enregistrement** : Ajouter un nouvel administrateur avec un nom.
- ✏️ **Mettre à jour un enregistrement** : Modifier le nom d'un administrateur existant en fonction de son ID.
- ❌ **Supprimer un enregistrement** : Supprimer un administrateur en fonction de son ID.
- 📋 **Afficher tous les enregistrements** : Afficher la liste de tous les administrateurs dans une **ListView**.

---

## 📷 Captures d'écran
![Uploading image.png…]()

---

## 📂 Structure du projet

```
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
```

---

## 🔧 Prérequis
- 📱 **Android Studio** (Version récente recommandée)
- 📡 **SDK Android** (API 21 ou supérieure)
- 📲 **Un émulateur ou un appareil physique** pour tester l'application

---

## 🚀 Installation
```bash
git clone https://github.com/Labrini-Ouiam/Android-SQLite-Database-Management.git
```
- Ouvrez le projet dans **Android Studio**.
- Synchronisez le projet avec **Gradle**.
- Exécutez l'application sur un **émulateur** ou un **appareil physique**.

---

## 📌 Utilisation
### ➕ Ajouter un enregistrement
1. Saisissez un nom dans le champ **"Nom"**.
2. Cliquez sur le bouton **"Enregistrer"**.

### ✏️ Mettre à jour un enregistrement
1. Saisissez l'**ID** de l'enregistrement à modifier.
2. Saisissez le **nouveau nom**.
3. Cliquez sur **"Mettre à jour"**.

### ❌ Supprimer un enregistrement
1. Saisissez l'**ID** de l'enregistrement à supprimer.
2. Cliquez sur **"Supprimer"**.

### 📋 Afficher les enregistrements
- La liste des enregistrements est affichée automatiquement dans la **ListView**.

---

## 🤝 Contribution
Les contributions sont les bienvenues !
1. **Forkez** le projet.
2. Créez une **branche** pour votre fonctionnalité :
   ```bash
   git checkout -b feature/NouvelleFonctionnalité
   ```
3. **Committez** vos modifications :
   ```bash
   git commit -m 'Ajout d\'une nouvelle fonctionnalité'
   ```
4. **Poussez** vers la branche :
   ```bash
   git push origin feature/NouvelleFonctionnalité
   ```
5. **Créez une Pull Request**.
