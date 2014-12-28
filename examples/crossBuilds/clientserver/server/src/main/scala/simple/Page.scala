package simple
import scalatags.Text.all._

object Page{
  val boot =
    "Client().main(document.getElementById('contents'))"
  val skeleton =
    html(
      head(
        script(src:="/client-fastopt.js"),
        link(
          rel:="stylesheet",
          href:="https://cdnjs.cloudflare.com/ajax/libs/pure/0.5.0/pure-min.css"
        )
      ),
      body(
        onload:=boot,
        div(id:="contents")
      )
    )
}
