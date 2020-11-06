::Run this batch file t execute this program in Windows..

@ECHO OFF
javac -d .class src\Branch.java
javac -d .class src\Class.java
javac -d .class src\Student.java
javac -d .class src\Database.java

java -cp .class src.Database