package com.github.tux2323.demo.osgiscala.echo.client

import com.github.tux2323.demo.osgiscala.echo.api.EchoService

import aQute.bnd.annotation.component.Reference
import aQute.bnd.annotation.component.Activate
import aQute.bnd.annotation.component.Component

@Component(immediate=true)
class EchoClient {

	var echoService : EchoService = null
	
	@Reference
	def echoService(value : EchoService) {echoService  = value}
	
	@Activate
	def start(){
		echoService.echo("Hallo, ich bin ein Scala DS Client.")
		echoService.helloWorld()
	}
	
}