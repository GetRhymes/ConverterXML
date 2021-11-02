package com.poly.converter

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

@RestController("/")
class ConvertController(
    private val convertService: ConvertService
) {
    @RequestMapping("/")
    fun hello(): String {
        return "Hello, my friend!"
    }

    @PostMapping("converter/json")
    fun convertXMLToJSON(@RequestParam("xml") xml: MultipartFile): String {
        return convertService.convertXMLToJSON(xml)
    }
}