## CI

CI
для `main`:  [![Build Status](https://app.travis-ci.com/GetRhymes/ConverterXML.svg?branch=master)](https://app.travis-ci.com/GetRhymes/ConverterXML)

CI
для `develop`:  [![Build Status](https://app.travis-ci.com/GetRhymes/ConverterXML.svg?branch=master)](https://app.travis-ci.com/GetRhymes/ConverterXML)

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
    Собрать образ:
        docker build -t converter .
    Запустить контейнер: 
        docker run -it -p8080:8080 converter
