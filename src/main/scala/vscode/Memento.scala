package vscode
import scala.scalajs.js
import js.|

@js.native
trait Memento extends js.Object {
  def get[T](key: String): T | Unit = js.native
  def get[T](key: String, defaultValue: T): T = js.native
  def update(key: String, value: js.Any): Thenable[Unit] = js.native
}