1. Напишите программу, которая заменяет символы в почтовом адресе пользователя:  

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@ заменяется на [ at ]  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;. заменяется на [ dot ]  

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Пример ввода:  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;person@gmail.com  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Результат:  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;person[ at ]gmail[ dot ].com  

2. i18n используется для обозначения слова internationalization, где 18 означает количество букв между первой и последней в этом слове, такое можно встретить в среде разработчиков. Например, для слова localization используется сокращение l10n.
Напишите функцию, которая преобразует слова введенные из консоли через пробел в сокращенную форму. Слова длиной меньше 4х оставить без изменений.  

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Пример ввода:  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;internationalization localization cat elephant monitor  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Результат:  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;i18n l10n cat e6t m5r  

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;PS: напишите функцию, которая сокращает слово, в основной функции используйте метод сплит,  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;который поместит слова в массив и для каждого из них вызовет вашу функцию  

3. Определить является ли слово палиндромом, т.е. читается одинаково, слева направо и справа налево.  
Определить количество таких слов в тексте, в котором все слова введены через запятую.  

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Пример ввода:  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;deleveled, evitative, cat, dog, deified  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Результат:  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;There are 3 palindromes in the text  

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;PS: используйте метод split c параметром "," и потом метод trim, чтобы удалить лишние пробелы слева и справа  

4. Для второй задачи (i18n) нарисуйте модель памяти (stack и heap). Нужно определить, где будут находиться ссылки, простые типы данных и строки.  
