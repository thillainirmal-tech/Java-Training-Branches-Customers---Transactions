# Java Training: Branches, Customers & Transactions

## Overview

This repository contains a Java project that demonstrates the concepts of branches, customers, and transactions. It provides functionalities to manage customer data and their transactions across different branches.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Features

- Add, update, and delete customer information.
- Record and manage transactions for customers.
- Support for multiple branches.
- Search and filter transactions by customer or branch.

## Installation

### Prerequisites

- Java 8 or higher
- Maven

### Steps

1. Clone the repository:
    ```bash
    git clone https://github.com/thillainirmal-tech/Java-Training-Branches-Customers---Transactions.git
    cd Java-Training-Branches-Customers---Transactions
    ```

2. Build the project using Maven:
    ```bash
    mvn clean install
    ```

## Usage

1. Run the application:
    ```bash
    mvn exec:java -Dexec.mainClass="com.example.Main"
    ```

2. Follow the on-screen instructions to interact with the application.

## Project Structure

```plaintext
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           ├── Branch.java
│   │   │           ├── Customer.java
│   │   │           ├── Transaction.java
│   │   │           └── Main.java
│   ├── test
│   │   └── java
│   │       └── com
│   │           └── example
│   │               └── MainTest.java
├── pom.xml
└── README.md
