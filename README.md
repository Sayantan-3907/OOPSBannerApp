<<<<<<< HEAD
# OOPSBannerApp
# OOPSBannerApp
=======
# OOPS Banner App

## Overview
OOPS Banner App is a simple Java program that prints "OOPS" to the console.
It can later be extended to display OOPS in a banner format using spaces and *.

## Use Case 1 (UC1)
**Goal:** Display "OOPS" in the console.  
**Actor:** User  

**Flow:**  
1. User runs the program.  
2. Program prints `OOPS`.  
3. Program exits.

## How to Compile and Run
```bash
javac OOPSBannerApp.java
java OOPSBannerApp
```

**Expected Output:**
```
OOPS
```

## Git Workflow
1. Create a feature branch:  
```bash
git checkout -b feature/UC1:PrintOOPS
```
2. Stage and commit changes:  
```bash
git add .
git commit -m "Coded UC1 to Print OOPS to Console"
```
3. Push feature branch:  
```bash
git push origin feature/UC1:PrintOOPS
```
4. Merge to dev branch:  
```bash
git checkout dev
git pull origin dev
git merge feature/UC1:PrintOOPS
git push origin dev
```

## Author
Your Name
>>>>>>> d8e1c14 (Initial commit of OOPSBannerAppUC1)
