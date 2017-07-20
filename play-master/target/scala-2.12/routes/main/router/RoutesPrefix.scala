
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/takuro/Desktop/play-master/conf/routes
// @DATE:Thu Jul 20 14:58:56 JST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
