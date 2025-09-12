# Face Detection Student Attendance System

This repository contains a **Face Detection system** designed for automating student attendance in classrooms. The system allows student registration with photo capture, builds a face dataset, and performs real-time face recognition to mark attendance. It is implemented using **Java**, **JavaFX** for the user interface, and **MySQL** for data storage.

## Features

- **Student Registration**: Enroll new students and capture multiple photos for the face dataset.
- **Face Dataset Management**: Store and organize student face images for reliable recognition.
- **Attendance Detection**: Real-time face detection and recognition to identify students and record attendance automatically.
- **JavaFX UI**: User-friendly interface for registration, attendance, and administration.
- **MySQL Database**: Stores student information and attendance records securely.

## Technology Stack

- **Java**: Core application logic and face recognition.
- **JavaFX**: Modern desktop GUI for interaction.
- **MySQL**: Relational database for student and attendance data.

## Installation

### Prerequisites

- Java 8 or higher
- MySQL Server
- Maven (for dependency management)
- Webcam (for capturing student photos)

### Setup Steps

1. **Clone the repository:**
   ```bash
   git clone https://github.com/abdelrahim-yehya/face-detection.git
   cd face-detection
   ```

2. **Configure the MySQL Database:**
   - Create a database, e.g., `attendance_system`.
   - Import the provided SQL schema (see `database/schema.sql` if available).
   - Update database connection settings in the project configuration (see `src/main/resources/db.properties` or relevant file).

3. **Install dependencies:**
   ```bash
   mvn install
   ```

4. **Run the application:**
   ```bash
   mvn javafx:run
   ```

## Usage

### Register a Student

1. Go to the Registration tab in the application.
2. Enter student details and capture multiple photos using a webcam.
3. Save the registration to add the student and their face dataset.

### Mark Attendance

1. Go to the Attendance tab.
2. Start the face detection module.
3. The system will detect and recognize faces, matching them to registered students and marking attendance automatically.


## Contributing

Contributions are welcome! Please open issues or pull requests for improvements or bug fixes.

## Author

**Abdelrahim Yehya**  
[GitHub Profile](https://github.com/abdelrahim-yehya)

---

Feel free to reach out for questions, suggestions, or collaboration!
