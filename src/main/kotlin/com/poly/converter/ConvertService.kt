package com.poly.converter

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper

import org.json.XML
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile
import java.io.File

@Service
class ConvertService {
    fun convertXMLToJSON(xmlFile: MultipartFile): String {
        val xml = String(xmlFile.bytes)
        return XML.toJSONObject(xml).toString()
    }

    fun convertXMLToYAML(xml: MultipartFile): String {
        return convertJSONToYAML(convertXMLToJSON(xml))
    }

    fun describe(): String {
        return File("src/main/resources/describe.txt").readText()
    }

    private fun convertJSONToYAML(json: String): String {
        val jsonNodeTree: JsonNode = ObjectMapper().readTree(json)
        return YAMLMapper().writeValueAsString(jsonNodeTree)
    }

}
