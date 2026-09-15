# TutorCrow

Java practice, worked through with friends. This repo is where I keep the exercises
from those sessions — from the first `println` up to small object-oriented projects.

It's a learning repo, not a library. Files are kept roughly as they were written so
the progression stays visible.

## What's in here

### `src/Lesson1/` — Java fundamentals

Lessons numbered in the order they were covered:

| Lesson | Topic |
| --- | --- |
| L1–L4 | Variables, user input, expressions, type conversion |
| L5–L6 | `if` statements, loops |
| L7–L11 | Functions: basics, formatted printing, definitions, return values |
| L12 | Arrays and lists |
| L13 | Method overloading |
| L14–L15 | `while` loops, and a simple banking app built on them |
| L16 | Stacking function calls |
| L17–L18 | `ArrayList`, 2D arrays |

Plus `LS_MyOwnSortingHats.java` — a questionnaire that sorts you into a Hogwarts
house — and a `Practice/` folder for extra attempts.

### `src/OOP/` — Object-oriented programming

Day-by-day material covering attributes (`Day7_attributes`), methods
(`Day8_methods`), and on through `Day9` and `Day10`, alongside `L1_IntroOOP`,
`L2_simpleGame`, and `TheWizardDuel`.

### `src/classwork/` — Weekly coursework

`week2` through `week7`, organised by week.

## Running the code

Each file declares a package matching its folder, so run them from `src/`:

```bash
cd src
javac Lesson1/L1_Variables.java
java Lesson1.L1_Variables
```

Or open the project in IntelliJ IDEA and run any class with a `main` method
directly from the editor.

Requires a JDK — any recent version works, since the code sticks to core Java.

## A note on the lesson files

These are practice exercises, so some are deliberately rough and a few are
incomplete. If a class won't start, check that its `main` is declared
`public static void main(String[] args)` — a couple were written without the
`String[] args` parameter and so aren't valid entry points.
