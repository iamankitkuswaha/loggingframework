# Logging Framework
Low-Level Design of a Scalable and Extensible Logging Framework
________________________________________________________________

A lightweight and extensible Logging Framework designed for handling log levels (INFO, DEBUG, ERROR) and multiple log destinations (Console, File, and Database) using the Chain of Responsibility and Singleton design patterns.

## Features
* Supports INFO, DEBUG, and ERROR log levels.
* Flexible log handling using the Chain of Responsibility design pattern.
* Centralized logger instance using the Singleton pattern.
## Configurable log destinations:
* Console: Prints logs to the standard output.
* File: Writes logs to a specified file.
* Database: Stores logs in a database table.
