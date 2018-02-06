package vscode
import scala.scalajs.js

@js.native
trait Event[T] extends js.Object {
  def apply(listener: js.Function1[T, Any], thisArgs: js.Any , disposables: js.Array[Disposable] ): Disposable = js.native
}