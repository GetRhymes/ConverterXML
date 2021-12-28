## CI
<table>
  <tr><td>master</td><td>develop</td></tr>
  <tr>
    <td><a href="https://github.com/GetRhymes/ConverterXML/actions?query=branch%3Amaster">
      <img src="https://github.com/GetRhymes/ConverterXML/actions/workflows/converter.yml/badge.svg?branch=master" alt="test for master"></a></td>
    <td><a href="https://github.com/GetRhymes/ConverterXML/actions?query=branch%3Adevelop">
      <img src="https://github.com/GetRhymes/ConverterXML/actions/workflows/converter.yml/badge.svg?branch=develop" alt="test for dev"></a></td>
  </tr>
</table>

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
