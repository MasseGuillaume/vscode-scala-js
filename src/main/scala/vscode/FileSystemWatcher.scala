package vscode
import scala.scalajs.js

@js.native
trait FileSystemWatcher extends Disposable {
  var ignoreCreateEvents: Boolean = js.native
  var ignoreChangeEvents: Boolean = js.native
  var ignoreDeleteEvents: Boolean = js.native
  var onDidCreate: Event[Uri] = js.native
  var onDidChange: Event[Uri] = js.native
  var onDidDelete: Event[Uri] = js.native
}