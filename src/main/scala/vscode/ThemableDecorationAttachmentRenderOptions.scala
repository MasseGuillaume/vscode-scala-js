package vscode
import scala.scalajs.js
import js.|

@js.native
trait ThemableDecorationAttachmentRenderOptions extends js.Object {
  var contentText: String = js.native
  var contentIconPath: String | Uri = js.native
  var border: String = js.native
  var borderColor: String | ThemeColor = js.native
  var fontStyle: String = js.native
  var fontWeight: String = js.native
  var textDecoration: String = js.native
  var color: String | ThemeColor = js.native
  var backgroundColor: String | ThemeColor = js.native
  var margin: String = js.native
  var width: String = js.native
  var height: String = js.native
}