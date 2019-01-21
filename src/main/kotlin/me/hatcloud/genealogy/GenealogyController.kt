package me.hatcloud.genealogy

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import java.text.SimpleDateFormat
import java.util.*

@RestController
class GenealogyController {
    @RequestMapping("/date")
    fun index(): String {
        val time = System.currentTimeMillis()
        val sdf = SimpleDateFormat("yyyy-MM-dd")
        return sdf.format(Date(time))
    }
}