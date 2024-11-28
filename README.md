# Проект по автоматизации тестовых сценариев для сайта компании Наука
## :scroll: Содержание:

- [Используемый стек](#computer-используемый-стек)
- [Запуск автотестов](#arrow_forward-запуск-автотестов)
- [Пример Allure-отчета](#arrow_forward-пример-отчета-allure)
- [Сборка в Jenkins](#arrow_forward-Сборка-в-Jenkins)
- [Уведомления в Telegram](#Уведомления-в-Telegram)


## :computer: Используемый стек

<p align="center"> 
<img title="Test Results in Allure" src="images/icons/java.svg" width="50" height="50" alt="Java">  
<img title="Test Results in Allure" src="images/icons/selenide.svg" width="50" height="50" alt="Selenide"> 
<img title="Test Results in Allure" src="images/icons/selenoid.svg" width="50" height="50" alt="Selenoid"> 
<img title="Test Results in Allure" src="images/icons/allure.svg" width="50" height="50" alt=" Allure Report">
<img title="Test Results in Allure" src="images/icons/gradle.svg" width="50" height="50" alt="Gradle"> 
<img title="Test Results in Allure" src="images/icons/junit5.svg" width="50" height="50" alt="JUnit5"> 
<img title="Test Results in Allure" src="images/icons/jenkins.svg" width="50" height="50" alt="Jenkins"> 
<img title="Test Results in Allure" src="images/icons/telegram_logo.svg" width="50" height="50" alt="Telegram"> 

</p>

В данном проекте находятся UI автотесты на сайт компании Наука. Для создания тестов использовалась Java 17, фреймворк для UI-тестирования Selenide и сборщик Gradle.
Тесты можно запускать удаленно с помощью в Jenkins в Selenoid с формированием Allure-отчета и получить результаты в Telegram с помощью бота.


## :arrow_forward: Запуск автотестов

### Запуск тестов из терминала
```
gradle clean test -Denv=remote - удаленно через Selenoid
gradle clean test -Denv=local - локально у себя на устройстве
```

## :arrow_forward: Пример отчета Allure

### Результат выполнения автотеста

<p align="center">
<img title="Test Results in Allure" src="images/allure1.png">
<img title="Test Results in Allure" src="images/allure2.png">
</p>

### Сборка в Jenkins
В </a>[Jenkins](https://jenkins.autotests.cloud/job/autotests_qa_guru/)</a> можно запускать данную сборку удаленно на selenoid и посмотреть результаты Allure

### Уведомления в Telegram


<p align="center">
<img width="70%" title="Telegram Notifications" src="images/bot.png">
</p>

