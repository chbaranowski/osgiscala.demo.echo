package com.github.tux2323.demo.osgiscala.echo.api

trait EchoService {

  def echo(msg: String)

  def helloWorld() { echo("Hello, Scala World!") }

}