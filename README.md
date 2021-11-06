## Описание:

    С помощью данного сервиса можно конвертировать:
    
    XML в JSON
    XML в YAML

## Как пользоваться:

    1) Запустить сервис
    2) Конвертировать файл
        2.1) Для конвертация XML в JSON
            Отправьте Post запрос с помощью curl или других инструментов следующего вида:
             **curl -F "xml=@/Users/path/to/file.xml" http://host:port/converter/toJson**
        2.2) Для конвертация XML в YAML
            Отправьте Post запрос с помощью curl или других инструментов следующего вида:
             **curl -F "xml=@/Users/path/to/file.xml" http://host:port/converter/toYaml**
    3) Получить результат на экране

## Docker
    docker build -t converter .

    docker run -it -p8080:8080 converter
