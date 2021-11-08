import com.poly.converter.ConvertService
import org.json.JSONObject
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.mock.web.MockMultipartFile
import org.springframework.web.multipart.MultipartFile
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths


class ConvertServiceTest {

    private val xml: MultipartFile
        get() {
            val path = Paths.get("src/test/resources/test.xml")
            val name = "test.xml"
            val originalFileName = "test.xml"
            val contentType = "text/xml"
            val content = Files.readAllBytes(path)
            return MockMultipartFile(name, originalFileName, contentType, content)
        }

    private val convertService = ConvertService()

    @Test
    fun convertXMLToJSONTest() {
        val textFromJSONFile = File("src/test/resources/convertXMLToJSONResult.json")
            .readText()
            .replace("\r", "")
        val expected = JSONObject(textFromJSONFile).toString()
        val actual = convertService.convertXMLToJSON(xml)
        assertEquals(expected, actual)
    }

    @Test
    fun convertXMLToYAMLTest() {
        val expected = File("src/test/resources/convertXMLToYAML.yaml")
            .readText()
            .replace("\r", "")
        val actual = convertService.convertXMLToYAML(xml)
        assertEquals(expected, actual)
    }
}
