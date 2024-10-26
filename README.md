# Media Library Application

## Overview
This Java application, MediaApp, allows for the management and display of different types of media items including books and films. It showcases how to create, manage, and print details of these items within a console application.

## Project Structure
The project is organized into the following directories and key files:

- **application**:
  - `MediaApp.java` - Main application entry point that creates and prints media items.
- **model**:
  - `Book.java` - Defines the `Book` class with properties like title, publication year, genres, authors, ISBN, and page count.
  - `Film.java` - Defines the `Film` class with properties such as title, release year, genres, directors, feature film status, cast members, and duration.
  - `Media.java` - An abstract class that generalizes the common characteristics of all media types.
  - `RentHistoryItem.java` - Manages rental history for media items.
- **test**:
  - `MediaTest.java` - Contains unit tests for media item functionalities.
- **resources**:
  - Contains media related resources and additional documentation.

## How to Run the Application
To run this application, follow these steps:

1. Ensure you have a Java Development Kit (JDK) installed on your machine.
2. Clone the repository:
```
git clone git@github.com:themane04/book-management-system.git
```
3. Navigate to the project directory
4. Compile the Java files
5. Run the application

The output will display details of the created book and film based on the hardcoded values within `MediaApp.java`.
