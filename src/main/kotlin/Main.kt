external fun require(module:String):dynamic


fun main(args: Array<String>) {
    require("source-map-support").install()
    println("Hello JavaScript!")

    val express = require("express")
    val app = express()
    app.hoge()

    app.get("/", { req, res ->
        res.type("text/plain")
        res.send("i am a beautiful butterfly")
    })

    app.listen(3000, {
        println("Listening on port 3000")
    })
}