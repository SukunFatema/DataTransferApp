# Data Transfer App

## Project Overview
Data Transfer App is a simple Android application demonstrating communication between two Activities using Explicit Intents.

## Features
- Two Android Activities.
- User input for name and email.
- Explicit Intent to navigate between screens.
- Data transfer using Intent extras.
- Display of received data on the second screen.
- Navigation back to the first screen.
- Pink and white user interface.

## Technologies Used
- Java
- XML
- Android Studio
- Android SDK

## Application Structure
- `MainActivity.java` – Accepts user details and sends them using an Intent.
- `SecondActivity.java` – Receives and displays the transferred details.
- `activity_main.xml` – First screen layout.
- `activity_second.xml` – Second screen layout.
- `drawable/` – UI backgrounds and styling resources.

## How to Test
1. Launch the application.
2. Enter your name and email address.
3. Tap Continue.
4. Verify that the second screen displays the submitted details.
5. Tap Go Back to return to the first screen.

## Project Objective
To understand Android Activities, Explicit Intents, and passing data between screens using Intent extras.
