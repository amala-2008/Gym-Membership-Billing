# Gym Membership & Billing System

## Student Details

**Name:** Amala Dinusha M
**Register Number:** [Enter Your Register Number]
**Course:** 23CSR306 - Java Programming
**Assignment:** II - OOP Mini Project

---

## 1. Project Title

**Gym Membership & Billing System**

## 2. Problem Statement

The Gym Membership & Billing System is a Java-based menu-driven application used to manage gym members and their memberships. The system allows the user to add members, view member details, and generate membership bills based on the selected membership type and duration.

The system provides Basic and Premium membership options and calculates the total membership fee automatically.

---

## 3. Features

- Add a new gym member
- Store member details
- Select Basic or Premium membership
- Calculate membership fee
- View all registered members
- Generate a bill
- Validate user inputs
- Handle invalid inputs using a custom exception
- Menu-driven interface

---

## 4. Membership Plans

| Membership | Monthly Fee |
| ---------- | ----------: |
| Basic      |     Rs.1000 |
| Premium    |     Rs.1500 |

### Bill Calculation

```text
Total Fee = Monthly Fee × Duration
```

Example:

```text
Premium × 3 months
= 1500 × 3
= Rs.4500
```

---

## 5. OOP Concepts Used

### Encapsulation

Member and membership data are declared as private fields and accessed using methods.

### Inheritance

The `Member` class extends the `Membership` class.

### Aggregation

`GymService` maintains a collection of `Member` objects.

### Polymorphism

The inherited membership behavior is used through `Member` objects.

---

## 6. Project Structure

```text
Gym-Membership-Billing
│
├── src
│   ├── model
│   │   ├── Member.java
│   │   └── Membership.java
│   │
│   ├── service
│   │   └── GymService.java
│   │
│   ├── exception
│   │   └── InvalidInputException.java
│   │
│   └── main
│       └── Main.java
│
└── README.md
```

---

## 7. How to Run

### Using VS Code

1. Open the `Gym-Membership-Billing` project in VS Code.
2. Open `src/main/Main.java`.
3. Click the **Run** button.
4. Enter the required values in the terminal.
5. Select the required menu option.

### Main Menu

```text
====================================
       GYM MEMBERSHIP & BILLING
====================================
1. Add Member
2. View Members
3. Generate Bill
4. Exit
====================================
```

---

## 8. Input Validation

The system validates:

- Empty member name
- Age between 15 and 70
- 10-digit phone number
- Basic or Premium membership
- Positive membership duration
- Valid menu choices

Invalid inputs are handled using exception handling without terminating the program.

---

## 9. Sample Bill

```text
========== GYM BILL ==========
Member ID       : 101
Member Name     : Amala
Membership      : Premium
Duration        : 3 month(s)
--------------------------------
Total Amount    : Rs.4500.0
================================
```

---

## 10. Technologies Used

- Java
- Object-Oriented Programming
- VS Code
- Git
- GitHub

```

```
