package vscode
import scala.scalajs.js
import js.|

@js.native
trait ThemableDecorationRenderOptions extends js.Object {
  var backgroundColor: String | ThemeColor = js.native
  var outline: String = js.native
  var outlineColor: String | ThemeColor = js.native
  var outlineStyle: String = js.native
  var outlineWidth: String = js.native
  var border: String = js.native
  var borderColor: String | ThemeColor = js.native
  var borderRadius: String = js.native
  var borderSpacing: String = js.native
  var borderStyle: String = js.native
  var borderWidth: String = js.native
  var fontStyle: String = js.native
  var fontWeight: String = js.native
  var textDecoration: String = js.native
  var cursor: String = js.native
  var color: String | ThemeColor = js.native
  var letterSpacing: String = js.native
  var gutterIconPath: String | Uri = js.native
  var gutterIconSize: String = js.native
  var overviewRulerColor: String | ThemeColor = js.native
  var before: ThemableDecorationAttachmentRenderOptions = js.native
  var after: ThemableDecorationAttachmentRenderOptions = js.native
}