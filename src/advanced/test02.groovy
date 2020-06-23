package advanced

def method1 (Closure clo) {
    clo()
    //clo.call()
}
method1 {{
    println 'hahaha'
}}

def method2 (closure) {
//    closure('jane')
     closure.call('jane')
}

method2({
    val->println "my name is ${val}"
})

def method3 = {
    param ->
        println(param)
}
method3(12345)
