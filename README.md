# Calculator

A simple, modern Android calculator app built with Java and Material Design principles.

## Features
- Basic arithmetic operations: addition, subtraction, multiplication, division
- Clean and intuitive user interface
- Responsive layout with Material Design components
- Error handling for division by zero
- Dual display for current input and previous operation
- Long-press clear for full reset, single tap for backspace
- Custom color palette and rounded buttons

## Screenshots
<!-- Add screenshots of the app here -->

## Getting Started

### Prerequisites
- Android Studio (latest recommended)
- Android SDK 24 or higher
- Java 11 or higher

### Setup
1. Clone this repository:
   ```sh
   git clone <repo-url>
   ```
2. Open the project in Android Studio.
3. Let Gradle sync and download dependencies.

### Build & Run
- Connect an Android device or start an emulator.
- Click **Run** in Android Studio or use:
  ```sh
  ./gradlew installDebug
  ```

### Testing
- Unit tests: `app/src/test/java/com/example/calculator/ExampleUnitTest.java`
- Instrumented tests: `app/src/androidTest/java/com/example/calculator/ExampleInstrumentedTest.java`
- To run all tests:
  ```sh
  ./gradlew test
  ./gradlew connectedAndroidTest
  ```

## Project Structure
- `app/src/main/java/com/example/calculator/` — Main Java source code
- `app/src/main/res/layout/activity_main.xml` — Main UI layout
- `app/src/main/res/values/` — Colors, strings, and themes
- `app/src/main/res/drawable/` — Icons and button backgrounds

## UI Design
- Material3 DayNight theme
- Custom colors: dark green, light green, beige
- Large, rounded buttons for easy input
- Dual display for input and result

## Usage Notes
- Tap numbers and operators to build expressions
- Tap `=` to evaluate
- Tap `AC` to backspace, long-press `AC` to clear all
- Division by zero shows a toast error

## License
This project is for educational purposes. Add a license if you plan to distribute.

## Credits
- Developed by [Your Name]
- Inspired by standard calculator apps 