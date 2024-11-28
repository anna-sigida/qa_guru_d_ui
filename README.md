# Проект по автоматизации тестовых сценариев для сайта компании Наука
## :scroll: Содержание:

- [Используемый стек](#computer-используемый-стек)
- [Запуск автотестов](#arrow_forward-запуск-автотестов)
- [Пример Allure-отчета](#arrow_forward-пример-отчета-allure)
- [Сборка в Jenkins](#arrow_forward-Сборка-в-Jenkins)
- [Уведомления в Telegram](#Уведомления-в-Telegram)


## :computer: Используемый стек

<p align="center"> 
<a href="https://www.java.com/"><img width="7%" title="Java" src="images/icons/Java.svg"></a>
<a href="https://selenide.org/"><img width="7%" title="Selenide" src="images/icons/selenide.svg"></a>
<a href="https://aerokube.com/selenoid/"><img width="7%" title="Selenoid" src="images/icons/selenoid.svg"></a>
<a href="https://allurereport.org/"><img width="7%" title="Allure Report" src="images/icons/allure.svg"></a>
<a href="https://gradle.org/"><img width="7%" title="Gradle" src="images/icons/gradle.svg"></a>
<a href="https://junit.org/junit5/"><img width="7%" title="JUnit5" src="images/icons/junit5.svg"></a>
<a href="https://www.jenkins.io/"><img width="7%" title="Jenkins" src="images/icons/jenkins.svg"></a>
<a href="https://web.telegram.org/"><img width="7%" title="Telegram" src="images/icons/telegram_logo.svg"></a>

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

