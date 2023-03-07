# Project job4j_forum
[![Build Status](https://app.travis-ci.com/EDGE775/job4j_forum.svg?branch=master)](https://app.travis-ci.com/EDGE775/job4j_forum)
[![codecov](https://codecov.io/gh/EDGE775/job4j_forum/branch/master/graph/badge.svg?token=PX1SVDWBAE)](https://codecov.io/gh/EDGE775/job4j_forum)

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Run project](#run-project)
* [Status](#status)
* [Screenshots](#screenshots)
* [Contact](#contact)

## General info
This app is a simple forum. 
Each user can add new topics on the forum, edit them and add comments. 
The application contains authorization and registration.

## Technologies
* Java 17
* Spring Boot(Data, Security, Test)
* PostgreSQL, H2 (for tests)
* Liquibase
* Apache TomCat
* HTML, Bootstrap, JSP, JSTL
* Maven
* Heroku
* Junit

## Run project
### Using Java CLI
Compile to jar.
```
mvn install
```
With your settings.
```
java -jar target/job4j_forum.jar --db=forum --user=postgres --password=password --port=your_port
```
OR default settings (db=forum, user=postgres, password=password, port=8080).
```
java -jar target/job4j_forum.jar
```
### Using Docker
Build.
```
docker-compose build
```
Run.
```
docker-compose up -d
```

## Status
Project is: _in progress_

## Screenshots
#### Main page
![ScreenShot](images/Screenshot_1.png)
#### Topic page
![ScreenShot](images/Screenshot_2.png)
#### Create topic
![ScreenShot](images/Screenshot_3.png)
#### Registration
![ScreenShot](images/Screenshot_5.png)
#### Authorization
![ScreenShot](images/Screenshot_4.png)

## Contact
Created by Khlapov Dmitry - feel free to contact me!
