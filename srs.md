# Требования к проекту
## Содержание
1. [Введение](https://github.com/del1ght7/ExpenseWise/blob/main/srs.md#1-%D0%B2%D0%B2%D0%B5%D0%B4%D0%B5%D0%BD%D0%B8%D0%B5)<br>  
2. [Требования пользователя](https://github.com/del1ght7/ExpenseWise/blob/main/srs.md#2-%D1%82%D1%80%D0%B5%D0%B1%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F-%D0%BF%D0%BE%D0%BB%D1%8C%D0%B7%D0%BE%D0%B2%D0%B0%D1%82%D0%B5%D0%BB%D1%8F)<br>
   2.1 [Программные интерфейсы](https://github.com/del1ght7/ExpenseWise/blob/main/srs.md#21-%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%BD%D1%8B%D0%B5-%D0%B8%D0%BD%D1%82%D0%B5%D1%80%D1%84%D0%B5%D0%B9%D1%81%D1%8B)<br>
   2.2 [Интерфейс пользователя](https://github.com/del1ght7/ExpenseWise/blob/main/srs.md#22-%D0%B8%D0%BD%D1%82%D0%B5%D1%80%D1%84%D0%B5%D0%B9%D1%81-%D0%BF%D0%BE%D0%BB%D1%8C%D0%B7%D0%BE%D0%B2%D0%B0%D1%82%D0%B5%D0%BB%D1%8F)<br>
   2.3 [Характеристики пользователей](https://github.com/del1ght7/ExpenseWise/blob/main/srs.md#23-%D1%85%D0%B0%D1%80%D0%B0%D0%BA%D1%82%D0%B5%D1%80%D0%B8%D1%81%D1%82%D0%B8%D0%BA%D0%B8-%D0%BF%D0%BE%D0%BB%D1%8C%D0%B7%D0%BE%D0%B2%D0%B0%D1%82%D0%B5%D0%BB%D0%B5%D0%B9)<br>
   2.4 [Предположения и зависимости](https://github.com/del1ght7/ExpenseWise/blob/main/srs.md#24-%D0%BF%D1%80%D0%B5%D0%B4%D0%BF%D0%BE%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D1%8F-%D0%B8-%D0%B7%D0%B0%D0%B2%D0%B8%D1%81%D0%B8%D0%BC%D0%BE%D1%81%D1%82%D0%B8)  
3. [Системные требования](https://github.com/del1ght7/ExpenseWise/blob/main/srs.md#3-%D1%81%D0%B8%D1%81%D1%82%D0%B5%D0%BC%D0%BD%D1%8B%D0%B5-%D1%82%D1%80%D0%B5%D0%B1%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F)<br>
   3.1 [Функциональные требования](https://github.com/del1ght7/ExpenseWise/blob/main/srs.md#31-%D1%84%D1%83%D0%BD%D0%BA%D1%86%D0%B8%D0%BE%D0%BD%D0%B0%D0%BB%D1%8C%D0%BD%D1%8B%D0%B5-%D1%82%D1%80%D0%B5%D0%B1%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F)<br>
   3.2 [Нефункциональные требования](https://github.com/del1ght7/ExpenseWise/blob/main/srs.md#32-%D0%BD%D0%B5%D1%84%D1%83%D0%BD%D0%BA%D1%86%D0%B8%D0%BE%D0%BD%D0%B0%D0%BB%D1%8C%D0%BD%D1%8B%D0%B5-%D1%82%D1%80%D0%B5%D0%B1%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F)<br>
   4. [Тестирование](#4-тестирование)  
      4.1 [План тестирования](#41-план-тестирования)
   
# 1 Введение  


## Название продукта  
### ExpenseWise  
## Описание продукта  
ExpenseWise — это мобильное приложение, предназначенное для управления личными финансами и отслеживания расходов. Оно позволяет пользователям:  
•	Вести учет трат.  
•	Анализировать финансовые привычки.  
•	Планировать бюджет.   
## Границы проекта  
ExpenseWise:  
Будет:  
•	Автоматически импортировать транзакции.  
•	Предоставлять отчеты и диаграммы.  
•	Поддерживать многовалютность.  
Не будет:  
•	Предоставлять услуги по инвестированию или кредитованию.  
•	Ориентироваться на бизнес-пользователей.  

# 2 Требования пользователя  


## 2.1 Программные интерфейсы  



ExpenseWise будет взаимодействовать со следующими внешними системами и сервисами:  
•	API банков для импорта транзакций.  
•	Облачные сервисы (например, AWS или Firebase) для хранения данных.  
•	Аналитические сервисы для построения отчетов.  
•	Сервисы аутентификации через OAuth 2.0.  


## 2.2 Интерфейс пользователя  
Взаимодействие с пользователем  
•	Главный экран: отображение текущего баланса и последних транзакций.  
•	Экран добавления: ввод новой транзакции вручную.  
•	Отчеты: графики и диаграммы по категориям расходов.  


Также с деталями интерфейса можно ознакомиться в [мокапах](https://github.com/del1ght7/ExpenseWise/tree/main/mockups)



## 2.3 Характеристики пользователей  
Пользователи приложения:  
Индивидуальные пользователи:  
•	Уровень образования: среднее и выше.  
•	Опыт: базовые знания работы с мобильными приложениями.  
•	Техническая грамотность: средний уровень, умение пользоваться банковскими приложениями.  



## 2.4 Предположения и зависимости  
•	Доступность API банков для подключения.  
•	Стабильное интернет-соединение для синхронизации данных.  
•	Поддержка платформ iOS и Android.  
•	Обновления операционных систем могут влиять на работоспособность приложения.  


## 3 Системные требования  


## 3.1 Функциональные требования  


1.	Импорт транзакций  
•	1.1 Подключение к API банков для автоматического импорта транзакций.  
•	1.2 Возможность ручного добавления транзакций.  
2.	Управление бюджетом  
•	2.1 Создание и редактирование категорий расходов.  
•	2.2 Установка месячных лимитов для категорий.  
3.	Отчеты и аналитика  
•	3.1 Генерация графиков по категориям расходов.  
•	3.2 Отчет по доходам и расходам за выбранный период.  
4.	Уведомления  
•	4.1 Настройка уведомлений о превышении бюджета.  
•	4.2 Напоминания о регулярных платежах.  
5.	Безопасность и аутентификация  
•	5.1 Поддержка входа через OAuth 2.0.  
•	5.2 Защита данных с помощью шифрования.

## 3.2 Нефункциональные требования
1.  Надежность  
•	Приложение должно работать без сбоев в 99% случаев.  
•	Измерение: тестирование на стабильность в различных сценариях использования.  
2.	Безопасность  
•	Данные пользователей должны быть зашифрованы.  
•	Поддержка двухфакторной аутентификации.  
•	Измерение: проведение регулярных аудитов безопасности.  
3.	Производительность  
•	Время отклика приложения не должно превышать 2 секунд.  
•	Измерение: нагрузочное тестирование с различными объемами данных.  
4.	Удобство использования  
•	Простой и интуитивно понятный интерфейс.  
•	Измерение: проведение пользовательских тестов с обратной связью.  
5.	Совместимость  
•	Поддержка актуальных версий iOS и Android.  
•	Измерение: тестирование на различных устройствах и операционных системах.  


## 4. Тестирование

### 4.1 План тестирования

# Содержание
1 [Введение](#introduction)  
2 [Объект тестирования](#items)  
3 [Атрибуты качества](#quality)  
4 [Риски](#risk)  
5 [Аспекты тестирования](#features)  
6 [Подходы к тестированию](#approach)  
7 [Представление результатов](#pass)  
8 [Выводы](#conclusion)

<a name="introduction"/>

## Введение

Вданном разделе описывается план тестирования приложения "ExpenseWise". Раздел предназначен для людей, выполняющих тестирование данного проекта. Цель тестирования - проверка соответствия реального поведения программы проекта и ее ожидаемого поведения.

<a name="items"/>

## Объект тестирования

В качестве объектов тестирования можно выделить следующие функциональные требования:

* Добавление расхода
* Удаление расходов
* Добавление категории расходов

<a name="quality"/>

## Атрибуты качества

1. Функциональность:
    - функциональная полнота: приложение должно выполнять все заявленные функции
    - функциональная корректность: приложение должно выполнять все заявленные функции корректно
2. Удобство использования:
    - интуитивно понятный интерфейс
    - все функциональные элементы имеют понятные названия
    - удобная навигация между разделами

<a name="risk"/>

## Риски

К рискам можно отнести:
* Потеря локальных данных при сбое устройства
* Конфликты при одновременном доступе к данным
* Проблемы совместимости с различными версиями Android

<a name="features"/>

## Аспекты тестирования

В ходе тестирования планируется проверить реализацию основных функций приложения:

### Управление Расходами
* Создание нового расхода
* Удаление расходов

### Управление категориями
* Создание новой категории
* Выбор сущестующей категории

### Интерфейс
* Корректное отображение всех элементов
* Работа навигации
* Адаптивность интерфейса

<a name="approach"/>

## Подходы к тестированию

При тестировании будет использован ручной подход.

<a name="pass"/>

## Представление результатов

|Сценарий|Действие|Ожидаемый результат|Фактический результат|Оценка|
|:---|:---|:---|:---|:---|
|001-1: Запуск приложения|Запустить приложение на устройстве Android|Успешный запуск приложения|Приложение запускается|Тест пройден|
|001-2: Отображение интерфейса|Проверка соответствия интерфейса макетам|Интерфейс соответствует макетам|Интерфейс соответствует макетам|Тест пройден|
|002-1: Создание расхода|Нажать кнопку "Добавить расход" и заполнить поля|Отображение расхода в списке|Расход отображается|Тест пройден|
|002-2: Удаление расходов|Нажать кнопку "Очистить все расходы"|Удаление расходов из списка|Расходы удаляются|Тест пройден|
|003-1: Создание категории|Нажать кнопку "Добавить расход" и заполнить поле "Новая категория"|Отображение категори|Категория отображается|Тест пройден|
|003-2: Выбор категории|Нажать кнопку "Добавить расход" и звыбрать категорию из списка|Выберется категория|Категория выбралась|Тест пройден|
|004-1: Сохранение данных|Проверка сохранения данных при перезапуске|Сохранение всех данных|Данные сохраняются локально|Тест пройден|
|005-1: Навигация|Проверка переходов между экранами|Корректная навигация|Навигация работает|Тест пройден|


## Общий вывод
Базовый функционал приложения реализован и работает стабильно. Основные функции выполняются корректно. Требуется расширение функциональности в соответствии с планом развития проекта. Приложение может использоваться для расчёта расходов, но требует дальнейшего развития для полного соответствия заявленным требованиям.

<a name="conclusion"/>

## Выводы

Данный тестовый план позволяет проверить основной функционал приложения ExpenseWise. Успешное прохождение всех тестов не гарантирует полной работоспособности на всех устройствах и версиях Android, однако позволяет утверждать о корректной работе основных функций приложения. Тестирование должно проводиться регулярно при внесении существенных изменений в код проекта.
  

