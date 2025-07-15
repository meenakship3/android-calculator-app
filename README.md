# Android Calculator

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
<img width="220" height="1456" alt="Screenshot 2025-07-15 at 12 43 31_PM" src="https://github.com/user-attachments/assets/5fc6d680-afe8-4456-bc22-9e07d40047d2" />
<img width="220" height="1456" alt="Screenshot 2025-07-15 at 12 56 25_PM" src="https://github.com/user-attachments/assets/6ede72a7-0922-4947-8ccc-36871acfab3e" />



## Getting Started

### Prerequisites
- Android Studio (latest recommended)
- Android SDK 24 or higher
- Java 11 or higher

### Setup
1. Clone this repository:
```sh
git clone https://github.com/meenakship3/android-calculator-app
```

2. Open the project in Android Studio.
3. Let Gradle sync and download dependencies.

### Build & Run
- Connect an Android device or start an emulator.

## Project Structure
- `app/src/main/java/com/example/calculator/` — Main Java source code
- `app/src/main/res/layout/activity_main.xml` — Main UI layout
- `app/src/main/res/values/` — Colors, strings, and themes
- `app/src/main/res/drawable/` — Icons and button backgrounds

## UI Design
- MaterialUI components
- Custom colors: dark green, light green, beige
- Large, rounded buttons for easy input
- Dual display for input and result

## Usage Notes
- Tap numbers and operators to build expressions
- Tap `=` to evaluate
- Tap `AC` to backspace, long-press `AC` to clear all
- Division by zero shows a toast error
