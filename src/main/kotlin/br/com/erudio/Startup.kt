package br.com.erudio

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class Startup

fun main(args: Array<String>) {
	runApplication<Startup>(*args)
	//para testes digitar no navegador
	//http://localhost:8080/sum/1/2
}