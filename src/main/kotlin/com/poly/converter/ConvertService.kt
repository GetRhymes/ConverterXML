package com.poly.converter

import org.json.XML
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile

@Service
class ConvertService {
    fun convertXMLToJSON(xmlFile: MultipartFile): String {
        val xml = String(xmlFile.bytes)
        return XML.toJSONObject(xml).toString()
    }
}