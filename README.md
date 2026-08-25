# Quadrant Composer

## Présentation

Quadrant Composer est une application Android réalisée avec Kotlin et Jetpack Compose.

Ce projet a pour objectif de créer une interface simple composée de quatre parties organisées sous forme d'une grille 2x2.

Chaque partie présente un composant ou une notion de base de Jetpack Compose.

## Technologies utilisées

- Kotlin
- Android Studio
- Jetpack Compose
- Material 3

## Fonctionnement de l'application

L'application affiche quatre quadrants :

- Text composables
- Image composables
- Row composables
- Column composables

Chaque quadrant contient un titre et une courte description.

Les quatre parties sont organisées en deux lignes et deux colonnes.

## Organisation du code

Le fichier principal de l'application est :

`MainActivity.kt`

Il contient notamment :

- `QuadrantCard()` : permet de créer une partie de la grille.
- `QuadrantLayout()` : permet d'organiser les quatre parties.
- `QuadrantLayoutPreview()` : permet de visualiser l'interface dans Android Studio.

Les textes affichés sont définis dans :

`app/src/main/res/values/strings.xml`

## Lancement du projet

Pour lancer l'application :

1. Ouvrir le projet avec Android Studio.
2. Attendre la synchronisation du projet.
3. Utiliser un émulateur Android ou un appareil Android connecté.
4. Cliquer sur le bouton **Run**.

## Auteur

Projet réalisé dans le cadre d'un exercice Android avec Kotlin et Jetpack Compose.