package com.github.tux2323.demo.osgiscala.echo.impl

import com.github.tux2323.demo.osgiscala.echo.api.EchoService
import aQute.bnd.annotation.component.Component

@Component
class EchoServiceImpl extends EchoService {

  override def echo(msg: String) { println(msg) }

}